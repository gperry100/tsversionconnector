
package aquisition.contract.bss.com.bskyb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the aquisition.contract.bss.com.bskyb package. 
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

    private final static QName _Synopsis_QNAME = new QName("http://BSkyB.com.BSS.Contract.Aquisition", "Synopsis");
    private final static QName _ArrayOfSeries_QNAME = new QName("http://BSkyB.com.BSS.Contract.Aquisition", "ArrayOfSeries");
    private final static QName _Title_QNAME = new QName("http://BSkyB.com.BSS.Contract.Aquisition", "Title");
    private final static QName _ArrayOfPurchase_QNAME = new QName("http://BSkyB.com.BSS.Contract.Aquisition", "ArrayOfPurchase");
    private final static QName _ArrayOfTitle_QNAME = new QName("http://BSkyB.com.BSS.Contract.Aquisition", "ArrayOfTitle");
    private final static QName _Series_QNAME = new QName("http://BSkyB.com.BSS.Contract.Aquisition", "Series");
    private final static QName _Purchase_QNAME = new QName("http://BSkyB.com.BSS.Contract.Aquisition", "Purchase");
    private final static QName _SynopsisText_QNAME = new QName("http://BSkyB.com.BSS.Contract.Aquisition", "Text");
    private final static QName _SeriesSeriesSeason_QNAME = new QName("http://BSkyB.com.BSS.Contract.Aquisition", "SeriesSeason");
    private final static QName _SeriesSeriesName_QNAME = new QName("http://BSkyB.com.BSS.Contract.Aquisition", "SeriesName");
    private final static QName _PurchaseEpisodeNo_QNAME = new QName("http://BSkyB.com.BSS.Contract.Aquisition", "EpisodeNo");
    private final static QName _PurchasePurchaseID_QNAME = new QName("http://BSkyB.com.BSS.Contract.Aquisition", "PurchaseID");
    private final static QName _PurchaseSeriesID_QNAME = new QName("http://BSkyB.com.BSS.Contract.Aquisition", "SeriesID");
    private final static QName _PurchaseTitleID_QNAME = new QName("http://BSkyB.com.BSS.Contract.Aquisition", "TitleID");
    private final static QName _TitleProgrammeName_QNAME = new QName("http://BSkyB.com.BSS.Contract.Aquisition", "ProgrammeName");
    private final static QName _TitleYearOfProduction_QNAME = new QName("http://BSkyB.com.BSS.Contract.Aquisition", "YearOfProduction");
    private final static QName _TitleTitleType_QNAME = new QName("http://BSkyB.com.BSS.Contract.Aquisition", "TitleType");
    private final static QName _TitleEPGTitle_QNAME = new QName("http://BSkyB.com.BSS.Contract.Aquisition", "EPGTitle");
    private final static QName _TitleSubGenreID_QNAME = new QName("http://BSkyB.com.BSS.Contract.Aquisition", "SubGenreID");
    private final static QName _TitleGenreID_QNAME = new QName("http://BSkyB.com.BSS.Contract.Aquisition", "GenreID");
    private final static QName _TitleProductionNo_QNAME = new QName("http://BSkyB.com.BSS.Contract.Aquisition", "ProductionNo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: aquisition.contract.bss.com.bskyb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfTitle }
     * 
     */
    public ArrayOfTitle createArrayOfTitle() {
        return new ArrayOfTitle();
    }

    /**
     * Create an instance of {@link ArrayOfPurchase }
     * 
     */
    public ArrayOfPurchase createArrayOfPurchase() {
        return new ArrayOfPurchase();
    }

    /**
     * Create an instance of {@link ArrayOfSeries }
     * 
     */
    public ArrayOfSeries createArrayOfSeries() {
        return new ArrayOfSeries();
    }

    /**
     * Create an instance of {@link Purchase }
     * 
     */
    public Purchase createPurchase() {
        return new Purchase();
    }

    /**
     * Create an instance of {@link Series }
     * 
     */
    public Series createSeries() {
        return new Series();
    }

    /**
     * Create an instance of {@link Synopsis }
     * 
     */
    public Synopsis createSynopsis() {
        return new Synopsis();
    }

    /**
     * Create an instance of {@link Title }
     * 
     */
    public Title createTitle() {
        return new Title();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Synopsis }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BSkyB.com.BSS.Contract.Aquisition", name = "Synopsis")
    public JAXBElement<Synopsis> createSynopsis(Synopsis value) {
        return new JAXBElement<Synopsis>(_Synopsis_QNAME, Synopsis.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSeries }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BSkyB.com.BSS.Contract.Aquisition", name = "ArrayOfSeries")
    public JAXBElement<ArrayOfSeries> createArrayOfSeries(ArrayOfSeries value) {
        return new JAXBElement<ArrayOfSeries>(_ArrayOfSeries_QNAME, ArrayOfSeries.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Title }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BSkyB.com.BSS.Contract.Aquisition", name = "Title")
    public JAXBElement<Title> createTitle(Title value) {
        return new JAXBElement<Title>(_Title_QNAME, Title.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPurchase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BSkyB.com.BSS.Contract.Aquisition", name = "ArrayOfPurchase")
    public JAXBElement<ArrayOfPurchase> createArrayOfPurchase(ArrayOfPurchase value) {
        return new JAXBElement<ArrayOfPurchase>(_ArrayOfPurchase_QNAME, ArrayOfPurchase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTitle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BSkyB.com.BSS.Contract.Aquisition", name = "ArrayOfTitle")
    public JAXBElement<ArrayOfTitle> createArrayOfTitle(ArrayOfTitle value) {
        return new JAXBElement<ArrayOfTitle>(_ArrayOfTitle_QNAME, ArrayOfTitle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Series }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BSkyB.com.BSS.Contract.Aquisition", name = "Series")
    public JAXBElement<Series> createSeries(Series value) {
        return new JAXBElement<Series>(_Series_QNAME, Series.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Purchase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BSkyB.com.BSS.Contract.Aquisition", name = "Purchase")
    public JAXBElement<Purchase> createPurchase(Purchase value) {
        return new JAXBElement<Purchase>(_Purchase_QNAME, Purchase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BSkyB.com.BSS.Contract.Aquisition", name = "Text", scope = Synopsis.class)
    public JAXBElement<String> createSynopsisText(String value) {
        return new JAXBElement<String>(_SynopsisText_QNAME, String.class, Synopsis.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BSkyB.com.BSS.Contract.Aquisition", name = "SeriesSeason", scope = Series.class)
    public JAXBElement<String> createSeriesSeriesSeason(String value) {
        return new JAXBElement<String>(_SeriesSeriesSeason_QNAME, String.class, Series.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BSkyB.com.BSS.Contract.Aquisition", name = "SeriesName", scope = Series.class)
    public JAXBElement<String> createSeriesSeriesName(String value) {
        return new JAXBElement<String>(_SeriesSeriesName_QNAME, String.class, Series.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BSkyB.com.BSS.Contract.Aquisition", name = "EpisodeNo", scope = Purchase.class)
    public JAXBElement<Integer> createPurchaseEpisodeNo(Integer value) {
        return new JAXBElement<Integer>(_PurchaseEpisodeNo_QNAME, Integer.class, Purchase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BSkyB.com.BSS.Contract.Aquisition", name = "PurchaseID", scope = Purchase.class)
    public JAXBElement<Integer> createPurchasePurchaseID(Integer value) {
        return new JAXBElement<Integer>(_PurchasePurchaseID_QNAME, Integer.class, Purchase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BSkyB.com.BSS.Contract.Aquisition", name = "SeriesID", scope = Purchase.class)
    public JAXBElement<Integer> createPurchaseSeriesID(Integer value) {
        return new JAXBElement<Integer>(_PurchaseSeriesID_QNAME, Integer.class, Purchase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BSkyB.com.BSS.Contract.Aquisition", name = "TitleID", scope = Purchase.class)
    public JAXBElement<Integer> createPurchaseTitleID(Integer value) {
        return new JAXBElement<Integer>(_PurchaseTitleID_QNAME, Integer.class, Purchase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Synopsis }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BSkyB.com.BSS.Contract.Aquisition", name = "Synopsis", scope = Title.class)
    public JAXBElement<Synopsis> createTitleSynopsis(Synopsis value) {
        return new JAXBElement<Synopsis>(_Synopsis_QNAME, Synopsis.class, Title.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BSkyB.com.BSS.Contract.Aquisition", name = "ProgrammeName", scope = Title.class)
    public JAXBElement<String> createTitleProgrammeName(String value) {
        return new JAXBElement<String>(_TitleProgrammeName_QNAME, String.class, Title.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BSkyB.com.BSS.Contract.Aquisition", name = "YearOfProduction", scope = Title.class)
    public JAXBElement<Integer> createTitleYearOfProduction(Integer value) {
        return new JAXBElement<Integer>(_TitleYearOfProduction_QNAME, Integer.class, Title.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BSkyB.com.BSS.Contract.Aquisition", name = "TitleType", scope = Title.class)
    public JAXBElement<String> createTitleTitleType(String value) {
        return new JAXBElement<String>(_TitleTitleType_QNAME, String.class, Title.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BSkyB.com.BSS.Contract.Aquisition", name = "EPGTitle", scope = Title.class)
    public JAXBElement<String> createTitleEPGTitle(String value) {
        return new JAXBElement<String>(_TitleEPGTitle_QNAME, String.class, Title.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BSkyB.com.BSS.Contract.Aquisition", name = "TitleID", scope = Title.class)
    public JAXBElement<Integer> createTitleTitleID(Integer value) {
        return new JAXBElement<Integer>(_PurchaseTitleID_QNAME, Integer.class, Title.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BSkyB.com.BSS.Contract.Aquisition", name = "SubGenreID", scope = Title.class)
    public JAXBElement<Integer> createTitleSubGenreID(Integer value) {
        return new JAXBElement<Integer>(_TitleSubGenreID_QNAME, Integer.class, Title.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BSkyB.com.BSS.Contract.Aquisition", name = "GenreID", scope = Title.class)
    public JAXBElement<Integer> createTitleGenreID(Integer value) {
        return new JAXBElement<Integer>(_TitleGenreID_QNAME, Integer.class, Title.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BSkyB.com.BSS.Contract.Aquisition", name = "ProductionNo", scope = Title.class)
    public JAXBElement<String> createTitleProductionNo(String value) {
        return new JAXBElement<String>(_TitleProductionNo_QNAME, String.class, Title.class, value);
    }

}
