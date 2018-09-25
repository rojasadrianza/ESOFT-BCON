
package com.temenos.wsbanescobcon;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.temenos.buildcontrol.BUILDCONTROLType;


/**
 * <p>Java class for CreateT24BconUnit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateT24BconUnit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WebRequestCommon" type="{http://temenos.com/WSBanescoBCON}webRequestCommon" minOccurs="0"/>
 *         &lt;element name="OfsFunction" type="{http://temenos.com/WSBanescoBCON}ofsFunction" minOccurs="0"/>
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
@XmlType(name = "CreateT24BconUnit", propOrder = {
    "webRequestCommon",
    "ofsFunction",
    "buildcontrolType"
})
public class CreateT24BconUnit {

    @XmlElement(name = "WebRequestCommon")
    protected WebRequestCommon webRequestCommon;
    @XmlElement(name = "OfsFunction")
    protected OfsFunction ofsFunction;
    @XmlElement(name = "BUILDCONTROLType")
    protected BUILDCONTROLType buildcontrolType;

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
     * Gets the value of the ofsFunction property.
     * 
     * @return
     *     possible object is
     *     {@link OfsFunction }
     *     
     */
    public OfsFunction getOfsFunction() {
        return ofsFunction;
    }

    /**
     * Sets the value of the ofsFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfsFunction }
     *     
     */
    public void setOfsFunction(OfsFunction value) {
        this.ofsFunction = value;
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
