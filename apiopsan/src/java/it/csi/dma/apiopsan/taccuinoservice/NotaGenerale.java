/*******************************************************************************
* Copyright Regione Piemonte - 2023
* SPDX-License-Identifier: EUPL-1.2
******************************************************************************/


package it.csi.dma.apiopsan.taccuinoservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per notaGenerale complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="notaGenerale"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="statoSalute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="stileVita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="dataCreazione" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="dataAggiornamento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0" form="qualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "notaGenerale", propOrder = {
    "statoSalute",
    "stileVita",
    "dataCreazione",
    "dataAggiornamento"
})
public class NotaGenerale {

    protected String statoSalute;
    protected String stileVita;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataCreazione;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataAggiornamento;

    /**
     * Recupera il valore della proprietÃ  statoSalute.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatoSalute() {
        return statoSalute;
    }

    /**
     * Imposta il valore della proprietÃ  statoSalute.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatoSalute(String value) {
        this.statoSalute = value;
    }

    /**
     * Recupera il valore della proprietÃ  stileVita.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStileVita() {
        return stileVita;
    }

    /**
     * Imposta il valore della proprietÃ  stileVita.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStileVita(String value) {
        this.stileVita = value;
    }

    /**
     * Recupera il valore della proprietÃ  dataCreazione.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataCreazione() {
        return dataCreazione;
    }

    /**
     * Imposta il valore della proprietÃ  dataCreazione.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataCreazione(XMLGregorianCalendar value) {
        this.dataCreazione = value;
    }

    /**
     * Recupera il valore della proprietÃ  dataAggiornamento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataAggiornamento() {
        return dataAggiornamento;
    }

    /**
     * Imposta il valore della proprietÃ  dataAggiornamento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataAggiornamento(XMLGregorianCalendar value) {
        this.dataAggiornamento = value;
    }

}
