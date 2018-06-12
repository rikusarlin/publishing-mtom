
package fi.publishing.skeemat.vahva._2018._06._08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JulkaisuLupaRequestTyyppi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JulkaisuLupaRequestTyyppi"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="julkaisuLupa" type="{http://www.publishing.fi/skeemat/vahva/2018/06/08}JulkaisuLupaTyyppi"/&gt;
 *         &lt;element name="asiakirjat" type="{http://www.publishing.fi/skeemat/vahva/2018/06/08}JulkaisuLupaAsiakirjaListaTyyppi" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JulkaisuLupaRequestTyyppi", propOrder = {
    "julkaisuLupa",
    "asiakirjat"
})
public class JulkaisuLupaRequestTyyppi {

    @XmlElement(required = true)
    protected JulkaisuLupaTyyppi julkaisuLupa;
    protected JulkaisuLupaAsiakirjaListaTyyppi asiakirjat;

    /**
     * Gets the value of the julkaisuLupa property.
     * 
     * @return
     *     possible object is
     *     {@link JulkaisuLupaTyyppi }
     *     
     */
    public JulkaisuLupaTyyppi getJulkaisuLupa() {
        return julkaisuLupa;
    }

    /**
     * Sets the value of the julkaisuLupa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JulkaisuLupaTyyppi }
     *     
     */
    public void setJulkaisuLupa(JulkaisuLupaTyyppi value) {
        this.julkaisuLupa = value;
    }

    /**
     * Gets the value of the asiakirjat property.
     * 
     * @return
     *     possible object is
     *     {@link JulkaisuLupaAsiakirjaListaTyyppi }
     *     
     */
    public JulkaisuLupaAsiakirjaListaTyyppi getAsiakirjat() {
        return asiakirjat;
    }

    /**
     * Sets the value of the asiakirjat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JulkaisuLupaAsiakirjaListaTyyppi }
     *     
     */
    public void setAsiakirjat(JulkaisuLupaAsiakirjaListaTyyppi value) {
        this.asiakirjat = value;
    }

}
