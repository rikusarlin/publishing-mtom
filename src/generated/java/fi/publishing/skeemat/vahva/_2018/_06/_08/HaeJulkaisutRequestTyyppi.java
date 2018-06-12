
package fi.publishing.skeemat.vahva._2018._06._08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * 				Julkaisuja voidaan hakea joko tunnisteella tai muutosaikaleimalla.
 * 			
 * 
 * <p>Java class for HaeJulkaisutRequestTyyppi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HaeJulkaisutRequestTyyppi"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tunniste" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="edellinenAikaleima" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HaeJulkaisutRequestTyyppi", propOrder = {
    "tunniste",
    "edellinenAikaleima"
})
public class HaeJulkaisutRequestTyyppi {

    protected String tunniste;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar edellinenAikaleima;

    /**
     * Gets the value of the tunniste property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTunniste() {
        return tunniste;
    }

    /**
     * Sets the value of the tunniste property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTunniste(String value) {
        this.tunniste = value;
    }

    /**
     * Gets the value of the edellinenAikaleima property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEdellinenAikaleima() {
        return edellinenAikaleima;
    }

    /**
     * Sets the value of the edellinenAikaleima property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEdellinenAikaleima(XMLGregorianCalendar value) {
        this.edellinenAikaleima = value;
    }

}
