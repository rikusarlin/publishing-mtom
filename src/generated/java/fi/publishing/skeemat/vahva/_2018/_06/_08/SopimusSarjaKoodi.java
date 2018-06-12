
package fi.publishing.skeemat.vahva._2018._06._08;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SopimusSarjaKoodi.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SopimusSarjaKoodi"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Sopimussarja"/&gt;
 *     &lt;enumeration value="Säädöskokoelma"/&gt;
 *     &lt;enumeration value="Molemmat"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SopimusSarjaKoodi")
@XmlEnum
public enum SopimusSarjaKoodi {

    @XmlEnumValue("Sopimussarja")
    SOPIMUSSARJA("Sopimussarja"),
    @XmlEnumValue("S\u00e4\u00e4d\u00f6skokoelma")
    SÄÄDÖSKOKOELMA("S\u00e4\u00e4d\u00f6skokoelma"),
    @XmlEnumValue("Molemmat")
    MOLEMMAT("Molemmat");
    private final String value;

    SopimusSarjaKoodi(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SopimusSarjaKoodi fromValue(String v) {
        for (SopimusSarjaKoodi c: SopimusSarjaKoodi.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
