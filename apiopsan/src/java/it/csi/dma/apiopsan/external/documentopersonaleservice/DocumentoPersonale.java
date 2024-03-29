/*******************************************************************************
* Copyright Regione Piemonte - 2023
* SPDX-License-Identifier: EUPL-1.2
******************************************************************************/


package it.csi.dma.apiopsan.external.documentopersonaleservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * &lt;p&gt;Classe Java per documentoPersonale complex type.
 * 
 * &lt;p&gt;Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="documentoPersonale"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="allegato" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="tipoAllegato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="trascrizione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="dataOraAggiornamento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "documentoPersonale", namespace = "http://dma.csi.it/", propOrder = {
    "allegato",
    "tipoAllegato",
    "trascrizione",
    "dataOraAggiornamento"
})
public class DocumentoPersonale {

    protected byte[] allegato;
    protected String tipoAllegato;
    protected String trascrizione;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataOraAggiornamento;

    /**
     * Recupera il valore della proprieta' allegato.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getAllegato() {
        return allegato;
    }

    /**
     * Imposta il valore della proprieta' allegato.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setAllegato(byte[] value) {
        this.allegato = value;
    }

    /**
     * Recupera il valore della proprieta' tipoAllegato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoAllegato() {
        return tipoAllegato;
    }

    /**
     * Imposta il valore della proprieta' tipoAllegato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoAllegato(String value) {
        this.tipoAllegato = value;
    }

    /**
     * Recupera il valore della proprieta' trascrizione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrascrizione() {
        return trascrizione;
    }

    /**
     * Imposta il valore della proprieta' trascrizione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrascrizione(String value) {
        this.trascrizione = value;
    }

    /**
     * Recupera il valore della proprieta' dataOraAggiornamento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataOraAggiornamento() {
        return dataOraAggiornamento;
    }

    /**
     * Imposta il valore della proprieta' dataOraAggiornamento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataOraAggiornamento(XMLGregorianCalendar value) {
        this.dataOraAggiornamento = value;
    }

}
