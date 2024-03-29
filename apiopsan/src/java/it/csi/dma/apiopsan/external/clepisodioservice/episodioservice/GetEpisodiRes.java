/*******************************************************************************
* Copyright Regione Piemonte - 2023
* SPDX-License-Identifier: EUPL-1.2
******************************************************************************/


package it.csi.dma.apiopsan.external.clepisodioservice.episodioservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import it.csi.dma.apiopsan.external.clepisodioservice.dma.Episodio;


/**
 * <p>Classe Java per GetEpisodiRes complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="GetEpisodiRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://EpisodioService.WS.DMACL.csi.it}ServiceRes"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="episodi" type="{http://dma.csi.it/}episodio" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetEpisodiRes", propOrder = {
    "episodi"
})
public class GetEpisodiRes
    extends ServiceRes
{

    @XmlElement(nillable = true)
    protected List<Episodio> episodi;

    /**
     * Gets the value of the episodi property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the episodi property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEpisodi().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Episodio }
     * 
     * 
     */
    public List<Episodio> getEpisodi() {
        if (episodi == null) {
            episodi = new ArrayList<Episodio>();
        }
        return this.episodi;
    }

}
