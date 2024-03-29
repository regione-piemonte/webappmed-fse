/*******************************************************************************
* Copyright Regione Piemonte - 2023
* SPDX-License-Identifier: EUPL-1.2
******************************************************************************/

package it.csi.dma.apiopsan.external.cldocumentiservice.dmaclbl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.5.0
 * 2022-11-22T16:57:17.362+01:00
 * Generated source version: 3.5.0
 *
 */
@WebService(targetNamespace = "http://dmaclbl.csi.it/", name = "DocumentiService")
@XmlSeeAlso({it.csi.dma.apiopsan.external.cldocumentiservice.dma.ObjectFactory.class, it.csi.dma.apiopsan.external.cldocumentiservice.dmacc.ObjectFactory.class, ObjectFactory.class, it.csi.dma.apiopsan.external.cldocumentiservice.dmacl.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface DocumentiService {

    @WebMethod
    @WebResult(name = "GetDettaglioDocumentoNOASResponse", targetNamespace = "http://dmaclbl.csi.it/", partName = "GetDettaglioDocumentoNOASResponse")
    public GetDettaglioDocumentoResponse getDettaglioDocumentoNOAS(

        @WebParam(partName = "getDettaglioDocumento", name = "getDettaglioDocumentoNOAS", targetNamespace = "http://dmaclbl.csi.it/")
        GetDettaglioDocumentoRequest getDettaglioDocumento
    );

    @WebMethod(action = "http://dma.csi.it/DocumentiService/registraAvvenutoRitiro")
    @WebResult(name = "registraAvvenutoRitiroResponse", targetNamespace = "http://dmaclbl.csi.it/", partName = "registraAvvenutoRitiroResponse")
    public RegistraAvvenutoRitiroResponse registraAvvenutoRitiro(

        @WebParam(partName = "registraAvvenutoRitiro", name = "registraAvvenutoRitiro", targetNamespace = "http://dmacl.csi.it/")
        RegistraAvvenutoRitiroRequest registraAvvenutoRitiro
    );

    @WebMethod
    @WebResult(name = "getMieiRefertiResponse", targetNamespace = "http://dmaclbl.csi.it/", partName = "getMieiRefertiResponse")
    public GetRefertiResponse getMieiReferti(

        @WebParam(partName = "getRefertiRequest", name = "getRefertiRequest", targetNamespace = "http://dmaclbl.csi.it/")
        GetRefertiRequest getRefertiRequest
    );

    @WebMethod
    @WebResult(name = "smediazioneDocumentiResponse", targetNamespace = "http://dmaclbl.csi.it/", partName = "smediazioneDocumentiResponse")
    public SmediazioneDocumentoResponse smediazioneDocumenti(

        @WebParam(partName = "smediazioneDocumentiRequest", name = "smediazioneDocumentiRequest", targetNamespace = "http://dmaclbl.csi.it/")
        SmediazioneDocumentoRequest smediazioneDocumentiRequest
    );

    @WebMethod
    public void getDettaglioDocumento(

        @WebParam(partName = "getDettaglioDocumento", mode = WebParam.Mode.INOUT, name = "getDettaglioDocumento", targetNamespace = "http://dmaclbl.csi.it/")
        javax.xml.ws.Holder<GetDettaglioDocumentoRequest> getDettaglioDocumento
    );

    @WebMethod
    @WebResult(name = "getMieiRefertiDocsResponse", targetNamespace = "http://dmaclbl.csi.it/", partName = "getMieiRefertiDocsResponse")
    public GetRefertiResponse getMieiRefertiDocs(

        @WebParam(partName = "getRefertiDocs", name = "getRefertiDocs", targetNamespace = "http://dmaclbl.csi.it/")
        GetRefertiRequest getRefertiDocs
    );
}
