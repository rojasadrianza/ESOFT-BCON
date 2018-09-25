package com.avilacorporation.esoft.service;


import com.temenos.wsbanescobcon.ViewtheErrorsofaBCONunitResponse;
import com.temenos.wsbanescobcon.ReverseBconatAppLevelResponse;
import javax.xml.ws.Response;


public class FactoryService
{
  public FactoryService() {}
  
   
 
  
  public static Response<ViewtheErrorsofaBCONunitResponse> ViewtheErrorsofaBCONunit(String ip, String username, String password, String company, String columName, String criteriaValue, String operand) {
    BconService physicUnitService = new BconService();
    //.out.println("CLASE*****************FACTORYSERVICE" );
    return physicUnitService.viewtheErrorsofaBCONunit(ip, username, password, company, columName, criteriaValue, operand);
  }
  
  public static Response<ReverseBconatAppLevelResponse> ReverseBconatAppLevel(String ip, String username, String password, String transactionid)
  {
    BconService physicUnitService = new BconService();
    return physicUnitService.reverseBconatAppLevel(ip, username, password, transactionid);
  }
}