/*******************************************************************************
* Copyright Regione Piemonte - 2023
* SPDX-License-Identifier: EUPL-1.2
******************************************************************************/


package it.csi.dma.apiopsan.documentiservice.dmacc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ElementiSmediazione complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ElementiSmediazione"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://dma.csi.it/}elementiProcessati"/&gt;
 *         &lt;element ref="{http://dma.csi.it/}elementiElaborati"/&gt;
 *         &lt;element ref="{http://dma.csi.it/}elementiScartati"/&gt;
 *         &lt;element ref="{http://dma.csi.it/}elencoIdEClDocSmediati" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElementiSmediazione", propOrder = {
    "elementiProcessati",
    "elementiElaborati",
    "elementiScartati",
    "elencoIdEClDocSmediati"
})
public class ElementiSmediazione {

    @XmlElement(namespace = "http://dma.csi.it/")
    protected int elementiProcessati;
    @XmlElement(namespace = "http://dma.csi.it/")
    protected int elementiElaborati;
    @XmlElement(namespace = "http://dma.csi.it/")
    protected int elementiScartati;
    @XmlElement(namespace = "http://dma.csi.it/")
    protected List<String> elencoIdEClDocSmediati;

    /**
     * Recupera il valore della proprietÃ  elementiProcessati.
     * 
     */
    public int getElementiProcessati() {
        return elementiProcessati;
    }

    /**
     * Imposta il valore della proprietÃ  elementiProcessati.
     * 
     */
    public void setElementiProcessati(int value) {
        this.elementiProcessati = value;
    }

    /**
     * Recupera il valore della proprietÃ  elementiElaborati.
     * 
     */
    public int getElementiElaborati() {
        return elementiElaborati;
    }

    /**
     * Imposta il valore della proprietÃ  elementiElaborati.
     * 
     */
    public void setElementiElaborati(int value) {
        this.elementiElaborati = value;
    }

    /**
     * Recupera il valore della proprietÃ  elementiScartati.
     * 
     */
    public int getElementiScartati() {
        return elementiScartati;
    }

    /**
     * Imposta il valore della proprietÃ  elementiScartati.
     * 
     */
    public void setElementiScartati(int value) {
        this.elementiScartati = value;
    }

    /**
     * Gets the value of the elencoIdEClDocSmediati property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the elencoIdEClDocSmediati property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElencoIdEClDocSmediati().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getElencoIdEClDocSmediati() {
        if (elencoIdEClDocSmediati == null) {
            elencoIdEClDocSmediati = new ArrayList<String>();
        }
        return this.elencoIdEClDocSmediati;
    }

}
