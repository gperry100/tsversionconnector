
package traffic.contract.bss.com.bskyb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AudioDescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AudioDescription">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AudioApproved" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AudioEmbedded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AudioRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ReceivedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AudioDescription", propOrder = {
    "audioApproved",
    "audioEmbedded",
    "audioRequired",
    "receivedDate"
})
public class AudioDescription {

    @XmlElementRef(name = "AudioApproved", namespace = "http://BSkyB.com.BSS.Contract.Traffic", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> audioApproved;
    @XmlElementRef(name = "AudioEmbedded", namespace = "http://BSkyB.com.BSS.Contract.Traffic", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> audioEmbedded;
    @XmlElementRef(name = "AudioRequired", namespace = "http://BSkyB.com.BSS.Contract.Traffic", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> audioRequired;
    @XmlElementRef(name = "ReceivedDate", namespace = "http://BSkyB.com.BSS.Contract.Traffic", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> receivedDate;

    /**
     * Gets the value of the audioApproved property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getAudioApproved() {
        return audioApproved;
    }

    /**
     * Sets the value of the audioApproved property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setAudioApproved(JAXBElement<Boolean> value) {
        this.audioApproved = value;
    }

    /**
     * Gets the value of the audioEmbedded property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getAudioEmbedded() {
        return audioEmbedded;
    }

    /**
     * Sets the value of the audioEmbedded property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setAudioEmbedded(JAXBElement<Boolean> value) {
        this.audioEmbedded = value;
    }

    /**
     * Gets the value of the audioRequired property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getAudioRequired() {
        return audioRequired;
    }

    /**
     * Sets the value of the audioRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setAudioRequired(JAXBElement<Boolean> value) {
        this.audioRequired = value;
    }

    /**
     * Gets the value of the receivedDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getReceivedDate() {
        return receivedDate;
    }

    /**
     * Sets the value of the receivedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setReceivedDate(JAXBElement<XMLGregorianCalendar> value) {
        this.receivedDate = value;
    }

}
