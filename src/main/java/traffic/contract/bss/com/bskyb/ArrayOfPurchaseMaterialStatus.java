
package traffic.contract.bss.com.bskyb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPurchaseMaterialStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPurchaseMaterialStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PurchaseMaterialStatus" type="{http://BSkyB.com.BSS.Contract.Traffic}PurchaseMaterialStatus" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPurchaseMaterialStatus", propOrder = {
    "purchaseMaterialStatus"
})
public class ArrayOfPurchaseMaterialStatus {

    @XmlElement(name = "PurchaseMaterialStatus", nillable = true)
    protected List<PurchaseMaterialStatus> purchaseMaterialStatus;

    /**
     * Gets the value of the purchaseMaterialStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the purchaseMaterialStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPurchaseMaterialStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PurchaseMaterialStatus }
     * 
     * 
     */
    public List<PurchaseMaterialStatus> getPurchaseMaterialStatus() {
        if (purchaseMaterialStatus == null) {
            purchaseMaterialStatus = new ArrayList<PurchaseMaterialStatus>();
        }
        return this.purchaseMaterialStatus;
    }

}
