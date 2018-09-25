
package com.temenos.wsbanescobcon;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.temenos.buildcontrol.BUILDCONTROLType;


/**
 * <p>Java class for CreateT24BconUnit_ValidateResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateT24BconUnit_ValidateResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Status" type="{http://temenos.com/WSBanescoBCON}Status" minOccurs="0"/>
 *         &lt;element name="BUILDCONTROLType" type="{http://temenos.com/BUILDCONTROL}BUILDCONTROLType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateT24BconUnit_ValidateResponse", propOrder = {
    "status",
    "buildcontrolType"
})
public class CreateT24BconUnitValidateResponse {

    @XmlElement(name = "Status")
    protected Status status;
    @XmlElement(name = "BUILDCONTROLType")
    protected BUILDCONTROLType buildcontrolType;

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
     * Gets the value of the buildcontrolType property.
     * 
     * @return
     *     possible object is
     *     {@link BUILDCONTROLType }
     *     
     */
    public BUILDCONTROLType getBUILDCONTROLType() {
        return buildcontrolType;
    }

    /**
     * Sets the value of the buildcontrolType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BUILDCONTROLType }
     *     
     */
    public void setBUILDCONTROLType(BUILDCONTROLType value) {
        this.buildcontrolType = value;
    }

}
