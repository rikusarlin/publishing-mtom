
package fi.publishing.skeemat.vahva._2018._06._08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JulkaisuPyyntoRequestTyyppi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JulkaisuPyyntoRequestTyyppi"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="julkaisuPyynto" type="{http://www.publishing.fi/skeemat/vahva/2018/06/08}JulkaisuPyyntoTyyppi"/&gt;
 *         &lt;element name="asiakirjat" type="{http://www.publishing.fi/skeemat/vahva/2018/06/08}JulkaisuPyyntoAsiakirjaListaTyyppi" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JulkaisuPyyntoRequestTyyppi", propOrder = {
    "julkaisuPyynto",
    "asiakirjat"
})
public class JulkaisuPyyntoRequestTyyppi {

    @XmlElement(required = true)
    protected JulkaisuPyyntoTyyppi julkaisuPyynto;
    protected JulkaisuPyyntoAsiakirjaListaTyyppi asiakirjat;

    /**
     * Gets the value of the julkaisuPyynto property.
     * 
     * @return
     *     possible object is
     *     {@link JulkaisuPyyntoTyyppi }
     *     
     */
    public JulkaisuPyyntoTyyppi getJulkaisuPyynto() {
        return julkaisuPyynto;
    }

    /**
     * Sets the value of the julkaisuPyynto property.
     * 
     * @param value
     *     allowed object is
     *     {@link JulkaisuPyyntoTyyppi }
     *     
     */
    public void setJulkaisuPyynto(JulkaisuPyyntoTyyppi value) {
        this.julkaisuPyynto = value;
    }

    /**
     * Gets the value of the asiakirjat property.
     * 
     * @return
     *     possible object is
     *     {@link JulkaisuPyyntoAsiakirjaListaTyyppi }
     *     
     */
    public JulkaisuPyyntoAsiakirjaListaTyyppi getAsiakirjat() {
        return asiakirjat;
    }

    /**
     * Sets the value of the asiakirjat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JulkaisuPyyntoAsiakirjaListaTyyppi }
     *     
     */
    public void setAsiakirjat(JulkaisuPyyntoAsiakirjaListaTyyppi value) {
        this.asiakirjat = value;
    }

}
