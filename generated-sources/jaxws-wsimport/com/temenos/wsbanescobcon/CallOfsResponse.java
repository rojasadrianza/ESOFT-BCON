
package com.temenos.wsbanescobcon;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for callOfsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="callOfsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Status" type="{http://temenos.com/WSBanescoBCON}Status" minOccurs="0"/>
 *         &lt;element name="OfsResponse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "callOfsResponse", propOrder = {
    "status",
    "ofsResponse"
})
public class CallOfsResponse {

    @XmlElement(name = "Status")
    protected Status status;
    @XmlElement(name = "OfsResponse")
    protected String ofsResponse;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setStatus(Status value) {
        this.status = value;
    }

    /**
     * Gets the value of the ofsResponse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfsResponse() {
        return ofsResponse;
    }

    /**
     * Sets the value of the ofsResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfsResponse(String value) {
        this.ofsResponse = value;
    }

}
