
package fi.publishing.skeemat.vahva._2018._06._08;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PyynnonLaatuKoodi.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PyynnonLaatuKoodi"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Eduskuntakappaleet"/&gt;
 *     &lt;enumeration value="Säädöskokoelmaan"/&gt;
 *     &lt;enumeration value="Muu"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PyynnonLaatuKoodi")
@XmlEnum
public enum PyynnonLaatuKoodi {

    @XmlEnumValue("Eduskuntakappaleet")
    EDUSKUNTAKAPPALEET("Eduskuntakappaleet"),
    @XmlEnumValue("S\u00e4\u00e4d\u00f6skokoelmaan")
    SÄÄDÖSKOKOELMAAN("S\u00e4\u00e4d\u00f6skokoelmaan"),
    @XmlEnumValue("Muu")
    MUU("Muu");
    private final String value;

    PyynnonLaatuKoodi(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PyynnonLaatuKoodi fromValue(String v) {
        for (PyynnonLaatuKoodi c: PyynnonLaatuKoodi.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
