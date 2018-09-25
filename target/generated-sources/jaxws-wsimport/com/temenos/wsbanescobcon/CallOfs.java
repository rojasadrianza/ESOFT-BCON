
package com.temenos.wsbanescobcon;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for callOfs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="callOfs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OfsRequest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "callOfs", propOrder = {
    "ofsRequest"
})
public class CallOfs {

    @XmlElement(name = "OfsRequest")
    protected String ofsRequest;

    /**
     * Gets the value of the ofsRequest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfsRequest() {
        return ofsRequest;
    }

    /**
     * Sets the value of the ofsRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfsRequest(String value) {
        this.ofsRequest = value;
    }

}
