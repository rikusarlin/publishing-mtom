
package fi.publishing.skeemat.vahva._2018._06._08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for JulkaisuLupaTyyppi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JulkaisuLupaTyyppi"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vastaanottaja" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="istuntoNumero" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="istuntoTyyppi" type="{http://www.publishing.fi/skeemat/vahva/2018/06/08}IstuntoTyyppiKoodi"/&gt;
 *         &lt;element name="istuntoAjankohta" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JulkaisuLupaTyyppi", propOrder = {
    "vastaanottaja",
    "istuntoNumero",
    "istuntoTyyppi",
    "istuntoAjankohta"
})
public class JulkaisuLupaTyyppi {

    @XmlElement(required = true)
    protected String vastaanottaja;
    @XmlElement(required = true)
    protected String istuntoNumero;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected IstuntoTyyppiKoodi istuntoTyyppi;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar istuntoAjankohta;

    /**
     * Gets the value of the vastaanottaja property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVastaanottaja() {
        return vastaanottaja;
    }

    /**
     * Sets the value of the vastaanottaja property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVastaanottaja(String value) {
        this.vastaanottaja = value;
    }

    /**
     * Gets the value of the istuntoNumero property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIstuntoNumero() {
        return istuntoNumero;
    }

    /**
     * Sets the value of the istuntoNumero property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIstuntoNumero(String value) {
        this.istuntoNumero = value;
    }

    /**
     * Gets the value of the istuntoTyyppi property.
     * 
     * @return
     *     possible object is
     *     {@link IstuntoTyyppiKoodi }
     *     
     */
    public IstuntoTyyppiKoodi getIstuntoTyyppi() {
        return istuntoTyyppi;
    }

    /**
     * Sets the value of the istuntoTyyppi property.
     * 
     * @param value
     *     allowed object is
     *     {@link IstuntoTyyppiKoodi }
     *     
     */
    public void setIstuntoTyyppi(IstuntoTyyppiKoodi value) {
        this.istuntoTyyppi = value;
    }

    /**
     * Gets the value of the istuntoAjankohta property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIstuntoAjankohta() {
        return istuntoAjankohta;
    }

    /**
     * Sets the value of the istuntoAjankohta property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIstuntoAjankohta(XMLGregorianCalendar value) {
        this.istuntoAjankohta = value;
    }

}
