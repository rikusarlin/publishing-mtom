
package fi.publishing.skeemat.vahva._2018._06._08;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LahetyksenTyyppiKoodi.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LahetyksenTyyppiKoodi"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Julkaisupyyntö"/&gt;
 *     &lt;enumeration value="Julkaisulupa"/&gt;
 *     &lt;enumeration value="Korjaus"/&gt;
 *     &lt;enumeration value="Vastaus"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LahetyksenTyyppiKoodi")
@XmlEnum
public enum LahetyksenTyyppiKoodi {

    @XmlEnumValue("Julkaisupyynt\u00f6")
    JULKAISUPYYNTÖ("Julkaisupyynt\u00f6"),
    @XmlEnumValue("Julkaisulupa")
    JULKAISULUPA("Julkaisulupa"),
    @XmlEnumValue("Korjaus")
    KORJAUS("Korjaus"),
    @XmlEnumValue("Vastaus")
    VASTAUS("Vastaus");
    private final String value;

    LahetyksenTyyppiKoodi(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LahetyksenTyyppiKoodi fromValue(String v) {
        for (LahetyksenTyyppiKoodi c: LahetyksenTyyppiKoodi.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
