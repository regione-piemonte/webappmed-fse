/*******************************************************************************
* Copyright Regione Piemonte - 2023
* SPDX-License-Identifier: EUPL-1.2
******************************************************************************/


package it.csi.dma.apiopsan.external.documentopersonaleservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Classe Java per richiedenteInfo complex type.
 * 
 * &lt;p&gt;Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="richiedenteInfo"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="applicativoVerticale" type="{http://dmacc.csi.it/}applicativoVerticale" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="applicazione" type="{http://dmacc.csi.it/}applicazioneRichiedente" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="codiceFiscale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="numeroTransazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ruolo" type="{http://dma.csi.it/}ruolo" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "richiedenteInfo", namespace = "http://dma.csi.it/", propOrder = {
    "applicativoVerticale",
    "applicazione",
    "codiceFiscale",
    "ip",
    "numeroTransazione",
    "ruolo"
})
public class RichiedenteInfo {

    protected ApplicativoVerticale applicativoVerticale;
    protected ApplicazioneRichiedente applicazione;
    protected String codiceFiscale;
    protected String ip;
    protected String numeroTransazione;
    protected Ruolo ruolo;

    /**
     * Recupera il valore della proprieta' applicativoVerticale.
     * 
     * @return
     *     possible object is
     *     {@link ApplicativoVerticale }
     *     
     */
    public ApplicativoVerticale getApplicativoVerticale() {
        return applicativoVerticale;
    }

    /**
     * Imposta il valore della proprieta' applicativoVerticale.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicativoVerticale }
     *     
     */
    public void setApplicativoVerticale(ApplicativoVerticale value) {
        this.applicativoVerticale = value;
    }

    /**
     * Recupera il valore della proprieta' applicazione.
     * 
     * @return
     *     possible object is
     *     {@link ApplicazioneRichiedente }
     *     
     */
    public ApplicazioneRichiedente getApplicazione() {
        return applicazione;
    }

    /**
     * Imposta il valore della proprieta' applicazione.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicazioneRichiedente }
     *     
     */
    public void setApplicazione(ApplicazioneRichiedente value) {
        this.applicazione = value;
    }

    /**
     * Recupera il valore della proprieta' codiceFiscale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    /**
     * Imposta il valore della proprieta' codiceFiscale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceFiscale(String value) {
        this.codiceFiscale = value;
    }

    /**
     * Recupera il valore della proprieta' ip.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIp() {
        return ip;
    }

    /**
     * Imposta il valore della proprieta' ip.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIp(String value) {
        this.ip = value;
    }

    /**
     * Recupera il valore della proprieta' numeroTransazione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroTransazione() {
        return numeroTransazione;
    }

    /**
     * Imposta il valore della proprieta' numeroTransazione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroTransazione(String value) {
        this.numeroTransazione = value;
    }

    /**
     * Recupera il valore della proprieta' ruolo.
     * 
     * @return
     *     possible object is
     *     {@link Ruolo }
     *     
     */
    public Ruolo getRuolo() {
        return ruolo;
    }

    /**
     * Imposta il valore della proprieta' ruolo.
     * 
     * @param value
     *     allowed object is
     *     {@link Ruolo }
     *     
     */
    public void setRuolo(Ruolo value) {
        this.ruolo = value;
    }

}
