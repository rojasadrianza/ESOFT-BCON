
package com.temenos.buildcontrolresults;

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
 * <p>Java class for BUILDCONTROLRESULTSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BUILDCONTROLRESULTSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gBUILDCONTROLRESULTSDetailType" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mBUILDCONTROLRESULTSDetailType" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PackageName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="HDRLIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ACTIVITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ProcessInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "BUILDCONTROLRESULTSType", propOrder = {
    "gbuildcontrolresultsDetailType"
})
public class BUILDCONTROLRESULTSType {

    @XmlElement(name = "gBUILDCONTROLRESULTSDetailType")
    protected BUILDCONTROLRESULTSType.GBUILDCONTROLRESULTSDetailType gbuildcontrolresultsDetailType;

    /**
     * Gets the value of the gbuildcontrolresultsDetailType property.
     * 
     * @return
     *     possible object is
     *     {@link BUILDCONTROLRESULTSType.GBUILDCONTROLRESULTSDetailType }
     *     
     */
    public BUILDCONTROLRESULTSType.GBUILDCONTROLRESULTSDetailType getGBUILDCONTROLRESULTSDetailType() {
        return gbuildcontrolresultsDetailType;
    }

    /**
     * Sets the value of the gbuildcontrolresultsDetailType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BUILDCONTROLRESULTSType.GBUILDCONTROLRESULTSDetailType }
     *     
     */
    public void setGBUILDCONTROLRESULTSDetailType(BUILDCONTROLRESULTSType.GBUILDCONTROLRESULTSDetailType value) {
        this.gbuildcontrolresultsDetailType = value;
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
     *         &lt;element name="mBUILDCONTROLRESULTSDetailType" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PackageName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="HDRLIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ACTIVITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ProcessInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "mbuildcontrolresultsDetailType"
    })
    public static class GBUILDCONTROLRESULTSDetailType {

        @XmlElement(name = "mBUILDCONTROLRESULTSDetailType")
        protected List<BUILDCONTROLRESULTSType.GBUILDCONTROLRESULTSDetailType.MBUILDCONTROLRESULTSDetailType> mbuildcontrolresultsDetailType;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mbuildcontrolresultsDetailType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mbuildcontrolresultsDetailType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMBUILDCONTROLRESULTSDetailType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BUILDCONTROLRESULTSType.GBUILDCONTROLRESULTSDetailType.MBUILDCONTROLRESULTSDetailType }
         * 
         * 
         */
        public List<BUILDCONTROLRESULTSType.GBUILDCONTROLRESULTSDetailType.MBUILDCONTROLRESULTSDetailType> getMBUILDCONTROLRESULTSDetailType() {
            if (mbuildcontrolresultsDetailType == null) {
                mbuildcontrolresultsDetailType = new ArrayList<BUILDCONTROLRESULTSType.GBUILDCONTROLRESULTSDetailType.MBUILDCONTROLRESULTSDetailType>();
            }
            return this.mbuildcontrolresultsDetailType;
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
         *         &lt;element name="ACTIVITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ProcessInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "activity",
            "processInfo"
        })
        public static class MBUILDCONTROLRESULTSDetailType {

            @XmlElement(name = "PackageName")
            protected String packageName;
            @XmlElement(name = "HDRLIT")
            protected String hdrlit;
            @XmlElement(name = "ID")
            protected String id;
            @XmlElement(name = "ACTIVITY")
            protected String activity;
            @XmlElement(name = "ProcessInfo")
            protected String processInfo;
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
             * Gets the value of the activity property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getACTIVITY() {
                return activity;
            }

            /**
             * Sets the value of the activity property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setACTIVITY(String value) {
                this.activity = value;
            }

            /**
             * Gets the value of the processInfo property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProcessInfo() {
                return processInfo;
            }

            /**
             * Sets the value of the processInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProcessInfo(String value) {
                this.processInfo = value;
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
