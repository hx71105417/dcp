
package org.gp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;attribute name="SecurityDomain" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="DAPVerification" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="DelegatedManagement" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="CardManagerLock" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="CardLock" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="CardTerminate" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="DefaultSelected" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="CardReset" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="CVMChange" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="CVMManagement" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ManadatedDAPVerification" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="TrustedPath" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="AuthorizedManagement" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="TokenVerification" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="GlobalDelete" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="GlobalLock" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="GlobalRegistry" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="FinalApplication" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="GlobalService" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ReceiptGeneration" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="CipheredLoadFileDataBlock" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ContactlessActivation" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ContactlessSelfActivation" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Privileges", namespace = "http://namespaces.globalplatform.org/systems-profiles/1.1.2")
public class Privileges {

    @XmlAttribute(name = "SecurityDomain")
    protected Boolean securityDomain;
    @XmlAttribute(name = "DAPVerification")
    protected Boolean dapVerification;
    @XmlAttribute(name = "DelegatedManagement")
    protected Boolean delegatedManagement;
    @XmlAttribute(name = "CardManagerLock")
    protected Boolean cardManagerLock;
    @XmlAttribute(name = "CardLock")
    protected Boolean cardLock;
    @XmlAttribute(name = "CardTerminate")
    protected Boolean cardTerminate;
    @XmlAttribute(name = "DefaultSelected")
    protected Boolean defaultSelected;
    @XmlAttribute(name = "CardReset")
    protected Boolean cardReset;
    @XmlAttribute(name = "CVMChange")
    protected Boolean cvmChange;
    @XmlAttribute(name = "CVMManagement")
    protected Boolean cvmManagement;
    @XmlAttribute(name = "ManadatedDAPVerification")
    protected Boolean manadatedDAPVerification;
    @XmlAttribute(name = "TrustedPath")
    protected Boolean trustedPath;
    @XmlAttribute(name = "AuthorizedManagement")
    protected Boolean authorizedManagement;
    @XmlAttribute(name = "TokenVerification")
    protected Boolean tokenVerification;
    @XmlAttribute(name = "GlobalDelete")
    protected Boolean globalDelete;
    @XmlAttribute(name = "GlobalLock")
    protected Boolean globalLock;
    @XmlAttribute(name = "GlobalRegistry")
    protected Boolean globalRegistry;
    @XmlAttribute(name = "FinalApplication")
    protected Boolean finalApplication;
    @XmlAttribute(name = "GlobalService")
    protected Boolean globalService;
    @XmlAttribute(name = "ReceiptGeneration")
    protected Boolean receiptGeneration;
    @XmlAttribute(name = "CipheredLoadFileDataBlock")
    protected Boolean cipheredLoadFileDataBlock;
    @XmlAttribute(name = "ContactlessActivation")
    protected Boolean contactlessActivation;
    @XmlAttribute(name = "ContactlessSelfActivation")
    protected Boolean contactlessSelfActivation;

    /**
     * Gets the value of the securityDomain property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSecurityDomain() {
        return securityDomain;
    }

    /**
     * Sets the value of the securityDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSecurityDomain(Boolean value) {
        this.securityDomain = value;
    }

    /**
     * Gets the value of the dapVerification property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDAPVerification() {
        return dapVerification;
    }

    /**
     * Sets the value of the dapVerification property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDAPVerification(Boolean value) {
        this.dapVerification = value;
    }

    /**
     * Gets the value of the delegatedManagement property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDelegatedManagement() {
        return delegatedManagement;
    }

    /**
     * Sets the value of the delegatedManagement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDelegatedManagement(Boolean value) {
        this.delegatedManagement = value;
    }

    /**
     * Gets the value of the cardManagerLock property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCardManagerLock() {
        return cardManagerLock;
    }

    /**
     * Sets the value of the cardManagerLock property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCardManagerLock(Boolean value) {
        this.cardManagerLock = value;
    }

    /**
     * Gets the value of the cardLock property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCardLock() {
        return cardLock;
    }

    /**
     * Sets the value of the cardLock property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCardLock(Boolean value) {
        this.cardLock = value;
    }

    /**
     * Gets the value of the cardTerminate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCardTerminate() {
        return cardTerminate;
    }

    /**
     * Sets the value of the cardTerminate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCardTerminate(Boolean value) {
        this.cardTerminate = value;
    }

    /**
     * Gets the value of the defaultSelected property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefaultSelected() {
        return defaultSelected;
    }

    /**
     * Sets the value of the defaultSelected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefaultSelected(Boolean value) {
        this.defaultSelected = value;
    }

    /**
     * Gets the value of the cardReset property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCardReset() {
        return cardReset;
    }

    /**
     * Sets the value of the cardReset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCardReset(Boolean value) {
        this.cardReset = value;
    }

    /**
     * Gets the value of the cvmChange property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCVMChange() {
        return cvmChange;
    }

    /**
     * Sets the value of the cvmChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCVMChange(Boolean value) {
        this.cvmChange = value;
    }

    /**
     * Gets the value of the cvmManagement property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCVMManagement() {
        return cvmManagement;
    }

    /**
     * Sets the value of the cvmManagement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCVMManagement(Boolean value) {
        this.cvmManagement = value;
    }

    /**
     * Gets the value of the manadatedDAPVerification property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isManadatedDAPVerification() {
        return manadatedDAPVerification;
    }

    /**
     * Sets the value of the manadatedDAPVerification property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setManadatedDAPVerification(Boolean value) {
        this.manadatedDAPVerification = value;
    }

    /**
     * Gets the value of the trustedPath property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTrustedPath() {
        return trustedPath;
    }

    /**
     * Sets the value of the trustedPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTrustedPath(Boolean value) {
        this.trustedPath = value;
    }

    /**
     * Gets the value of the authorizedManagement property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAuthorizedManagement() {
        return authorizedManagement;
    }

    /**
     * Sets the value of the authorizedManagement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAuthorizedManagement(Boolean value) {
        this.authorizedManagement = value;
    }

    /**
     * Gets the value of the tokenVerification property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTokenVerification() {
        return tokenVerification;
    }

    /**
     * Sets the value of the tokenVerification property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTokenVerification(Boolean value) {
        this.tokenVerification = value;
    }

    /**
     * Gets the value of the globalDelete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGlobalDelete() {
        return globalDelete;
    }

    /**
     * Sets the value of the globalDelete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGlobalDelete(Boolean value) {
        this.globalDelete = value;
    }

    /**
     * Gets the value of the globalLock property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGlobalLock() {
        return globalLock;
    }

    /**
     * Sets the value of the globalLock property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGlobalLock(Boolean value) {
        this.globalLock = value;
    }

    /**
     * Gets the value of the globalRegistry property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGlobalRegistry() {
        return globalRegistry;
    }

    /**
     * Sets the value of the globalRegistry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGlobalRegistry(Boolean value) {
        this.globalRegistry = value;
    }

    /**
     * Gets the value of the finalApplication property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFinalApplication() {
        return finalApplication;
    }

    /**
     * Sets the value of the finalApplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFinalApplication(Boolean value) {
        this.finalApplication = value;
    }

    /**
     * Gets the value of the globalService property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGlobalService() {
        return globalService;
    }

    /**
     * Sets the value of the globalService property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGlobalService(Boolean value) {
        this.globalService = value;
    }

    /**
     * Gets the value of the receiptGeneration property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReceiptGeneration() {
        return receiptGeneration;
    }

    /**
     * Sets the value of the receiptGeneration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReceiptGeneration(Boolean value) {
        this.receiptGeneration = value;
    }

    /**
     * Gets the value of the cipheredLoadFileDataBlock property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCipheredLoadFileDataBlock() {
        return cipheredLoadFileDataBlock;
    }

    /**
     * Sets the value of the cipheredLoadFileDataBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCipheredLoadFileDataBlock(Boolean value) {
        this.cipheredLoadFileDataBlock = value;
    }

    /**
     * Gets the value of the contactlessActivation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContactlessActivation() {
        return contactlessActivation;
    }

    /**
     * Sets the value of the contactlessActivation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContactlessActivation(Boolean value) {
        this.contactlessActivation = value;
    }

    /**
     * Gets the value of the contactlessSelfActivation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContactlessSelfActivation() {
        return contactlessSelfActivation;
    }

    /**
     * Sets the value of the contactlessSelfActivation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContactlessSelfActivation(Boolean value) {
        this.contactlessSelfActivation = value;
    }

}
