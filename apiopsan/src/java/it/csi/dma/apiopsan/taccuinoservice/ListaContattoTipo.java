/*******************************************************************************
* Copyright Regione Piemonte - 2023
* SPDX-License-Identifier: EUPL-1.2
******************************************************************************/


package it.csi.dma.apiopsan.taccuinoservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per listaContattoTipo complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="listaContattoTipo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contattoTipo" type="{http://dmaclbluc.dma.csi.it/}contattoTipo" maxOccurs="unbounded" minOccurs="0" form="qualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listaContattoTipo", propOrder = {
    "contattoTipo"
})
public class ListaContattoTipo {

    protected List<ContattoTipo> contattoTipo;

    /**
     * Gets the value of the contattoTipo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contattoTipo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContattoTipo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContattoTipo }
     * 
     * 
     */
    public List<ContattoTipo> getContattoTipo() {
        if (contattoTipo == null) {
            contattoTipo = new ArrayList<ContattoTipo>();
        }
        return this.contattoTipo;
    }

}
