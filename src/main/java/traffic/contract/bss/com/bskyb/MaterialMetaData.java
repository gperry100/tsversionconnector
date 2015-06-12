
package traffic.contract.bss.com.bskyb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MaterialMetaData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaterialMetaData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ArrivalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="BSSMediaID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeliveryChannelGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EpisodeNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarkedAsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaterialMetaDataID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ProductionNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SeriesName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TemporaryMAMID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaterialMetaData", propOrder = {
    "arrivalDate",
    "bssMediaID",
    "deliveryChannelGroup",
    "episodeNo",
    "fileName",
    "markedAsDeleted",
    "materialMetaDataID",
    "productionNo",
    "seriesName",
    "temporaryMAMID",
    "title"
})
public class MaterialMetaData {

    @XmlElementRef(name = "ArrivalDate", namespace = "http://BSkyB.com.BSS.Contract.Traffic", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> arrivalDate;
    @XmlElementRef(name = "BSSMediaID", namespace = "http://BSkyB.com.BSS.Contract.Traffic", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bssMediaID;
    @XmlElementRef(name = "DeliveryChannelGroup", namespace = "http://BSkyB.com.BSS.Contract.Traffic", type = JAXBElement.class, required = false)
    protected JAXBElement<String> deliveryChannelGroup;
    @XmlElementRef(name = "EpisodeNo", namespace = "http://BSkyB.com.BSS.Contract.Traffic", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> episodeNo;
    @XmlElementRef(name = "FileName", namespace = "http://BSkyB.com.BSS.Contract.Traffic", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fileName;
    @XmlElementRef(name = "MarkedAsDeleted", namespace = "http://BSkyB.com.BSS.Contract.Traffic", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> markedAsDeleted;
    @XmlElementRef(name = "MaterialMetaDataID", namespace = "http://BSkyB.com.BSS.Contract.Traffic", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> materialMetaDataID;
    @XmlElementRef(name = "ProductionNo", namespace = "http://BSkyB.com.BSS.Contract.Traffic", type = JAXBElement.class, required = false)
    protected JAXBElement<String> productionNo;
    @XmlElementRef(name = "SeriesName", namespace = "http://BSkyB.com.BSS.Contract.Traffic", type = JAXBElement.class, required = false)
    protected JAXBElement<String> seriesName;
    @XmlElementRef(name = "TemporaryMAMID", namespace = "http://BSkyB.com.BSS.Contract.Traffic", type = JAXBElement.class, required = false)
    protected JAXBElement<String> temporaryMAMID;
    @XmlElementRef(name = "Title", namespace = "http://BSkyB.com.BSS.Contract.Traffic", type = JAXBElement.class, required = false)
    protected JAXBElement<String> title;

    /**
     * Gets the value of the arrivalDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getArrivalDate() {
        return arrivalDate;
    }

    /**
     * Sets the value of the arrivalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setArrivalDate(JAXBElement<XMLGregorianCalendar> value) {
        this.arrivalDate = value;
    }

    /**
     * Gets the value of the bssMediaID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBSSMediaID() {
        return bssMediaID;
    }

    /**
     * Sets the value of the bssMediaID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBSSMediaID(JAXBElement<String> value) {
        this.bssMediaID = value;
    }

    /**
     * Gets the value of the deliveryChannelGroup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeliveryChannelGroup() {
        return deliveryChannelGroup;
    }

    /**
     * Sets the value of the deliveryChannelGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeliveryChannelGroup(JAXBElement<String> value) {
        this.deliveryChannelGroup = value;
    }

    /**
     * Gets the value of the episodeNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEpisodeNo() {
        return episodeNo;
    }

    /**
     * Sets the value of the episodeNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEpisodeNo(JAXBElement<Integer> value) {
        this.episodeNo = value;
    }

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFileName(JAXBElement<String> value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the markedAsDeleted property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMarkedAsDeleted() {
        return markedAsDeleted;
    }

    /**
     * Sets the value of the markedAsDeleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMarkedAsDeleted(JAXBElement<Boolean> value) {
        this.markedAsDeleted = value;
    }

    /**
     * Gets the value of the materialMetaDataID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMaterialMetaDataID() {
        return materialMetaDataID;
    }

    /**
     * Sets the value of the materialMetaDataID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMaterialMetaDataID(JAXBElement<Integer> value) {
        this.materialMetaDataID = value;
    }

    /**
     * Gets the value of the productionNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProductionNo() {
        return productionNo;
    }

    /**
     * Sets the value of the productionNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProductionNo(JAXBElement<String> value) {
        this.productionNo = value;
    }

    /**
     * Gets the value of the seriesName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSeriesName() {
        return seriesName;
    }

    /**
     * Sets the value of the seriesName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSeriesName(JAXBElement<String> value) {
        this.seriesName = value;
    }

    /**
     * Gets the value of the temporaryMAMID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTemporaryMAMID() {
        return temporaryMAMID;
    }

    /**
     * Sets the value of the temporaryMAMID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTemporaryMAMID(JAXBElement<String> value) {
        this.temporaryMAMID = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTitle(JAXBElement<String> value) {
        this.title = value;
    }

}
