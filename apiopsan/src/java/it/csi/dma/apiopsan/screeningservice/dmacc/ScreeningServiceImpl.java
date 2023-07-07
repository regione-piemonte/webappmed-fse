/*******************************************************************************
* Copyright Regione Piemonte - 2023
* SPDX-License-Identifier: EUPL-1.2
******************************************************************************/


/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package it.csi.dma.apiopsan.screeningservice.dmacc;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.2.7
 * Wed Sep 14 14:45:37 CEST 2022
 * Generated source version: 2.2.7
 * 
 */

@javax.jws.WebService(
                      serviceName = "ScreeningService",
                      portName = "ScreeningServicePort",
                      targetNamespace = "http://dmacc.csi.it/",
                      //wsdlLocation = "https://tst-bejava-dma.isan.csi.it/dmaccrti/ScreeningService?wsdl",
                      endpointInterface = "it.csi.dma.apiopsan.screeningservice.dmacc.ScreeningService")
                      
public class ScreeningServiceImpl implements ScreeningService {

    private static final Logger LOG = Logger.getLogger(ScreeningServiceImpl.class.getName());

    /* (non-Javadoc)
     * @see it.csi.dmacc.ScreeningService#getScreening(it.csi.dmacc.ScreeningRequest  getScreening )*
     */
    public it.csi.dma.apiopsan.screeningservice.dmacc.ScreeningResponse getScreening(ScreeningRequest getScreening) { 
        LOG.info("Executing operation getScreening");
        System.out.println(getScreening);
        try {
        	it.csi.dma.apiopsan.screeningservice.dmacc.ScreeningResponse _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}