
package fi.publishing.skeemat.vahva._2018._06._08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KorjausRequestTyyppi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KorjausRequestTyyppi"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="korjaus" type="{http://www.publishing.fi/skeemat/vahva/2018/06/08}KorjausAsiakirjaTyyppi"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KorjausRequestTyyppi", propOrder = {
    "korjaus"
})
public class KorjausRequestTyyppi {

    @XmlElement(required = true)
    protected KorjausAsiakirjaTyyppi korjaus;

    /**
     * Gets the value of the korjaus property.
     * 
     * @return
     *     possible object is
     *     {@link KorjausAsiakirjaTyyppi }
     *     
     */
    public KorjausAsiakirjaTyyppi getKorjaus() {
        return korjaus;
    }

    /**
     * Sets the value of the korjaus property.
     * 
     * @param value
     *     allowed object is
     *     {@link KorjausAsiakirjaTyyppi }
     *     
     */
    public void setKorjaus(KorjausAsiakirjaTyyppi value) {
        this.korjaus = value;
    }

}
