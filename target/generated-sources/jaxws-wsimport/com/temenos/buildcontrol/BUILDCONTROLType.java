
package com.temenos.buildcontrol;

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
 * <p>Java class for BUILDCONTROLType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BUILDCONTROLType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gLLDESC" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mLLDESC" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="sgLLDESC" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="DESC" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
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
 *         &lt;element name="MNEMONIC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BCONPRODUCT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAVEPATH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RELEASEPATH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gPROGRAMBP" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mPROGRAMBP" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PROGRAMBP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="sgSELECTCMD" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="SELECTCMD" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="SELECTCMD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="MVRESERVED9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="RELEASEBP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="gJBCDEVLIB" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="JBCDEVLIB" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="gJBCDEVBIN" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="JBCDEVBIN" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OBJNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gDEPENDENCY" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DEPENDENCY" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="gOURREFERENCE" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mOURREFERENCE" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="OURREFERENCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="THEIRREFERENCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ISSUEDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="OFSSOURCEID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gDLDEFINE" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mDLDEFINE" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="DLDEFINE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="FROMCOMPANY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="TOCOMPANY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="gLOCREFTABLE" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mLOCREFTABLE" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="LOCREFTABLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="sgLOCALTABLE" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="LOCALTABLE" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="LOCALTABLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="TABLEASSOC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
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
 *         &lt;element name="gSSAPPLNAME" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mSSAPPLNAME" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="SSAPPLNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="USRFIELDNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="USRTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="sgUSRFIELDNO" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="USRFIELDNO" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="USRFIELDNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="sgUSRVALPROG" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="USRVALPROG" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="USRVALPROG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="USRCONVERSION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="USRDISPLAYFMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="USRALTINDEX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="USRIDXFILE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="USRINDEXNULLS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="USRSINGLEMULT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="USRLANGFIELD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="USRCNVTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="USRRELFILE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="SSRESVD42" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BUILDNEWDICT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WSFILENAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WSRECORDNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GENINSTALLDOC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UPDTABLENAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UPDCOMPANY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UPDRECORD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UPDFIELD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UPDVALUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MVRESVD59" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FILEVOCID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FILESTOCREATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SHELLCMD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RELEASEORDER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AUTHSPLINSTR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CREATELIB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CREATEBIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CREATERELBP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DLSAVEPATH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DLRESTOREPATH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PROGRAMOS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CLRPROCESSLOG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACTIVITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PROCESSINFO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PROCESSERR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAVEDDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAVEDVERSION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAVEDUSER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RELEASEDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RELEASEVERSION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RELEASEUSER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RELSTAGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VIEWREPORT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REMOVESOURCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PREINSTALL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="POSTINSTALL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DOCIDNEW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ADDNLSYSREQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BCONFUNCTIONALITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DELOTHERCOMPRECS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RECORDSTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CURRNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INPUTTER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DATETIME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AUTHORISER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DEPTCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AUDITORCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AUDITDATETIME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BUILDCONTROLType", propOrder = {
    "glldesc",
    "mnemonic",
    "action",
    "bconproduct",
    "savepath",
    "releasepath",
    "gprogrambp",
    "gjbcdevlib",
    "gjbcdevbin",
    "objname",
    "gdependency",
    "gourreference",
    "ofssourceid",
    "gdldefine",
    "glocreftable",
    "gssapplname",
    "ssresvd42",
    "buildnewdict",
    "wsfilename",
    "wsrecordname",
    "geninstalldoc",
    "updtablename",
    "updcompany",
    "updrecord",
    "updfield",
    "updvalue",
    "mvresvd59",
    "filevocid",
    "filestocreate",
    "shellcmd",
    "releaseorder",
    "authsplinstr",
    "createlib",
    "createbin",
    "createrelbp",
    "dlsavepath",
    "dlrestorepath",
    "programos",
    "clrprocesslog",
    "activity",
    "processinfo",
    "processerr",
    "saveddate",
    "savedversion",
    "saveduser",
    "releasedate",
    "releaseversion",
    "releaseuser",
    "relstage",
    "viewreport",
    "removesource",
    "preinstall",
    "postinstall",
    "docidnew",
    "addnlsysreq",
    "bconfunctionality",
    "delothercomprecs",
    "recordstatus",
    "currno",
    "inputter",
    "datetime",
    "authoriser",
    "cocode",
    "deptcode",
    "auditorcode",
    "auditdatetime"
})
public class BUILDCONTROLType {

    @XmlElement(name = "gLLDESC")
    protected BUILDCONTROLType.GLLDESC glldesc;
    @XmlElement(name = "MNEMONIC")
    protected String mnemonic;
    @XmlElement(name = "ACTION")
    protected String action;
    @XmlElement(name = "BCONPRODUCT")
    protected String bconproduct;
    @XmlElement(name = "SAVEPATH")
    protected String savepath;
    @XmlElement(name = "RELEASEPATH")
    protected String releasepath;
    @XmlElement(name = "gPROGRAMBP")
    protected BUILDCONTROLType.GPROGRAMBP gprogrambp;
    @XmlElement(name = "gJBCDEVLIB")
    protected BUILDCONTROLType.GJBCDEVLIB gjbcdevlib;
    @XmlElement(name = "gJBCDEVBIN")
    protected BUILDCONTROLType.GJBCDEVBIN gjbcdevbin;
    @XmlElement(name = "OBJNAME")
    protected String objname;
    @XmlElement(name = "gDEPENDENCY")
    protected BUILDCONTROLType.GDEPENDENCY gdependency;
    @XmlElement(name = "gOURREFERENCE")
    protected BUILDCONTROLType.GOURREFERENCE gourreference;
    @XmlElement(name = "OFSSOURCEID")
    protected String ofssourceid;
    @XmlElement(name = "gDLDEFINE")
    protected BUILDCONTROLType.GDLDEFINE gdldefine;
    @XmlElement(name = "gLOCREFTABLE")
    protected BUILDCONTROLType.GLOCREFTABLE glocreftable;
    @XmlElement(name = "gSSAPPLNAME")
    protected BUILDCONTROLType.GSSAPPLNAME gssapplname;
    @XmlElement(name = "SSRESVD42")
    protected String ssresvd42;
    @XmlElement(name = "BUILDNEWDICT")
    protected String buildnewdict;
    @XmlElement(name = "WSFILENAME")
    protected String wsfilename;
    @XmlElement(name = "WSRECORDNAME")
    protected String wsrecordname;
    @XmlElement(name = "GENINSTALLDOC")
    protected String geninstalldoc;
    @XmlElement(name = "UPDTABLENAME")
    protected String updtablename;
    @XmlElement(name = "UPDCOMPANY")
    protected String updcompany;
    @XmlElement(name = "UPDRECORD")
    protected String updrecord;
    @XmlElement(name = "UPDFIELD")
    protected String updfield;
    @XmlElement(name = "UPDVALUE")
    protected String updvalue;
    @XmlElement(name = "MVRESVD59")
    protected String mvresvd59;
    @XmlElement(name = "FILEVOCID")
    protected String filevocid;
    @XmlElement(name = "FILESTOCREATE")
    protected String filestocreate;
    @XmlElement(name = "SHELLCMD")
    protected String shellcmd;
    @XmlElement(name = "RELEASEORDER")
    protected String releaseorder;
    @XmlElement(name = "AUTHSPLINSTR")
    protected String authsplinstr;
    @XmlElement(name = "CREATELIB")
    protected String createlib;
    @XmlElement(name = "CREATEBIN")
    protected String createbin;
    @XmlElement(name = "CREATERELBP")
    protected String createrelbp;
    @XmlElement(name = "DLSAVEPATH")
    protected String dlsavepath;
    @XmlElement(name = "DLRESTOREPATH")
    protected String dlrestorepath;
    @XmlElement(name = "PROGRAMOS")
    protected String programos;
    @XmlElement(name = "CLRPROCESSLOG")
    protected String clrprocesslog;
    @XmlElement(name = "ACTIVITY")
    protected String activity;
    @XmlElement(name = "PROCESSINFO")
    protected String processinfo;
    @XmlElement(name = "PROCESSERR")
    protected String processerr;
    @XmlElement(name = "SAVEDDATE")
    protected String saveddate;
    @XmlElement(name = "SAVEDVERSION")
    protected String savedversion;
    @XmlElement(name = "SAVEDUSER")
    protected String saveduser;
    @XmlElement(name = "RELEASEDATE")
    protected String releasedate;
    @XmlElement(name = "RELEASEVERSION")
    protected String releaseversion;
    @XmlElement(name = "RELEASEUSER")
    protected String releaseuser;
    @XmlElement(name = "RELSTAGE")
    protected String relstage;
    @XmlElement(name = "VIEWREPORT")
    protected String viewreport;
    @XmlElement(name = "REMOVESOURCE")
    protected String removesource;
    @XmlElement(name = "PREINSTALL")
    protected String preinstall;
    @XmlElement(name = "POSTINSTALL")
    protected String postinstall;
    @XmlElement(name = "DOCIDNEW")
    protected String docidnew;
    @XmlElement(name = "ADDNLSYSREQ")
    protected String addnlsysreq;
    @XmlElement(name = "BCONFUNCTIONALITY")
    protected String bconfunctionality;
    @XmlElement(name = "DELOTHERCOMPRECS")
    protected String delothercomprecs;
    @XmlElement(name = "RECORDSTATUS")
    protected String recordstatus;
    @XmlElement(name = "CURRNO")
    protected String currno;
    @XmlElement(name = "INPUTTER")
    protected String inputter;
    @XmlElement(name = "DATETIME")
    protected String datetime;
    @XmlElement(name = "AUTHORISER")
    protected String authoriser;
    @XmlElement(name = "COCODE")
    protected String cocode;
    @XmlElement(name = "DEPTCODE")
    protected String deptcode;
    @XmlElement(name = "AUDITORCODE")
    protected String auditorcode;
    @XmlElement(name = "AUDITDATETIME")
    protected String auditdatetime;
    @XmlAttribute(name = "id")
    protected String id;

    /**
     * Gets the value of the glldesc property.
     * 
     * @return
     *     possible object is
     *     {@link BUILDCONTROLType.GLLDESC }
     *     
     */
    public BUILDCONTROLType.GLLDESC getGLLDESC() {
        return glldesc;
    }

    /**
     * Sets the value of the glldesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BUILDCONTROLType.GLLDESC }
     *     
     */
    public void setGLLDESC(BUILDCONTROLType.GLLDESC value) {
        this.glldesc = value;
    }

    /**
     * Gets the value of the mnemonic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMNEMONIC() {
        return mnemonic;
    }

    /**
     * Sets the value of the mnemonic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMNEMONIC(String value) {
        this.mnemonic = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACTION() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACTION(String value) {
        this.action = value;
    }

    /**
     * Gets the value of the bconproduct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBCONPRODUCT() {
        return bconproduct;
    }

    /**
     * Sets the value of the bconproduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBCONPRODUCT(String value) {
        this.bconproduct = value;
    }

    /**
     * Gets the value of the savepath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAVEPATH() {
        return savepath;
    }

    /**
     * Sets the value of the savepath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAVEPATH(String value) {
        this.savepath = value;
    }

    /**
     * Gets the value of the releasepath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRELEASEPATH() {
        return releasepath;
    }

    /**
     * Sets the value of the releasepath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRELEASEPATH(String value) {
        this.releasepath = value;
    }

    /**
     * Gets the value of the gprogrambp property.
     * 
     * @return
     *     possible object is
     *     {@link BUILDCONTROLType.GPROGRAMBP }
     *     
     */
    public BUILDCONTROLType.GPROGRAMBP getGPROGRAMBP() {
        return gprogrambp;
    }

    /**
     * Sets the value of the gprogrambp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BUILDCONTROLType.GPROGRAMBP }
     *     
     */
    public void setGPROGRAMBP(BUILDCONTROLType.GPROGRAMBP value) {
        this.gprogrambp = value;
    }

    /**
     * Gets the value of the gjbcdevlib property.
     * 
     * @return
     *     possible object is
     *     {@link BUILDCONTROLType.GJBCDEVLIB }
     *     
     */
    public BUILDCONTROLType.GJBCDEVLIB getGJBCDEVLIB() {
        return gjbcdevlib;
    }

    /**
     * Sets the value of the gjbcdevlib property.
     * 
     * @param value
     *     allowed object is
     *     {@link BUILDCONTROLType.GJBCDEVLIB }
     *     
     */
    public void setGJBCDEVLIB(BUILDCONTROLType.GJBCDEVLIB value) {
        this.gjbcdevlib = value;
    }

    /**
     * Gets the value of the gjbcdevbin property.
     * 
     * @return
     *     possible object is
     *     {@link BUILDCONTROLType.GJBCDEVBIN }
     *     
     */
    public BUILDCONTROLType.GJBCDEVBIN getGJBCDEVBIN() {
        return gjbcdevbin;
    }

    /**
     * Sets the value of the gjbcdevbin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BUILDCONTROLType.GJBCDEVBIN }
     *     
     */
    public void setGJBCDEVBIN(BUILDCONTROLType.GJBCDEVBIN value) {
        this.gjbcdevbin = value;
    }

    /**
     * Gets the value of the objname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOBJNAME() {
        return objname;
    }

    /**
     * Sets the value of the objname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOBJNAME(String value) {
        this.objname = value;
    }

    /**
     * Gets the value of the gdependency property.
     * 
     * @return
     *     possible object is
     *     {@link BUILDCONTROLType.GDEPENDENCY }
     *     
     */
    public BUILDCONTROLType.GDEPENDENCY getGDEPENDENCY() {
        return gdependency;
    }

    /**
     * Sets the value of the gdependency property.
     * 
     * @param value
     *     allowed object is
     *     {@link BUILDCONTROLType.GDEPENDENCY }
     *     
     */
    public void setGDEPENDENCY(BUILDCONTROLType.GDEPENDENCY value) {
        this.gdependency = value;
    }

    /**
     * Gets the value of the gourreference property.
     * 
     * @return
     *     possible object is
     *     {@link BUILDCONTROLType.GOURREFERENCE }
     *     
     */
    public BUILDCONTROLType.GOURREFERENCE getGOURREFERENCE() {
        return gourreference;
    }

    /**
     * Sets the value of the gourreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BUILDCONTROLType.GOURREFERENCE }
     *     
     */
    public void setGOURREFERENCE(BUILDCONTROLType.GOURREFERENCE value) {
        this.gourreference = value;
    }

    /**
     * Gets the value of the ofssourceid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOFSSOURCEID() {
        return ofssourceid;
    }

    /**
     * Sets the value of the ofssourceid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOFSSOURCEID(String value) {
        this.ofssourceid = value;
    }

    /**
     * Gets the value of the gdldefine property.
     * 
     * @return
     *     possible object is
     *     {@link BUILDCONTROLType.GDLDEFINE }
     *     
     */
    public BUILDCONTROLType.GDLDEFINE getGDLDEFINE() {
        return gdldefine;
    }

    /**
     * Sets the value of the gdldefine property.
     * 
     * @param value
     *     allowed object is
     *     {@link BUILDCONTROLType.GDLDEFINE }
     *     
     */
    public void setGDLDEFINE(BUILDCONTROLType.GDLDEFINE value) {
        this.gdldefine = value;
    }

    /**
     * Gets the value of the glocreftable property.
     * 
     * @return
     *     possible object is
     *     {@link BUILDCONTROLType.GLOCREFTABLE }
     *     
     */
    public BUILDCONTROLType.GLOCREFTABLE getGLOCREFTABLE() {
        return glocreftable;
    }

    /**
     * Sets the value of the glocreftable property.
     * 
     * @param value
     *     allowed object is
     *     {@link BUILDCONTROLType.GLOCREFTABLE }
     *     
     */
    public void setGLOCREFTABLE(BUILDCONTROLType.GLOCREFTABLE value) {
        this.glocreftable = value;
    }

    /**
     * Gets the value of the gssapplname property.
     * 
     * @return
     *     possible object is
     *     {@link BUILDCONTROLType.GSSAPPLNAME }
     *     
     */
    public BUILDCONTROLType.GSSAPPLNAME getGSSAPPLNAME() {
        return gssapplname;
    }

    /**
     * Sets the value of the gssapplname property.
     * 
     * @param value
     *     allowed object is
     *     {@link BUILDCONTROLType.GSSAPPLNAME }
     *     
     */
    public void setGSSAPPLNAME(BUILDCONTROLType.GSSAPPLNAME value) {
        this.gssapplname = value;
    }

    /**
     * Gets the value of the ssresvd42 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSRESVD42() {
        return ssresvd42;
    }

    /**
     * Sets the value of the ssresvd42 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSRESVD42(String value) {
        this.ssresvd42 = value;
    }

    /**
     * Gets the value of the buildnewdict property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBUILDNEWDICT() {
        return buildnewdict;
    }

    /**
     * Sets the value of the buildnewdict property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBUILDNEWDICT(String value) {
        this.buildnewdict = value;
    }

    /**
     * Gets the value of the wsfilename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWSFILENAME() {
        return wsfilename;
    }

    /**
     * Sets the value of the wsfilename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWSFILENAME(String value) {
        this.wsfilename = value;
    }

    /**
     * Gets the value of the wsrecordname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWSRECORDNAME() {
        return wsrecordname;
    }

    /**
     * Sets the value of the wsrecordname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWSRECORDNAME(String value) {
        this.wsrecordname = value;
    }

    /**
     * Gets the value of the geninstalldoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGENINSTALLDOC() {
        return geninstalldoc;
    }

    /**
     * Sets the value of the geninstalldoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGENINSTALLDOC(String value) {
        this.geninstalldoc = value;
    }

    /**
     * Gets the value of the updtablename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUPDTABLENAME() {
        return updtablename;
    }

    /**
     * Sets the value of the updtablename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUPDTABLENAME(String value) {
        this.updtablename = value;
    }

    /**
     * Gets the value of the updcompany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUPDCOMPANY() {
        return updcompany;
    }

    /**
     * Sets the value of the updcompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUPDCOMPANY(String value) {
        this.updcompany = value;
    }

    /**
     * Gets the value of the updrecord property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUPDRECORD() {
        return updrecord;
    }

    /**
     * Sets the value of the updrecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUPDRECORD(String value) {
        this.updrecord = value;
    }

    /**
     * Gets the value of the updfield property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUPDFIELD() {
        return updfield;
    }

    /**
     * Sets the value of the updfield property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUPDFIELD(String value) {
        this.updfield = value;
    }

    /**
     * Gets the value of the updvalue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUPDVALUE() {
        return updvalue;
    }

    /**
     * Sets the value of the updvalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUPDVALUE(String value) {
        this.updvalue = value;
    }

    /**
     * Gets the value of the mvresvd59 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMVRESVD59() {
        return mvresvd59;
    }

    /**
     * Sets the value of the mvresvd59 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMVRESVD59(String value) {
        this.mvresvd59 = value;
    }

    /**
     * Gets the value of the filevocid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFILEVOCID() {
        return filevocid;
    }

    /**
     * Sets the value of the filevocid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFILEVOCID(String value) {
        this.filevocid = value;
    }

    /**
     * Gets the value of the filestocreate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFILESTOCREATE() {
        return filestocreate;
    }

    /**
     * Sets the value of the filestocreate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFILESTOCREATE(String value) {
        this.filestocreate = value;
    }

    /**
     * Gets the value of the shellcmd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSHELLCMD() {
        return shellcmd;
    }

    /**
     * Sets the value of the shellcmd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSHELLCMD(String value) {
        this.shellcmd = value;
    }

    /**
     * Gets the value of the releaseorder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRELEASEORDER() {
        return releaseorder;
    }

    /**
     * Sets the value of the releaseorder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRELEASEORDER(String value) {
        this.releaseorder = value;
    }

    /**
     * Gets the value of the authsplinstr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUTHSPLINSTR() {
        return authsplinstr;
    }

    /**
     * Sets the value of the authsplinstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUTHSPLINSTR(String value) {
        this.authsplinstr = value;
    }

    /**
     * Gets the value of the createlib property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCREATELIB() {
        return createlib;
    }

    /**
     * Sets the value of the createlib property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCREATELIB(String value) {
        this.createlib = value;
    }

    /**
     * Gets the value of the createbin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCREATEBIN() {
        return createbin;
    }

    /**
     * Sets the value of the createbin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCREATEBIN(String value) {
        this.createbin = value;
    }

    /**
     * Gets the value of the createrelbp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCREATERELBP() {
        return createrelbp;
    }

    /**
     * Sets the value of the createrelbp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCREATERELBP(String value) {
        this.createrelbp = value;
    }

    /**
     * Gets the value of the dlsavepath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDLSAVEPATH() {
        return dlsavepath;
    }

    /**
     * Sets the value of the dlsavepath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDLSAVEPATH(String value) {
        this.dlsavepath = value;
    }

    /**
     * Gets the value of the dlrestorepath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDLRESTOREPATH() {
        return dlrestorepath;
    }

    /**
     * Sets the value of the dlrestorepath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDLRESTOREPATH(String value) {
        this.dlrestorepath = value;
    }

    /**
     * Gets the value of the programos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROGRAMOS() {
        return programos;
    }

    /**
     * Sets the value of the programos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROGRAMOS(String value) {
        this.programos = value;
    }

    /**
     * Gets the value of the clrprocesslog property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLRPROCESSLOG() {
        return clrprocesslog;
    }

    /**
     * Sets the value of the clrprocesslog property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLRPROCESSLOG(String value) {
        this.clrprocesslog = value;
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
     * Gets the value of the processinfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROCESSINFO() {
        return processinfo;
    }

    /**
     * Sets the value of the processinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROCESSINFO(String value) {
        this.processinfo = value;
    }

    /**
     * Gets the value of the processerr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROCESSERR() {
        return processerr;
    }

    /**
     * Sets the value of the processerr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROCESSERR(String value) {
        this.processerr = value;
    }

    /**
     * Gets the value of the saveddate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAVEDDATE() {
        return saveddate;
    }

    /**
     * Sets the value of the saveddate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAVEDDATE(String value) {
        this.saveddate = value;
    }

    /**
     * Gets the value of the savedversion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAVEDVERSION() {
        return savedversion;
    }

    /**
     * Sets the value of the savedversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAVEDVERSION(String value) {
        this.savedversion = value;
    }

    /**
     * Gets the value of the saveduser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAVEDUSER() {
        return saveduser;
    }

    /**
     * Sets the value of the saveduser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAVEDUSER(String value) {
        this.saveduser = value;
    }

    /**
     * Gets the value of the releasedate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRELEASEDATE() {
        return releasedate;
    }

    /**
     * Sets the value of the releasedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRELEASEDATE(String value) {
        this.releasedate = value;
    }

    /**
     * Gets the value of the releaseversion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRELEASEVERSION() {
        return releaseversion;
    }

    /**
     * Sets the value of the releaseversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRELEASEVERSION(String value) {
        this.releaseversion = value;
    }

    /**
     * Gets the value of the releaseuser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRELEASEUSER() {
        return releaseuser;
    }

    /**
     * Sets the value of the releaseuser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRELEASEUSER(String value) {
        this.releaseuser = value;
    }

    /**
     * Gets the value of the relstage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRELSTAGE() {
        return relstage;
    }

    /**
     * Sets the value of the relstage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRELSTAGE(String value) {
        this.relstage = value;
    }

    /**
     * Gets the value of the viewreport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVIEWREPORT() {
        return viewreport;
    }

    /**
     * Sets the value of the viewreport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVIEWREPORT(String value) {
        this.viewreport = value;
    }

    /**
     * Gets the value of the removesource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREMOVESOURCE() {
        return removesource;
    }

    /**
     * Sets the value of the removesource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREMOVESOURCE(String value) {
        this.removesource = value;
    }

    /**
     * Gets the value of the preinstall property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPREINSTALL() {
        return preinstall;
    }

    /**
     * Sets the value of the preinstall property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPREINSTALL(String value) {
        this.preinstall = value;
    }

    /**
     * Gets the value of the postinstall property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOSTINSTALL() {
        return postinstall;
    }

    /**
     * Sets the value of the postinstall property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOSTINSTALL(String value) {
        this.postinstall = value;
    }

    /**
     * Gets the value of the docidnew property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOCIDNEW() {
        return docidnew;
    }

    /**
     * Sets the value of the docidnew property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOCIDNEW(String value) {
        this.docidnew = value;
    }

    /**
     * Gets the value of the addnlsysreq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADDNLSYSREQ() {
        return addnlsysreq;
    }

    /**
     * Sets the value of the addnlsysreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADDNLSYSREQ(String value) {
        this.addnlsysreq = value;
    }

    /**
     * Gets the value of the bconfunctionality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBCONFUNCTIONALITY() {
        return bconfunctionality;
    }

    /**
     * Sets the value of the bconfunctionality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBCONFUNCTIONALITY(String value) {
        this.bconfunctionality = value;
    }

    /**
     * Gets the value of the delothercomprecs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDELOTHERCOMPRECS() {
        return delothercomprecs;
    }

    /**
     * Sets the value of the delothercomprecs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDELOTHERCOMPRECS(String value) {
        this.delothercomprecs = value;
    }

    /**
     * Gets the value of the recordstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRECORDSTATUS() {
        return recordstatus;
    }

    /**
     * Sets the value of the recordstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRECORDSTATUS(String value) {
        this.recordstatus = value;
    }

    /**
     * Gets the value of the currno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCURRNO() {
        return currno;
    }

    /**
     * Sets the value of the currno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCURRNO(String value) {
        this.currno = value;
    }

    /**
     * Gets the value of the inputter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINPUTTER() {
        return inputter;
    }

    /**
     * Sets the value of the inputter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINPUTTER(String value) {
        this.inputter = value;
    }

    /**
     * Gets the value of the datetime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATETIME() {
        return datetime;
    }

    /**
     * Sets the value of the datetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATETIME(String value) {
        this.datetime = value;
    }

    /**
     * Gets the value of the authoriser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUTHORISER() {
        return authoriser;
    }

    /**
     * Sets the value of the authoriser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUTHORISER(String value) {
        this.authoriser = value;
    }

    /**
     * Gets the value of the cocode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOCODE() {
        return cocode;
    }

    /**
     * Sets the value of the cocode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOCODE(String value) {
        this.cocode = value;
    }

    /**
     * Gets the value of the deptcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEPTCODE() {
        return deptcode;
    }

    /**
     * Sets the value of the deptcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEPTCODE(String value) {
        this.deptcode = value;
    }

    /**
     * Gets the value of the auditorcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUDITORCODE() {
        return auditorcode;
    }

    /**
     * Sets the value of the auditorcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUDITORCODE(String value) {
        this.auditorcode = value;
    }

    /**
     * Gets the value of the auditdatetime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUDITDATETIME() {
        return auditdatetime;
    }

    /**
     * Sets the value of the auditdatetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUDITDATETIME(String value) {
        this.auditdatetime = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
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
    public void setId(String value) {
        this.id = value;
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
     *         &lt;element name="DEPENDENCY" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "dependency"
    })
    public static class GDEPENDENCY {

        @XmlElement(name = "DEPENDENCY")
        protected List<String> dependency;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the dependency property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dependency property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDEPENDENCY().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getDEPENDENCY() {
            if (dependency == null) {
                dependency = new ArrayList<String>();
            }
            return this.dependency;
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
     *         &lt;element name="mDLDEFINE" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="DLDEFINE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="FROMCOMPANY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TOCOMPANY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "mdldefine"
    })
    public static class GDLDEFINE {

        @XmlElement(name = "mDLDEFINE")
        protected List<BUILDCONTROLType.GDLDEFINE.MDLDEFINE> mdldefine;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mdldefine property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mdldefine property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMDLDEFINE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BUILDCONTROLType.GDLDEFINE.MDLDEFINE }
         * 
         * 
         */
        public List<BUILDCONTROLType.GDLDEFINE.MDLDEFINE> getMDLDEFINE() {
            if (mdldefine == null) {
                mdldefine = new ArrayList<BUILDCONTROLType.GDLDEFINE.MDLDEFINE>();
            }
            return this.mdldefine;
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
         *         &lt;element name="DLDEFINE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="FROMCOMPANY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TOCOMPANY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "dldefine",
            "fromcompany",
            "tocompany"
        })
        public static class MDLDEFINE {

            @XmlElement(name = "DLDEFINE")
            protected String dldefine;
            @XmlElement(name = "FROMCOMPANY")
            protected String fromcompany;
            @XmlElement(name = "TOCOMPANY")
            protected String tocompany;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the dldefine property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDLDEFINE() {
                return dldefine;
            }

            /**
             * Sets the value of the dldefine property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDLDEFINE(String value) {
                this.dldefine = value;
            }

            /**
             * Gets the value of the fromcompany property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFROMCOMPANY() {
                return fromcompany;
            }

            /**
             * Sets the value of the fromcompany property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFROMCOMPANY(String value) {
                this.fromcompany = value;
            }

            /**
             * Gets the value of the tocompany property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTOCOMPANY() {
                return tocompany;
            }

            /**
             * Sets the value of the tocompany property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTOCOMPANY(String value) {
                this.tocompany = value;
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
     *         &lt;element name="JBCDEVBIN" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "jbcdevbin"
    })
    public static class GJBCDEVBIN {

        @XmlElement(name = "JBCDEVBIN")
        protected List<String> jbcdevbin;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the jbcdevbin property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the jbcdevbin property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getJBCDEVBIN().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getJBCDEVBIN() {
            if (jbcdevbin == null) {
                jbcdevbin = new ArrayList<String>();
            }
            return this.jbcdevbin;
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
     *         &lt;element name="JBCDEVLIB" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "jbcdevlib"
    })
    public static class GJBCDEVLIB {

        @XmlElement(name = "JBCDEVLIB")
        protected List<String> jbcdevlib;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the jbcdevlib property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the jbcdevlib property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getJBCDEVLIB().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getJBCDEVLIB() {
            if (jbcdevlib == null) {
                jbcdevlib = new ArrayList<String>();
            }
            return this.jbcdevlib;
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
     *         &lt;element name="mLLDESC" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="sgLLDESC" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="DESC" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
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
        "mlldesc"
    })
    public static class GLLDESC {

        @XmlElement(name = "mLLDESC")
        protected List<BUILDCONTROLType.GLLDESC.MLLDESC> mlldesc;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mlldesc property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mlldesc property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMLLDESC().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BUILDCONTROLType.GLLDESC.MLLDESC }
         * 
         * 
         */
        public List<BUILDCONTROLType.GLLDESC.MLLDESC> getMLLDESC() {
            if (mlldesc == null) {
                mlldesc = new ArrayList<BUILDCONTROLType.GLLDESC.MLLDESC>();
            }
            return this.mlldesc;
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
         *         &lt;element name="sgLLDESC" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="DESC" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                           &lt;/sequence>
         *                           &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "sgLLDESC"
        })
        public static class MLLDESC {

            protected BUILDCONTROLType.GLLDESC.MLLDESC.SgLLDESC sgLLDESC;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the sgLLDESC property.
             * 
             * @return
             *     possible object is
             *     {@link BUILDCONTROLType.GLLDESC.MLLDESC.SgLLDESC }
             *     
             */
            public BUILDCONTROLType.GLLDESC.MLLDESC.SgLLDESC getSgLLDESC() {
                return sgLLDESC;
            }

            /**
             * Sets the value of the sgLLDESC property.
             * 
             * @param value
             *     allowed object is
             *     {@link BUILDCONTROLType.GLLDESC.MLLDESC.SgLLDESC }
             *     
             */
            public void setSgLLDESC(BUILDCONTROLType.GLLDESC.MLLDESC.SgLLDESC value) {
                this.sgLLDESC = value;
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
             *         &lt;element name="DESC" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                 &lt;/sequence>
             *                 &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "desc"
            })
            public static class SgLLDESC {

                @XmlElement(name = "DESC")
                protected List<BUILDCONTROLType.GLLDESC.MLLDESC.SgLLDESC.DESC> desc;
                @XmlAttribute(name = "sg")
                @XmlSchemaType(name = "positiveInteger")
                protected BigInteger sg;

                /**
                 * Gets the value of the desc property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the desc property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getDESC().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link BUILDCONTROLType.GLLDESC.MLLDESC.SgLLDESC.DESC }
                 * 
                 * 
                 */
                public List<BUILDCONTROLType.GLLDESC.MLLDESC.SgLLDESC.DESC> getDESC() {
                    if (desc == null) {
                        desc = new ArrayList<BUILDCONTROLType.GLLDESC.MLLDESC.SgLLDESC.DESC>();
                    }
                    return this.desc;
                }

                /**
                 * Gets the value of the sg property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getSg() {
                    return sg;
                }

                /**
                 * Sets the value of the sg property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setSg(BigInteger value) {
                    this.sg = value;
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
                 *         &lt;element name="DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *       &lt;/sequence>
                 *       &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "desc"
                })
                public static class DESC {

                    @XmlElement(name = "DESC")
                    protected String desc;
                    @XmlAttribute(name = "s")
                    @XmlSchemaType(name = "positiveInteger")
                    protected BigInteger s;

                    /**
                     * Gets the value of the desc property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDESC() {
                        return desc;
                    }

                    /**
                     * Sets the value of the desc property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDESC(String value) {
                        this.desc = value;
                    }

                    /**
                     * Gets the value of the s property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getS() {
                        return s;
                    }

                    /**
                     * Sets the value of the s property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setS(BigInteger value) {
                        this.s = value;
                    }

                }

            }

        }

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
     *         &lt;element name="mLOCREFTABLE" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="LOCREFTABLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="sgLOCALTABLE" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="LOCALTABLE" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="LOCALTABLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="TABLEASSOC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
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
        "mlocreftable"
    })
    public static class GLOCREFTABLE {

        @XmlElement(name = "mLOCREFTABLE")
        protected List<BUILDCONTROLType.GLOCREFTABLE.MLOCREFTABLE> mlocreftable;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mlocreftable property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mlocreftable property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMLOCREFTABLE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BUILDCONTROLType.GLOCREFTABLE.MLOCREFTABLE }
         * 
         * 
         */
        public List<BUILDCONTROLType.GLOCREFTABLE.MLOCREFTABLE> getMLOCREFTABLE() {
            if (mlocreftable == null) {
                mlocreftable = new ArrayList<BUILDCONTROLType.GLOCREFTABLE.MLOCREFTABLE>();
            }
            return this.mlocreftable;
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
         *         &lt;element name="LOCREFTABLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="sgLOCALTABLE" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="LOCALTABLE" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="LOCALTABLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="TABLEASSOC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                           &lt;/sequence>
         *                           &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "locreftable",
            "sgLOCALTABLE"
        })
        public static class MLOCREFTABLE {

            @XmlElement(name = "LOCREFTABLE")
            protected String locreftable;
            protected BUILDCONTROLType.GLOCREFTABLE.MLOCREFTABLE.SgLOCALTABLE sgLOCALTABLE;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the locreftable property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLOCREFTABLE() {
                return locreftable;
            }

            /**
             * Sets the value of the locreftable property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLOCREFTABLE(String value) {
                this.locreftable = value;
            }

            /**
             * Gets the value of the sgLOCALTABLE property.
             * 
             * @return
             *     possible object is
             *     {@link BUILDCONTROLType.GLOCREFTABLE.MLOCREFTABLE.SgLOCALTABLE }
             *     
             */
            public BUILDCONTROLType.GLOCREFTABLE.MLOCREFTABLE.SgLOCALTABLE getSgLOCALTABLE() {
                return sgLOCALTABLE;
            }

            /**
             * Sets the value of the sgLOCALTABLE property.
             * 
             * @param value
             *     allowed object is
             *     {@link BUILDCONTROLType.GLOCREFTABLE.MLOCREFTABLE.SgLOCALTABLE }
             *     
             */
            public void setSgLOCALTABLE(BUILDCONTROLType.GLOCREFTABLE.MLOCREFTABLE.SgLOCALTABLE value) {
                this.sgLOCALTABLE = value;
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
             *         &lt;element name="LOCALTABLE" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="LOCALTABLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="TABLEASSOC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                 &lt;/sequence>
             *                 &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "localtable"
            })
            public static class SgLOCALTABLE {

                @XmlElement(name = "LOCALTABLE")
                protected List<BUILDCONTROLType.GLOCREFTABLE.MLOCREFTABLE.SgLOCALTABLE.LOCALTABLE> localtable;
                @XmlAttribute(name = "sg")
                @XmlSchemaType(name = "positiveInteger")
                protected BigInteger sg;

                /**
                 * Gets the value of the localtable property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the localtable property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getLOCALTABLE().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link BUILDCONTROLType.GLOCREFTABLE.MLOCREFTABLE.SgLOCALTABLE.LOCALTABLE }
                 * 
                 * 
                 */
                public List<BUILDCONTROLType.GLOCREFTABLE.MLOCREFTABLE.SgLOCALTABLE.LOCALTABLE> getLOCALTABLE() {
                    if (localtable == null) {
                        localtable = new ArrayList<BUILDCONTROLType.GLOCREFTABLE.MLOCREFTABLE.SgLOCALTABLE.LOCALTABLE>();
                    }
                    return this.localtable;
                }

                /**
                 * Gets the value of the sg property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getSg() {
                    return sg;
                }

                /**
                 * Sets the value of the sg property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setSg(BigInteger value) {
                    this.sg = value;
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
                 *         &lt;element name="LOCALTABLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="TABLEASSOC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *       &lt;/sequence>
                 *       &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "localtable",
                    "tableassoc"
                })
                public static class LOCALTABLE {

                    @XmlElement(name = "LOCALTABLE")
                    protected String localtable;
                    @XmlElement(name = "TABLEASSOC")
                    protected String tableassoc;
                    @XmlAttribute(name = "s")
                    @XmlSchemaType(name = "positiveInteger")
                    protected BigInteger s;

                    /**
                     * Gets the value of the localtable property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getLOCALTABLE() {
                        return localtable;
                    }

                    /**
                     * Sets the value of the localtable property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setLOCALTABLE(String value) {
                        this.localtable = value;
                    }

                    /**
                     * Gets the value of the tableassoc property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTABLEASSOC() {
                        return tableassoc;
                    }

                    /**
                     * Sets the value of the tableassoc property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTABLEASSOC(String value) {
                        this.tableassoc = value;
                    }

                    /**
                     * Gets the value of the s property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getS() {
                        return s;
                    }

                    /**
                     * Sets the value of the s property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setS(BigInteger value) {
                        this.s = value;
                    }

                }

            }

        }

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
     *         &lt;element name="mOURREFERENCE" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="OURREFERENCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="THEIRREFERENCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ISSUEDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "mourreference"
    })
    public static class GOURREFERENCE {

        @XmlElement(name = "mOURREFERENCE")
        protected List<BUILDCONTROLType.GOURREFERENCE.MOURREFERENCE> mourreference;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mourreference property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mourreference property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMOURREFERENCE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BUILDCONTROLType.GOURREFERENCE.MOURREFERENCE }
         * 
         * 
         */
        public List<BUILDCONTROLType.GOURREFERENCE.MOURREFERENCE> getMOURREFERENCE() {
            if (mourreference == null) {
                mourreference = new ArrayList<BUILDCONTROLType.GOURREFERENCE.MOURREFERENCE>();
            }
            return this.mourreference;
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
         *         &lt;element name="OURREFERENCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="THEIRREFERENCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ISSUEDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "ourreference",
            "theirreference",
            "issuedesc"
        })
        public static class MOURREFERENCE {

            @XmlElement(name = "OURREFERENCE")
            protected String ourreference;
            @XmlElement(name = "THEIRREFERENCE")
            protected String theirreference;
            @XmlElement(name = "ISSUEDESC")
            protected String issuedesc;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the ourreference property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOURREFERENCE() {
                return ourreference;
            }

            /**
             * Sets the value of the ourreference property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOURREFERENCE(String value) {
                this.ourreference = value;
            }

            /**
             * Gets the value of the theirreference property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTHEIRREFERENCE() {
                return theirreference;
            }

            /**
             * Sets the value of the theirreference property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTHEIRREFERENCE(String value) {
                this.theirreference = value;
            }

            /**
             * Gets the value of the issuedesc property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getISSUEDESC() {
                return issuedesc;
            }

            /**
             * Sets the value of the issuedesc property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setISSUEDESC(String value) {
                this.issuedesc = value;
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
     *         &lt;element name="mPROGRAMBP" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PROGRAMBP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="sgSELECTCMD" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="SELECTCMD" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="SELECTCMD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="MVRESERVED9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="RELEASEBP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "mprogrambp"
    })
    public static class GPROGRAMBP {

        @XmlElement(name = "mPROGRAMBP")
        protected List<BUILDCONTROLType.GPROGRAMBP.MPROGRAMBP> mprogrambp;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mprogrambp property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mprogrambp property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMPROGRAMBP().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BUILDCONTROLType.GPROGRAMBP.MPROGRAMBP }
         * 
         * 
         */
        public List<BUILDCONTROLType.GPROGRAMBP.MPROGRAMBP> getMPROGRAMBP() {
            if (mprogrambp == null) {
                mprogrambp = new ArrayList<BUILDCONTROLType.GPROGRAMBP.MPROGRAMBP>();
            }
            return this.mprogrambp;
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
         *         &lt;element name="PROGRAMBP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="sgSELECTCMD" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="SELECTCMD" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="SELECTCMD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                           &lt;/sequence>
         *                           &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="MVRESERVED9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="RELEASEBP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "programbp",
            "sgSELECTCMD",
            "mvreserved9",
            "releasebp"
        })
        public static class MPROGRAMBP {

            @XmlElement(name = "PROGRAMBP")
            protected String programbp;
            protected BUILDCONTROLType.GPROGRAMBP.MPROGRAMBP.SgSELECTCMD sgSELECTCMD;
            @XmlElement(name = "MVRESERVED9")
            protected String mvreserved9;
            @XmlElement(name = "RELEASEBP")
            protected String releasebp;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the programbp property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPROGRAMBP() {
                return programbp;
            }

            /**
             * Sets the value of the programbp property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPROGRAMBP(String value) {
                this.programbp = value;
            }

            /**
             * Gets the value of the sgSELECTCMD property.
             * 
             * @return
             *     possible object is
             *     {@link BUILDCONTROLType.GPROGRAMBP.MPROGRAMBP.SgSELECTCMD }
             *     
             */
            public BUILDCONTROLType.GPROGRAMBP.MPROGRAMBP.SgSELECTCMD getSgSELECTCMD() {
                return sgSELECTCMD;
            }

            /**
             * Sets the value of the sgSELECTCMD property.
             * 
             * @param value
             *     allowed object is
             *     {@link BUILDCONTROLType.GPROGRAMBP.MPROGRAMBP.SgSELECTCMD }
             *     
             */
            public void setSgSELECTCMD(BUILDCONTROLType.GPROGRAMBP.MPROGRAMBP.SgSELECTCMD value) {
                this.sgSELECTCMD = value;
            }

            /**
             * Gets the value of the mvreserved9 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMVRESERVED9() {
                return mvreserved9;
            }

            /**
             * Sets the value of the mvreserved9 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMVRESERVED9(String value) {
                this.mvreserved9 = value;
            }

            /**
             * Gets the value of the releasebp property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRELEASEBP() {
                return releasebp;
            }

            /**
             * Sets the value of the releasebp property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRELEASEBP(String value) {
                this.releasebp = value;
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
             *         &lt;element name="SELECTCMD" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="SELECTCMD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                 &lt;/sequence>
             *                 &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "selectcmd"
            })
            public static class SgSELECTCMD {

                @XmlElement(name = "SELECTCMD")
                protected List<BUILDCONTROLType.GPROGRAMBP.MPROGRAMBP.SgSELECTCMD.SELECTCMD> selectcmd;
                @XmlAttribute(name = "sg")
                @XmlSchemaType(name = "positiveInteger")
                protected BigInteger sg;

                /**
                 * Gets the value of the selectcmd property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the selectcmd property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getSELECTCMD().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link BUILDCONTROLType.GPROGRAMBP.MPROGRAMBP.SgSELECTCMD.SELECTCMD }
                 * 
                 * 
                 */
                public List<BUILDCONTROLType.GPROGRAMBP.MPROGRAMBP.SgSELECTCMD.SELECTCMD> getSELECTCMD() {
                    if (selectcmd == null) {
                        selectcmd = new ArrayList<BUILDCONTROLType.GPROGRAMBP.MPROGRAMBP.SgSELECTCMD.SELECTCMD>();
                    }
                    return this.selectcmd;
                }

                /**
                 * Gets the value of the sg property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getSg() {
                    return sg;
                }

                /**
                 * Sets the value of the sg property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setSg(BigInteger value) {
                    this.sg = value;
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
                 *         &lt;element name="SELECTCMD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *       &lt;/sequence>
                 *       &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "selectcmd"
                })
                public static class SELECTCMD {

                    @XmlElement(name = "SELECTCMD")
                    protected String selectcmd;
                    @XmlAttribute(name = "s")
                    @XmlSchemaType(name = "positiveInteger")
                    protected BigInteger s;

                    /**
                     * Gets the value of the selectcmd property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSELECTCMD() {
                        return selectcmd;
                    }

                    /**
                     * Sets the value of the selectcmd property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSELECTCMD(String value) {
                        this.selectcmd = value;
                    }

                    /**
                     * Gets the value of the s property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getS() {
                        return s;
                    }

                    /**
                     * Sets the value of the s property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setS(BigInteger value) {
                        this.s = value;
                    }

                }

            }

        }

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
     *         &lt;element name="mSSAPPLNAME" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="SSAPPLNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="USRFIELDNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="USRTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="sgUSRFIELDNO" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="USRFIELDNO" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="USRFIELDNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="sgUSRVALPROG" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="USRVALPROG" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="USRVALPROG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="USRCONVERSION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="USRDISPLAYFMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="USRALTINDEX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="USRIDXFILE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="USRINDEXNULLS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="USRSINGLEMULT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="USRLANGFIELD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="USRCNVTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="USRRELFILE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "mssapplname"
    })
    public static class GSSAPPLNAME {

        @XmlElement(name = "mSSAPPLNAME")
        protected List<BUILDCONTROLType.GSSAPPLNAME.MSSAPPLNAME> mssapplname;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mssapplname property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mssapplname property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMSSAPPLNAME().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BUILDCONTROLType.GSSAPPLNAME.MSSAPPLNAME }
         * 
         * 
         */
        public List<BUILDCONTROLType.GSSAPPLNAME.MSSAPPLNAME> getMSSAPPLNAME() {
            if (mssapplname == null) {
                mssapplname = new ArrayList<BUILDCONTROLType.GSSAPPLNAME.MSSAPPLNAME>();
            }
            return this.mssapplname;
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
         *         &lt;element name="SSAPPLNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="USRFIELDNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="USRTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="sgUSRFIELDNO" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="USRFIELDNO" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="USRFIELDNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                           &lt;/sequence>
         *                           &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="sgUSRVALPROG" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="USRVALPROG" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="USRVALPROG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                           &lt;/sequence>
         *                           &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="USRCONVERSION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="USRDISPLAYFMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="USRALTINDEX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="USRIDXFILE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="USRINDEXNULLS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="USRSINGLEMULT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="USRLANGFIELD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="USRCNVTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="USRRELFILE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "ssapplname",
            "usrfieldname",
            "usrtype",
            "sgUSRFIELDNO",
            "sgUSRVALPROG",
            "usrconversion",
            "usrdisplayfmt",
            "usraltindex",
            "usridxfile",
            "usrindexnulls",
            "usrsinglemult",
            "usrlangfield",
            "usrcnvtype",
            "usrrelfile"
        })
        public static class MSSAPPLNAME {

            @XmlElement(name = "SSAPPLNAME")
            protected String ssapplname;
            @XmlElement(name = "USRFIELDNAME")
            protected String usrfieldname;
            @XmlElement(name = "USRTYPE")
            protected String usrtype;
            protected BUILDCONTROLType.GSSAPPLNAME.MSSAPPLNAME.SgUSRFIELDNO sgUSRFIELDNO;
            protected BUILDCONTROLType.GSSAPPLNAME.MSSAPPLNAME.SgUSRVALPROG sgUSRVALPROG;
            @XmlElement(name = "USRCONVERSION")
            protected String usrconversion;
            @XmlElement(name = "USRDISPLAYFMT")
            protected String usrdisplayfmt;
            @XmlElement(name = "USRALTINDEX")
            protected String usraltindex;
            @XmlElement(name = "USRIDXFILE")
            protected String usridxfile;
            @XmlElement(name = "USRINDEXNULLS")
            protected String usrindexnulls;
            @XmlElement(name = "USRSINGLEMULT")
            protected String usrsinglemult;
            @XmlElement(name = "USRLANGFIELD")
            protected String usrlangfield;
            @XmlElement(name = "USRCNVTYPE")
            protected String usrcnvtype;
            @XmlElement(name = "USRRELFILE")
            protected String usrrelfile;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the ssapplname property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSSAPPLNAME() {
                return ssapplname;
            }

            /**
             * Sets the value of the ssapplname property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSSAPPLNAME(String value) {
                this.ssapplname = value;
            }

            /**
             * Gets the value of the usrfieldname property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUSRFIELDNAME() {
                return usrfieldname;
            }

            /**
             * Sets the value of the usrfieldname property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUSRFIELDNAME(String value) {
                this.usrfieldname = value;
            }

            /**
             * Gets the value of the usrtype property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUSRTYPE() {
                return usrtype;
            }

            /**
             * Sets the value of the usrtype property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUSRTYPE(String value) {
                this.usrtype = value;
            }

            /**
             * Gets the value of the sgUSRFIELDNO property.
             * 
             * @return
             *     possible object is
             *     {@link BUILDCONTROLType.GSSAPPLNAME.MSSAPPLNAME.SgUSRFIELDNO }
             *     
             */
            public BUILDCONTROLType.GSSAPPLNAME.MSSAPPLNAME.SgUSRFIELDNO getSgUSRFIELDNO() {
                return sgUSRFIELDNO;
            }

            /**
             * Sets the value of the sgUSRFIELDNO property.
             * 
             * @param value
             *     allowed object is
             *     {@link BUILDCONTROLType.GSSAPPLNAME.MSSAPPLNAME.SgUSRFIELDNO }
             *     
             */
            public void setSgUSRFIELDNO(BUILDCONTROLType.GSSAPPLNAME.MSSAPPLNAME.SgUSRFIELDNO value) {
                this.sgUSRFIELDNO = value;
            }

            /**
             * Gets the value of the sgUSRVALPROG property.
             * 
             * @return
             *     possible object is
             *     {@link BUILDCONTROLType.GSSAPPLNAME.MSSAPPLNAME.SgUSRVALPROG }
             *     
             */
            public BUILDCONTROLType.GSSAPPLNAME.MSSAPPLNAME.SgUSRVALPROG getSgUSRVALPROG() {
                return sgUSRVALPROG;
            }

            /**
             * Sets the value of the sgUSRVALPROG property.
             * 
             * @param value
             *     allowed object is
             *     {@link BUILDCONTROLType.GSSAPPLNAME.MSSAPPLNAME.SgUSRVALPROG }
             *     
             */
            public void setSgUSRVALPROG(BUILDCONTROLType.GSSAPPLNAME.MSSAPPLNAME.SgUSRVALPROG value) {
                this.sgUSRVALPROG = value;
            }

            /**
             * Gets the value of the usrconversion property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUSRCONVERSION() {
                return usrconversion;
            }

            /**
             * Sets the value of the usrconversion property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUSRCONVERSION(String value) {
                this.usrconversion = value;
            }

            /**
             * Gets the value of the usrdisplayfmt property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUSRDISPLAYFMT() {
                return usrdisplayfmt;
            }

            /**
             * Sets the value of the usrdisplayfmt property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUSRDISPLAYFMT(String value) {
                this.usrdisplayfmt = value;
            }

            /**
             * Gets the value of the usraltindex property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUSRALTINDEX() {
                return usraltindex;
            }

            /**
             * Sets the value of the usraltindex property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUSRALTINDEX(String value) {
                this.usraltindex = value;
            }

            /**
             * Gets the value of the usridxfile property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUSRIDXFILE() {
                return usridxfile;
            }

            /**
             * Sets the value of the usridxfile property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUSRIDXFILE(String value) {
                this.usridxfile = value;
            }

            /**
             * Gets the value of the usrindexnulls property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUSRINDEXNULLS() {
                return usrindexnulls;
            }

            /**
             * Sets the value of the usrindexnulls property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUSRINDEXNULLS(String value) {
                this.usrindexnulls = value;
            }

            /**
             * Gets the value of the usrsinglemult property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUSRSINGLEMULT() {
                return usrsinglemult;
            }

            /**
             * Sets the value of the usrsinglemult property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUSRSINGLEMULT(String value) {
                this.usrsinglemult = value;
            }

            /**
             * Gets the value of the usrlangfield property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUSRLANGFIELD() {
                return usrlangfield;
            }

            /**
             * Sets the value of the usrlangfield property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUSRLANGFIELD(String value) {
                this.usrlangfield = value;
            }

            /**
             * Gets the value of the usrcnvtype property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUSRCNVTYPE() {
                return usrcnvtype;
            }

            /**
             * Sets the value of the usrcnvtype property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUSRCNVTYPE(String value) {
                this.usrcnvtype = value;
            }

            /**
             * Gets the value of the usrrelfile property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUSRRELFILE() {
                return usrrelfile;
            }

            /**
             * Sets the value of the usrrelfile property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUSRRELFILE(String value) {
                this.usrrelfile = value;
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
             *         &lt;element name="USRFIELDNO" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="USRFIELDNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                 &lt;/sequence>
             *                 &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "usrfieldno"
            })
            public static class SgUSRFIELDNO {

                @XmlElement(name = "USRFIELDNO")
                protected List<BUILDCONTROLType.GSSAPPLNAME.MSSAPPLNAME.SgUSRFIELDNO.USRFIELDNO> usrfieldno;
                @XmlAttribute(name = "sg")
                @XmlSchemaType(name = "positiveInteger")
                protected BigInteger sg;

                /**
                 * Gets the value of the usrfieldno property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the usrfieldno property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getUSRFIELDNO().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link BUILDCONTROLType.GSSAPPLNAME.MSSAPPLNAME.SgUSRFIELDNO.USRFIELDNO }
                 * 
                 * 
                 */
                public List<BUILDCONTROLType.GSSAPPLNAME.MSSAPPLNAME.SgUSRFIELDNO.USRFIELDNO> getUSRFIELDNO() {
                    if (usrfieldno == null) {
                        usrfieldno = new ArrayList<BUILDCONTROLType.GSSAPPLNAME.MSSAPPLNAME.SgUSRFIELDNO.USRFIELDNO>();
                    }
                    return this.usrfieldno;
                }

                /**
                 * Gets the value of the sg property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getSg() {
                    return sg;
                }

                /**
                 * Sets the value of the sg property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setSg(BigInteger value) {
                    this.sg = value;
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
                 *         &lt;element name="USRFIELDNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *       &lt;/sequence>
                 *       &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "usrfieldno"
                })
                public static class USRFIELDNO {

                    @XmlElement(name = "USRFIELDNO")
                    protected String usrfieldno;
                    @XmlAttribute(name = "s")
                    @XmlSchemaType(name = "positiveInteger")
                    protected BigInteger s;

                    /**
                     * Gets the value of the usrfieldno property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getUSRFIELDNO() {
                        return usrfieldno;
                    }

                    /**
                     * Sets the value of the usrfieldno property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setUSRFIELDNO(String value) {
                        this.usrfieldno = value;
                    }

                    /**
                     * Gets the value of the s property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getS() {
                        return s;
                    }

                    /**
                     * Sets the value of the s property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setS(BigInteger value) {
                        this.s = value;
                    }

                }

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
             *         &lt;element name="USRVALPROG" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="USRVALPROG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                 &lt;/sequence>
             *                 &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "usrvalprog"
            })
            public static class SgUSRVALPROG {

                @XmlElement(name = "USRVALPROG")
                protected List<BUILDCONTROLType.GSSAPPLNAME.MSSAPPLNAME.SgUSRVALPROG.USRVALPROG> usrvalprog;
                @XmlAttribute(name = "sg")
                @XmlSchemaType(name = "positiveInteger")
                protected BigInteger sg;

                /**
                 * Gets the value of the usrvalprog property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the usrvalprog property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getUSRVALPROG().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link BUILDCONTROLType.GSSAPPLNAME.MSSAPPLNAME.SgUSRVALPROG.USRVALPROG }
                 * 
                 * 
                 */
                public List<BUILDCONTROLType.GSSAPPLNAME.MSSAPPLNAME.SgUSRVALPROG.USRVALPROG> getUSRVALPROG() {
                    if (usrvalprog == null) {
                        usrvalprog = new ArrayList<BUILDCONTROLType.GSSAPPLNAME.MSSAPPLNAME.SgUSRVALPROG.USRVALPROG>();
                    }
                    return this.usrvalprog;
                }

                /**
                 * Gets the value of the sg property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getSg() {
                    return sg;
                }

                /**
                 * Sets the value of the sg property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setSg(BigInteger value) {
                    this.sg = value;
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
                 *         &lt;element name="USRVALPROG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *       &lt;/sequence>
                 *       &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "usrvalprog"
                })
                public static class USRVALPROG {

                    @XmlElement(name = "USRVALPROG")
                    protected String usrvalprog;
                    @XmlAttribute(name = "s")
                    @XmlSchemaType(name = "positiveInteger")
                    protected BigInteger s;

                    /**
                     * Gets the value of the usrvalprog property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getUSRVALPROG() {
                        return usrvalprog;
                    }

                    /**
                     * Sets the value of the usrvalprog property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setUSRVALPROG(String value) {
                        this.usrvalprog = value;
                    }

                    /**
                     * Gets the value of the s property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getS() {
                        return s;
                    }

                    /**
                     * Sets the value of the s property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setS(BigInteger value) {
                        this.s = value;
                    }

                }

            }

        }

    }

}
