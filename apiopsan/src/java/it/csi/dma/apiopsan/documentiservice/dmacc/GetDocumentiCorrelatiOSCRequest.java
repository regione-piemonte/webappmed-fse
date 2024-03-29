/*******************************************************************************
* Copyright Regione Piemonte - 2023
* SPDX-License-Identifier: EUPL-1.2
******************************************************************************/


package it.csi.dma.apiopsan.documentiservice.dmacc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import it.csi.dma.apiopsan.documentiservice.dma.RichiedenteInfo;
import it.csi.dma.apiopsan.documentiservice.dma.TipoAzione;


/**
 * <p>Classe Java per getDocumentiCorrelatiOSCRequest complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getDocumentiCorrelatiOSCRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="richiedente" type="{http://dma.csi.it/}richiedenteInfo" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="cfPaziente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="documento" type="{http://dmacc.csi.it/}identificativoDocumento" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="tipoAzione" type="{http://dma.csi.it/}tipoAzione" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDocumentiCorrelatiOSCRequest", propOrder = {
    "richiedente",
    "cfPaziente",
    "documento",
    "tipoAzione"
})
public class GetDocumentiCorrelatiOSCRequest {

    protected RichiedenteInfo richiedente;
    protected String cfPaziente;
    protected IdentificativoDocumento documento;
    @XmlSchemaType(name = "string")
    protected TipoAzione tipoAzione;

    /**
     * Recupera il valore della proprietÃ  richiedente.
     * 
     * @return
     *     possible object is
     *     {@link RichiedenteInfo }
     *     
     */
    public RichiedenteInfo getRichiedente() {
        return richiedente;
    }

    /**
     * Imposta il valore della proprietÃ  richiedente.
     * 
     * @param value
     *     allowed object is
     *     {@link RichiedenteInfo }
     *     
     */
    public void setRichiedente(RichiedenteInfo value) {
        this.richiedente = value;
    }

    /**
     * Recupera il valore della proprietÃ  cfPaziente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCfPaziente() {
        return cfPaziente;
    }

    /**
     * Imposta il valore della proprietÃ  cfPaziente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCfPaziente(String value) {
        this.cfPaziente = value;
    }

    /**
     * Recupera il valore della proprietÃ  documento.
     * 
     * @return
     *     possible object is
     *     {@link IdentificativoDocumento }
     *     
     */
    public IdentificativoDocumento getDocumento() {
        return documento;
    }

    /**
     * Imposta il valore della proprietÃ  documento.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificativoDocumento }
     *     
     */
    public void setDocumento(IdentificativoDocumento value) {
        this.documento = value;
    }

    /**
     * Recupera il valore della proprietÃ  tipoAzione.
     * 
     * @return
     *     possible object is
     *     {@link TipoAzione }
     *     
     */
    public TipoAzione getTipoAzione() {
        return tipoAzione;
    }

    /**
     * Imposta il valore della proprietÃ  tipoAzione.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoAzione }
     *     
     */
    public void setTipoAzione(TipoAzione value) {
        this.tipoAzione = value;
    }

}
