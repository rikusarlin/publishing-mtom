
package fi.publishing.skeemat.vahva._2018._06._08;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VedosTyyppiKoodi.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VedosTyyppiKoodi"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Paperi"/&gt;
 *     &lt;enumeration value="Taitettu Pdf"/&gt;
 *     &lt;enumeration value="Ei"/&gt;
 *     &lt;enumeration value="Muu"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VedosTyyppiKoodi")
@XmlEnum
public enum VedosTyyppiKoodi {

    @XmlEnumValue("Paperi")
    PAPERI("Paperi"),
    @XmlEnumValue("Taitettu Pdf")
    TAITETTU_PDF("Taitettu Pdf"),
    @XmlEnumValue("Ei")
    EI("Ei"),
    @XmlEnumValue("Muu")
    MUU("Muu");
    private final String value;

    VedosTyyppiKoodi(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VedosTyyppiKoodi fromValue(String v) {
        for (VedosTyyppiKoodi c: VedosTyyppiKoodi.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
