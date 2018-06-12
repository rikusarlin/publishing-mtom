
package fi.publishing.skeemat.vahva._2018._06._08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SiirtoJaLiitteetTyyppi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SiirtoJaLiitteetTyyppi"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Siirto" type="{http://www.publishing.fi/skeemat/vahva/2018/06/08}LahetystiedotType"/&gt;
 *         &lt;element name="Tiedosto" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SiirtoJaLiitteetTyyppi", propOrder = {
    "siirto",
    "tiedosto"
})
public class SiirtoJaLiitteetTyyppi {

    @XmlElement(name = "Siirto", required = true)
    protected LahetystiedotType siirto;
    @XmlElement(name = "Tiedosto")
    protected byte[] tiedosto;

    /**
     * Gets the value of the siirto property.
     * 
     * @return
     *     possible object is
     *     {@link LahetystiedotType }
     *     
     */
    public LahetystiedotType getSiirto() {
        return siirto;
    }

    /**
     * Sets the value of the siirto property.
     * 
     * @param value
     *     allowed object is
     *     {@link LahetystiedotType }
     *     
     */
    public void setSiirto(LahetystiedotType value) {
        this.siirto = value;
    }

    /**
     * Gets the value of the tiedosto property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getTiedosto() {
        return tiedosto;
    }

    /**
     * Sets the value of the tiedosto property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setTiedosto(byte[] value) {
        this.tiedosto = value;
    }

}
