
package traffic.wcf.bss.com.bskyb.tsversion;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import aquisition.contract.bss.com.bskyb.ArrayOfPurchase;
import aquisition.contract.bss.com.bskyb.ArrayOfSeries;
import aquisition.contract.bss.com.bskyb.ArrayOfTitle;
import traffic.contract.bss.com.bskyb.ArrayOfMAMRequest;
import traffic.contract.bss.com.bskyb.ArrayOfMaterial;
import traffic.contract.bss.com.bskyb.ArrayOfVersion;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="version" type="{http://BSkyB.com.BSS.Contract.Traffic}ArrayOfVersion" minOccurs="0"/>
 *         &lt;element name="title" type="{http://BSkyB.com.BSS.Contract.Aquisition}ArrayOfTitle" minOccurs="0"/>
 *         &lt;element name="series" type="{http://BSkyB.com.BSS.Contract.Aquisition}ArrayOfSeries" minOccurs="0"/>
 *         &lt;element name="purchase" type="{http://BSkyB.com.BSS.Contract.Aquisition}ArrayOfPurchase" minOccurs="0"/>
 *         &lt;element name="material" type="{http://BSkyB.com.BSS.Contract.Traffic}ArrayOfMaterial" minOccurs="0"/>
 *         &lt;element name="MAMRequest" type="{http://BSkyB.com.BSS.Contract.Traffic}ArrayOfMAMRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "version",
    "title",
    "series",
    "purchase",
    "material",
    "mamRequest"
})
@XmlRootElement(name = "GetResponse")
public class GetResponse {

    @XmlElementRef(name = "version", namespace = "http://BSkyB.com.BSS.WCF.Traffic/TSVersion", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfVersion> version;
    @XmlElementRef(name = "title", namespace = "http://BSkyB.com.BSS.WCF.Traffic/TSVersion", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTitle> title;
    @XmlElementRef(name = "series", namespace = "http://BSkyB.com.BSS.WCF.Traffic/TSVersion", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSeries> series;
    @XmlElementRef(name = "purchase", namespace = "http://BSkyB.com.BSS.WCF.Traffic/TSVersion", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPurchase> purchase;
    @XmlElementRef(name = "material", namespace = "http://BSkyB.com.BSS.WCF.Traffic/TSVersion", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfMaterial> material;
    @XmlElementRef(name = "MAMRequest", namespace = "http://BSkyB.com.BSS.WCF.Traffic/TSVersion", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfMAMRequest> mamRequest;

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfVersion }{@code >}
     *     
     */
    public JAXBElement<ArrayOfVersion> getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfVersion }{@code >}
     *     
     */
    public void setVersion(JAXBElement<ArrayOfVersion> value) {
        this.version = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTitle }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTitle> getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTitle }{@code >}
     *     
     */
    public void setTitle(JAXBElement<ArrayOfTitle> value) {
        this.title = value;
    }

    /**
     * Gets the value of the series property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSeries }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSeries> getSeries() {
        return series;
    }

    /**
     * Sets the value of the series property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSeries }{@code >}
     *     
     */
    public void setSeries(JAXBElement<ArrayOfSeries> value) {
        this.series = value;
    }

    /**
     * Gets the value of the purchase property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPurchase }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPurchase> getPurchase() {
        return purchase;
    }

    /**
     * Sets the value of the purchase property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPurchase }{@code >}
     *     
     */
    public void setPurchase(JAXBElement<ArrayOfPurchase> value) {
        this.purchase = value;
    }

    /**
     * Gets the value of the material property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMaterial }{@code >}
     *     
     */
    public JAXBElement<ArrayOfMaterial> getMaterial() {
        return material;
    }

    /**
     * Sets the value of the material property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMaterial }{@code >}
     *     
     */
    public void setMaterial(JAXBElement<ArrayOfMaterial> value) {
        this.material = value;
    }

    /**
     * Gets the value of the mamRequest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMAMRequest }{@code >}
     *     
     */
    public JAXBElement<ArrayOfMAMRequest> getMAMRequest() {
        return mamRequest;
    }

    /**
     * Sets the value of the mamRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMAMRequest }{@code >}
     *     
     */
    public void setMAMRequest(JAXBElement<ArrayOfMAMRequest> value) {
        this.mamRequest = value;
    }

}
