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
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.stereotype.Service;

import com.sun.istack.ByteArrayDataSource;

import fi.publishing.skeemat.vahva._2018._06._08.CorrectionRequest;
import fi.publishing.skeemat.vahva._2018._06._08.DeliveryTypeCode;
import fi.publishing.skeemat.vahva._2018._06._08.FetchPublishedRequest;
import fi.publishing.skeemat.vahva._2018._06._08.FetchPublishedResponse;
import fi.publishing.skeemat.vahva._2018._06._08.ObjectFactory;
import fi.publishing.skeemat.vahva._2018._06._08.PublishedDocument;
import fi.publishing.skeemat.vahva._2018._06._08.PublishedDocumentList;
import fi.publishing.skeemat.vahva._2018._06._08.PublishedDocumentMetadata;
import fi.publishing.skeemat.vahva._2018._06._08.PublishingPermissionDocument;
import fi.publishing.skeemat.vahva._2018._06._08.PublishingPermissionRequest;
import fi.publishing.skeemat.vahva._2018._06._08.PublishingPort;
import fi.publishing.skeemat.vahva._2018._06._08.PublishingRequestDocument;
import fi.publishing.skeemat.vahva._2018._06._08.PublishingRequestRequest;
import fi.publishing.skeemat.vahva._2018._06._08.TransmissionResponse;
import test.mtom.service.PdfGenerationService;


@Service
@WebService(portName = "PublishingPort", serviceName = "VastaanotaAineisto", 
			endpointInterface = "fi.publishing.skeemat.vahva._2018._06._08.PublishingPort", 
			targetNamespace = "http://www.publishing.fi/skeemat/vahva/2018/06/08")
public class PublishingServiceEndpoint implements PublishingPort {

	Logger logger = LoggerFactory.getLogger("test.mtom");

    @Value("${publishingRequestFilePath}")
    private String publishingRequestFilePath = "C:\\Temp\\fileet\\julkaisupyynnot\\";
    @Value("${publishingPermissionFilePath}")
    private String publishingPermissionFilePath = "C:\\Temp\\fileet\\julkaisuluvat\\";
    @Value("${correctionFilePath}")
    private String correctionFilePath = "C:\\Temp\\fileet\\korjaukset\\";
    
	private PdfGenerationService pdfGenerationService;
	@Autowired
	public PublishingServiceEndpoint(PdfGenerationService pdfGenerationService) {
		this.pdfGenerationService = pdfGenerationService;
	}
	
	@Override
	public TransmissionResponse sendPublishingRequest(PublishingRequestRequest request) {

		ObjectFactory factory = new ObjectFactory();
		TransmissionResponse response = factory.createTransmissionResponse();
		// Now, copy the file received to pre-defined directory, with the name received as input
		try{
			String newDirName = UUID.randomUUID().toString();
			boolean created = new File(publishingRequestFilePath.concat(newDirName)).mkdirs();
			for(PublishingRequestDocument document:request.getDocuments().getDocument()) {				
				// Note: this implementation blindly writes a new file on top of an existing one with the same name
				String diskFileName = publishingRequestFilePath.concat(newDirName).concat("\\").concat(document.getFileName());
				FileOutputStream fos = new FileOutputStream(diskFileName);
				int bytes = IOUtils.copy(document.getContents().getInputStream(), fos);
				logger.info("File stored to: " + diskFileName);
				logger.info("Copied " + bytes + " bytes from message to file");
				IOUtils.closeQuietly(fos);
				fos.flush();
				fos.close();
			}
			
			// Marshal the request as XML file to same directory (with the same directory name), too
			// We could again use some metadata as file name here
			JAXB.marshal(request, new File(publishingRequestFilePath.concat(newDirName).concat("\\").concat("publishingRequest.xml")));

			response.setReturnCode("0");
			response.setExplanation("Storing publishing request documents successful");
		} catch (Exception e){
			logger.error("Error storing publishing request", e);
			response.setReturnCode("1");
			response.setExplanation("Error storing publishing request");
			response.setMessage(e.getMessage());
		}
		return response;
	}
	
	@Override
	public TransmissionResponse sendPublishingPermission(PublishingPermissionRequest request) {

		ObjectFactory factory = new ObjectFactory();
		TransmissionResponse response = factory.createTransmissionResponse();
		
		// Now, copy the file received to pre-defined directory, with the name received as input
		try{
			// Could use some metadata, too
			String newDirName = UUID.randomUUID().toString();
			boolean created = new File(publishingPermissionFilePath.concat(newDirName)).mkdirs();
			for(PublishingPermissionDocument document:request.getDocuments().getDocument()) {
				// Note: this implementation blindly writes a new file on top of an existing one with the same name
				String diskFileName = publishingPermissionFilePath.concat(newDirName).concat("\\").concat(document.getFileName());
				FileOutputStream fos = new FileOutputStream(diskFileName);
				int bytes = IOUtils.copy(document.getContents().getInputStream(), fos);
				logger.info("File stored to: " + diskFileName);
				logger.info("Copied " + bytes + " bytes from message to file");
				IOUtils.closeQuietly(fos);
				fos.flush();
				fos.close();
			}

			// Marshal the request as XML file to same directory (with the same directory name), too
			// We could again use some metadata as file name here
			JAXB.marshal(request, new File(publishingPermissionFilePath.concat(newDirName).concat("\\").concat("publishingPermission.xml")));

			response.setReturnCode("0");
			response.setExplanation("Tallennus onnistui");
		} catch (Exception e){
			logger.error("Virhe julkaisuluvan tallennuksen aikana", e);
			response.setReturnCode("1");
			response.setExplanation("Tallennus ei onnistunut");
			response.setMessage(e.getMessage());
		}
		return response;
	}


	@Override
	public TransmissionResponse sendCorrection(CorrectionRequest request) {

		ObjectFactory factory = new ObjectFactory();
		TransmissionResponse response = factory.createTransmissionResponse();
		
		// Now, copy the file received to pre-defined directory, with the name received as input
		try{
			String newDirName = UUID.randomUUID().toString();
			boolean created = new File(correctionFilePath.concat(newDirName)).mkdirs();

			// Note: this implementation blindly writes a new file on top of an existing one with the same name
			String diskFileName = correctionFilePath.concat(newDirName).concat("\\").concat(request.getCorrection().getFileName());
			FileOutputStream fos = new FileOutputStream(diskFileName);
			int bytes = IOUtils.copy(request.getCorrection().getContents().getInputStream(), fos);
			logger.info("File stored to: " + diskFileName); 
			logger.info("Copied " + bytes + " bytes from message to file");
			IOUtils.closeQuietly(fos);
			fos.flush();
			fos.close();
			
			// Marshal the request as XML file to same directory (with the same directory name), too
			// We could again use some metadata as file name here
			JAXB.marshal(request, new File(correctionFilePath.concat(newDirName).concat("\\").concat("correction.xml")));
			
			response.setReturnCode("0");
			response.setExplanation("Tallennus onnistui");
		} catch (Exception e){
			logger.error("Virhe korjauspyynnön tallennuksen aikana", e);
			response.setReturnCode("1");
			response.setExplanation("Tallennus ei onnistunut");
			response.setMessage(e.getMessage());
		}
		return response;
	}
	
	@Override
	public FetchPublishedResponse fetchPublished(FetchPublishedRequest request) {

		ObjectFactory factory = new ObjectFactory();
		FetchPublishedResponse response = factory.createFetchPublishedResponse();

		TransmissionResponse tr = factory.createTransmissionResponse();
		tr.setReturnCode("0");
		tr.setExplanation("Fetched successfully");
		response.setTransmissionResponse(tr);

		try {
			
			/*
			 * Generate simple pdf and return it twice as the published document.
			 * In real life, documents and metadata would be fetched from an
			 * information system or file system. This is just to demonstrate
			 * that several files can be successfully returned in returned 
			 * SOAP MTOM message
			 */
			PublishedDocumentList publishedList = factory.createPublishedDocumentList();
			response.setPublishedDocuments(publishedList);

			PublishedDocument publishedDocument1 = factory.createPublishedDocument();
			publishedDocument1.setFileName("example1.pdf");
			byte[] pdfDocument = pdfGenerationService.generatePdf();		
			DataSource byteArrayDataSource = new ByteArrayDataSource(pdfDocument, "application/pdf");
			publishedDocument1.setContents(new DataHandler(byteArrayDataSource));
			publishedList.getPublishedDocument().add(publishedDocument1);
			
			PublishedDocumentMetadata metadata = factory.createPublishedDocumentMetadata();
			metadata.setCaseId("VN/2018/667");
			metadata.setDocumentId("VN/2018/667/VN/2");
			metadata.setDeliveryType(DeliveryTypeCode.LAYOUT);
			publishedDocument1.setMetadata(metadata);

			PublishedDocument publishedDocument2 = factory.createPublishedDocument();
			publishedDocument2.setFileName("example2.pdf");
			publishedDocument2.setContents(new DataHandler(byteArrayDataSource));
			publishedList.getPublishedDocument().add(publishedDocument2);
			
			PublishedDocumentMetadata metadata2 = factory.createPublishedDocumentMetadata();
			metadata2.setCaseId("VN/2018/668");
			metadata2.setDocumentId("VN/2018/668/VN/1");
			metadata2.setDeliveryType(DeliveryTypeCode.LAYOUT);
			publishedDocument2.setMetadata(metadata2);

		} catch (Exception e){
			logger.error("Error reading published documents: ", e);
			tr.setReturnCode("1");
			tr.setExplanation("Error reading published documents");
			tr.setMessage(e.getMessage());			
		}
				
		return response;
	}

}