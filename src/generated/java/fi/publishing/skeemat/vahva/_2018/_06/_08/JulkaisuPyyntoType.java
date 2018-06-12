
package fi.publishing.skeemat.vahva._2018._06._08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for JulkaisuPyyntoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JulkaisuPyyntoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tunniste" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="asiaOtsikko" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="saate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pyynnonLaatu" type="{http://www.publishing.fi/skeemat/vahva/2018/06/08}PyynnonLaatuKoodi"/&gt;
 *         &lt;element name="asiatyyppi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tilauksenTekija" type="{http://www.publishing.fi/skeemat/vahva/2018/06/08}YhteysTiedotTyyppi"/&gt;
 *         &lt;element name="julkaistavaViimeistaan" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="euTunnus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ekAsiakirjat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sopimussarja" type="{http://www.publishing.fi/skeemat/vahva/2018/06/08}SopimusSarjaKoodi"/&gt;
 *         &lt;element name="ennakkolahetys" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="vedoksia" type="{http://www.publishing.fi/skeemat/vahva/2018/06/08}VedosTyyppiKoodi"/&gt;
 *         &lt;element name="vedoksiaMaara" type="{http://www.publishing.fi/skeemat/vahva/2018/06/08}VedosTyyppiKoodi"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JulkaisuPyyntoType", propOrder = {
    "tunniste",
    "asiaOtsikko",
    "saate",
    "pyynnonLaatu",
    "asiatyyppi",
    "tilauksenTekija",
    "julkaistavaViimeistaan",
    "euTunnus",
    "ekAsiakirjat",
    "sopimussarja",
    "ennakkolahetys",
    "vedoksia",
    "vedoksiaMaara"
})
public class JulkaisuPyyntoType {

    @XmlElement(required = true)
    protected String tunniste;
    @XmlElement(required = true)
    protected String asiaOtsikko;
    protected String saate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected PyynnonLaatuKoodi pyynnonLaatu;
    @XmlElement(required = true)
    protected String asiatyyppi;
    @XmlElement(required = true)
    protected YhteysTiedotTyyppi tilauksenTekija;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar julkaistavaViimeistaan;
    protected String euTunnus;
    protected String ekAsiakirjat;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected SopimusSarjaKoodi sopimussarja;
    protected Boolean ennakkolahetys;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected VedosTyyppiKoodi vedoksia;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected VedosTyyppiKoodi vedoksiaMaara;

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
     * Gets the value of the pyynnonLaatu property.
     * 
     * @return
     *     possible object is
     *     {@link PyynnonLaatuKoodi }
     *     
     */
    public PyynnonLaatuKoodi getPyynnonLaatu() {
        return pyynnonLaatu;
    }

    /**
     * Sets the value of the pyynnonLaatu property.
     * 
     * @param value
     *     allowed object is
     *     {@link PyynnonLaatuKoodi }
     *     
     */
    public void setPyynnonLaatu(PyynnonLaatuKoodi value) {
        this.pyynnonLaatu = value;
    }

    /**
     * Gets the value of the asiatyyppi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsiatyyppi() {
        return asiatyyppi;
    }

    /**
     * Sets the value of the asiatyyppi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsiatyyppi(String value) {
        this.asiatyyppi = value;
    }

    /**
     * Gets the value of the tilauksenTekija property.
     * 
     * @return
     *     possible object is
     *     {@link YhteysTiedotTyyppi }
     *     
     */
    public YhteysTiedotTyyppi getTilauksenTekija() {
        return tilauksenTekija;
    }

    /**
     * Sets the value of the tilauksenTekija property.
     * 
     * @param value
     *     allowed object is
     *     {@link YhteysTiedotTyyppi }
     *     
     */
    public void setTilauksenTekija(YhteysTiedotTyyppi value) {
        this.tilauksenTekija = value;
    }

    /**
     * Gets the value of the julkaistavaViimeistaan property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getJulkaistavaViimeistaan() {
        return julkaistavaViimeistaan;
    }

    /**
     * Sets the value of the julkaistavaViimeistaan property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setJulkaistavaViimeistaan(XMLGregorianCalendar value) {
        this.julkaistavaViimeistaan = value;
    }

    /**
     * Gets the value of the euTunnus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEuTunnus() {
        return euTunnus;
    }

    /**
     * Sets the value of the euTunnus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEuTunnus(String value) {
        this.euTunnus = value;
    }

    /**
     * Gets the value of the ekAsiakirjat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEkAsiakirjat() {
        return ekAsiakirjat;
    }

    /**
     * Sets the value of the ekAsiakirjat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEkAsiakirjat(String value) {
        this.ekAsiakirjat = value;
    }

    /**
     * Gets the value of the sopimussarja property.
     * 
     * @return
     *     possible object is
     *     {@link SopimusSarjaKoodi }
     *     
     */
    public SopimusSarjaKoodi getSopimussarja() {
        return sopimussarja;
    }

    /**
     * Sets the value of the sopimussarja property.
     * 
     * @param value
     *     allowed object is
     *     {@link SopimusSarjaKoodi }
     *     
     */
    public void setSopimussarja(SopimusSarjaKoodi value) {
        this.sopimussarja = value;
    }

    /**
     * Gets the value of the ennakkolahetys property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnnakkolahetys() {
        return ennakkolahetys;
    }

    /**
     * Sets the value of the ennakkolahetys property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnnakkolahetys(Boolean value) {
        this.ennakkolahetys = value;
    }

    /**
     * Gets the value of the vedoksia property.
     * 
     * @return
     *     possible object is
     *     {@link VedosTyyppiKoodi }
     *     
     */
    public VedosTyyppiKoodi getVedoksia() {
        return vedoksia;
    }

    /**
     * Sets the value of the vedoksia property.
     * 
     * @param value
     *     allowed object is
     *     {@link VedosTyyppiKoodi }
     *     
     */
    public void setVedoksia(VedosTyyppiKoodi value) {
        this.vedoksia = value;
    }

    /**
     * Gets the value of the vedoksiaMaara property.
     * 
     * @return
     *     possible object is
     *     {@link VedosTyyppiKoodi }
     *     
     */
    public VedosTyyppiKoodi getVedoksiaMaara() {
        return vedoksiaMaara;
    }

    /**
     * Sets the value of the vedoksiaMaara property.
     * 
     * @param value
     *     allowed object is
     *     {@link VedosTyyppiKoodi }
     *     
     */
    public void setVedoksiaMaara(VedosTyyppiKoodi value) {
        this.vedoksiaMaara = value;
    }

}
