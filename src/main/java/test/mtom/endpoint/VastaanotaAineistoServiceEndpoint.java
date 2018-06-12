package test.mtom.endpoint;

import java.io.File;
import java.io.FileOutputStream;
import java.util.UUID;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.jws.WebService;
import javax.xml.bind.JAXB;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.sun.istack.ByteArrayDataSource;

import fi.publishing.skeemat.vahva._2018._06._08.HaeJulkaisutRequestTyyppi;
import fi.publishing.skeemat.vahva._2018._06._08.HaeJulkaisutResponseTyyppi;
import fi.publishing.skeemat.vahva._2018._06._08.JulkaisuLupaAsiakirjaTyyppi;
import fi.publishing.skeemat.vahva._2018._06._08.JulkaisuLupaRequestTyyppi;
import fi.publishing.skeemat.vahva._2018._06._08.JulkaisuMetatiedotTyyppi;
import fi.publishing.skeemat.vahva._2018._06._08.JulkaisuPyyntoAsiakirjaTyyppi;
import fi.publishing.skeemat.vahva._2018._06._08.JulkaisuPyyntoRequestTyyppi;
import fi.publishing.skeemat.vahva._2018._06._08.JulkaisuTiedotListaTyyppi;
import fi.publishing.skeemat.vahva._2018._06._08.JulkaisuTiedotTyyppi;
import fi.publishing.skeemat.vahva._2018._06._08.KorjausRequestTyyppi;
import fi.publishing.skeemat.vahva._2018._06._08.KuittausTyyppi;
import fi.publishing.skeemat.vahva._2018._06._08.ObjectFactory;
import fi.publishing.skeemat.vahva._2018._06._08.PublishingPort;
import fi.publishing.skeemat.vahva._2018._06._08.ToimituksenTyyppiKoodi;

import test.mtom.service.PdfGenerationService;

@Service
@WebService(portName = "PublishingPort", serviceName = "VastaanotaAineisto", 
			endpointInterface = "fi.publishing.skeemat.vahva._2018._06._08.PublishingPort", 
			targetNamespace = "http://www.publishing.fi/skeemat/vahva/2018/06/08")
public class VastaanotaAineistoServiceEndpoint implements PublishingPort {

	Logger logger = LoggerFactory.getLogger("test.mtom");

    @Value("${julkaisuPyyntoFilePath}")
    private String julkaisuPyyntoFilePath;
    @Value("${julkaisuLupaFilePath}")
    private String julkaisuLupaFilePath;
    @Value("${korjausFilePath}")
    private String korjausFilePath;
    
	private PdfGenerationService pdfGenerationService;
	@Autowired
	public VastaanotaAineistoServiceEndpoint(PdfGenerationService pdfGenerationService) {
		this.pdfGenerationService = pdfGenerationService;
	}

	
	@Override
	public KuittausTyyppi lahetaJulkaisuPyynto(JulkaisuPyyntoRequestTyyppi request) {

		ObjectFactory factory = new ObjectFactory();
		KuittausTyyppi response = factory.createKuittausTyyppi();
		// Now, copy the file received to pre-defined directory, with the name received as input
		try{
			String newDirName = UUID.randomUUID().toString();
			boolean created = new File(julkaisuPyyntoFilePath.concat(newDirName)).mkdirs();
			for(JulkaisuPyyntoAsiakirjaTyyppi asiakirja:request.getAsiakirjat().getAsiakirja()) {				
				// Note: this implementation blindly writes a new file on top of an existing one with the same name
				String diskFileName = julkaisuPyyntoFilePath.concat(newDirName).concat("\\").concat(asiakirja.getAsiakirjaTiedostoNimi());
				FileOutputStream fos = new FileOutputStream(diskFileName);
				int bytes = IOUtils.copy(asiakirja.getTiedosto().getInputStream(), fos);
				logger.info("File stored to: " + diskFileName);
				logger.info("Copied " + bytes + " bytes from message to file");
				IOUtils.closeQuietly(fos);
				fos.flush();
				fos.close();
			}
			
			// Marshal the request as XML file to same directory (with the same directory name), too
			// We could again use some metadata as file name here
			JAXB.marshal(request, new File(julkaisuPyyntoFilePath.concat(newDirName).concat("\\").concat("julkaisupyynto.xml")));

			response.setPaluuKoodi("0");
			response.setSelite("Tallennus onnistui");
		} catch (Exception e){
			logger.error("Virhe julkaisupyynnon tallennuksen aikana" + e);
			response.setPaluuKoodi("1");
			response.setSelite("Tallennus ei onnistunut");
			response.setViesti(e.getMessage());
		}
		return response;
	}
	
	@Override
	public KuittausTyyppi lahetaJulkaisuLupa(JulkaisuLupaRequestTyyppi request) {

		ObjectFactory factory = new ObjectFactory();
		KuittausTyyppi response = factory.createKuittausTyyppi();
		
		// Now, copy the file received to pre-defined directory, with the name received as input
		try{
			// Could use some metadata, too
			String newDirName = UUID.randomUUID().toString();
			boolean created = new File(julkaisuLupaFilePath.concat(newDirName)).mkdirs();
			for(JulkaisuLupaAsiakirjaTyyppi asiakirja:request.getAsiakirjat().getAsiakirja()) {
				// Note: this implementation blindly writes a new file on top of an existing one with the same name
				String diskFileName = julkaisuLupaFilePath.concat(newDirName).concat("\\").concat(asiakirja.getAsiakirjaTiedostoNimi());
				FileOutputStream fos = new FileOutputStream(diskFileName);
				int bytes = IOUtils.copy(asiakirja.getTiedosto().getInputStream(), fos);
				logger.info("File stored to: " + diskFileName);
				logger.info("Copied " + bytes + " bytes from message to file");
				IOUtils.closeQuietly(fos);
				fos.flush();
				fos.close();
			}

			// Marshal the request as XML file to same directory (with the same directory name), too
			// We could again use some metadata as file name here
			JAXB.marshal(request, new File(julkaisuLupaFilePath.concat(newDirName).concat("\\").concat("julkaisulupa.xml")));

			response.setPaluuKoodi("0");
			response.setSelite("Tallennus onnistui");
		} catch (Exception e){
			logger.error("Virhe julkaisuluvan tallennuksen aikana" + e);
			response.setPaluuKoodi("1");
			response.setSelite("Tallennus ei onnistunut");
			response.setViesti(e.getMessage());
		}
		return response;
	}


	@Override
	public KuittausTyyppi lahetaKorjaus(KorjausRequestTyyppi request) {

		ObjectFactory factory = new ObjectFactory();
		KuittausTyyppi response = factory.createKuittausTyyppi();
		
		// Now, copy the file received to pre-defined directory, with the name received as input
		try{
			String newDirName = UUID.randomUUID().toString();
			boolean created = new File(korjausFilePath.concat(newDirName)).mkdirs();

			// Note: this implementation blindly writes a new file on top of an existing one with the same name
			String diskFileName = korjausFilePath.concat(newDirName).concat("\\").concat(request.getKorjaus().getAsiakirjaTiedostoNimi());
			FileOutputStream fos = new FileOutputStream(diskFileName);
			int bytes = IOUtils.copy(request.getKorjaus().getTiedosto().getInputStream(), fos);
			logger.info("File stored to: " + diskFileName); 
			logger.info("Copied " + bytes + " bytes from message to file");
			IOUtils.closeQuietly(fos);
			fos.flush();
			fos.close();
			
			// Marshal the request as XML file to same directory (with the same directory name), too
			// We could again use some metadata as file name here
			JAXB.marshal(request, new File(korjausFilePath.concat(newDirName).concat("\\").concat("korjaus.xml")));
			
			response.setPaluuKoodi("0");
			response.setSelite("Tallennus onnistui");
		} catch (Exception e){
			logger.error("Virhe korjauspyynnön tallennuksen aikana" + e);
			response.setPaluuKoodi("1");
			response.setSelite("Tallennus ei onnistunut");
			response.setViesti(e.getMessage());
		}
		return response;
	}
	
	@Override
	public HaeJulkaisutResponseTyyppi haeJulkaisut(HaeJulkaisutRequestTyyppi request) {

		ObjectFactory factory = new ObjectFactory();
		HaeJulkaisutResponseTyyppi response = factory.createHaeJulkaisutResponseTyyppi();

		KuittausTyyppi kuittaus = factory.createKuittausTyyppi();
		kuittaus.setPaluuKoodi("0");
		kuittaus.setViesti("Haku onnistui");
		response.setSiirtoResponse(kuittaus);

		try {
			
			/*
			 * Generate simple pdf and return it twice as the published document.
			 * In real life, documents and metadata would be fetched from an
			 * information system or file system. This is just to demonstrate
			 * that several files can be successfully returned in returned 
			 * SOAP MTOM message
			 */
			JulkaisuTiedotListaTyyppi julkaisuLista = factory.createJulkaisuTiedotListaTyyppi();
			response.setJulkaisut(julkaisuLista);

			
			JulkaisuTiedotTyyppi julkaisu = factory.createJulkaisuTiedotTyyppi();
			julkaisu.setTiedostoNimi("example1.pdf");
			byte[] pdfDocument = pdfGenerationService.generatePdf();		
			DataSource byteArrayDataSource = new ByteArrayDataSource(pdfDocument, "application/pdf");
			julkaisu.setTiedosto(new DataHandler(byteArrayDataSource));
			julkaisuLista.getJulkaisu().add(julkaisu);
		
			JulkaisuMetatiedotTyyppi metatiedot = factory.createJulkaisuMetatiedotTyyppi();
			metatiedot.setTunniste("VN/2018/667-1");
			metatiedot.setAsiaTunniste("VN/2018/667");
			metatiedot.setAsiakirjaTunniste("VN/2018/667/VN/2");
			metatiedot.setToimituksenTyyppi(ToimituksenTyyppiKoodi.TAITTO);
			julkaisu.setJulkaisuMetatiedot(metatiedot);

			JulkaisuTiedotTyyppi julkaisu2 = factory.createJulkaisuTiedotTyyppi();
			julkaisu2.setTiedostoNimi("example2.pdf");
			julkaisu2.setTiedosto(new DataHandler(byteArrayDataSource));
			julkaisuLista.getJulkaisu().add(julkaisu2);
		
			JulkaisuMetatiedotTyyppi metatiedot2 = factory.createJulkaisuMetatiedotTyyppi();
			metatiedot2.setTunniste("VN/2018/668-1");
			metatiedot2.setAsiaTunniste("VN/2018/668");
			metatiedot2.setAsiakirjaTunniste("VN/2018/668/VN/1");
			metatiedot2.setToimituksenTyyppi(ToimituksenTyyppiKoodi.TAITTO);
			julkaisu2.setJulkaisuMetatiedot(metatiedot);

		} catch (Exception e){
			logger.error("Virhe julkaisutietojen lukemisen aikana" + e);
			kuittaus.setPaluuKoodi("1");
			kuittaus.setSelite("Luku ei onnistunut");
			kuittaus.setViesti(e.getMessage());			
		}
		
		// Create some dummy response with 2 files
		/* Example
		ObjectFactory factory = new ObjectFactory();
		AccountDetailsResponse response = factory.createAccountDetailsResponse();
		
		Account account = factory.createAccount();
		account.setAccountNumber("12345");
		account.setAccountStatus(EnumAccountStatus.ACTIVE);
		account.setAccountName("Joe Bloggs");
		account.setAccountBalance(3400);
		
		byte[] pdfDocument = pdfGenerationService.generatePdf();		
		DataSource byteArrayDataSource = new ByteArrayDataSource(pdfDocument, "application/pdf");
		account.setStatement(new DataHandler(byteArrayDataSource));
		response.setAccountDetails(account);		
		return response;
		*/
		
		return response;
	}

}