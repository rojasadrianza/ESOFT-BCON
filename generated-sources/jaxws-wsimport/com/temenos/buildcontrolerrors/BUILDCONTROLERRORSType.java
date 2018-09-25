
package com.temenos.buildcontrolerrors;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BUILDCONTROLERRORSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BUILDCONTROLERRORSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gBUILDCONTROLERRORSDetailType" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mBUILDCONTROLERRORSDetailType" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PackageName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="HDRLIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ProcessErrors" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="RecordTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="m" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BUILDCONTROLERRORSType", propOrder = {
    "gbuildcontrolerrorsDetailType"
})
public class BUILDCONTROLERRORSType {

    @XmlElement(name = "gBUILDCONTROLERRORSDetailType")
    protected BUILDCONTROLERRORSType.GBUILDCONTROLERRORSDetailType gbuildcontrolerrorsDetailType;

    /**
     * Gets the value of the gbuildcontrolerrorsDetailType property.
     * 
     * @return
     *     possible object is
     *     {@link BUILDCONTROLERRORSType.GBUILDCONTROLERRORSDetailType }
     *     
     */
    public BUILDCONTROLERRORSType.GBUILDCONTROLERRORSDetailType getGBUILDCONTROLERRORSDetailType() {
        return gbuildcontrolerrorsDetailType;
    }

    /**
     * Sets the value of the gbuildcontrolerrorsDetailType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BUILDCONTROLERRORSType.GBUILDCONTROLERRORSDetailType }
     *     
     */
    public void setGBUILDCONTROLERRORSDetailType(BUILDCONTROLERRORSType.GBUILDCONTROLERRORSDetailType value) {
        this.gbuildcontrolerrorsDetailType = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="mBUILDCONTROLERRORSDetailType" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PackageName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="HDRLIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ProcessErrors" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="RecordTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="m" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "mbuildcontrolerrorsDetailType"
    })
    public static class GBUILDCONTROLERRORSDetailType {

        @XmlElement(name = "mBUILDCONTROLERRORSDetailType")
        protected List<BUILDCONTROLERRORSType.GBUILDCONTROLERRORSDetailType.MBUILDCONTROLERRORSDetailType> mbuildcontrolerrorsDetailType;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mbuildcontrolerrorsDetailType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mbuildcontrolerrorsDetailType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMBUILDCONTROLERRORSDetailType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BUILDCONTROLERRORSType.GBUILDCONTROLERRORSDetailType.MBUILDCONTROLERRORSDetailType }
         * 
         * 
         */
        public List<BUILDCONTROLERRORSType.GBUILDCONTROLERRORSDetailType.MBUILDCONTROLERRORSDetailType> getMBUILDCONTROLERRORSDetailType() {
            if (mbuildcontrolerrorsDetailType == null) {
                mbuildcontrolerrorsDetailType = new ArrayList<BUILDCONTROLERRORSType.GBUILDCONTROLERRORSDetailType.MBUILDCONTROLERRORSDetailType>();
            }
            return this.mbuildcontrolerrorsDetailType;
        }

        /**
         * Gets the value of the g property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getG() {
            return g;
        }

        /**
         * Sets the value of the g property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setG(BigInteger value) {
            this.g = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="PackageName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="HDRLIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ProcessErrors" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="RecordTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="m" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "packageName",
            "hdrlit",
            "id",
            "processErrors",
            "recordTime"
        })
        public static class MBUILDCONTROLERRORSDetailType {

            @XmlElement(name = "PackageName")
            protected String packageName;
            @XmlElement(name = "HDRLIT")
            protected String hdrlit;
            @XmlElement(name = "ID")
            protected String id;
            @XmlElement(name = "ProcessErrors")
            protected String processErrors;
            @XmlElement(name = "RecordTime")
            protected String recordTime;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the packageName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPackageName() {
                return packageName;
            }

            /**
             * Sets the value of the packageName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPackageName(String value) {
                this.packageName = value;
            }

            /**
             * Gets the value of the hdrlit property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHDRLIT() {
                return hdrlit;
            }

            /**
             * Sets the value of the hdrlit property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHDRLIT(String value) {
                this.hdrlit = value;
            }

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getID() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setID(String value) {
                this.id = value;
            }

            /**
             * Gets the value of the processErrors property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProcessErrors() {
                return processErrors;
            }

            /**
             * Sets the value of the processErrors property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProcessErrors(String value) {
                this.processErrors = value;
            }

            /**
             * Gets the value of the recordTime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRecordTime() {
                return recordTime;
            }

            /**
             * Sets the value of the recordTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRecordTime(String value) {
                this.recordTime = value;
            }

            /**
             * Gets the value of the m property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getM() {
                return m;
            }

            /**
             * Sets the value of the m property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setM(BigInteger value) {
                this.m = value;
            }

        }

    }

}
