
package fi.publishing.skeemat.vahva._2018._06._08;

import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JulkaisuPyyntoAsiakirjaTyyppi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JulkaisuPyyntoAsiakirjaTyyppi"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="asiakirjaTiedostoNimi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="asiakirjaMetatiedot" type="{http://www.publishing.fi/skeemat/vahva/2018/06/08}JulkaisuPyyntoAsiakirjaMetatiedotTyyppi"/&gt;
 *         &lt;element name="tiedosto" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JulkaisuPyyntoAsiakirjaTyyppi", propOrder = {
    "asiakirjaTiedostoNimi",
    "asiakirjaMetatiedot",
    "tiedosto"
})
public class JulkaisuPyyntoAsiakirjaTyyppi {

    @XmlElement(required = true)
    protected String asiakirjaTiedostoNimi;
    @XmlElement(required = true)
    protected JulkaisuPyyntoAsiakirjaMetatiedotTyyppi asiakirjaMetatiedot;
    @XmlElement(required = true)
    @XmlMimeType("application/octet-stream")
    protected DataHandler tiedosto;

    /**
     * Gets the value of the asiakirjaTiedostoNimi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsiakirjaTiedostoNimi() {
        return asiakirjaTiedostoNimi;
    }

    /**
     * Sets the value of the asiakirjaTiedostoNimi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsiakirjaTiedostoNimi(String value) {
        this.asiakirjaTiedostoNimi = value;
    }

    /**
     * Gets the value of the asiakirjaMetatiedot property.
     * 
     * @return
     *     possible object is
     *     {@link JulkaisuPyyntoAsiakirjaMetatiedotTyyppi }
     *     
     */
    public JulkaisuPyyntoAsiakirjaMetatiedotTyyppi getAsiakirjaMetatiedot() {
        return asiakirjaMetatiedot;
    }

    /**
     * Sets the value of the asiakirjaMetatiedot property.
     * 
     * @param value
     *     allowed object is
     *     {@link JulkaisuPyyntoAsiakirjaMetatiedotTyyppi }
     *     
     */
    public void setAsiakirjaMetatiedot(JulkaisuPyyntoAsiakirjaMetatiedotTyyppi value) {
        this.asiakirjaMetatiedot = value;
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
