
package fi.publishing.skeemat.vahva._2018._06._08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KuittausTyyppi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KuittausTyyppi"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paluuKoodi" type="{http://www.publishing.fi/skeemat/vahva/2018/06/08}PaluuKoodiTyyppi"/&gt;
 *         &lt;element name="selite" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="viesti" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KuittausTyyppi", propOrder = {
    "paluuKoodi",
    "selite",
    "viesti"
})
public class KuittausTyyppi {

    @XmlElement(required = true)
    protected String paluuKoodi;
    @XmlElement(required = true)
    protected String selite;
    protected String viesti;

    /**
     * Gets the value of the paluuKoodi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaluuKoodi() {
        return paluuKoodi;
    }

    /**
     * Sets the value of the paluuKoodi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaluuKoodi(String value) {
        this.paluuKoodi = value;
    }

    /**
     * Gets the value of the selite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelite() {
        return selite;
    }

    /**
     * Sets the value of the selite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelite(String value) {
        this.selite = value;
    }

    /**
     * Gets the value of the viesti property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViesti() {
        return viesti;
    }

    /**
     * Sets the value of the viesti property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViesti(String value) {
        this.viesti = value;
    }

}
