package com.avilacorporation.esoft.service;

import com.avilacorporation.esoft.conexion.BConConexion;
import com.temenos.buildcontrol.BUILDCONTROLType;
import com.temenos.buildcontrolerrors.BUILDCONTROLERRORSType;
import com.temenos.wsbanescobcon.CreateBconPhysicUnitResponse;
import com.temenos.wsbanescobcon.CreateT24BconUnitResponse;
import com.temenos.wsbanescobcon.ViewtheResultsofaBCONunitResponse;
import com.temenos.wsbanescobcon.ViewtheErrorsofaBCONunitResponse;
import com.temenos.wsbanescobcon.ReverseBconatAppLevelResponse;
import com.temenos.wsbanescobcon.OfsFunction;
import com.temenos.wsbanescobcon.T24WebServicesImpl;
import com.temenos.wsbanescobcon.TransactionId;
import com.temenos.wsbanescobcon.WebRequestCommon;
import com.temenos.wsbanescobcon.EnquiryInput;
import com.temenos.wsbanescobcon.EnquiryInputCollection;

import com.temenos.wsbanescobcon.EnquiryInputCollection;
import com.temenos.wsbanescobcon.Status;
import java.util.List;
import javax.xml.ws.Response;
import javax.xml.ws.Holder;

public class BconService
{
  public BconService() {}
  
  private WebRequestCommon getWebRequestCommon(String username, String password, String company)
  {
    WebRequestCommon result = new WebRequestCommon();
    result.setUserName(username);
    result.setPassword(password);
    result.setCompany(company);    
    return result;
  }
  
  private Holder<Status> getStatus() {
        Holder<Status> result = new Holder<>();
        return result;
  }
  
  private Holder<List> getList() {
        Holder<List> result = new Holder<>();
        return result;
  }
  
  private Holder<BUILDCONTROLERRORSType.GBUILDCONTROLERRORSDetailType.MBUILDCONTROLERRORSDetailType> getBUILDCONTROLERRORSTYPE() {
        Holder<BUILDCONTROLERRORSType.GBUILDCONTROLERRORSDetailType.MBUILDCONTROLERRORSDetailType> result = new Holder<>();
        
        return result;
  }
  
    private EnquiryInputCollection setEnquiryInput(String columnName, String criteriaValue, String operand)  {
        EnquiryInputCollection result = new EnquiryInputCollection();        
        result.setColumnName(columnName);
        result.setCriteriaValue(criteriaValue);
        result.setOperand(operand);
        //System.out.println("GENERANDO setEnquiryInput *****************BCONSERVICE 3 " + columnName +" "+ criteriaValue +" "+ operand );
        return result;
    }
    
  public Response<ViewtheErrorsofaBCONunitResponse> viewtheErrorsofaBCONunit(String ip, String username, String password, String company, String columName, String criteriaValue, String operand) {
    
    //System.out.println("1 " +" " + ip +" "+ username +" "+ password +" "+ company +" "+ columName +" "+ criteriaValue +" "+ operand);
    BConConexion conexion = BConConexion.getInstace(ip);
    //System.out.println("2 " +" " + ip +" "+ username +" "+ password +" "+ company +" "+ columName +" "+ criteriaValue +" "+ operand);
    T24WebServicesImpl service = conexion.getService();
    WebRequestCommon webRequestCommon = getWebRequestCommon(username, password, company);   
    EnquiryInput enquiryInput =   new EnquiryInput();
    enquiryInput.getEnquiryInputCollection().add(setEnquiryInput(columName,criteriaValue,operand));
    try {     
      
      Response<ViewtheErrorsofaBCONunitResponse> response = service.viewtheErrorsofaBCONunitAsync(webRequestCommon, enquiryInput, getStatus(),null);
      //service.viewtheErrorsofaBCONunit(webRequestCommon, enquiryInput, getStatus(),null);  
       while (!response.isDone())
      {
        Thread.sleep(100L);
      }
      
      return response;
      
      
    } catch (Exception e) {
      System.out.println("BconService " + e.getMessage());
    }
    
    return null;
  } 
  
  
  
  
  
  
  
  
 /*public Response<ViewtheErrorsofaBCONunitResponse> viewtheErrorsofaBCONunit(String ip, String username, String password, String company, String columName, String criteriaValue, String operand) {
     
    BConConexion conexion = BConConexion.getInstace(ip);
    T24WebServicesImpl service = conexion.getService();
    WebRequestCommon webRequestCommon = getWebRequestCommon(username, password, company);   
    EnquiryInput enquiryInput =   new EnquiryInput();
    enquiryInput.getEnquiryInputCollection().add(setEnquiryInput(columName,criteriaValue,operand));
   
    try {
          
      Response<ViewtheErrorsofaBCONunitResponse> response = service.viewtheErrorsofaBCONunitAsync(webRequestCommon, enquiryInput, getStatus());
      while (!response.isDone())
      {
        Thread.sleep(100L);
      }
      
      return response;
    } catch (Exception e) {
      System.out.println("BconService " + e.getMessage());
    }
    
    return null;
  }
  
  */
  
  public Response<ReverseBconatAppLevelResponse> reverseBconatAppLevel(String ip, String username, String password, String transactionid) {
    BConConexion conexion = BConConexion.getInstace(ip);
    T24WebServicesImpl service = conexion.getService();
    WebRequestCommon webRequestCommon = getWebRequestCommon(username, password, null);
    TransactionId transactionIdResult = new TransactionId();
    transactionIdResult.setTransactionId(transactionid);    
        
    try {
      Response<ReverseBconatAppLevelResponse> response = service.reverseBconatAppLevelAsync(webRequestCommon, transactionIdResult);      
      while (!response.isDone())
      {
        Thread.sleep(100L);
      }
      return response;
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return null;
  }
  
  
  
}
