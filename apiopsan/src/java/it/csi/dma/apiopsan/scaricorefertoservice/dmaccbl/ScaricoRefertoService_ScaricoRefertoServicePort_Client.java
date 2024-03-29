/*******************************************************************************
* Copyright Regione Piemonte - 2023
* SPDX-License-Identifier: EUPL-1.2
******************************************************************************/


package it.csi.dma.apiopsan.scaricorefertoservice.dmaccbl;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;

import it.csi.dma.apiopsan.scaricorefertoservice.dmacc.ImpostaDataRitiroRefertoSRResponse;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.2.7
 * Wed Sep 14 15:36:17 CEST 2022
 * Generated source version: 2.2.7
 * 
 */

public final class ScaricoRefertoService_ScaricoRefertoServicePort_Client {

    private static final QName SERVICE_NAME = new QName("http://dmaccbl.csi.it/", "ScaricoRefertoService");

    private ScaricoRefertoService_ScaricoRefertoServicePort_Client() {
    }

    public static void main(String args[]) throws Exception {
        URL wsdlURL = ScaricoRefertoService_Service.WSDL_LOCATION;
        if (args.length > 0) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        ScaricoRefertoService_Service ss = new ScaricoRefertoService_Service(wsdlURL, SERVICE_NAME);
        ScaricoRefertoService port = ss.getScaricoRefertoServicePort();  
        
        {
        System.out.println("Invoking getCLDaContattareSR...");
        GetCLDaContattareSR _getCLDaContattareSR_getCLDaContattareSR = null;
        GetCLDaContattareSRResponse _getCLDaContattareSR__return = port.getCLDaContattareSR(_getCLDaContattareSR_getCLDaContattareSR);
        System.out.println("getCLDaContattareSR.result=" + _getCLDaContattareSR__return);


        }
        {
        System.out.println("Invoking checkGetRefertoSR...");
        CheckGetRefertoSR _checkGetRefertoSR_checkGetRefertoSR = null;
        CheckGetRefertoSRResponse _checkGetRefertoSR__return = port.checkGetRefertoSR(_checkGetRefertoSR_checkGetRefertoSR);
        System.out.println("checkGetRefertoSR.result=" + _checkGetRefertoSR__return);


        }
        {
        System.out.println("Invoking addPageQRCode...");
        AddPageQRCodeRequest _addPageQRCode_addPageQRCode = null;
        AddPageQRCodeResponse _addPageQRCode__return = port.addPageQRCode(_addPageQRCode_addPageQRCode);
        System.out.println("addPageQRCode.result=" + _addPageQRCode__return);


        }
        {
        System.out.println("Invoking scansionaRefertoQRCode...");
        ScansionaRefertoQRCodeRequest _scansionaRefertoQRCode_scansionaRefertoQRCode = null;
        ScansionaRefertoQRCodeResponse _scansionaRefertoQRCode__return = port.scansionaRefertoQRCode(_scansionaRefertoQRCode_scansionaRefertoQRCode);
        System.out.println("scansionaRefertoQRCode.result=" + _scansionaRefertoQRCode__return);


        }
        {
        System.out.println("Invoking checkVerificaDelega...");
        CheckVerificaDelega _checkVerificaDelega_checkVerificaDelega = null;
        CheckVerificaDelegaResponse _checkVerificaDelega__return = port.checkVerificaDelega(_checkVerificaDelega_checkVerificaDelega);
        System.out.println("checkVerificaDelega.result=" + _checkVerificaDelega__return);


        }
        {
        System.out.println("Invoking impostaDataRitiroRefertoSR...");
        ImpostaDataRitiroRefertoSRRequest _impostaDataRitiroRefertoSR_impostaDataRitiroRefertoSR = null;
        ImpostaDataRitiroRefertoSRResponse _impostaDataRitiroRefertoSR__return = port.impostaDataRitiroRefertoSR(_impostaDataRitiroRefertoSR_impostaDataRitiroRefertoSR);
        System.out.println("impostaDataRitiroRefertoSR.result=" + _impostaDataRitiroRefertoSR__return);


        }

        System.exit(0);
    }

}
