
package fi.publishing.skeemat.vahva._2018._06._08;

import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JulkaisuTiedotTyyppi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JulkaisuTiedotTyyppi"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tiedostoNimi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="julkaisuMetatiedot" type="{http://www.publishing.fi/skeemat/vahva/2018/06/08}JulkaisuMetatiedotTyyppi"/&gt;
 *         &lt;element name="tiedosto" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JulkaisuTiedotTyyppi", propOrder = {
    "tiedostoNimi",
    "julkaisuMetatiedot",
    "tiedosto"
})
public class JulkaisuTiedotTyyppi {

    @XmlElement(required = true)
    protected String tiedostoNimi;
    @XmlElement(required = true)
    protected JulkaisuMetatiedotTyyppi julkaisuMetatiedot;
    @XmlMimeType("application/octet-stream")
    protected DataHandler tiedosto;

    /**
     * Gets the value of the tiedostoNimi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiedostoNimi() {
        return tiedostoNimi;
    }

    /**
     * Sets the value of the tiedostoNimi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiedostoNimi(String value) {
        this.tiedostoNimi = value;
    }

    /**
     * Gets the value of the julkaisuMetatiedot property.
     * 
     * @return
     *     possible object is
     *     {@link JulkaisuMetatiedotTyyppi }
     *     
     */
    public JulkaisuMetatiedotTyyppi getJulkaisuMetatiedot() {
        return julkaisuMetatiedot;
    }

    /**
     * Sets the value of the julkaisuMetatiedot property.
     * 
     * @param value
     *     allowed object is
     *     {@link JulkaisuMetatiedotTyyppi }
     *     
     */
    public void setJulkaisuMetatiedot(JulkaisuMetatiedotTyyppi value) {
        this.julkaisuMetatiedot = value;
    }

    /**
     * Gets the value of the tiedosto property.
     * 
     * @return
     *     possible object is
     *     {@link DataHandler }
     *     
     */
    public DataHandler getTiedosto() {
        return tiedosto;
    }

    /**
     * Sets the value of the tiedosto property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataHandler }
     *     
     */
    public void setTiedosto(DataHandler value) {
        this.tiedosto = value;
    }

}
