
package fi.publishing.skeemat.vahva._2018._06._08;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ToimituksenTyyppiKoodi.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ToimituksenTyyppiKoodi"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Taitto"/&gt;
 *     &lt;enumeration value="Taitto ja vedos"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ToimituksenTyyppiKoodi")
@XmlEnum
public enum ToimituksenTyyppiKoodi {


    /**
     * Toimituksessa mukana taitettu lopputulos
     * 
     */
    @XmlEnumValue("Taitto")
    TAITTO("Taitto"),

    /**
     * Toimituksessa mukana sekä taitettu lopputulos että vedos
     * 
     */
    @XmlEnumValue("Taitto ja vedos")
    TAITTO_JA_VEDOS("Taitto ja vedos");
    private final String value;

    ToimituksenTyyppiKoodi(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ToimituksenTyyppiKoodi fromValue(String v) {
        for (ToimituksenTyyppiKoodi c: ToimituksenTyyppiKoodi.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
