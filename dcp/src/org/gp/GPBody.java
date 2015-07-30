
package org.gp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
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
 *       &lt;sequence maxOccurs="unbounded">
 *         &lt;choice>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}AP" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}CP" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}CPChanges" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}KP" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}KeyExchange" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}LFP" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}ProfileRequest" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}ApplicationDataNotification" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}ApplicationDataRequest" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}CardCustomization" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}BatchCardCustomization" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}ApplicationAuditTrail" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}BatchAuditTrail" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}CardAuditTrail" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}Error" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}CPP" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}CheckGlobalEligibilityRequest" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}CheckGlobalEligibilityResponse" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}GetDeviceCapabilityProfileIdRequest" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}GetDeviceCapabilityProfileIdResponse" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}GetSECapabilityProfileIdRequest" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}GetSECapabilityProfileIdResponse" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}CheckMobileSubscriptionEligibilityRequest" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}CheckMobileSubscriptionEligibilityResponse" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}HandleStartServiceStateChangeNotificationRequest" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}HandleEndServiceStateChangeNotificationRequest" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}GetMobileSubscriptionAlternateIdentifierRequest" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}GetMobileSubscriptionAlternateIdentifierResponse" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}GetSEMobileSubscriptionIdentifierRequest" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}GetSEMobileSubscriptionIdentifierResponse" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}GetMobileSubscriptionSEIdentifiersRequest" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}GetMobileSubscriptionSEIdentifiersResponse" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}HandleMobileSubscriptionIdentifierChangedNotificationRequest" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}HandleMobileSubscriptionStatusChangeNotificationRequest" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}HandleSERenewalNotificationRequest" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}HandleSEDeviceChangedNotificationRequest" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}HandleSEDeviceStatusChangeNotificationRequest" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}HandleSEMobileSubscriptionChangedNotificationRequest" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}HandleSEStatusChangeNotificationRequest" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}EnrollSSDOwnerCertificateRequest" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}EnrollSSDOwnerCertificateResponse" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}LookupServiceInstanceReferenceRequest" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}LookupServiceInstanceReferenceResponse" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}DeclareServiceInstanceReferenceRequest" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}DeclareServiceInstanceReferenceResponse" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}GetServiceInstanceReferenceDescriptorRequest" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}GetServiceInstanceReferenceDescriptorResponse" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}GetServiceStateRequest" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}GetServiceStateResponse" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}DeployServiceRequest" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}DeployServiceResponse" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}UpgradeServiceRequest" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}UpgradeServiceResponse" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}ExchangeServiceDataRequest" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}ExchangeServiceDataResponse" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}SuspendOrResumeServiceRequest" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}SuspendOrResumeServiceResponse" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}TerminateServiceRequest" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}TerminateServiceResponse" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}HandleServiceEnvironmentChangeNotificationRequest" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}HandleActionDoneOnServiceNotificationRequest" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}GetCAInformationRequest" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}GetCAInformationResponse" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}AuditCAInformationRequest" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}AuditCAInformationResponse" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}SECommandsGenerationAndRemoteExecutionRequest" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}SECommandsGenerationAndRemoteExecutionResponse" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}GenerateDMTokenRequest" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}GenerateDMTokenResponse" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}VerifyDMReceiptRequest" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}VerifyDMReceiptResponse" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}BeginConversationRequest" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}BeginConversationResponse" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}SendScriptRequest" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}SendScriptResponse" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}EndConversationRequest" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}EndConversationResponse" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}GetApplicationOrELFStatusRequest" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}GetApplicationOrELFStatusResponse" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}GetSDFreeMemoryRequest" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}GetSDFreeMemoryResponse" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}LoadSCWSServicePortalRequest" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}LoadSCWSServicePortalResponse" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}DeleteSCWSServicePortalRequest" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}DeleteSCWSServicePortalResponse" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}LoadDeviceApplicationRequest" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}LoadDeviceApplicationResponse" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}BindDeviceApplicationToSEApplicationRequest" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}BindDeviceApplicationToSEApplicationResponse" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}DeleteDeviceApplicationRequest" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}DeleteDeviceApplicationResponse" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}UnbindDeviceApplicationToSEApplicationRequest" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}UnbindDeviceApplicationToSEApplicationResponse" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}HandleActionDoneOnDeviceApplicationNotificationRequest" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "apOrCPOrCPChanges"
})
@XmlRootElement(name = "GPBody")
public class GPBody {

    @XmlElementRefs({
        @XmlElementRef(name = "GetSDFreeMemoryRequest", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = JAXBElement.class),
        @XmlElementRef(name = "GetSEMobileSubscriptionIdentifierResponse", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = JAXBElement.class),
        @XmlElementRef(name = "LoadSCWSServicePortalResponse", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = JAXBElement.class),
        @XmlElementRef(name = "HandleMobileSubscriptionStatusChangeNotificationRequest", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = JAXBElement.class),
        @XmlElementRef(name = "AuditCAInformationResponse", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = JAXBElement.class),
        @XmlElementRef(name = "GetServiceInstanceReferenceDescriptorRequest", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = JAXBElement.class),
        @XmlElementRef(name = "BindDeviceApplicationToSEApplicationResponse", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = JAXBElement.class),
        @XmlElementRef(name = "HandleStartServiceStateChangeNotificationRequest", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = JAXBElement.class),
        @XmlElementRef(name = "HandleSEDeviceChangedNotificationRequest", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = JAXBElement.class),
        @XmlElementRef(name = "BatchCardCustomization", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = BatchCardCustomization.class),
        @XmlElementRef(name = "HandleActionDoneOnServiceNotificationRequest", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = JAXBElement.class),
        @XmlElementRef(name = "CheckMobileSubscriptionEligibilityResponse", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = JAXBElement.class),
        @XmlElementRef(name = "ApplicationDataNotification", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = ApplicationDataNotification.class),
        @XmlElementRef(name = "HandleServiceEnvironmentChangeNotificationRequest", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = JAXBElement.class),
        @XmlElementRef(name = "GetCAInformationRequest", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = JAXBElement.class),
        @XmlElementRef(name = "SuspendOrResumeServiceResponse", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = JAXBElement.class),
        @XmlElementRef(name = "HandleEndServiceStateChangeNotificationRequest", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = JAXBElement.class),
        @XmlElementRef(name = "TerminateServiceRequest", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = JAXBElement.class),
        @XmlElementRef(name = "GetMobileSubscriptionSEIdentifiersResponse", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = JAXBElement.class),
        @XmlElementRef(name = "SECommandsGenerationAndRemoteExecutionRequest", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = JAXBElement.class),
        @XmlElementRef(name = "GetSDFreeMemoryResponse", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = JAXBElement.class),
        @XmlElementRef(name = "Error", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = Error.class),
        @XmlElementRef(name = "EndConversationRequest", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = JAXBElement.class),
        @XmlElementRef(name = "GetSEMobileSubscriptionIdentifierRequest", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = JAXBElement.class),
        @XmlElementRef(name = "DeclareServiceInstanceReferenceRequest", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = JAXBElement.class),
        @XmlElementRef(name = "LoadSCWSServicePortalRequest", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = JAXBElement.class),
        @XmlElementRef(name = "GetMobileSubscriptionAlternateIdentifierResponse", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = JAXBElement.class),
        @XmlElementRef(name = "DeleteSCWSServicePortalRequest", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = JAXBElement.class),
        @XmlElementRef(name = "VerifyDMReceiptRequest", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = JAXBElement.class),
        @XmlElementRef(name = "BatchAuditTrail", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = BatchAuditTrail.class),
        @XmlElementRef(name = "GetSECapabilityProfileIdRequest", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = JAXBElement.class),
        @XmlElementRef(name = "HandleActionDoneOnDeviceApplicationNotificationRequest", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = JAXBElement.class),
        @XmlElementRef(name = "GetMobileSubscriptionSEIdentifiersRequest", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = JAXBElement.class),
        @XmlElementRef(name = "UnbindDeviceApplicationToSEApplicationRequest", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = JAXBElement.class),
        @XmlElementRef(name = "CheckMobileSubscriptionEligibilityRequest", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = JAXBElement.class),
        @XmlElementRef(name = "DeleteDeviceApplicationRequest", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = JAXBElement.class),
        @XmlElementRef(name = "LookupServiceInstanceReferenceRequest", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = JAXBElement.class),
        @XmlElementRef(name = "CheckGlobalEligibilityRequest", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = JAXBElement.class),
        @XmlElementRef(name = "GetSECapabilityProfileIdResponse", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = JAXBElement.class),
        @XmlElementRef(name = "BindDeviceApplicationToSEApplicationRequest", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = JAXBElement.class),
        @XmlElementRef(name = "EndConversationResponse", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = JAXBElement.class),
        @XmlElementRef(name = "DeployServiceResponse", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = JAXBElement.class),
        @XmlElementRef(name = "VerifyDMReceiptResponse", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = JAXBElement.class),
        @XmlElementRef(name = "DeleteSCWSServicePortalResponse", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = JAXBElement.class),
        @XmlElementRef(name = "GenerateDMTokenResponse", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = JAXBElement.class),
        @XmlElementRef(name = "UpgradeServiceResponse", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = JAXBElement.class),
        @XmlElementRef(name = "ApplicationDataRequest", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = ApplicationDataRequest.class),
        @XmlElementRef(name = "BeginConversationRequest", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = JAXBElement.class),
        @XmlElementRef(name = "KP", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = KP.class),
        @XmlElementRef(name = "DeleteDeviceApplicationResponse", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = JAXBElement.class),
        @XmlElementRef(name = "SendScriptRequest", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = JAXBElement.class),
        @XmlElementRef(name = "SECommandsGenerationAndRemoteExecutionResponse", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = JAXBElement.class),
        @XmlElementRef(name = "GenerateDMTokenRequest", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = JAXBElement.class),
        @XmlElementRef(name = "CardCustomization", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = CardCustomization.class),
        @XmlElementRef(name = "HandleSEMobileSubscriptionChangedNotificationRequest", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = JAXBElement.class),
        @XmlElementRef(name = "GetServiceInstanceReferenceDescriptorResponse", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = JAXBElement.class),
        @XmlElementRef(name = "EnrollSSDOwnerCertificateResponse", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = JAXBElement.class),
        @XmlElementRef(name = "CPChanges", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = CPChanges.class),
        @XmlElementRef(name = "GetCAInformationResponse", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = JAXBElement.class),
        @XmlElementRef(name = "GetDeviceCapabilityProfileIdResponse", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = JAXBElement.class),
        @XmlElementRef(name = "GetServiceStateResponse", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = JAXBElement.class),
        @XmlElementRef(name = "LookupServiceInstanceReferenceResponse", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = JAXBElement.class),
        @XmlElementRef(name = "ExchangeServiceDataResponse", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = JAXBElement.class),
        @XmlElementRef(name = "UnbindDeviceApplicationToSEApplicationResponse", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = JAXBElement.class),
        @XmlElementRef(name = "ApplicationAuditTrail", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = ApplicationAuditTrail.class),
        @XmlElementRef(name = "CPP", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = CPP.class),
        @XmlElementRef(name = "LoadDeviceApplicationRequest", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = JAXBElement.class),
        @XmlElementRef(name = "HandleSERenewalNotificationRequest", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = JAXBElement.class),
        @XmlElementRef(name = "HandleSEDeviceStatusChangeNotificationRequest", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = JAXBElement.class),
        @XmlElementRef(name = "KeyExchange", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = KeyExchange.class),
        @XmlElementRef(name = "GetApplicationOrELFStatusRequest", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = JAXBElement.class),
        @XmlElementRef(name = "BeginConversationResponse", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = JAXBElement.class),
        @XmlElementRef(name = "AP", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = AP.class),
        @XmlElementRef(name = "HandleMobileSubscriptionIdentifierChangedNotificationRequest", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = JAXBElement.class),
        @XmlElementRef(name = "CheckGlobalEligibilityResponse", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = JAXBElement.class),
        @XmlElementRef(name = "GetMobileSubscriptionAlternateIdentifierRequest", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = JAXBElement.class),
        @XmlElementRef(name = "EnrollSSDOwnerCertificateRequest", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = JAXBElement.class),
        @XmlElementRef(name = "TerminateServiceResponse", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = JAXBElement.class),
        @XmlElementRef(name = "AuditCAInformationRequest", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = JAXBElement.class),
        @XmlElementRef(name = "ProfileRequest", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = ProfileRequest.class),
        @XmlElementRef(name = "DeclareServiceInstanceReferenceResponse", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = JAXBElement.class),
        @XmlElementRef(name = "CardAuditTrail", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = CardAuditTrail.class),
        @XmlElementRef(name = "DeployServiceRequest", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = JAXBElement.class),
        @XmlElementRef(name = "CP", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = CP.class),
        @XmlElementRef(name = "LoadDeviceApplicationResponse", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = JAXBElement.class),
        @XmlElementRef(name = "ExchangeServiceDataRequest", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = JAXBElement.class),
        @XmlElementRef(name = "SendScriptResponse", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = JAXBElement.class),
        @XmlElementRef(name = "UpgradeServiceRequest", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = JAXBElement.class),
        @XmlElementRef(name = "HandleSEStatusChangeNotificationRequest", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = JAXBElement.class),
        @XmlElementRef(name = "GetServiceStateRequest", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = JAXBElement.class),
        @XmlElementRef(name = "GetApplicationOrELFStatusResponse", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = JAXBElement.class),
        @XmlElementRef(name = "GetDeviceCapabilityProfileIdRequest", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = JAXBElement.class),
        @XmlElementRef(name = "SuspendOrResumeServiceRequest", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = JAXBElement.class),
        @XmlElementRef(name = "LFP", namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", type = LFP.class)
    })
    protected List<Object> apOrCPOrCPChanges;

    /**
     * Gets the value of the apOrCPOrCPChanges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the apOrCPOrCPChanges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAPOrCPOrCPChanges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link GetSEMobileSubscriptionIdentifierResponseType }{@code >}
     * {@link JAXBElement }{@code <}{@link GetSDFreeMemoryRequestType }{@code >}
     * {@link JAXBElement }{@code <}{@link HandleMobileSubscriptionStatusChangeNotificationRequestType }{@code >}
     * {@link JAXBElement }{@code <}{@link LoadSCWSServicePortalResponseType }{@code >}
     * {@link JAXBElement }{@code <}{@link GetServiceInstanceReferenceDescriptorRequestType }{@code >}
     * {@link JAXBElement }{@code <}{@link GetCAInformationResponseType }{@code >}
     * {@link JAXBElement }{@code <}{@link BindDeviceApplicationToSEApplicationResponseType }{@code >}
     * {@link JAXBElement }{@code <}{@link HandleStartServiceStateChangeNotificationRequestType }{@code >}
     * {@link JAXBElement }{@code <}{@link HandleSEDeviceChangedNotificationRequestType }{@code >}
     * {@link BatchCardCustomization }
     * {@link ApplicationDataNotification }
     * {@link JAXBElement }{@code <}{@link CheckMobileSubscriptionEligibilityResponseType }{@code >}
     * {@link JAXBElement }{@code <}{@link HandleActionDoneOnServiceNotificationRequestType }{@code >}
     * {@link JAXBElement }{@code <}{@link HandleServiceEnvironmentChangeNotificationRequestType }{@code >}
     * {@link JAXBElement }{@code <}{@link HandleEndServiceStateChangeNotificationRequestType }{@code >}
     * {@link JAXBElement }{@code <}{@link SuspendOrResumeServiceResponseType }{@code >}
     * {@link JAXBElement }{@code <}{@link GetCAInformationRequestType }{@code >}
     * {@link JAXBElement }{@code <}{@link GetMobileSubscriptionSEIdentifiersResponseType }{@code >}
     * {@link JAXBElement }{@code <}{@link TerminateServiceRequestType }{@code >}
     * {@link JAXBElement }{@code <}{@link SECommandsGenerationAndRemoteExecutionRequestType }{@code >}
     * {@link JAXBElement }{@code <}{@link GetSDFreeMemoryResponseType }{@code >}
     * {@link Error }
     * {@link JAXBElement }{@code <}{@link EndConversationRequestType }{@code >}
     * {@link JAXBElement }{@code <}{@link DeclareServiceInstanceReferenceRequestType }{@code >}
     * {@link JAXBElement }{@code <}{@link GetSEMobileSubscriptionIdentifierRequestType }{@code >}
     * {@link JAXBElement }{@code <}{@link GetMobileSubscriptionAlternateIdentifierResponseType }{@code >}
     * {@link JAXBElement }{@code <}{@link LoadSCWSServicePortalRequestType }{@code >}
     * {@link BatchAuditTrail }
     * {@link JAXBElement }{@code <}{@link VerifyDMReceiptRequestType }{@code >}
     * {@link JAXBElement }{@code <}{@link DeleteSCWSServicePortalRequestType }{@code >}
     * {@link JAXBElement }{@code <}{@link GetSECapabilityProfileIdRequestType }{@code >}
     * {@link JAXBElement }{@code <}{@link GetMobileSubscriptionSEIdentifiersRequestType }{@code >}
     * {@link JAXBElement }{@code <}{@link HandleActionDoneOnDeviceApplicationNotificationRequestType }{@code >}
     * {@link JAXBElement }{@code <}{@link CheckMobileSubscriptionEligibilityRequestType }{@code >}
     * {@link JAXBElement }{@code <}{@link UnbindDeviceApplicationToSEApplicationRequestType }{@code >}
     * {@link JAXBElement }{@code <}{@link LookupServiceInstanceReferenceRequestType }{@code >}
     * {@link JAXBElement }{@code <}{@link DeleteDeviceApplicationRequestType }{@code >}
     * {@link JAXBElement }{@code <}{@link CheckGlobalEligibilityRequestType }{@code >}
     * {@link JAXBElement }{@code <}{@link GetSECapabilityProfileIdResponseType }{@code >}
     * {@link JAXBElement }{@code <}{@link DeployServiceResponseType }{@code >}
     * {@link JAXBElement }{@code <}{@link EndConversationResponseType }{@code >}
     * {@link JAXBElement }{@code <}{@link BindDeviceApplicationToSEApplicationRequestType }{@code >}
     * {@link JAXBElement }{@code <}{@link VerifyDMReceiptResponseType }{@code >}
     * {@link JAXBElement }{@code <}{@link GenerateDMTokenResponseType }{@code >}
     * {@link JAXBElement }{@code <}{@link DeleteSCWSServicePortalResponseType }{@code >}
     * {@link ApplicationDataRequest }
     * {@link JAXBElement }{@code <}{@link UpgradeServiceResponseType }{@code >}
     * {@link JAXBElement }{@code <}{@link BeginConversationRequestType }{@code >}
     * {@link KP }
     * {@link JAXBElement }{@code <}{@link DeleteDeviceApplicationResponseType }{@code >}
     * {@link JAXBElement }{@code <}{@link SECommandsGenerationAndRemoteExecutionResponseType }{@code >}
     * {@link JAXBElement }{@code <}{@link SendScriptRequestType }{@code >}
     * {@link JAXBElement }{@code <}{@link GenerateDMTokenRequestType }{@code >}
     * {@link CardCustomization }
     * {@link JAXBElement }{@code <}{@link GetServiceInstanceReferenceDescriptorResponseType }{@code >}
     * {@link JAXBElement }{@code <}{@link HandleSEMobileSubscriptionChangedNotificationRequestType }{@code >}
     * {@link JAXBElement }{@code <}{@link EnrollSSDOwnerCertificateResponseType }{@code >}
     * {@link CPChanges }
     * {@link JAXBElement }{@code <}{@link GetDeviceCapabilityProfileIdResponseType }{@code >}
     * {@link JAXBElement }{@code <}{@link GetCAInformationResponseType }{@code >}
     * {@link JAXBElement }{@code <}{@link GetServiceStateResponseType }{@code >}
     * {@link JAXBElement }{@code <}{@link LookupServiceInstanceReferenceResponseType }{@code >}
     * {@link JAXBElement }{@code <}{@link ExchangeServiceDataResponseType }{@code >}
     * {@link ApplicationAuditTrail }
     * {@link JAXBElement }{@code <}{@link UnbindDeviceApplicationToSEApplicationResponseType }{@code >}
     * {@link CPP }
     * {@link JAXBElement }{@code <}{@link LoadDeviceApplicationRequestType }{@code >}
     * {@link JAXBElement }{@code <}{@link HandleSEDeviceStatusChangeNotificationRequestType }{@code >}
     * {@link JAXBElement }{@code <}{@link HandleSERenewalNotificationRequestType }{@code >}
     * {@link KeyExchange }
     * {@link JAXBElement }{@code <}{@link BeginConversationResponseType }{@code >}
     * {@link JAXBElement }{@code <}{@link GetApplicationOrELFStatusRequestType }{@code >}
     * {@link JAXBElement }{@code <}{@link HandleMobileSubscriptionIdentifierChangedNotificationRequestType }{@code >}
     * {@link AP }
     * {@link JAXBElement }{@code <}{@link GetMobileSubscriptionAlternateIdentifierRequestType }{@code >}
     * {@link JAXBElement }{@code <}{@link CheckGlobalEligibilityResponseType }{@code >}
     * {@link JAXBElement }{@code <}{@link EnrollSSDOwnerCertificateRequestType }{@code >}
     * {@link JAXBElement }{@code <}{@link TerminateServiceResponseType }{@code >}
     * {@link JAXBElement }{@code <}{@link GetCAInformationRequestType }{@code >}
     * {@link ProfileRequest }
     * {@link JAXBElement }{@code <}{@link DeclareServiceInstanceReferenceResponseType }{@code >}
     * {@link CardAuditTrail }
     * {@link JAXBElement }{@code <}{@link DeployServiceRequestType }{@code >}
     * {@link CP }
     * {@link JAXBElement }{@code <}{@link ExchangeServiceDataRequestType }{@code >}
     * {@link JAXBElement }{@code <}{@link LoadDeviceApplicationResponseType }{@code >}
     * {@link JAXBElement }{@code <}{@link SendScriptResponseType }{@code >}
     * {@link JAXBElement }{@code <}{@link UpgradeServiceRequestType }{@code >}
     * {@link JAXBElement }{@code <}{@link GetServiceStateRequestType }{@code >}
     * {@link JAXBElement }{@code <}{@link HandleSEStatusChangeNotificationRequestType }{@code >}
     * {@link JAXBElement }{@code <}{@link GetDeviceCapabilityProfileIdRequestType }{@code >}
     * {@link JAXBElement }{@code <}{@link GetApplicationOrELFStatusResponseType }{@code >}
     * {@link JAXBElement }{@code <}{@link SuspendOrResumeServiceRequestType }{@code >}
     * {@link LFP }
     * 
     * 
     */
    public List<Object> getAPOrCPOrCPChanges() {
        if (apOrCPOrCPChanges == null) {
            apOrCPOrCPChanges = new ArrayList<Object>();
        }
        return this.apOrCPOrCPChanges;
    }

}
