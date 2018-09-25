
package com.temenos.wsbanescobcon;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.temenos.buildcontrolerrors.BUILDCONTROLERRORSType;


/**
 * <p>Java class for ViewtheErrorsofaBCONunitResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ViewtheErrorsofaBCONunitResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Status" type="{http://temenos.com/WSBanescoBCON}Status" minOccurs="0"/>
 *         &lt;element name="BUILDCONTROLERRORSType" type="{http://temenos.com/BUILDCONTROLERRORS}BUILDCONTROLERRORSType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViewtheErrorsofaBCONunitResponse", propOrder = {
    "status",
    "buildcontrolerrorsType"
})
public class ViewtheErrorsofaBCONunitResponse {

    @XmlElement(name = "Status")
    protected Status status;
    @XmlElement(name = "BUILDCONTROLERRORSType")
    protected List<BUILDCONTROLERRORSType> buildcontrolerrorsType;

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
     * Gets the value of the buildcontrolerrorsType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the buildcontrolerrorsType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBUILDCONTROLERRORSType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BUILDCONTROLERRORSType }
     * 
     * 
     */
    public List<BUILDCONTROLERRORSType> getBUILDCONTROLERRORSType() {
        if (buildcontrolerrorsType == null) {
            buildcontrolerrorsType = new ArrayList<BUILDCONTROLERRORSType>();
        }
        return this.buildcontrolerrorsType;
    }

}
