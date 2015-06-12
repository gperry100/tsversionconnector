
package traffic.wcf.bss.com.bskyb.tsversion;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import common.bss.com.bskyb.EndUser;


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
 *         &lt;element name="versionID" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         &lt;element name="deliveryReferenceID" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="mediaID" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="titleID" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         &lt;element name="purchaseID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="getMaterial" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="getProgramme" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="getMAMRequest" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="endUser" type="{http://BSkyB.com.BSS.Common}EndUser" minOccurs="0"/>
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
    "versionID",
    "deliveryReferenceID",
    "mediaID",
    "titleID",
    "purchaseID",
    "getMaterial",
    "getProgramme",
    "getMAMRequest",
    "endUser"
})
@XmlRootElement(name = "Get")
public class Get {

    @XmlElementRef(name = "versionID", namespace = "http://BSkyB.com.BSS.WCF.Traffic/TSVersion", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfint> versionID;
    @XmlElementRef(name = "deliveryReferenceID", namespace = "http://BSkyB.com.BSS.WCF.Traffic/TSVersion", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> deliveryReferenceID;
    @XmlElementRef(name = "mediaID", namespace = "http://BSkyB.com.BSS.WCF.Traffic/TSVersion", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> mediaID;
    @XmlElementRef(name = "titleID", namespace = "http://BSkyB.com.BSS.WCF.Traffic/TSVersion", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfint> titleID;
    protected Integer purchaseID;
    protected Boolean getMaterial;
    protected Boolean getProgramme;
    protected Boolean getMAMRequest;
    @XmlElementRef(name = "endUser", namespace = "http://BSkyB.com.BSS.WCF.Traffic/TSVersion", type = JAXBElement.class, required = false)
    protected JAXBElement<EndUser> endUser;

    /**
     * Gets the value of the versionID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfint> getVersionID() {
        return versionID;
    }

    /**
     * Sets the value of the versionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public void setVersionID(JAXBElement<ArrayOfint> value) {
        this.versionID = value;
    }

    /**
     * Gets the value of the deliveryReferenceID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getDeliveryReferenceID() {
        return deliveryReferenceID;
    }

    /**
     * Sets the value of the deliveryReferenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setDeliveryReferenceID(JAXBElement<ArrayOfstring> value) {
        this.deliveryReferenceID = value;
    }

    /**
     * Gets the value of the mediaID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getMediaID() {
        return mediaID;
    }

    /**
     * Sets the value of the mediaID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setMediaID(JAXBElement<ArrayOfstring> value) {
        this.mediaID = value;
    }

    /**
     * Gets the value of the titleID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfint> getTitleID() {
        return titleID;
    }

    /**
     * Sets the value of the titleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public void setTitleID(JAXBElement<ArrayOfint> value) {
        this.titleID = value;
    }

    /**
     * Gets the value of the purchaseID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPurchaseID() {
        return purchaseID;
    }

    /**
     * Sets the value of the purchaseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPurchaseID(Integer value) {
        this.purchaseID = value;
    }

    /**
     * Gets the value of the getMaterial property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGetMaterial() {
        return getMaterial;
    }

    /**
     * Sets the value of the getMaterial property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGetMaterial(Boolean value) {
        this.getMaterial = value;
    }

    /**
     * Gets the value of the getProgramme property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGetProgramme() {
        return getProgramme;
    }

    /**
     * Sets the value of the getProgramme property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGetProgramme(Boolean value) {
        this.getProgramme = value;
    }

    /**
     * Gets the value of the getMAMRequest property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGetMAMRequest() {
        return getMAMRequest;
    }

    /**
     * Sets the value of the getMAMRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGetMAMRequest(Boolean value) {
        this.getMAMRequest = value;
    }

    /**
     * Gets the value of the endUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EndUser }{@code >}
     *     
     */
    public JAXBElement<EndUser> getEndUser() {
        return endUser;
    }

    /**
     * Sets the value of the endUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EndUser }{@code >}
     *     
     */
    public void setEndUser(JAXBElement<EndUser> value) {
        this.endUser = value;
    }

}
