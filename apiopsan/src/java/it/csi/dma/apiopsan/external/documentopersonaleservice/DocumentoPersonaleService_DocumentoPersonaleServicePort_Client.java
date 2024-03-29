/*******************************************************************************
* Copyright Regione Piemonte - 2023
* SPDX-License-Identifier: EUPL-1.2
******************************************************************************/


package it.csi.dma.apiopsan.external.documentopersonaleservice;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.3.10
 * 2022-09-30T14:46:26.232+02:00
 * Generated source version: 3.3.10
 *
 */
public final class DocumentoPersonaleService_DocumentoPersonaleServicePort_Client {

    private static final QName SERVICE_NAME = new QName("http://dmacc.csi.it/", "DocumentoPersonaleService");

    private DocumentoPersonaleService_DocumentoPersonaleServicePort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = DocumentoPersonaleService_Service.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) {
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

        DocumentoPersonaleService_Service ss = new DocumentoPersonaleService_Service(wsdlURL, SERVICE_NAME);
        DocumentoPersonaleService port = ss.getDocumentoPersonaleServicePort();

        {
        System.out.println("Invoking getDocumentoPersonale...");
        java.lang.String _getDocumentoPersonale_idDocumento = "";
        java.lang.String _getDocumentoPersonale_cfPaziente = "";
        it.csi.dma.apiopsan.external.documentopersonaleservice.RichiedenteInfo _getDocumentoPersonale_richiedente = null;
        javax.xml.ws.Holder<java.util.List<it.csi.dma.apiopsan.external.documentopersonaleservice.Errore>> _getDocumentoPersonale_errori = new javax.xml.ws.Holder<java.util.List<it.csi.dma.apiopsan.external.documentopersonaleservice.Errore>>();
        javax.xml.ws.Holder<it.csi.dma.apiopsan.external.documentopersonaleservice.RisultatoCodice> _getDocumentoPersonale_esito = new javax.xml.ws.Holder<it.csi.dma.apiopsan.external.documentopersonaleservice.RisultatoCodice>();
        javax.xml.ws.Holder<it.csi.dma.apiopsan.external.documentopersonaleservice.DocumentoPersonale> _getDocumentoPersonale_documento = new javax.xml.ws.Holder<it.csi.dma.apiopsan.external.documentopersonaleservice.DocumentoPersonale>();
        port.getDocumentoPersonale(_getDocumentoPersonale_idDocumento, _getDocumentoPersonale_cfPaziente, _getDocumentoPersonale_richiedente, _getDocumentoPersonale_errori, _getDocumentoPersonale_esito, _getDocumentoPersonale_documento);

        System.out.println("getDocumentoPersonale._getDocumentoPersonale_errori=" + _getDocumentoPersonale_errori.value);
        System.out.println("getDocumentoPersonale._getDocumentoPersonale_esito=" + _getDocumentoPersonale_esito.value);
        System.out.println("getDocumentoPersonale._getDocumentoPersonale_documento=" + _getDocumentoPersonale_documento.value);

        }
        {
        System.out.println("Invoking setDocumentoPersonale...");
        it.csi.dma.apiopsan.external.documentopersonaleservice.RichiedenteInfo _setDocumentoPersonale_richiedente = null;
        java.lang.String _setDocumentoPersonale_cfPaziente = "";
        it.csi.dma.apiopsan.external.documentopersonaleservice.DocumentoPersonale _setDocumentoPersonale_documento = null;
        it.csi.dma.apiopsan.external.documentopersonaleservice.MetadatiDocumentoPersonale _setDocumentoPersonale_metadatiDocumento = null;
        javax.xml.ws.Holder<java.util.List<it.csi.dma.apiopsan.external.documentopersonaleservice.Errore>> _setDocumentoPersonale_errori = new javax.xml.ws.Holder<java.util.List<it.csi.dma.apiopsan.external.documentopersonaleservice.Errore>>();
        javax.xml.ws.Holder<it.csi.dma.apiopsan.external.documentopersonaleservice.RisultatoCodice> _setDocumentoPersonale_esito = new javax.xml.ws.Holder<it.csi.dma.apiopsan.external.documentopersonaleservice.RisultatoCodice>();
        javax.xml.ws.Holder<java.lang.String> _setDocumentoPersonale_idDocumento = new javax.xml.ws.Holder<java.lang.String>();
        port.setDocumentoPersonale(_setDocumentoPersonale_richiedente, _setDocumentoPersonale_cfPaziente, _setDocumentoPersonale_documento, _setDocumentoPersonale_metadatiDocumento, _setDocumentoPersonale_errori, _setDocumentoPersonale_esito, _setDocumentoPersonale_idDocumento);

        System.out.println("setDocumentoPersonale._setDocumentoPersonale_errori=" + _setDocumentoPersonale_errori.value);
        System.out.println("setDocumentoPersonale._setDocumentoPersonale_esito=" + _setDocumentoPersonale_esito.value);
        System.out.println("setDocumentoPersonale._setDocumentoPersonale_idDocumento=" + _setDocumentoPersonale_idDocumento.value);

        }
        {
        System.out.println("Invoking deleteDocumentoPersonale...");
        java.lang.String _deleteDocumentoPersonale_idDocumento = "";
        it.csi.dma.apiopsan.external.documentopersonaleservice.RichiedenteInfo _deleteDocumentoPersonale_richiedente = null;
        java.lang.String _deleteDocumentoPersonale_cfPaziente = "";
        javax.xml.ws.Holder<java.util.List<it.csi.dma.apiopsan.external.documentopersonaleservice.Errore>> _deleteDocumentoPersonale_errori = new javax.xml.ws.Holder<java.util.List<it.csi.dma.apiopsan.external.documentopersonaleservice.Errore>>();
        javax.xml.ws.Holder<it.csi.dma.apiopsan.external.documentopersonaleservice.RisultatoCodice> _deleteDocumentoPersonale_esito = new javax.xml.ws.Holder<it.csi.dma.apiopsan.external.documentopersonaleservice.RisultatoCodice>();
        port.deleteDocumentoPersonale(_deleteDocumentoPersonale_idDocumento, _deleteDocumentoPersonale_richiedente, _deleteDocumentoPersonale_cfPaziente, _deleteDocumentoPersonale_errori, _deleteDocumentoPersonale_esito);

        System.out.println("deleteDocumentoPersonale._deleteDocumentoPersonale_errori=" + _deleteDocumentoPersonale_errori.value);
        System.out.println("deleteDocumentoPersonale._deleteDocumentoPersonale_esito=" + _deleteDocumentoPersonale_esito.value);

        }

        System.exit(0);
    }

}
