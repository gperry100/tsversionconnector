
package traffic.contract.bss.com.bskyb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Version complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Version">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AspectRatio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Audio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AudioDescription" type="{http://BSkyB.com.BSS.Contract.Traffic}AudioDescription" minOccurs="0"/>
 *         &lt;element name="Certification" type="{http://BSkyB.com.BSS.Contract.Traffic}Certification" minOccurs="0"/>
 *         &lt;element name="ClosedCaption" type="{http://BSkyB.com.BSS.Contract.Traffic}ClosedCaption" minOccurs="0"/>
 *         &lt;element name="Colour" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EditorialStatus" type="{http://BSkyB.com.BSS.Contract.Traffic}EditorialStatus" minOccurs="0"/>
 *         &lt;element name="HighDefinition" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HighDefinitionResolution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Keyword" type="{http://BSkyB.com.BSS.Contract.Traffic}ArrayOfKeyword" minOccurs="0"/>
 *         &lt;element name="PurchaseMaterialStatus" type="{http://BSkyB.com.BSS.Contract.Traffic}ArrayOfPurchaseMaterialStatus" minOccurs="0"/>
 *         &lt;element name="QualityControl" type="{http://BSkyB.com.BSS.Contract.Traffic}QualityControl" minOccurs="0"/>
 *         &lt;element name="SubTitles" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TXStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TitleID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="VersionID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="VersionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VersionSeqNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="VersionVoiceOver" type="{http://BSkyB.com.BSS.Contract.Traffic}VersionVoiceOver" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Version", propOrder = {
    "aspectRatio",
    "audio",
    "audioDescription",
    "certification",
    "closedCaption",
    "colour",
    "editorialStatus",
    "highDefinition",
    "highDefinitionResolution",
    "keyword",
    "purchaseMaterialStatus",
    "qualityControl",
    "subTitles",
    "txStatus",
    "titleID",
    "versionID",
    "versionName",
    "versionSeqNo",
    "versionVoiceOver"
})
public class Version {

    @XmlElementRef(name = "AspectRatio", namespace = "http://BSkyB.com.BSS.Contract.Traffic", type = JAXBElement.class, required = false)
    protected JAXBElement<String> aspectRatio;
    @XmlElementRef(name = "Audio", namespace = "http://BSkyB.com.BSS.Contract.Traffic", type = JAXBElement.class, required = false)
    protected JAXBElement<String> audio;
    @XmlElementRef(name = "AudioDescription", namespace = "http://BSkyB.com.BSS.Contract.Traffic", type = JAXBElement.class, required = false)
    protected JAXBElement<AudioDescription> audioDescription;
    @XmlElementRef(name = "Certification", namespace = "http://BSkyB.com.BSS.Contract.Traffic", type = JAXBElement.class, required = false)
    protected JAXBElement<Certification> certification;
    @XmlElementRef(name = "ClosedCaption", namespace = "http://BSkyB.com.BSS.Contract.Traffic", type = JAXBElement.class, required = false)
    protected JAXBElement<ClosedCaption> closedCaption;
    @XmlElementRef(name = "Colour", namespace = "http://BSkyB.com.BSS.Contract.Traffic", type = JAXBElement.class, required = false)
    protected JAXBElement<String> colour;
    @XmlElementRef(name = "EditorialStatus", namespace = "http://BSkyB.com.BSS.Contract.Traffic", type = JAXBElement.class, required = false)
    protected JAXBElement<EditorialStatus> editorialStatus;
    @XmlElementRef(name = "HighDefinition", namespace = "http://BSkyB.com.BSS.Contract.Traffic", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> highDefinition;
    @XmlElementRef(name = "HighDefinitionResolution", namespace = "http://BSkyB.com.BSS.Contract.Traffic", type = JAXBElement.class, required = false)
    protected JAXBElement<String> highDefinitionResolution;
    @XmlElementRef(name = "Keyword", namespace = "http://BSkyB.com.BSS.Contract.Traffic", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyword> keyword;
    @XmlElementRef(name = "PurchaseMaterialStatus", namespace = "http://BSkyB.com.BSS.Contract.Traffic", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPurchaseMaterialStatus> purchaseMaterialStatus;
    @XmlElementRef(name = "QualityControl", namespace = "http://BSkyB.com.BSS.Contract.Traffic", type = JAXBElement.class, required = false)
    protected JAXBElement<QualityControl> qualityControl;
    @XmlElementRef(name = "SubTitles", namespace = "http://BSkyB.com.BSS.Contract.Traffic", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> subTitles;
    @XmlElementRef(name = "TXStatus", namespace = "http://BSkyB.com.BSS.Contract.Traffic", type = JAXBElement.class, required = false)
    protected JAXBElement<String> txStatus;
    @XmlElementRef(name = "TitleID", namespace = "http://BSkyB.com.BSS.Contract.Traffic", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> titleID;
    @XmlElementRef(name = "VersionID", namespace = "http://BSkyB.com.BSS.Contract.Traffic", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> versionID;
    @XmlElementRef(name = "VersionName", namespace = "http://BSkyB.com.BSS.Contract.Traffic", type = JAXBElement.class, required = false)
    protected JAXBElement<String> versionName;
    @XmlElementRef(name = "VersionSeqNo", namespace = "http://BSkyB.com.BSS.Contract.Traffic", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> versionSeqNo;
    @XmlElementRef(name = "VersionVoiceOver", namespace = "http://BSkyB.com.BSS.Contract.Traffic", type = JAXBElement.class, required = false)
    protected JAXBElement<VersionVoiceOver> versionVoiceOver;

    /**
     * Gets the value of the aspectRatio property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAspectRatio() {
        return aspectRatio;
    }

    /**
     * Sets the value of the aspectRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAspectRatio(JAXBElement<String> value) {
        this.aspectRatio = value;
    }

    /**
     * Gets the value of the audio property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAudio() {
        return audio;
    }

    /**
     * Sets the value of the audio property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAudio(JAXBElement<String> value) {
        this.audio = value;
    }

    /**
     * Gets the value of the audioDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AudioDescription }{@code >}
     *     
     */
    public JAXBElement<AudioDescription> getAudioDescription() {
        return audioDescription;
    }

    /**
     * Sets the value of the audioDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AudioDescription }{@code >}
     *     
     */
    public void setAudioDescription(JAXBElement<AudioDescription> value) {
        this.audioDescription = value;
    }

    /**
     * Gets the value of the certification property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Certification }{@code >}
     *     
     */
    public JAXBElement<Certification> getCertification() {
        return certification;
    }

    /**
     * Sets the value of the certification property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Certification }{@code >}
     *     
     */
    public void setCertification(JAXBElement<Certification> value) {
        this.certification = value;
    }

    /**
     * Gets the value of the closedCaption property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ClosedCaption }{@code >}
     *     
     */
    public JAXBElement<ClosedCaption> getClosedCaption() {
        return closedCaption;
    }

    /**
     * Sets the value of the closedCaption property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ClosedCaption }{@code >}
     *     
     */
    public void setClosedCaption(JAXBElement<ClosedCaption> value) {
        this.closedCaption = value;
    }

    /**
     * Gets the value of the colour property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getColour() {
        return colour;
    }

    /**
     * Sets the value of the colour property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setColour(JAXBElement<String> value) {
        this.colour = value;
    }

    /**
     * Gets the value of the editorialStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EditorialStatus }{@code >}
     *     
     */
    public JAXBElement<EditorialStatus> getEditorialStatus() {
        return editorialStatus;
    }

    /**
     * Sets the value of the editorialStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EditorialStatus }{@code >}
     *     
     */
    public void setEditorialStatus(JAXBElement<EditorialStatus> value) {
        this.editorialStatus = value;
    }

    /**
     * Gets the value of the highDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getHighDefinition() {
        return highDefinition;
    }

    /**
     * Sets the value of the highDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setHighDefinition(JAXBElement<Boolean> value) {
        this.highDefinition = value;
    }

    /**
     * Gets the value of the highDefinitionResolution property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHighDefinitionResolution() {
        return highDefinitionResolution;
    }

    /**
     * Sets the value of the highDefinitionResolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHighDefinitionResolution(JAXBElement<String> value) {
        this.highDefinitionResolution = value;
    }

    /**
     * Gets the value of the keyword property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyword }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyword> getKeyword() {
        return keyword;
    }

    /**
     * Sets the value of the keyword property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyword }{@code >}
     *     
     */
    public void setKeyword(JAXBElement<ArrayOfKeyword> value) {
        this.keyword = value;
    }

    /**
     * Gets the value of the purchaseMaterialStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPurchaseMaterialStatus }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPurchaseMaterialStatus> getPurchaseMaterialStatus() {
        return purchaseMaterialStatus;
    }

    /**
     * Sets the value of the purchaseMaterialStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPurchaseMaterialStatus }{@code >}
     *     
     */
    public void setPurchaseMaterialStatus(JAXBElement<ArrayOfPurchaseMaterialStatus> value) {
        this.purchaseMaterialStatus = value;
    }

    /**
     * Gets the value of the qualityControl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QualityControl }{@code >}
     *     
     */
    public JAXBElement<QualityControl> getQualityControl() {
        return qualityControl;
    }

    /**
     * Sets the value of the qualityControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QualityControl }{@code >}
     *     
     */
    public void setQualityControl(JAXBElement<QualityControl> value) {
        this.qualityControl = value;
    }

    /**
     * Gets the value of the subTitles property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSubTitles() {
        return subTitles;
    }

    /**
     * Sets the value of the subTitles property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSubTitles(JAXBElement<Boolean> value) {
        this.subTitles = value;
    }

    /**
     * Gets the value of the txStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTXStatus() {
        return txStatus;
    }

    /**
     * Sets the value of the txStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTXStatus(JAXBElement<String> value) {
        this.txStatus = value;
    }

    /**
     * Gets the value of the titleID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTitleID() {
        return titleID;
    }

    /**
     * Sets the value of the titleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTitleID(JAXBElement<Integer> value) {
        this.titleID = value;
    }

    /**
     * Gets the value of the versionID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getVersionID() {
        return versionID;
    }

    /**
     * Sets the value of the versionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setVersionID(JAXBElement<Integer> value) {
        this.versionID = value;
    }

    /**
     * Gets the value of the versionName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVersionName() {
        return versionName;
    }

    /**
     * Sets the value of the versionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVersionName(JAXBElement<String> value) {
        this.versionName = value;
    }

    /**
     * Gets the value of the versionSeqNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getVersionSeqNo() {
        return versionSeqNo;
    }

    /**
     * Sets the value of the versionSeqNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setVersionSeqNo(JAXBElement<Integer> value) {
        this.versionSeqNo = value;
    }

    /**
     * Gets the value of the versionVoiceOver property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link VersionVoiceOver }{@code >}
     *     
     */
    public JAXBElement<VersionVoiceOver> getVersionVoiceOver() {
        return versionVoiceOver;
    }

    /**
     * Sets the value of the versionVoiceOver property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link VersionVoiceOver }{@code >}
     *     
     */
    public void setVersionVoiceOver(JAXBElement<VersionVoiceOver> value) {
        this.versionVoiceOver = value;
    }

}
