
package traffic.contract.bss.com.bskyb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MaterialReel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaterialReel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Active" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Format" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaterialMetaData" type="{http://BSkyB.com.BSS.Contract.Traffic}MaterialMetaData" minOccurs="0"/>
 *         &lt;element name="MaterialPart" type="{http://BSkyB.com.BSS.Contract.Traffic}ArrayOfMaterialPart" minOccurs="0"/>
 *         &lt;element name="MediaID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MediaMatched" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReelNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TapeTypeID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TotalReels" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaterialReel", propOrder = {
    "active",
    "format",
    "location",
    "materialMetaData",
    "materialPart",
    "mediaID",
    "mediaMatched",
    "reelNo",
    "tapeTypeID",
    "totalReels"
})
public class MaterialReel {

    @XmlElementRef(name = "Active", namespace = "http://BSkyB.com.BSS.Contract.Traffic", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> active;
    @XmlElementRef(name = "Format", namespace = "http://BSkyB.com.BSS.Contract.Traffic", type = JAXBElement.class, required = false)
    protected JAXBElement<String> format;
    @XmlElementRef(name = "Location", namespace = "http://BSkyB.com.BSS.Contract.Traffic", type = JAXBElement.class, required = false)
    protected JAXBElement<String> location;
    @XmlElementRef(name = "MaterialMetaData", namespace = "http://BSkyB.com.BSS.Contract.Traffic", type = JAXBElement.class, required = false)
    protected JAXBElement<MaterialMetaData> materialMetaData;
    @XmlElementRef(name = "MaterialPart", namespace = "http://BSkyB.com.BSS.Contract.Traffic", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfMaterialPart> materialPart;
    @XmlElementRef(name = "MediaID", namespace = "http://BSkyB.com.BSS.Contract.Traffic", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mediaID;
    @XmlElementRef(name = "MediaMatched", namespace = "http://BSkyB.com.BSS.Contract.Traffic", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mediaMatched;
    @XmlElementRef(name = "ReelNo", namespace = "http://BSkyB.com.BSS.Contract.Traffic", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> reelNo;
    @XmlElementRef(name = "TapeTypeID", namespace = "http://BSkyB.com.BSS.Contract.Traffic", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> tapeTypeID;
    @XmlElementRef(name = "TotalReels", namespace = "http://BSkyB.com.BSS.Contract.Traffic", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> totalReels;

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setActive(JAXBElement<Boolean> value) {
        this.active = value;
    }

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFormat(JAXBElement<String> value) {
        this.format = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocation(JAXBElement<String> value) {
        this.location = value;
    }

    /**
     * Gets the value of the materialMetaData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MaterialMetaData }{@code >}
     *     
     */
    public JAXBElement<MaterialMetaData> getMaterialMetaData() {
        return materialMetaData;
    }

    /**
     * Sets the value of the materialMetaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MaterialMetaData }{@code >}
     *     
     */
    public void setMaterialMetaData(JAXBElement<MaterialMetaData> value) {
        this.materialMetaData = value;
    }

    /**
     * Gets the value of the materialPart property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMaterialPart }{@code >}
     *     
     */
    public JAXBElement<ArrayOfMaterialPart> getMaterialPart() {
        return materialPart;
    }

    /**
     * Sets the value of the materialPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMaterialPart }{@code >}
     *     
     */
    public void setMaterialPart(JAXBElement<ArrayOfMaterialPart> value) {
        this.materialPart = value;
    }

    /**
     * Gets the value of the mediaID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMediaID() {
        return mediaID;
    }

    /**
     * Sets the value of the mediaID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMediaID(JAXBElement<String> value) {
        this.mediaID = value;
    }

    /**
     * Gets the value of the mediaMatched property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMediaMatched() {
        return mediaMatched;
    }

    /**
     * Sets the value of the mediaMatched property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMediaMatched(JAXBElement<String> value) {
        this.mediaMatched = value;
    }

    /**
     * Gets the value of the reelNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getReelNo() {
        return reelNo;
    }

    /**
     * Sets the value of the reelNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setReelNo(JAXBElement<Integer> value) {
        this.reelNo = value;
    }

    /**
     * Gets the value of the tapeTypeID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTapeTypeID() {
        return tapeTypeID;
    }

    /**
     * Sets the value of the tapeTypeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTapeTypeID(JAXBElement<Integer> value) {
        this.tapeTypeID = value;
    }

    /**
     * Gets the value of the totalReels property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTotalReels() {
        return totalReels;
    }

    /**
     * Sets the value of the totalReels property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTotalReels(JAXBElement<Integer> value) {
        this.totalReels = value;
    }

}
