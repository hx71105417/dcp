
package org.gp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-profiles/1.1.2}Revision" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="arrayElement" use="required" type="{http://namespaces.globalplatform.org/systems-profiles/1.1.2}arrayList" />
 *       &lt;attribute name="arrayIndex" use="required" type="{http://namespaces.globalplatform.org/systems-profiles/1.1.2}indexList" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "revision"
})
@XmlRootElement(name = "Revisions", namespace = "http://namespaces.globalplatform.org/systems-profiles/1.1.2")
public class Revisions {

    @XmlElement(name = "Revision", namespace = "http://namespaces.globalplatform.org/systems-profiles/1.1.2", required = true)
    protected List<Revision> revision;
    @XmlAttribute(name = "arrayElement", required = true)
    protected List<String> arrayElement;
    @XmlAttribute(name = "arrayIndex", required = true)
    protected List<String> arrayIndex;

    /**
     * Gets the value of the revision property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the revision property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRevision().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Revision }
     * 
     * 
     */
    public List<Revision> getRevision() {
        if (revision == null) {
            revision = new ArrayList<Revision>();
        }
        return this.revision;
    }

    /**
     * Gets the value of the arrayElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arrayElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArrayElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getArrayElement() {
        if (arrayElement == null) {
            arrayElement = new ArrayList<String>();
        }
        return this.arrayElement;
    }

    /**
     * Gets the value of the arrayIndex property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arrayIndex property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArrayIndex().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getArrayIndex() {
        if (arrayIndex == null) {
            arrayIndex = new ArrayList<String>();
        }
        return this.arrayIndex;
    }

}
