
package fi.publishing.skeemat.vahva._2018._06._08;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaatosTyyppiKoodi.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaatosTyyppiKoodi"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Painolupa"/&gt;
 *     &lt;enumeration value="Ennakkotieto"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PaatosTyyppiKoodi")
@XmlEnum
public enum PaatosTyyppiKoodi {

    @XmlEnumValue("Painolupa")
    PAINOLUPA("Painolupa"),
    @XmlEnumValue("Ennakkotieto")
    ENNAKKOTIETO("Ennakkotieto");
    private final String value;

    PaatosTyyppiKoodi(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaatosTyyppiKoodi fromValue(String v) {
        for (PaatosTyyppiKoodi c: PaatosTyyppiKoodi.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
