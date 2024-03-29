/*******************************************************************************
* Copyright Regione Piemonte - 2023
* SPDX-License-Identifier: EUPL-1.2
******************************************************************************/


package it.csi.dma.apiopsan.consensoextservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.csi.dma.apiopsan.consensoextservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CollocazioneReport_QNAME = new QName("http://dmacc.csi.it/", "collocazioneReport");
    private final static QName _StatoConsensi_QNAME = new QName("http://dmacc.csi.it/", "statoConsensi");
    private final static QName _StatoConsensiResponse_QNAME = new QName("http://dmacc.csi.it/", "statoConsensiResponse");
    private final static QName _ComunicazioneConsensi_QNAME = new QName("http://dmacc.csi.it/", "comunicazioneConsensi");
    private final static QName _ComunicazioneConsensiResponse_QNAME = new QName("http://dmacc.csi.it/", "comunicazioneConsensiResponse");
    private final static QName _RecuperoInformativa_QNAME = new QName("http://dmacc.csi.it/", "recuperoInformativa");
    private final static QName _RecuperoInformativaResponse_QNAME = new QName("http://dmacc.csi.it/", "recuperoInformativaResponse");
    private final static QName _ComunicazioneConsensiIN_QNAME = new QName("http://dma.csi.it/", "comunicazioneConsensiIN");
    private final static QName _Consenso_QNAME = new QName("http://dma.csi.it/", "consenso");
    private final static QName _Delega_QNAME = new QName("http://dma.csi.it/", "delega");
    private final static QName _InformativaIN_QNAME = new QName("http://dma.csi.it/", "informativaIN");
    private final static QName _InformativaOUT_QNAME = new QName("http://dma.csi.it/", "informativaOUT");
    private final static QName _ModalitaDiAlimentazione_QNAME = new QName("http://dma.csi.it/", "modalitaDiAlimentazione");
    private final static QName _Paziente_QNAME = new QName("http://dma.csi.it/", "paziente");
    private final static QName _Richiedente_QNAME = new QName("http://dma.csi.it/", "richiedente");
    private final static QName _RichiedenteExt_QNAME = new QName("http://dma.csi.it/", "richiedenteExt");
    private final static QName _StatoConsensiIN_QNAME = new QName("http://dma.csi.it/", "statoConsensiIN");
    private final static QName _StatoConsensiOUT_QNAME = new QName("http://dma.csi.it/", "statoConsensiOUT");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.csi.dma.apiopsan.consensoextservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CollocazioneReport }
     * 
     */
    public CollocazioneReport createCollocazioneReport() {
        return new CollocazioneReport();
    }

    /**
     * Create an instance of {@link StatoConsensiExtRequeste }
     * 
     */
    public StatoConsensiExtRequeste createStatoConsensiExtRequeste() {
        return new StatoConsensiExtRequeste();
    }

    /**
     * Create an instance of {@link StatoConsensiResponse }
     * 
     */
    public StatoConsensiResponse createStatoConsensiResponse() {
        return new StatoConsensiResponse();
    }

    /**
     * Create an instance of {@link ComunicazioneConsensiExtRequeste }
     * 
     */
    public ComunicazioneConsensiExtRequeste createComunicazioneConsensiExtRequeste() {
        return new ComunicazioneConsensiExtRequeste();
    }

    /**
     * Create an instance of {@link ComunicazioneConsensiResponse }
     * 
     */
    public ComunicazioneConsensiResponse createComunicazioneConsensiResponse() {
        return new ComunicazioneConsensiResponse();
    }

    /**
     * Create an instance of {@link RecuperoInformativaExtRequeste }
     * 
     */
    public RecuperoInformativaExtRequeste createRecuperoInformativaExtRequeste() {
        return new RecuperoInformativaExtRequeste();
    }

    /**
     * Create an instance of {@link RecuperoInformativaResponse }
     * 
     */
    public RecuperoInformativaResponse createRecuperoInformativaResponse() {
        return new RecuperoInformativaResponse();
    }

    /**
     * Create an instance of {@link ServiceResponse }
     * 
     */
    public ServiceResponse createServiceResponse() {
        return new ServiceResponse();
    }

    /**
     * Create an instance of {@link ComunicazioneConsensiIN }
     * 
     */
    public ComunicazioneConsensiIN createComunicazioneConsensiIN() {
        return new ComunicazioneConsensiIN();
    }

    /**
     * Create an instance of {@link Consenso }
     * 
     */
    public Consenso createConsenso() {
        return new Consenso();
    }

    /**
     * Create an instance of {@link Delega }
     * 
     */
    public Delega createDelega() {
        return new Delega();
    }

    /**
     * Create an instance of {@link InformativaIN }
     * 
     */
    public InformativaIN createInformativaIN() {
        return new InformativaIN();
    }

    /**
     * Create an instance of {@link InformativaOUT }
     * 
     */
    public InformativaOUT createInformativaOUT() {
        return new InformativaOUT();
    }

    /**
     * Create an instance of {@link ModalitaDiAlimentazione }
     * 
     */
    public ModalitaDiAlimentazione createModalitaDiAlimentazione() {
        return new ModalitaDiAlimentazione();
    }

    /**
     * Create an instance of {@link Paziente }
     * 
     */
    public Paziente createPaziente() {
        return new Paziente();
    }

    /**
     * Create an instance of {@link Richiedente }
     * 
     */
    public Richiedente createRichiedente() {
        return new Richiedente();
    }

    /**
     * Create an instance of {@link RichiedenteExt }
     * 
     */
    public RichiedenteExt createRichiedenteExt() {
        return new RichiedenteExt();
    }

    /**
     * Create an instance of {@link StatoConsensiIN }
     * 
     */
    public StatoConsensiIN createStatoConsensiIN() {
        return new StatoConsensiIN();
    }

    /**
     * Create an instance of {@link StatoConsensiOUT }
     * 
     */
    public StatoConsensiOUT createStatoConsensiOUT() {
        return new StatoConsensiOUT();
    }

    /**
     * Create an instance of {@link ComuneDiNascita }
     * 
     */
    public ComuneDiNascita createComuneDiNascita() {
        return new ComuneDiNascita();
    }

    /**
     * Create an instance of {@link Codifica }
     * 
     */
    public Codifica createCodifica() {
        return new Codifica();
    }

    /**
     * Create an instance of {@link Disciplina }
     * 
     */
    public Disciplina createDisciplina() {
        return new Disciplina();
    }

    /**
     * Create an instance of {@link ApplicazioneRichiedente }
     * 
     */
    public ApplicazioneRichiedente createApplicazioneRichiedente() {
        return new ApplicazioneRichiedente();
    }

    /**
     * Create an instance of {@link TipoEpisodio }
     * 
     */
    public TipoEpisodio createTipoEpisodio() {
        return new TipoEpisodio();
    }

    /**
     * Create an instance of {@link AziendaSanitaria }
     * 
     */
    public AziendaSanitaria createAziendaSanitaria() {
        return new AziendaSanitaria();
    }

    /**
     * Create an instance of {@link Prestazione }
     * 
     */
    public Prestazione createPrestazione() {
        return new Prestazione();
    }

    /**
     * Create an instance of {@link Branca }
     * 
     */
    public Branca createBranca() {
        return new Branca();
    }

    /**
     * Create an instance of {@link ValoriPrestazione }
     * 
     */
    public ValoriPrestazione createValoriPrestazione() {
        return new ValoriPrestazione();
    }

    /**
     * Create an instance of {@link TipoDocumento }
     * 
     */
    public TipoDocumento createTipoDocumento() {
        return new TipoDocumento();
    }

    /**
     * Create an instance of {@link UnitaOperativaSanitaria }
     * 
     */
    public UnitaOperativaSanitaria createUnitaOperativaSanitaria() {
        return new UnitaOperativaSanitaria();
    }

    /**
     * Create an instance of {@link StrutturaSanitaria }
     * 
     */
    public StrutturaSanitaria createStrutturaSanitaria() {
        return new StrutturaSanitaria();
    }

    /**
     * Create an instance of {@link Errore }
     * 
     */
    public Errore createErrore() {
        return new Errore();
    }

    /**
     * Create an instance of {@link ComponenteLocale }
     * 
     */
    public ComponenteLocale createComponenteLocale() {
        return new ComponenteLocale();
    }

    /**
     * Create an instance of {@link ComponenteLocaleTipo }
     * 
     */
    public ComponenteLocaleTipo createComponenteLocaleTipo() {
        return new ComponenteLocaleTipo();
    }

    /**
     * Create an instance of {@link ComponenteLocaleServizio }
     * 
     */
    public ComponenteLocaleServizio createComponenteLocaleServizio() {
        return new ComponenteLocaleServizio();
    }

    /**
     * Create an instance of {@link ComponenteLocaleOperazione }
     * 
     */
    public ComponenteLocaleOperazione createComponenteLocaleOperazione() {
        return new ComponenteLocaleOperazione();
    }

    /**
     * Create an instance of {@link RegimeDMA }
     * 
     */
    public RegimeDMA createRegimeDMA() {
        return new RegimeDMA();
    }

    /**
     * Create an instance of {@link ComponenteLocaleRispostaStato }
     * 
     */
    public ComponenteLocaleRispostaStato createComponenteLocaleRispostaStato() {
        return new ComponenteLocaleRispostaStato();
    }

    /**
     * Create an instance of {@link TipoFileDocumento }
     * 
     */
    public TipoFileDocumento createTipoFileDocumento() {
        return new TipoFileDocumento();
    }

    /**
     * Create an instance of {@link StatoDiNascita }
     * 
     */
    public StatoDiNascita createStatoDiNascita() {
        return new StatoDiNascita();
    }

    /**
     * Create an instance of {@link RuoloDMA }
     * 
     */
    public RuoloDMA createRuoloDMA() {
        return new RuoloDMA();
    }

    /**
     * Create an instance of {@link Profilo }
     * 
     */
    public Profilo createProfilo() {
        return new Profilo();
    }

    /**
     * Create an instance of {@link EpisodioStato }
     * 
     */
    public EpisodioStato createEpisodioStato() {
        return new EpisodioStato();
    }

    /**
     * Create an instance of {@link TipoReferto }
     * 
     */
    public TipoReferto createTipoReferto() {
        return new TipoReferto();
    }

    /**
     * Create an instance of {@link ConsensoMatriceRuolo }
     * 
     */
    public ConsensoMatriceRuolo createConsensoMatriceRuolo() {
        return new ConsensoMatriceRuolo();
    }

    /**
     * Create an instance of {@link OpzioniType }
     * 
     */
    public OpzioniType createOpzioniType() {
        return new OpzioniType();
    }

    /**
     * Create an instance of {@link ApplicativoVerticale }
     * 
     */
    public ApplicativoVerticale createApplicativoVerticale() {
        return new ApplicativoVerticale();
    }

    /**
     * Create an instance of {@link ArrayOfcodificacodifica }
     * 
     */
    public ArrayOfcodificacodifica createArrayOfcodificacodifica() {
        return new ArrayOfcodificacodifica();
    }

    /**
     * Create an instance of {@link ArrayOfpazientepaziente }
     * 
     */
    public ArrayOfpazientepaziente createArrayOfpazientepaziente() {
        return new ArrayOfpazientepaziente();
    }

    /**
     * Create an instance of {@link ComponenteLocaleRisposta }
     * 
     */
    public ComponenteLocaleRisposta createComponenteLocaleRisposta() {
        return new ComponenteLocaleRisposta();
    }

    /**
     * Create an instance of {@link ConsensoMatriceTipoDato }
     * 
     */
    public ConsensoMatriceTipoDato createConsensoMatriceTipoDato() {
        return new ConsensoMatriceTipoDato();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CollocazioneReport }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CollocazioneReport }{@code >}
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "collocazioneReport")
    public JAXBElement<CollocazioneReport> createCollocazioneReport(CollocazioneReport value) {
        return new JAXBElement<CollocazioneReport>(_CollocazioneReport_QNAME, CollocazioneReport.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatoConsensiExtRequeste }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StatoConsensiExtRequeste }{@code >}
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "statoConsensi")
    public JAXBElement<StatoConsensiExtRequeste> createStatoConsensi(StatoConsensiExtRequeste value) {
        return new JAXBElement<StatoConsensiExtRequeste>(_StatoConsensi_QNAME, StatoConsensiExtRequeste.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatoConsensiResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StatoConsensiResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "statoConsensiResponse")
    public JAXBElement<StatoConsensiResponse> createStatoConsensiResponse(StatoConsensiResponse value) {
        return new JAXBElement<StatoConsensiResponse>(_StatoConsensiResponse_QNAME, StatoConsensiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComunicazioneConsensiExtRequeste }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ComunicazioneConsensiExtRequeste }{@code >}
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "comunicazioneConsensi")
    public JAXBElement<ComunicazioneConsensiExtRequeste> createComunicazioneConsensi(ComunicazioneConsensiExtRequeste value) {
        return new JAXBElement<ComunicazioneConsensiExtRequeste>(_ComunicazioneConsensi_QNAME, ComunicazioneConsensiExtRequeste.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComunicazioneConsensiResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ComunicazioneConsensiResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "comunicazioneConsensiResponse")
    public JAXBElement<ComunicazioneConsensiResponse> createComunicazioneConsensiResponse(ComunicazioneConsensiResponse value) {
        return new JAXBElement<ComunicazioneConsensiResponse>(_ComunicazioneConsensiResponse_QNAME, ComunicazioneConsensiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecuperoInformativaExtRequeste }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RecuperoInformativaExtRequeste }{@code >}
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "recuperoInformativa")
    public JAXBElement<RecuperoInformativaExtRequeste> createRecuperoInformativa(RecuperoInformativaExtRequeste value) {
        return new JAXBElement<RecuperoInformativaExtRequeste>(_RecuperoInformativa_QNAME, RecuperoInformativaExtRequeste.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecuperoInformativaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RecuperoInformativaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://dmacc.csi.it/", name = "recuperoInformativaResponse")
    public JAXBElement<RecuperoInformativaResponse> createRecuperoInformativaResponse(RecuperoInformativaResponse value) {
        return new JAXBElement<RecuperoInformativaResponse>(_RecuperoInformativaResponse_QNAME, RecuperoInformativaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComunicazioneConsensiIN }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ComunicazioneConsensiIN }{@code >}
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "comunicazioneConsensiIN")
    public JAXBElement<ComunicazioneConsensiIN> createComunicazioneConsensiIN(ComunicazioneConsensiIN value) {
        return new JAXBElement<ComunicazioneConsensiIN>(_ComunicazioneConsensiIN_QNAME, ComunicazioneConsensiIN.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Consenso }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Consenso }{@code >}
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "consenso")
    public JAXBElement<Consenso> createConsenso(Consenso value) {
        return new JAXBElement<Consenso>(_Consenso_QNAME, Consenso.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Delega }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Delega }{@code >}
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "delega")
    public JAXBElement<Delega> createDelega(Delega value) {
        return new JAXBElement<Delega>(_Delega_QNAME, Delega.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InformativaIN }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InformativaIN }{@code >}
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "informativaIN")
    public JAXBElement<InformativaIN> createInformativaIN(InformativaIN value) {
        return new JAXBElement<InformativaIN>(_InformativaIN_QNAME, InformativaIN.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InformativaOUT }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InformativaOUT }{@code >}
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "informativaOUT")
    public JAXBElement<InformativaOUT> createInformativaOUT(InformativaOUT value) {
        return new JAXBElement<InformativaOUT>(_InformativaOUT_QNAME, InformativaOUT.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModalitaDiAlimentazione }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ModalitaDiAlimentazione }{@code >}
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "modalitaDiAlimentazione")
    public JAXBElement<ModalitaDiAlimentazione> createModalitaDiAlimentazione(ModalitaDiAlimentazione value) {
        return new JAXBElement<ModalitaDiAlimentazione>(_ModalitaDiAlimentazione_QNAME, ModalitaDiAlimentazione.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Paziente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Paziente }{@code >}
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "paziente")
    public JAXBElement<Paziente> createPaziente(Paziente value) {
        return new JAXBElement<Paziente>(_Paziente_QNAME, Paziente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Richiedente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Richiedente }{@code >}
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "richiedente")
    public JAXBElement<Richiedente> createRichiedente(Richiedente value) {
        return new JAXBElement<Richiedente>(_Richiedente_QNAME, Richiedente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RichiedenteExt }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RichiedenteExt }{@code >}
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "richiedenteExt")
    public JAXBElement<RichiedenteExt> createRichiedenteExt(RichiedenteExt value) {
        return new JAXBElement<RichiedenteExt>(_RichiedenteExt_QNAME, RichiedenteExt.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatoConsensiIN }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StatoConsensiIN }{@code >}
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "statoConsensiIN")
    public JAXBElement<StatoConsensiIN> createStatoConsensiIN(StatoConsensiIN value) {
        return new JAXBElement<StatoConsensiIN>(_StatoConsensiIN_QNAME, StatoConsensiIN.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatoConsensiOUT }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StatoConsensiOUT }{@code >}
     */
    @XmlElementDecl(namespace = "http://dma.csi.it/", name = "statoConsensiOUT")
    public JAXBElement<StatoConsensiOUT> createStatoConsensiOUT(StatoConsensiOUT value) {
        return new JAXBElement<StatoConsensiOUT>(_StatoConsensiOUT_QNAME, StatoConsensiOUT.class, null, value);
    }

}
