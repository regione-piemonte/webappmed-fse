/*******************************************************************************
* Copyright Regione Piemonte - 2023
* SPDX-License-Identifier: EUPL-1.2
******************************************************************************/

package it.csi.dma.apiopsan.ultimodocumentoservice.dmaccbl;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.5.3
 * 2022-10-03T22:05:13.386+02:00
 * Generated source version: 3.5.3
 *
 */
@WebServiceClient(name = "UltimoDocumentoService",
                  wsdlLocation = "file:/C:/axis-1_4/UltimoDocumentoService.wsdl",
                  targetNamespace = "http://dmaccbl.csi.it/")
public class UltimoDocumentoService_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://dmaccbl.csi.it/", "UltimoDocumentoService");
    public final static QName UltimoDocumentoServicePort = new QName("http://dmaccbl.csi.it/", "UltimoDocumentoServicePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/axis-1_4/UltimoDocumentoService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(UltimoDocumentoService_Service.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/C:/axis-1_4/UltimoDocumentoService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public UltimoDocumentoService_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public UltimoDocumentoService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UltimoDocumentoService_Service() {
        super(WSDL_LOCATION, SERVICE);
    }

    public UltimoDocumentoService_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public UltimoDocumentoService_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public UltimoDocumentoService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns UltimoDocumentoService
     */
    @WebEndpoint(name = "UltimoDocumentoServicePort")
    public UltimoDocumentoService getUltimoDocumentoServicePort() {
        return super.getPort(UltimoDocumentoServicePort, UltimoDocumentoService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UltimoDocumentoService
     */
    @WebEndpoint(name = "UltimoDocumentoServicePort")
    public UltimoDocumentoService getUltimoDocumentoServicePort(WebServiceFeature... features) {
        return super.getPort(UltimoDocumentoServicePort, UltimoDocumentoService.class, features);
    }

}
