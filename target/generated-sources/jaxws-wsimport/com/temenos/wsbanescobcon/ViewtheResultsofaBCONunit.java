
package com.temenos.wsbanescobcon;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ViewtheResultsofaBCONunit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ViewtheResultsofaBCONunit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WebRequestCommon" type="{http://temenos.com/WSBanescoBCON}webRequestCommon" minOccurs="0"/>
 *         &lt;element name="BUILDCONTROLRESULTSType" type="{http://temenos.com/WSBanescoBCON}enquiryInput" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViewtheResultsofaBCONunit", propOrder = {
    "webRequestCommon",
    "buildcontrolresultsType"
})
public class ViewtheResultsofaBCONunit {

    @XmlElement(name = "WebRequestCommon")
    protected WebRequestCommon webRequestCommon;
    @XmlElement(name = "BUILDCONTROLRESULTSType")
    protected EnquiryInput buildcontrolresultsType;

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
     * Gets the value of the buildcontrolresultsType property.
     * 
     * @return
     *     possible object is
     *     {@link EnquiryInput }
     *     
     */
    public EnquiryInput getBUILDCONTROLRESULTSType() {
        return buildcontrolresultsType;
    }

    /**
     * Sets the value of the buildcontrolresultsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnquiryInput }
     *     
     */
    public void setBUILDCONTROLRESULTSType(EnquiryInput value) {
        this.buildcontrolresultsType = value;
    }

}
