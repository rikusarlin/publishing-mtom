
package fi.publishing.skeemat.vahva._2018._06._08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LahetystiedotType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LahetystiedotType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tyyppi" type="{http://www.publishing.fi/skeemat/vahva/2018/06/08}LahetyksenTyyppiKoodi"/&gt;
 *         &lt;element name="julkaisuPyynto" type="{http://www.publishing.fi/skeemat/vahva/2018/06/08}JulkaisuPyyntoType" minOccurs="0"/&gt;
 *         &lt;element name="julkaisuLupa" type="{http://www.publishing.fi/skeemat/vahva/2018/06/08}JulkaisuLupaType" minOccurs="0"/&gt;
 *         &lt;element name="asiakirjat" type="{http://www.publishing.fi/skeemat/vahva/2018/06/08}AsiakirjaType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LahetystiedotType", propOrder = {
    "tyyppi",
    "julkaisuPyynto",
    "julkaisuLupa",
    "asiakirjat"
})
public class LahetystiedotType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected LahetyksenTyyppiKoodi tyyppi;
    protected JulkaisuPyyntoType julkaisuPyynto;
    protected JulkaisuLupaType julkaisuLupa;
    protected AsiakirjaType asiakirjat;

    /**
     * Gets the value of the tyyppi property.
     * 
     * @return
     *     possible object is
     *     {@link LahetyksenTyyppiKoodi }
     *     
     */
    public LahetyksenTyyppiKoodi getTyyppi() {
        return tyyppi;
    }

    /**
     * Sets the value of the tyyppi property.
     * 
     * @param value
     *     allowed object is
     *     {@link LahetyksenTyyppiKoodi }
     *     
     */
    public void setTyyppi(LahetyksenTyyppiKoodi value) {
        this.tyyppi = value;
    }

    /**
     * Gets the value of the julkaisuPyynto property.
     * 
     * @return
     *     possible object is
     *     {@link JulkaisuPyyntoType }
     *     
     */
    public JulkaisuPyyntoType getJulkaisuPyynto() {
        return julkaisuPyynto;
    }

    /**
     * Sets the value of the julkaisuPyynto property.
     * 
     * @param value
     *     allowed object is
     *     {@link JulkaisuPyyntoType }
     *     
     */
    public void setJulkaisuPyynto(JulkaisuPyyntoType value) {
        this.julkaisuPyynto = value;
    }

    /**
     * Gets the value of the julkaisuLupa property.
     * 
     * @return
     *     possible object is
     *     {@link JulkaisuLupaType }
     *     
     */
    public JulkaisuLupaType getJulkaisuLupa() {
        return julkaisuLupa;
    }

    /**
     * Sets the value of the julkaisuLupa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JulkaisuLupaType }
     *     
     */
    public void setJulkaisuLupa(JulkaisuLupaType value) {
        this.julkaisuLupa = value;
    }

    /**
     * Gets the value of the asiakirjat property.
     * 
     * @return
     *     possible object is
     *     {@link AsiakirjaType }
     *     
     */
    public AsiakirjaType getAsiakirjat() {
        return asiakirjat;
    }

    /**
     * Sets the value of the asiakirjat property.
     * 
     * @param value
     *     allowed object is
     *     {@link AsiakirjaType }
     *     
     */
    public void setAsiakirjat(AsiakirjaType value) {
        this.asiakirjat = value;
    }

}
