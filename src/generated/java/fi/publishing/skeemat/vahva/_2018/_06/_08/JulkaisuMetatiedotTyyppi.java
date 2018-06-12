
package fi.publishing.skeemat.vahva._2018._06._08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JulkaisuMetatiedotTyyppi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JulkaisuMetatiedotTyyppi"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tunniste" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="asiaTunniste" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="asiakirjaTunniste" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="toimituksenTyyppi" type="{http://www.publishing.fi/skeemat/vahva/2018/06/08}ToimituksenTyyppiKoodi"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JulkaisuMetatiedotTyyppi", propOrder = {
    "tunniste",
    "asiaTunniste",
    "asiakirjaTunniste",
    "toimituksenTyyppi"
})
public class JulkaisuMetatiedotTyyppi {

    @XmlElement(required = true)
    protected String tunniste;
    @XmlElement(required = true)
    protected String asiaTunniste;
    @XmlElement(required = true)
    protected String asiakirjaTunniste;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ToimituksenTyyppiKoodi toimituksenTyyppi;

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
     * Gets the value of the asiaTunniste property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsiaTunniste() {
        return asiaTunniste;
    }

    /**
     * Sets the value of the asiaTunniste property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsiaTunniste(String value) {
        this.asiaTunniste = value;
    }

    /**
     * Gets the value of the asiakirjaTunniste property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsiakirjaTunniste() {
        return asiakirjaTunniste;
    }

    /**
     * Sets the value of the asiakirjaTunniste property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsiakirjaTunniste(String value) {
        this.asiakirjaTunniste = value;
    }

    /**
     * Gets the value of the toimituksenTyyppi property.
     * 
     * @return
     *     possible object is
     *     {@link ToimituksenTyyppiKoodi }
     *     
     */
    public ToimituksenTyyppiKoodi getToimituksenTyyppi() {
        return toimituksenTyyppi;
    }

    /**
     * Sets the value of the toimituksenTyyppi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ToimituksenTyyppiKoodi }
     *     
     */
    public void setToimituksenTyyppi(ToimituksenTyyppiKoodi value) {
        this.toimituksenTyyppi = value;
    }

}
