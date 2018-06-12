
package fi.publishing.skeemat.vahva._2018._06._08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KorjausAsiakirjaMetatiedotTyyppi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KorjausAsiakirjaMetatiedotTyyppi"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="asiaTunnus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="asiaOtsikko" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="viimeinenPainotehtava" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="eduskuntaTunnus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="saate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="asiakirjaNimi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="asiakirjaTunnus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="asiakirjaTyyppi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="kieli" type="{http://www.publishing.fi/skeemat/vahva/2018/06/08}KieliKoodi"/&gt;
 *         &lt;element name="versio" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tallentaja" type="{http://www.publishing.fi/skeemat/vahva/2018/06/08}YhteysTiedotTyyppi" minOccurs="0"/&gt;
 *         &lt;element name="asiakirjaTiedostoNimi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KorjausAsiakirjaMetatiedotTyyppi", propOrder = {
    "asiaTunnus",
    "asiaOtsikko",
    "viimeinenPainotehtava",
    "eduskuntaTunnus",
    "saate",
    "asiakirjaNimi",
    "asiakirjaTunnus",
    "asiakirjaTyyppi",
    "kieli",
    "versio",
    "tallentaja",
    "asiakirjaTiedostoNimi"
})
public class KorjausAsiakirjaMetatiedotTyyppi {

    @XmlElement(required = true)
    protected String asiaTunnus;
    @XmlElement(required = true)
    protected String asiaOtsikko;
    @XmlElement(required = true)
    protected String viimeinenPainotehtava;
    @XmlElement(required = true)
    protected String eduskuntaTunnus;
    @XmlElement(required = true)
    protected String saate;
    @XmlElement(required = true)
    protected String asiakirjaNimi;
    @XmlElement(required = true)
    protected String asiakirjaTunnus;
    @XmlElement(required = true)
    protected String asiakirjaTyyppi;
    @XmlElement(required = true)
    protected String kieli;
    @XmlElement(required = true)
    protected String versio;
    protected YhteysTiedotTyyppi tallentaja;
    @XmlElement(required = true)
    protected String asiakirjaTiedostoNimi;

    /**
     * Gets the value of the asiaTunnus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsiaTunnus() {
        return asiaTunnus;
    }

    /**
     * Sets the value of the asiaTunnus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsiaTunnus(String value) {
        this.asiaTunnus = value;
    }

    /**
     * Gets the value of the asiaOtsikko property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsiaOtsikko() {
        return asiaOtsikko;
    }

    /**
     * Sets the value of the asiaOtsikko property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsiaOtsikko(String value) {
        this.asiaOtsikko = value;
    }

    /**
     * Gets the value of the viimeinenPainotehtava property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViimeinenPainotehtava() {
        return viimeinenPainotehtava;
    }

    /**
     * Sets the value of the viimeinenPainotehtava property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViimeinenPainotehtava(String value) {
        this.viimeinenPainotehtava = value;
    }

    /**
     * Gets the value of the eduskuntaTunnus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEduskuntaTunnus() {
        return eduskuntaTunnus;
    }

    /**
     * Sets the value of the eduskuntaTunnus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEduskuntaTunnus(String value) {
        this.eduskuntaTunnus = value;
    }

    /**
     * Gets the value of the saate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaate() {
        return saate;
    }

    /**
     * Sets the value of the saate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaate(String value) {
        this.saate = value;
    }

    /**
     * Gets the value of the asiakirjaNimi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsiakirjaNimi() {
        return asiakirjaNimi;
    }

    /**
     * Sets the value of the asiakirjaNimi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsiakirjaNimi(String value) {
        this.asiakirjaNimi = value;
    }

    /**
     * Gets the value of the asiakirjaTunnus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsiakirjaTunnus() {
        return asiakirjaTunnus;
    }

    /**
     * Sets the value of the asiakirjaTunnus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsiakirjaTunnus(String value) {
        this.asiakirjaTunnus = value;
    }

    /**
     * Gets the value of the asiakirjaTyyppi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsiakirjaTyyppi() {
        return asiakirjaTyyppi;
    }

    /**
     * Sets the value of the asiakirjaTyyppi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsiakirjaTyyppi(String value) {
        this.asiakirjaTyyppi = value;
    }

    /**
     * Gets the value of the kieli property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKieli() {
        return kieli;
    }

    /**
     * Sets the value of the kieli property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKieli(String value) {
        this.kieli = value;
    }

    /**
     * Gets the value of the versio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersio() {
        return versio;
    }

    /**
     * Sets the value of the versio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersio(String value) {
        this.versio = value;
    }

    /**
     * Gets the value of the tallentaja property.
     * 
     * @return
     *     possible object is
     *     {@link YhteysTiedotTyyppi }
     *     
     */
    public YhteysTiedotTyyppi getTallentaja() {
        return tallentaja;
    }

    /**
     * Sets the value of the tallentaja property.
     * 
     * @param value
     *     allowed object is
     *     {@link YhteysTiedotTyyppi }
     *     
     */
    public void setTallentaja(YhteysTiedotTyyppi value) {
        this.tallentaja = value;
    }

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

}