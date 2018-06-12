
package fi.publishing.skeemat.vahva._2018._06._08;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IstuntoTyyppiKoodi.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IstuntoTyyppiKoodi"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RV"/&gt;
 *     &lt;enumeration value="VN"/&gt;
 *     &lt;enumeration value="TP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IstuntoTyyppiKoodi")
@XmlEnum
public enum IstuntoTyyppiKoodi {


    /**
     * Raha-asiain valiokunnan
     * 						istunto
     * 
     */
    RV,

    /**
     * Valtioneuvoston
     * 						yleisistunto
     * 
     */
    VN,

    /**
     * Tasavallan presidentin
     * 						esittely
     * 
     */
    TP;

    public String value() {
        return name();
    }

    public static IstuntoTyyppiKoodi fromValue(String v) {
        return valueOf(v);
    }

}
