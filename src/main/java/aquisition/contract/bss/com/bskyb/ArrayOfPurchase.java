
package aquisition.contract.bss.com.bskyb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPurchase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPurchase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Purchase" type="{http://BSkyB.com.BSS.Contract.Aquisition}Purchase" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPurchase", propOrder = {
    "purchase"
})
public class ArrayOfPurchase {

    @XmlElement(name = "Purchase", nillable = true)
    protected List<Purchase> purchase;

    /**
     * Gets the value of the purchase property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the purchase property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPurchase().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Purchase }
     * 
     * 
     */
    public List<Purchase> getPurchase() {
        if (purchase == null) {
            purchase = new ArrayList<Purchase>();
        }
        return this.purchase;
    }

}
