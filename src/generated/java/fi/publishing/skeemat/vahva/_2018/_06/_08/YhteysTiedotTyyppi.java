
package fi.publishing.skeemat.vahva._2018._06._08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for YhteysTiedotTyyppi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="YhteysTiedotTyyppi"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="etuNimi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sukuNimi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="titteli" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="puhelinNumero" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sahkoPosti" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "YhteysTiedotTyyppi", propOrder = {
    "etuNimi",
    "sukuNimi",
    "titteli",
    "puhelinNumero",
    "sahkoPosti"
})
public class YhteysTiedotTyyppi {

    @XmlElement(required = true)
    protected String etuNimi;
    @XmlElement(required = true)
    protected String sukuNimi;
    @XmlElement(required = true)
    protected String titteli;
    @XmlElement(required = true)
    protected String puhelinNumero;
    @XmlElement(required = true)
    protected String sahkoPosti;

    /**
     * Gets the value of the etuNimi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEtuNimi() {
        return etuNimi;
    }

    /**
     * Sets the value of the etuNimi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEtuNimi(String value) {
        this.etuNimi = value;
    }

    /**
     * Gets the value of the sukuNimi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSukuNimi() {
        return sukuNimi;
    }

    /**
     * Sets the value of the sukuNimi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSukuNimi(String value) {
        this.sukuNimi = value;
    }

    /**
     * Gets the value of the titteli property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitteli() {
        return titteli;
    }

    /**
     * Sets the value of the titteli property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitteli(String value) {
        this.titteli = value;
    }

    /**
     * Gets the value of the puhelinNumero property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPuhelinNumero() {
        return puhelinNumero;
    }

    /**
     * Sets the value of the puhelinNumero property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPuhelinNumero(String value) {
        this.puhelinNumero = value;
    }

    /**
     * Gets the value of the sahkoPosti property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSahkoPosti() {
        return sahkoPosti;
    }

    /**
     * Sets the value of the sahkoPosti property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSahkoPosti(String value) {
        this.sahkoPosti = value;
    }

}
