
package fi.publishing.skeemat.vahva._2018._06._08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HaeJulkaisutResponseTyyppi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HaeJulkaisutResponseTyyppi"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="julkaisut" type="{http://www.publishing.fi/skeemat/vahva/2018/06/08}JulkaisuTiedotListaTyyppi"/&gt;
 *         &lt;element name="siirtoResponse" type="{http://www.publishing.fi/skeemat/vahva/2018/06/08}KuittausTyyppi"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HaeJulkaisutResponseTyyppi", propOrder = {
    "julkaisut",
    "siirtoResponse"
})
public class HaeJulkaisutResponseTyyppi {

    @XmlElement(required = true)
    protected JulkaisuTiedotListaTyyppi julkaisut;
    @XmlElement(required = true)
    protected KuittausTyyppi siirtoResponse;

    /**
     * Gets the value of the julkaisut property.
     * 
     * @return
     *     possible object is
     *     {@link JulkaisuTiedotListaTyyppi }
     *     
     */
    public JulkaisuTiedotListaTyyppi getJulkaisut() {
        return julkaisut;
    }

    /**
     * Sets the value of the julkaisut property.
     * 
     * @param value
     *     allowed object is
     *     {@link JulkaisuTiedotListaTyyppi }
     *     
     */
    public void setJulkaisut(JulkaisuTiedotListaTyyppi value) {
        this.julkaisut = value;
    }

    /**
     * Gets the value of the siirtoResponse property.
     * 
     * @return
     *     possible object is
     *     {@link KuittausTyyppi }
     *     
     */
    public KuittausTyyppi getSiirtoResponse() {
        return siirtoResponse;
    }

    /**
     * Sets the value of the siirtoResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link KuittausTyyppi }
     *     
     */
    public void setSiirtoResponse(KuittausTyyppi value) {
        this.siirtoResponse = value;
    }

}
