
package traffic.wcf.bss.com.bskyb.tsversion;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import aquisition.contract.bss.com.bskyb.ArrayOfPurchase;
import aquisition.contract.bss.com.bskyb.ArrayOfSeries;
import aquisition.contract.bss.com.bskyb.ArrayOfTitle;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import common.bss.com.bskyb.EndUser;
import traffic.contract.bss.com.bskyb.ArrayOfMAMRequest;
import traffic.contract.bss.com.bskyb.ArrayOfMaterial;
import traffic.contract.bss.com.bskyb.ArrayOfVersion;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the traffic.wcf.bss.com.bskyb.tsversion package. 
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

    private final static QName _GetResponseTitle_QNAME = new QName("http://BSkyB.com.BSS.WCF.Traffic/TSVersion", "title");
    private final static QName _GetResponseSeries_QNAME = new QName("http://BSkyB.com.BSS.WCF.Traffic/TSVersion", "series");
    private final static QName _GetResponsePurchase_QNAME = new QName("http://BSkyB.com.BSS.WCF.Traffic/TSVersion", "purchase");
    private final static QName _GetResponseMaterial_QNAME = new QName("http://BSkyB.com.BSS.WCF.Traffic/TSVersion", "material");
    private final static QName _GetResponseVersion_QNAME = new QName("http://BSkyB.com.BSS.WCF.Traffic/TSVersion", "version");
    private final static QName _GetResponseMAMRequest_QNAME = new QName("http://BSkyB.com.BSS.WCF.Traffic/TSVersion", "MAMRequest");
    private final static QName _GetTitleID_QNAME = new QName("http://BSkyB.com.BSS.WCF.Traffic/TSVersion", "titleID");
    private final static QName _GetMediaID_QNAME = new QName("http://BSkyB.com.BSS.WCF.Traffic/TSVersion", "mediaID");
    private final static QName _GetEndUser_QNAME = new QName("http://BSkyB.com.BSS.WCF.Traffic/TSVersion", "endUser");
    private final static QName _GetVersionID_QNAME = new QName("http://BSkyB.com.BSS.WCF.Traffic/TSVersion", "versionID");
    private final static QName _GetDeliveryReferenceID_QNAME = new QName("http://BSkyB.com.BSS.WCF.Traffic/TSVersion", "deliveryReferenceID");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: traffic.wcf.bss.com.bskyb.tsversion
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetResponse }
     * 
     */
    public GetResponse createGetResponse() {
        return new GetResponse();
    }

    /**
     * Create an instance of {@link Get }
     * 
     */
    public Get createGet() {
        return new Get();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTitle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BSkyB.com.BSS.WCF.Traffic/TSVersion", name = "title", scope = GetResponse.class)
    public JAXBElement<ArrayOfTitle> createGetResponseTitle(ArrayOfTitle value) {
        return new JAXBElement<ArrayOfTitle>(_GetResponseTitle_QNAME, ArrayOfTitle.class, GetResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSeries }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BSkyB.com.BSS.WCF.Traffic/TSVersion", name = "series", scope = GetResponse.class)
    public JAXBElement<ArrayOfSeries> createGetResponseSeries(ArrayOfSeries value) {
        return new JAXBElement<ArrayOfSeries>(_GetResponseSeries_QNAME, ArrayOfSeries.class, GetResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPurchase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BSkyB.com.BSS.WCF.Traffic/TSVersion", name = "purchase", scope = GetResponse.class)
    public JAXBElement<ArrayOfPurchase> createGetResponsePurchase(ArrayOfPurchase value) {
        return new JAXBElement<ArrayOfPurchase>(_GetResponsePurchase_QNAME, ArrayOfPurchase.class, GetResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMaterial }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BSkyB.com.BSS.WCF.Traffic/TSVersion", name = "material", scope = GetResponse.class)
    public JAXBElement<ArrayOfMaterial> createGetResponseMaterial(ArrayOfMaterial value) {
        return new JAXBElement<ArrayOfMaterial>(_GetResponseMaterial_QNAME, ArrayOfMaterial.class, GetResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfVersion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BSkyB.com.BSS.WCF.Traffic/TSVersion", name = "version", scope = GetResponse.class)
    public JAXBElement<ArrayOfVersion> createGetResponseVersion(ArrayOfVersion value) {
        return new JAXBElement<ArrayOfVersion>(_GetResponseVersion_QNAME, ArrayOfVersion.class, GetResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMAMRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BSkyB.com.BSS.WCF.Traffic/TSVersion", name = "MAMRequest", scope = GetResponse.class)
    public JAXBElement<ArrayOfMAMRequest> createGetResponseMAMRequest(ArrayOfMAMRequest value) {
        return new JAXBElement<ArrayOfMAMRequest>(_GetResponseMAMRequest_QNAME, ArrayOfMAMRequest.class, GetResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BSkyB.com.BSS.WCF.Traffic/TSVersion", name = "titleID", scope = Get.class)
    public JAXBElement<ArrayOfint> createGetTitleID(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetTitleID_QNAME, ArrayOfint.class, Get.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BSkyB.com.BSS.WCF.Traffic/TSVersion", name = "mediaID", scope = Get.class)
    public JAXBElement<ArrayOfstring> createGetMediaID(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_GetMediaID_QNAME, ArrayOfstring.class, Get.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EndUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BSkyB.com.BSS.WCF.Traffic/TSVersion", name = "endUser", scope = Get.class)
    public JAXBElement<EndUser> createGetEndUser(EndUser value) {
        return new JAXBElement<EndUser>(_GetEndUser_QNAME, EndUser.class, Get.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BSkyB.com.BSS.WCF.Traffic/TSVersion", name = "versionID", scope = Get.class)
    public JAXBElement<ArrayOfint> createGetVersionID(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetVersionID_QNAME, ArrayOfint.class, Get.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BSkyB.com.BSS.WCF.Traffic/TSVersion", name = "deliveryReferenceID", scope = Get.class)
    public JAXBElement<ArrayOfstring> createGetDeliveryReferenceID(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_GetDeliveryReferenceID_QNAME, ArrayOfstring.class, Get.class, value);
    }

}
