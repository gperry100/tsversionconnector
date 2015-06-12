
package aquisition.contract.bss.com.bskyb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Purchase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Purchase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EpisodeNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PurchaseID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SeriesID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TitleID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Purchase", propOrder = {
    "episodeNo",
    "purchaseID",
    "seriesID",
    "titleID"
})
public class Purchase {

    @XmlElementRef(name = "EpisodeNo", namespace = "http://BSkyB.com.BSS.Contract.Aquisition", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> episodeNo;
    @XmlElementRef(name = "PurchaseID", namespace = "http://BSkyB.com.BSS.Contract.Aquisition", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> purchaseID;
    @XmlElementRef(name = "SeriesID", namespace = "http://BSkyB.com.BSS.Contract.Aquisition", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> seriesID;
    @XmlElementRef(name = "TitleID", namespace = "http://BSkyB.com.BSS.Contract.Aquisition", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> titleID;

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
     * Gets the value of the purchaseID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPurchaseID() {
        return purchaseID;
    }

    /**
     * Sets the value of the purchaseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPurchaseID(JAXBElement<Integer> value) {
        this.purchaseID = value;
    }

    /**
     * Gets the value of the seriesID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSeriesID() {
        return seriesID;
    }

    /**
     * Sets the value of the seriesID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSeriesID(JAXBElement<Integer> value) {
        this.seriesID = value;
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

}
