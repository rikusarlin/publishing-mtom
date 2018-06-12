
package fi.publishing.skeemat.vahva._2018._06._08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AsiakirjaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AsiakirjaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="asiakirjaTiedostoNimi" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="asiakirjaMetatiedot" type="{http://www.publishing.fi/skeemat/vahva/2018/06/08}JulkaisuPyyntoAsiakirjaMetatiedotType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AsiakirjaType", propOrder = {
    "asiakirjaTiedostoNimi",
    "asiakirjaMetatiedot"
})
public class AsiakirjaType {

    @XmlElement(required = true)
    protected Object asiakirjaTiedostoNimi;
    @XmlElement(required = true)
    protected JulkaisuPyyntoAsiakirjaMetatiedotType asiakirjaMetatiedot;

    /**
     * Gets the value of the asiakirjaTiedostoNimi property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAsiakirjaTiedostoNimi() {
        return asiakirjaTiedostoNimi;
    }

    /**
     * Sets the value of the asiakirjaTiedostoNimi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAsiakirjaTiedostoNimi(Object value) {
        this.asiakirjaTiedostoNimi = value;
    }

    /**
     * Gets the value of the asiakirjaMetatiedot property.
     * 
     * @return
     *     possible object is
     *     {@link JulkaisuPyyntoAsiakirjaMetatiedotType }
     *     
     */
    public JulkaisuPyyntoAsiakirjaMetatiedotType getAsiakirjaMetatiedot() {
        return asiakirjaMetatiedot;
    }

    /**
     * Sets the value of the asiakirjaMetatiedot property.
     * 
     * @param value
     *     allowed object is
     *     {@link JulkaisuPyyntoAsiakirjaMetatiedotType }
     *     
     */
    public void setAsiakirjaMetatiedot(JulkaisuPyyntoAsiakirjaMetatiedotType value) {
        this.asiakirjaMetatiedot = value;
    }

}
