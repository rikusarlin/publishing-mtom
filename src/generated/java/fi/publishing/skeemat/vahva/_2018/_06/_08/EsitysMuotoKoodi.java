
package fi.publishing.skeemat.vahva._2018._06._08;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EsitysMuotoKoodi.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EsitysMuotoKoodi"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="XML"/&gt;
 *     &lt;enumeration value="Alkuperäinen"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EsitysMuotoKoodi")
@XmlEnum
public enum EsitysMuotoKoodi {

    XML("XML"),
    @XmlEnumValue("Alkuper\u00e4inen")
    ALKUPERÄINEN("Alkuper\u00e4inen");
    private final String value;

    EsitysMuotoKoodi(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EsitysMuotoKoodi fromValue(String v) {
        for (EsitysMuotoKoodi c: EsitysMuotoKoodi.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
