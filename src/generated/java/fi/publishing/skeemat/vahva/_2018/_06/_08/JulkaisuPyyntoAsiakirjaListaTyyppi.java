
package fi.publishing.skeemat.vahva._2018._06._08;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JulkaisuPyyntoAsiakirjaListaTyyppi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JulkaisuPyyntoAsiakirjaListaTyyppi"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="asiakirja" type="{http://www.publishing.fi/skeemat/vahva/2018/06/08}JulkaisuPyyntoAsiakirjaTyyppi" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JulkaisuPyyntoAsiakirjaListaTyyppi", propOrder = {
    "asiakirja"
})
public class JulkaisuPyyntoAsiakirjaListaTyyppi {

    protected List<JulkaisuPyyntoAsiakirjaTyyppi> asiakirja;

    /**
     * Gets the value of the asiakirja property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the asiakirja property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAsiakirja().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JulkaisuPyyntoAsiakirjaTyyppi }
     * 
     * 
     */
    public List<JulkaisuPyyntoAsiakirjaTyyppi> getAsiakirja() {
        if (asiakirja == null) {
            asiakirja = new ArrayList<JulkaisuPyyntoAsiakirjaTyyppi>();
        }
        return this.asiakirja;
    }

}
