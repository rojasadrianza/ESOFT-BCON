package com.avilacorporation.esoft.conexion;

import com.temenos.wsbanescobcon.T24WebServicesImpl;
import com.temenos.wsbanescobcon.T24WebServicesImplService;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author Isaac Arismendi
 */
public class BConConexion {

    private static BConConexion instancia;
    private T24WebServicesImpl service;

    private BConConexion(String ip) {
        createConexion(ip);
    }

    public T24WebServicesImpl getService() {
        return service;
    }

    private void createConexion(String ip) {
        try {
            T24WebServicesImplService conexion = new T24WebServicesImplService(new URL("http://" + ip + "/WSBanescoBCON/services?wsdl"));
            //T24WebServicesImplService conexion = new T24WebServicesImplService(new URL("http://172.16.27.40:84/WSBanescoBCON/services?wsdl"));
            service = conexion.getT24WebServicesImplPort();
        } catch (MalformedURLException ex) {
            System.out.println("ERROR CONEXION " + ex);
        }
    }

    public static BConConexion getInstace(String ip) {
        if (instancia == null) {
            instancia = new BConConexion(ip);
        }
        return instancia;
    }

}
