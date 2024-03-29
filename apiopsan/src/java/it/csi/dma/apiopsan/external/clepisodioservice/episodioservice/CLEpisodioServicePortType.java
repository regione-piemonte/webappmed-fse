/*******************************************************************************
* Copyright Regione Piemonte - 2023
* SPDX-License-Identifier: EUPL-1.2
******************************************************************************/

package it.csi.dma.apiopsan.external.clepisodioservice.episodioservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.5.0
 * 2022-10-03T12:40:10.622+02:00
 * Generated source version: 3.5.0
 *
 */
@WebService(targetNamespace = "http://EpisodioService.WS.DMACL.csi.it", name = "CLEpisodioServicePortType")
@XmlSeeAlso({ObjectFactory.class, it.csi.dma.apiopsan.external.clepisodioservice.dmaclbl.ObjectFactory.class, it.csi.dma.apiopsan.external.clepisodioservice.dma.ObjectFactory.class})
public interface CLEpisodioServicePortType {

    @WebMethod(operationName = "GetDocumento", action = "http://EpisodioService.WS.DMACL.csi.it/DMACL.WS.EpisodioService.GetDocumento")
    @Action(input = "http://EpisodioService.WS.DMACL.csi.it/DMACL.WS.EpisodioService.GetDocumento", output = "http://EpisodioService.WS.DMACL.csi.it/EpisodioServiceSoap/GetDocumentoResponse")
    @RequestWrapper(localName = "GetDocumento", targetNamespace = "http://EpisodioService.WS.DMACL.csi.it", className = "it.csi.dma.apiopsan.external.clepisodioservice.episodioservice.GetDocumento")
    @ResponseWrapper(localName = "GetDocumentoResponse", targetNamespace = "http://EpisodioService.WS.DMACL.csi.it", className = "it.csi.dma.apiopsan.external.clepisodioservice.episodioservice.GetDocumentoResponse")
    @WebResult(name = "GetDocumentoResult", targetNamespace = "http://EpisodioService.WS.DMACL.csi.it")
    public it.csi.dma.apiopsan.external.clepisodioservice.episodioservice.GetDocumentoRes getDocumento(

        @WebParam(name = "requestDc", targetNamespace = "http://EpisodioService.WS.DMACL.csi.it")
        it.csi.dma.apiopsan.external.clepisodioservice.episodioservice.GetDocumentoReq requestDc
    );

    @WebMethod(operationName = "GetEpisodi", action = "http://EpisodioService.WS.DMACL.csi.it/DMACL.WS.EpisodioService.GetEpisodi")
    @Action(input = "http://EpisodioService.WS.DMACL.csi.it/DMACL.WS.EpisodioService.GetEpisodi", output = "http://EpisodioService.WS.DMACL.csi.it/EpisodioServiceSoap/GetEpisodiResponse")
    @RequestWrapper(localName = "GetEpisodi", targetNamespace = "http://EpisodioService.WS.DMACL.csi.it", className = "it.csi.dma.apiopsan.external.clepisodioservice.episodioservice.GetEpisodi")
    @ResponseWrapper(localName = "GetEpisodiResponse", targetNamespace = "http://EpisodioService.WS.DMACL.csi.it", className = "it.csi.dma.apiopsan.external.clepisodioservice.episodioservice.GetEpisodiResponse")
    @WebResult(name = "GetEpisodiResult", targetNamespace = "http://EpisodioService.WS.DMACL.csi.it")
    public it.csi.dma.apiopsan.external.clepisodioservice.episodioservice.GetEpisodiRes getEpisodi(

        @WebParam(name = "requestGe", targetNamespace = "http://EpisodioService.WS.DMACL.csi.it")
        it.csi.dma.apiopsan.external.clepisodioservice.episodioservice.GetEpisodiReq requestGe
    );
}
