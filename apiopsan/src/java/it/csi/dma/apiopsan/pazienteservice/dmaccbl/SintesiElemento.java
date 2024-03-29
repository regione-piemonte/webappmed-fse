/*******************************************************************************
* Copyright Regione Piemonte - 2023
* SPDX-License-Identifier: EUPL-1.2
******************************************************************************/


package it.csi.dma.apiopsan.pazienteservice.dmaccbl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import it.csi.dma.apiopsan.pazienteservice.dma.ComponenteLocaleRispostaStato;


/**
 * <p>Classe Java per SintesiElemento complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SintesiElemento"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://dma.csi.it/}tipo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://dma.csi.it/}cardinalita"/&gt;
 *         &lt;element ref="{http://dma.csi.it/}data" minOccurs="0"/&gt;
 *         &lt;element ref="{http://dma.csi.it/}stato" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SintesiElemento", propOrder = {
    "tipo",
    "cardinalita",
    "data",
    "stato"
})
public class SintesiElemento {

    @XmlElement(namespace = "http://dma.csi.it/")
    @XmlSchemaType(name = "string")
    protected SintesiElementoTipo tipo;
    @XmlElement(namespace = "http://dma.csi.it/")
    protected int cardinalita;
    @XmlElement(namespace = "http://dma.csi.it/")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar data;
    @XmlElement(namespace = "http://dma.csi.it/")
    protected ComponenteLocaleRispostaStato stato;

    /**
     * Recupera il valore della proprietÃ  tipo.
     * 
     * @return
     *     possible object is
     *     {@link SintesiElementoTipo }
     *     
     */
    public SintesiElementoTipo getTipo() {
        return tipo;
    }

    /**
     * Imposta il valore della proprietÃ  tipo.
     * 
     * @param value
     *     allowed object is
     *     {@link SintesiElementoTipo }
     *     
     */
    public void setTipo(SintesiElementoTipo value) {
        this.tipo = value;
    }

    /**
     * Recupera il valore della proprietÃ  cardinalita.
     * 
     */
    public int getCardinalita() {
        return cardinalita;
    }

    /**
     * Imposta il valore della proprietÃ  cardinalita.
     * 
     */
    public void setCardinalita(int value) {
        this.cardinalita = value;
    }

    /**
     * Recupera il valore della proprietÃ  data.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getData() {
        return data;
    }

    /**
     * Imposta il valore della proprietÃ  data.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setData(XMLGregorianCalendar value) {
        this.data = value;
    }

    /**
     * Recupera il valore della proprietÃ  stato.
     * 
     * @return
     *     possible object is
     *     {@link ComponenteLocaleRispostaStato }
     *     
     */
    public ComponenteLocaleRispostaStato getStato() {
        return stato;
    }

    /**
     * Imposta il valore della proprietÃ  stato.
     * 
     * @param value
     *     allowed object is
     *     {@link ComponenteLocaleRispostaStato }
     *     
     */
    public void setStato(ComponenteLocaleRispostaStato value) {
        this.stato = value;
    }

}
