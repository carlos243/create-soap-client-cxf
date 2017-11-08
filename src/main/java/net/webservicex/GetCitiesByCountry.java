
package net.webservicex;

import javax.xml.bind.annotation.*;


/**
 * <p>Clase Java para anonymous complex type.
 * <p>
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CountryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "countryName"
})
@XmlRootElement(name = "GetCitiesByCountry")
public class GetCitiesByCountry {

    @XmlElement(name = "CountryName")
    protected String countryName;

    /**
     * Obtiene el valor de la propiedad countryName.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * Define el valor de la propiedad countryName.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCountryName(String value) {
        this.countryName = value;
    }

}
