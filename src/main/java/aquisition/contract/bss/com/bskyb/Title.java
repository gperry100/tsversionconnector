
package aquisition.contract.bss.com.bskyb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Title complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Title">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EPGTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GenreID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ProductionNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProgrammeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubGenreID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Synopsis" type="{http://BSkyB.com.BSS.Contract.Aquisition}Synopsis" minOccurs="0"/>
 *         &lt;element name="TitleID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TitleType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="YearOfProduction" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Title", propOrder = {
    "epgTitle",
    "genreID",
    "productionNo",
    "programmeName",
    "subGenreID",
    "synopsis",
    "titleID",
    "titleType",
    "yearOfProduction"
})
public class Title {

    @XmlElementRef(name = "EPGTitle", namespace = "http://BSkyB.com.BSS.Contract.Aquisition", type = JAXBElement.class, required = false)
    protected JAXBElement<String> epgTitle;
    @XmlElementRef(name = "GenreID", namespace = "http://BSkyB.com.BSS.Contract.Aquisition", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> genreID;
    @XmlElementRef(name = "ProductionNo", namespace = "http://BSkyB.com.BSS.Contract.Aquisition", type = JAXBElement.class, required = false)
    protected JAXBElement<String> productionNo;
    @XmlElementRef(name = "ProgrammeName", namespace = "http://BSkyB.com.BSS.Contract.Aquisition", type = JAXBElement.class, required = false)
    protected JAXBElement<String> programmeName;
    @XmlElementRef(name = "SubGenreID", namespace = "http://BSkyB.com.BSS.Contract.Aquisition", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> subGenreID;
    @XmlElementRef(name = "Synopsis", namespace = "http://BSkyB.com.BSS.Contract.Aquisition", type = JAXBElement.class, required = false)
    protected JAXBElement<Synopsis> synopsis;
    @XmlElementRef(name = "TitleID", namespace = "http://BSkyB.com.BSS.Contract.Aquisition", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> titleID;
    @XmlElementRef(name = "TitleType", namespace = "http://BSkyB.com.BSS.Contract.Aquisition", type = JAXBElement.class, required = false)
    protected JAXBElement<String> titleType;
    @XmlElementRef(name = "YearOfProduction", namespace = "http://BSkyB.com.BSS.Contract.Aquisition", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> yearOfProduction;

    /**
     * Gets the value of the epgTitle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEPGTitle() {
        return epgTitle;
    }

    /**
     * Sets the value of the epgTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEPGTitle(JAXBElement<String> value) {
        this.epgTitle = value;
    }

    /**
     * Gets the value of the genreID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getGenreID() {
        return genreID;
    }

    /**
     * Sets the value of the genreID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setGenreID(JAXBElement<Integer> value) {
        this.genreID = value;
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
     * Gets the value of the programmeName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProgrammeName() {
        return programmeName;
    }

    /**
     * Sets the value of the programmeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProgrammeName(JAXBElement<String> value) {
        this.programmeName = value;
    }

    /**
     * Gets the value of the subGenreID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSubGenreID() {
        return subGenreID;
    }

    /**
     * Sets the value of the subGenreID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSubGenreID(JAXBElement<Integer> value) {
        this.subGenreID = value;
    }

    /**
     * Gets the value of the synopsis property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Synopsis }{@code >}
     *     
     */
    public JAXBElement<Synopsis> getSynopsis() {
        return synopsis;
    }

    /**
     * Sets the value of the synopsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Synopsis }{@code >}
     *     
     */
    public void setSynopsis(JAXBElement<Synopsis> value) {
        this.synopsis = value;
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
     * Gets the value of the titleType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTitleType() {
        return titleType;
    }

    /**
     * Sets the value of the titleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTitleType(JAXBElement<String> value) {
        this.titleType = value;
    }

    /**
     * Gets the value of the yearOfProduction property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getYearOfProduction() {
        return yearOfProduction;
    }

    /**
     * Sets the value of the yearOfProduction property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setYearOfProduction(JAXBElement<Integer> value) {
        this.yearOfProduction = value;
    }

}
