
package fi.publishing.skeemat.vahva._2018._06._08;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JulkaisuTiedotListaTyyppi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JulkaisuTiedotListaTyyppi"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="julkaisu" type="{http://www.publishing.fi/skeemat/vahva/2018/06/08}JulkaisuTiedotTyyppi" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JulkaisuTiedotListaTyyppi", propOrder = {
    "julkaisu"
})
public class JulkaisuTiedotListaTyyppi {

    protected List<JulkaisuTiedotTyyppi> julkaisu;

    /**
     * Gets the value of the julkaisu property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the julkaisu property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJulkaisu().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JulkaisuTiedotTyyppi }
     * 
     * 
     */
    public List<JulkaisuTiedotTyyppi> getJulkaisu() {
        if (julkaisu == null) {
            julkaisu = new ArrayList<JulkaisuTiedotTyyppi>();
        }
        return this.julkaisu;
    }

}
