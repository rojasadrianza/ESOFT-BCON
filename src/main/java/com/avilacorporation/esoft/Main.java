package com.avilacorporation.esoft;

import com.avilacorporation.esoft.service.FactoryService;
import com.temenos.buildcontrol.BUILDCONTROLType;
import com.temenos.buildcontrolerrors.BUILDCONTROLERRORSType;
import com.temenos.buildcontrolerrors.BUILDCONTROLERRORSType.GBUILDCONTROLERRORSDetailType.MBUILDCONTROLERRORSDetailType;
import com.temenos.buildcontrolresults.BUILDCONTROLRESULTSType;
import com.temenos.buildcontrolresults.BUILDCONTROLRESULTSType.GBUILDCONTROLRESULTSDetailType;
import com.temenos.buildcontrolresults.BUILDCONTROLRESULTSType.GBUILDCONTROLRESULTSDetailType.MBUILDCONTROLRESULTSDetailType;
import com.temenos.wsbanescobcon.CreateBconPhysicUnitResponse;
import com.temenos.wsbanescobcon.CreateT24BconUnitResponse;
import com.temenos.wsbanescobcon.ReverseBconatAppLevelResponse;
import com.temenos.wsbanescobcon.ViewtheErrorsofaBCONunitResponse;
import com.temenos.wsbanescobcon.ViewtheResultsofaBCONunitResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ExecutionException;
import javax.xml.bind.JAXBElement;
import javax.xml.ws.Response;

/**
 *
 * @author Isaac Arismendi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
           
          /* Response<ViewtheErrorsofaBCONunitResponse> viewtheErrorsofaBCONunitResponse = FactoryService.ViewtheErrorsofaBCONunit("172.16.27.40:84", "CCHARVEST", "123456789", "PA0019999", "@ID", "BSAP001-PACS00690356.20180731", "EQ");
                                                                                                                                           //  ip,       username,    password,   company,columName, criteriaValue,               operand
            if ((((ViewtheErrorsofaBCONunitResponse)viewtheErrorsofaBCONunitResponse.get()).getStatus().getMessages() != null) && (((ViewtheErrorsofaBCONunitResponse)viewtheErrorsofaBCONunitResponse.get()).getStatus().getMessages().size() > 0)) {
                      System.out.println(((ViewtheErrorsofaBCONunitResponse)viewtheErrorsofaBCONunitResponse.get()).getStatus().getSuccessIndicator().value() + " - " + ((ViewtheErrorsofaBCONunitResponse)viewtheErrorsofaBCONunitResponse.get()).getStatus().getMessages());
                 
            }
            
           */ 
            
            
           /*Response<ReverseBconatAppLevelResponse> reverseBconatAppLevelResponse = FactoryService.ReverseBconatAppLevel("172.16.27.40:84", "CCHARVEST", "123456789","9999");
                                                                                                                                           //  ip,       username,    password,   company,columName, criteriaValue,               operand
            if ((((ReverseBconatAppLevelResponse)reverseBconatAppLevelResponse.get()).getStatus().getMessages() != null) && (((ReverseBconatAppLevelResponse)reverseBconatAppLevelResponse.get()).getStatus().getMessages().size() > 0)) {
                      System.out.println(((ReverseBconatAppLevelResponse)reverseBconatAppLevelResponse.get()).getStatus().getSuccessIndicator().value() + " - " + ((ReverseBconatAppLevelResponse)reverseBconatAppLevelResponse.get()).getStatus().getMessages());
                 
            } */
            
            
            
            
            
            
            
          //INICIAR COMENTARIOS AQUI PARA PRUEBAS
           
            String ip = args[1];
            String username = args[2];
            String password = args[3];
            String company = args[4];
            String TransactionId = args[5];
            String columName = args[6];
            String criteriaValue = args[7];
            String operando = args[8];
            
            
            //String a = "-a"; //ELIMINAR*************************************************
            
            switch (args[0]) {
              //switch (a) { //ELIMINAR*************************************************
                case "-t":
                                       
                    break;

                case "-p":
                   
                    break;
                
                case "-r":
                    
                    
                    break;    
                
                case "-e":
                   Response<ViewtheErrorsofaBCONunitResponse> viewtheErrorsofaBCONunitResponse = FactoryService.ViewtheErrorsofaBCONunit(ip, username, password, company, columName, criteriaValue, operando);
                   
                    //Response<ViewtheErrorsofaBCONunitResponse> viewtheErrorsofaBCONunitResponse = FactoryService.ViewtheErrorsofaBCONunit("172.16.27.40:85", "CCHARVEST", "123456789", "PA0019999", "@ID","BSAP001-PACS00697344.180830.01", "EQ");
                     
                                                                                                                   
                    //if ((((ViewtheErrorsofaBCONunitResponse)viewtheErrorsofaBCONunitResponse.get()).getStatus().getMessages() != null) && (((ViewtheErrorsofaBCONunitResponse)viewtheErrorsofaBCONunitResponse.get()).getStatus().getMessages().size() > 0)) {
                      if ((((ViewtheErrorsofaBCONunitResponse)viewtheErrorsofaBCONunitResponse.get()).getStatus() != null)) {
                        // System.out.println(((ViewtheErrorsofaBCONunitResponse)viewtheErrorsofaBCONunitResponse.get()).getStatus().getSuccessIndicator().value() + " - " + ((ViewtheErrorsofaBCONunitResponse)viewtheErrorsofaBCONunitResponse.get()).getStatus().getMessages());
                      //} else {
                          
                      System.out.println(((ViewtheErrorsofaBCONunitResponse)viewtheErrorsofaBCONunitResponse.get()).getStatus().getSuccessIndicator().value());
                          
                      ListIterator<BUILDCONTROLERRORSType> itr = ((ViewtheErrorsofaBCONunitResponse)viewtheErrorsofaBCONunitResponse.get()).getBUILDCONTROLERRORSType().listIterator();
                        while (itr.hasNext()){                             
                              ListIterator<BUILDCONTROLERRORSType.GBUILDCONTROLERRORSDetailType.MBUILDCONTROLERRORSDetailType> datos = itr.next().getGBUILDCONTROLERRORSDetailType().getMBUILDCONTROLERRORSDetailType().listIterator();
                              while (datos.hasNext()){
                                   MBUILDCONTROLERRORSDetailType dat = datos.next();
                                   
                                   if(dat.getProcessErrors() != null && !dat.getProcessErrors().isEmpty()){
                                     System.out.println("PROCESSERROR " + dat.getProcessErrors() );    
                                   }else{
                                     System.out.println("");  
                                   }
                                   if(dat.getHDRLIT() != null && !dat.getHDRLIT().isEmpty()){
                                     System.out.println("HDRLIT " + dat.getHDRLIT() );    
                                   /*}else{
                                     System.out.println("HDRLIT ");  */
                                   }
                                   if(dat.getID() != null && !dat.getID().isEmpty()){
                                     System.out.println("ID " + dat.getID() );    
                                   /*}else{
                                     System.out.println("ID ");   */  
                                   }
                                   if(dat.getRecordTime() != null && !dat.getRecordTime().isEmpty()){
                                     System.out.println("PROCESSINFO " + dat.getRecordTime() );    
                                   /*}else{
                                      System.out.println("PROCESSINFO ");  */
                                   } 
                             }
                        }
                    }
                    
                break; 
                    
                case "-a":
                    Response<ReverseBconatAppLevelResponse> reverseBconatAppLevelResponse = FactoryService.ReverseBconatAppLevel(ip, username, password,TransactionId);
                    //Response<ReverseBconatAppLevelResponse> reverseBconatAppLevelResponse = FactoryService.ReverseBconatAppLevel("172.16.27.40:81", "CCHARVEST", "123456789","BSAP001-PACS00702152.20180920");
                                                                                                                                           
                    
                    if ((((ReverseBconatAppLevelResponse)reverseBconatAppLevelResponse.get()).getStatus() != null)) {          
                          
                                   System.out.println(((ReverseBconatAppLevelResponse)reverseBconatAppLevelResponse.get()).getStatus().getSuccessIndicator().value());
                                   
                                   if (((ReverseBconatAppLevelResponse)reverseBconatAppLevelResponse.get()).getBUILDCONTROLType().getACTION() != null  ){
                                     System.out.println("ACTION " + ((ReverseBconatAppLevelResponse)reverseBconatAppLevelResponse.get()).getBUILDCONTROLType().getACTION() );    
                                   }
                                   
                                   if (((ReverseBconatAppLevelResponse)reverseBconatAppLevelResponse.get()).getBUILDCONTROLType().getSAVEPATH() != null ){
                                     System.out.println("SAVEPATH " + ((ReverseBconatAppLevelResponse)reverseBconatAppLevelResponse.get()).getBUILDCONTROLType().getSAVEPATH() );    
                                   }
                                   
                                   if (((ReverseBconatAppLevelResponse)reverseBconatAppLevelResponse.get()).getBUILDCONTROLType().getRELEASEPATH() != null ){
                                     System.out.println("RELEASEPATH " + ((ReverseBconatAppLevelResponse)reverseBconatAppLevelResponse.get()).getBUILDCONTROLType().getRELEASEPATH() );    
                                   }
                                   
                                   if (((ReverseBconatAppLevelResponse)reverseBconatAppLevelResponse.get()).getBUILDCONTROLType().getOFSSOURCEID() != null ){
                                     System.out.println("OFSSOURCEID " + ((ReverseBconatAppLevelResponse)reverseBconatAppLevelResponse.get()).getBUILDCONTROLType().getOFSSOURCEID() );    
                                   }
                                   
                                   if (((ReverseBconatAppLevelResponse)reverseBconatAppLevelResponse.get()).getBUILDCONTROLType().getGDLDEFINE() != null ){
                                     System.out.println("GDLDEFINE " + ((ReverseBconatAppLevelResponse)reverseBconatAppLevelResponse.get()).getBUILDCONTROLType().getGDLDEFINE().getMDLDEFINE() );    
                                   }
                                   
                                   if (((ReverseBconatAppLevelResponse)reverseBconatAppLevelResponse.get()).getBUILDCONTROLType().getBUILDNEWDICT() != null ){
                                     System.out.println("BUILDNEWDICT " + ((ReverseBconatAppLevelResponse)reverseBconatAppLevelResponse.get()).getBUILDCONTROLType().getBUILDNEWDICT() );    
                                   }
                                   
                                   if (((ReverseBconatAppLevelResponse)reverseBconatAppLevelResponse.get()).getBUILDCONTROLType().getRELEASEORDER() != null ){
                                     System.out.println("RELEASEORDER " + ((ReverseBconatAppLevelResponse)reverseBconatAppLevelResponse.get()).getBUILDCONTROLType().getRELEASEORDER() );    
                                   }
                                   
                                   if (((ReverseBconatAppLevelResponse)reverseBconatAppLevelResponse.get()).getBUILDCONTROLType().getAUTHSPLINSTR() != null ){
                                     System.out.println("AUTHSPLINSTR " + ((ReverseBconatAppLevelResponse)reverseBconatAppLevelResponse.get()).getBUILDCONTROLType().getAUTHSPLINSTR() );    
                                   }
                                   
                                   if (((ReverseBconatAppLevelResponse)reverseBconatAppLevelResponse.get()).getBUILDCONTROLType().getCREATELIB() != null ){
                                     System.out.println("CREATELIB " + ((ReverseBconatAppLevelResponse)reverseBconatAppLevelResponse.get()).getBUILDCONTROLType().getCREATELIB() );    
                                   }
                                   
                                   if (((ReverseBconatAppLevelResponse)reverseBconatAppLevelResponse.get()).getBUILDCONTROLType().getCREATEBIN() != null ){
                                     System.out.println("CREATEBIN " + ((ReverseBconatAppLevelResponse)reverseBconatAppLevelResponse.get()).getBUILDCONTROLType().getCREATEBIN() );    
                                   }
                                   
                                   if (((ReverseBconatAppLevelResponse)reverseBconatAppLevelResponse.get()).getBUILDCONTROLType().getCREATERELBP() != null ){
                                     System.out.println("CREATERELBP " + ((ReverseBconatAppLevelResponse)reverseBconatAppLevelResponse.get()).getBUILDCONTROLType().getCREATERELBP() );    
                                   }
                                   
                                   if (((ReverseBconatAppLevelResponse)reverseBconatAppLevelResponse.get()).getBUILDCONTROLType().getDLSAVEPATH() != null ){
                                     System.out.println("DLSAVEPATH " + ((ReverseBconatAppLevelResponse)reverseBconatAppLevelResponse.get()).getBUILDCONTROLType().getDLSAVEPATH() );    
                                   }
                                   
                                   if (((ReverseBconatAppLevelResponse)reverseBconatAppLevelResponse.get()).getBUILDCONTROLType().getDLRESTOREPATH() != null ){
                                     System.out.println("DLRESTOREPATH " + ((ReverseBconatAppLevelResponse)reverseBconatAppLevelResponse.get()).getBUILDCONTROLType().getDLRESTOREPATH() );    
                                   }
                                   
                                   if (((ReverseBconatAppLevelResponse)reverseBconatAppLevelResponse.get()).getBUILDCONTROLType().getPROGRAMOS() != null ){
                                     System.out.println("PROGRAMOS " + ((ReverseBconatAppLevelResponse)reverseBconatAppLevelResponse.get()).getBUILDCONTROLType().getPROGRAMOS() );    
                                   }
                                   
                                   if (((ReverseBconatAppLevelResponse)reverseBconatAppLevelResponse.get()).getBUILDCONTROLType().getCLRPROCESSLOG() != null ){
                                     System.out.println("CLRPROCESSLOG " + ((ReverseBconatAppLevelResponse)reverseBconatAppLevelResponse.get()).getBUILDCONTROLType().getCLRPROCESSLOG() );    
                                   }
                                   
                                   if (((ReverseBconatAppLevelResponse)reverseBconatAppLevelResponse.get()).getBUILDCONTROLType().getACTIVITY() != null ){
                                     System.out.println("ACTIVITY " + ((ReverseBconatAppLevelResponse)reverseBconatAppLevelResponse.get()).getBUILDCONTROLType().getACTIVITY() );    
                                   }
                                   
                                    if (((ReverseBconatAppLevelResponse)reverseBconatAppLevelResponse.get()).getBUILDCONTROLType().getPROCESSINFO() != null ){
                                     System.out.println("PROCESSINFO " + ((ReverseBconatAppLevelResponse)reverseBconatAppLevelResponse.get()).getBUILDCONTROLType().getPROCESSINFO() );    
                                    }
                                    
                                    if (((ReverseBconatAppLevelResponse)reverseBconatAppLevelResponse.get()).getBUILDCONTROLType().getPROCESSERR() != null ){
                                     System.out.println("PROCESSERR " + ((ReverseBconatAppLevelResponse)reverseBconatAppLevelResponse.get()).getBUILDCONTROLType().getPROCESSERR() );    
                                    }
                                    
                                    if (((ReverseBconatAppLevelResponse)reverseBconatAppLevelResponse.get()).getBUILDCONTROLType().getRELEASEDATE() != null ){
                                     System.out.println("RELEASEDATE " + ((ReverseBconatAppLevelResponse)reverseBconatAppLevelResponse.get()).getBUILDCONTROLType().getRELEASEDATE() );    
                                    }
                                    
                                    if (((ReverseBconatAppLevelResponse)reverseBconatAppLevelResponse.get()).getBUILDCONTROLType().getRELEASEVERSION() != null ){
                                     System.out.println("RELEASEVERSION " + ((ReverseBconatAppLevelResponse)reverseBconatAppLevelResponse.get()).getBUILDCONTROLType().getRELEASEVERSION() );    
                                    }
                                    
                                    if (((ReverseBconatAppLevelResponse)reverseBconatAppLevelResponse.get()).getBUILDCONTROLType().getRELEASEUSER() != null ){
                                     System.out.println("RELEASEUSER " + ((ReverseBconatAppLevelResponse)reverseBconatAppLevelResponse.get()).getBUILDCONTROLType().getRELEASEUSER() );    
                                    }
                                    
                                    if (((ReverseBconatAppLevelResponse)reverseBconatAppLevelResponse.get()).getBUILDCONTROLType().getRELSTAGE() != null ){
                                     System.out.println("RELSTAGE " + ((ReverseBconatAppLevelResponse)reverseBconatAppLevelResponse.get()).getBUILDCONTROLType().getRELSTAGE() );    
                                    }
                                    
                                    if (((ReverseBconatAppLevelResponse)reverseBconatAppLevelResponse.get()).getBUILDCONTROLType().getDATETIME() != null ){
                                     System.out.println("DATETIME " + ((ReverseBconatAppLevelResponse)reverseBconatAppLevelResponse.get()).getBUILDCONTROLType().getDATETIME() );    
                                    }
                                    
                                    if (((ReverseBconatAppLevelResponse)reverseBconatAppLevelResponse.get()).getBUILDCONTROLType().getAUTHORISER() != null ){
                                     System.out.println("AUTHORISER " + ((ReverseBconatAppLevelResponse)reverseBconatAppLevelResponse.get()).getBUILDCONTROLType().getAUTHORISER() );    
                                    }
                                    
                                    if (((ReverseBconatAppLevelResponse)reverseBconatAppLevelResponse.get()).getBUILDCONTROLType().getCOCODE() != null ){
                                     System.out.println("COCODE " + ((ReverseBconatAppLevelResponse)reverseBconatAppLevelResponse.get()).getBUILDCONTROLType().getCOCODE() );    
                                    }
                                   
                                   System.out.println("--------------------------------------------------");  
                             //}
                        //}
                    }
                    
                break;     
                    
                    
                    
            }  //FINALIZAR COMENTARIO AQUI PARA PRUEBAS
        } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Cantidad parámetros incorrectos. " + e);
    }
    catch (InterruptedException ex)
    {
          System.out.println("error uno " + ex.getMessage());
    }
    catch (ExecutionException ex)
    {
      System.out.println("error dos " + ex.getMessage());
    }
    finally {}
  }
    }


