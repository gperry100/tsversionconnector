
package traffic.contract.bss.com.bskyb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VersionVoiceOver complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VersionVoiceOver">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EndCreditsUpTC" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="EndCreditsUpTCFrames" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="VoiceOverOffset" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="VoiceOverPossible" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VoiceOverWindow" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VersionVoiceOver", propOrder = {
    "endCreditsUpTC",
    "endCreditsUpTCFrames",
    "voiceOverOffset",
    "voiceOverPossible",
    "voiceOverWindow"
})
public class VersionVoiceOver {

    @XmlElementRef(name = "EndCreditsUpTC", namespace = "http://BSkyB.com.BSS.Contract.Traffic", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> endCreditsUpTC;
    @XmlElementRef(name = "EndCreditsUpTCFrames", namespace = "http://BSkyB.com.BSS.Contract.Traffic", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> endCreditsUpTCFrames;
    @XmlElementRef(name = "VoiceOverOffset", namespace = "http://BSkyB.com.BSS.Contract.Traffic", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> voiceOverOffset;
    @XmlElementRef(name = "VoiceOverPossible", namespace = "http://BSkyB.com.BSS.Contract.Traffic", type = JAXBElement.class, required = false)
    protected JAXBElement<String> voiceOverPossible;
    @XmlElementRef(name = "VoiceOverWindow", namespace = "http://BSkyB.com.BSS.Contract.Traffic", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> voiceOverWindow;

    /**
     * Gets the value of the endCreditsUpTC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getEndCreditsUpTC() {
        return endCreditsUpTC;
    }

    /**
     * Sets the value of the endCreditsUpTC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setEndCreditsUpTC(JAXBElement<Long> value) {
        this.endCreditsUpTC = value;
    }

    /**
     * Gets the value of the endCreditsUpTCFrames property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getEndCreditsUpTCFrames() {
        return endCreditsUpTCFrames;
    }

    /**
     * Sets the value of the endCreditsUpTCFrames property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setEndCreditsUpTCFrames(JAXBElement<Long> value) {
        this.endCreditsUpTCFrames = value;
    }

    /**
     * Gets the value of the voiceOverOffset property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getVoiceOverOffset() {
        return voiceOverOffset;
    }

    /**
     * Sets the value of the voiceOverOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setVoiceOverOffset(JAXBElement<Long> value) {
        this.voiceOverOffset = value;
    }

    /**
     * Gets the value of the voiceOverPossible property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVoiceOverPossible() {
        return voiceOverPossible;
    }

    /**
     * Sets the value of the voiceOverPossible property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVoiceOverPossible(JAXBElement<String> value) {
        this.voiceOverPossible = value;
    }

    /**
     * Gets the value of the voiceOverWindow property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getVoiceOverWindow() {
        return voiceOverWindow;
    }

    /**
     * Sets the value of the voiceOverWindow property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setVoiceOverWindow(JAXBElement<Long> value) {
        this.voiceOverWindow = value;
    }

}
