
package fi.publishing.skeemat.vahva._2018._06._08;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AsiakirjanTilaKoodi.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AsiakirjanTilaKoodi"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Korjattavana"/&gt;
 *     &lt;enumeration value="Valmis"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AsiakirjanTilaKoodi")
@XmlEnum
public enum AsiakirjanTilaKoodi {

    @XmlEnumValue("Korjattavana")
    KORJATTAVANA("Korjattavana"),
    @XmlEnumValue("Valmis")
    VALMIS("Valmis");
    private final String value;

    AsiakirjanTilaKoodi(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AsiakirjanTilaKoodi fromValue(String v) {
        for (AsiakirjanTilaKoodi c: AsiakirjanTilaKoodi.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
