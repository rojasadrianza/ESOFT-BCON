
package com.temenos.wsbanescobcon;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateBconPhysicUnit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateBconPhysicUnit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WebRequestCommon" type="{http://temenos.com/WSBanescoBCON}webRequestCommon" minOccurs="0"/>
 *         &lt;element name="BUILDCONTROLType" type="{http://temenos.com/WSBanescoBCON}transactionId" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateBconPhysicUnit", propOrder = {
    "webRequestCommon",
    "buildcontrolType"
})
public class CreateBconPhysicUnit {

    @XmlElement(name = "WebRequestCommon")
    protected WebRequestCommon webRequestCommon;
    @XmlElement(name = "BUILDCONTROLType")
    protected TransactionId buildcontrolType;

    /**
     * Gets the value of the webRequestCommon property.
     * 
     * @return
     *     possible object is
     *     {@link WebRequestCommon }
     *     
     */
    public WebRequestCommon getWebRequestCommon() {
        return webRequestCommon;
    }

    /**
     * Sets the value of the webRequestCommon property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebRequestCommon }
     *     
     */
    public void setWebRequestCommon(WebRequestCommon value) {
        this.webRequestCommon = value;
    }

    /**
     * Gets the value of the buildcontrolType property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionId }
     *     
     */
    public TransactionId getBUILDCONTROLType() {
        return buildcontrolType;
    }

    /**
     * Sets the value of the buildcontrolType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionId }
     *     
     */
    public void setBUILDCONTROLType(TransactionId value) {
        this.buildcontrolType = value;
    }

}
