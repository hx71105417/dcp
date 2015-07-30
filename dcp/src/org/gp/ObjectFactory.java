
package org.gp;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.gp package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _PGPDataTypePGPKeyID_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "PGPKeyID");
    private final static QName _PGPDataTypePGPKeyPacket_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "PGPKeyPacket");
    private final static QName _PGPData_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "PGPData");
    private final static QName _EndConversationRequest_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "EndConversationRequest");
    private final static QName _GetMobileSubscriptionAlternateIdentifierRequest_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "GetMobileSubscriptionAlternateIdentifierRequest");
    private final static QName _Value_QNAME = new QName("http://namespaces.globalplatform.org/systems-profiles/1.1.2", "value");
    private final static QName _GetSECapabilityProfileIdRequest_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "GetSECapabilityProfileIdRequest");
    private final static QName _Side_QNAME = new QName("http://namespaces.globalplatform.org/systems-profiles/1.1.2", "Side");
    private final static QName _CheckMobileSubscriptionEligibilityResponse_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "CheckMobileSubscriptionEligibilityResponse");
    private final static QName _CheckDigit_QNAME = new QName("http://namespaces.globalplatform.org/systems-profiles/1.1.2", "CheckDigit");
    private final static QName _SPKIData_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "SPKIData");
    private final static QName _GenerateDMTokenRequest_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "GenerateDMTokenRequest");
    private final static QName _Blue_QNAME = new QName("http://namespaces.globalplatform.org/systems-profiles/1.1.2", "Blue");
    private final static QName _SuspendOrResumeServiceResponse_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "SuspendOrResumeServiceResponse");
    private final static QName _CanonicalizationMethod_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "CanonicalizationMethod");
    private final static QName _DeclareServiceInstanceReferenceRequest_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "DeclareServiceInstanceReferenceRequest");
    private final static QName _ApplyInfo_QNAME = new QName("http://www.gi-de.com/gd-extionsion-1.0.0", "ApplyInfo");
    private final static QName _Style_QNAME = new QName("http://namespaces.globalplatform.org/systems-profiles/1.1.2", "Style");
    private final static QName _HceCardInfo_QNAME = new QName("http://www.gi-de.com/gd-extionsion-1.0.0", "HceCardInfo");
    private final static QName _AuditCAInformationRequest_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "AuditCAInformationRequest");
    private final static QName _HandleStartServiceStateChangeNotificationRequest_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "HandleStartServiceStateChangeNotificationRequest");
    private final static QName _LookupServiceInstanceReferenceRequest_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "LookupServiceInstanceReferenceRequest");
    private final static QName _Transforms_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "Transforms");
    private final static QName _Manifest_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "Manifest");
    private final static QName _LineStyle_QNAME = new QName("http://namespaces.globalplatform.org/systems-profiles/1.1.2", "LineStyle");
    private final static QName _BindDeviceApplicationToSEApplicationResponse_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "BindDeviceApplicationToSEApplicationResponse");
    private final static QName _ScriptFragment_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "ScriptFragment");
    private final static QName _LoadSCWSServicePortalRequest_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "LoadSCWSServicePortalRequest");
    private final static QName _GetMobileSubscriptionSEIdentifiersResponse_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "GetMobileSubscriptionSEIdentifiersResponse");
    private final static QName _Green_QNAME = new QName("http://namespaces.globalplatform.org/systems-profiles/1.1.2", "Green");
    private final static QName _SignatureMethod_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "SignatureMethod");
    private final static QName _AnchorPosition_QNAME = new QName("http://namespaces.globalplatform.org/systems-profiles/1.1.2", "AnchorPosition");
    private final static QName _KeyInfo_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "KeyInfo");
    private final static QName _WriteLevelStandard_QNAME = new QName("http://namespaces.globalplatform.org/systems-profiles/1.1.2", "WriteLevelStandard");
    private final static QName _GetMobileSubscriptionSEIdentifiersRequest_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "GetMobileSubscriptionSEIdentifiersRequest");
    private final static QName _HandleSERenewalNotificationRequest_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "HandleSERenewalNotificationRequest");
    private final static QName _DigestMethod_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "DigestMethod");
    private final static QName _BeginConversationRequest_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "BeginConversationRequest");
    private final static QName _GetSDFreeMemoryRequest_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "GetSDFreeMemoryRequest");
    private final static QName _SendScriptRequest_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "SendScriptRequest");
    private final static QName _MgmtData_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "MgmtData");
    private final static QName _SECommandsGenerationAndRemoteExecutionResponse_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "SECommandsGenerationAndRemoteExecutionResponse");
    private final static QName _DPI_QNAME = new QName("http://namespaces.globalplatform.org/systems-profiles/1.1.2", "DPI");
    private final static QName _ProfileUniqueID_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "ProfileUniqueID");
    private final static QName _GetServiceStateRequest_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "GetServiceStateRequest");
    private final static QName _GetSDFreeMemoryResponse_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "GetSDFreeMemoryResponse");
    private final static QName _CheckMobileSubscriptionEligibilityRequest_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "CheckMobileSubscriptionEligibilityRequest");
    private final static QName _GetApplicationOrELFStatusResponse_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "GetApplicationOrELFStatusResponse");
    private final static QName _PersonalizationOrderConstraint_QNAME = new QName("http://namespaces.globalplatform.org/systems-profiles/1.1.2", "PersonalizationOrderConstraint");
    private final static QName _UpgradeServiceResponse_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "UpgradeServiceResponse");
    private final static QName _GetServiceInstanceReferenceDescriptorRequest_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "GetServiceInstanceReferenceDescriptorRequest");
    private final static QName _MuteCardsNumber_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "MuteCardsNumber");
    private final static QName _LookupServiceInstanceReferenceResponse_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "LookupServiceInstanceReferenceResponse");
    private final static QName _EndConversationResponse_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "EndConversationResponse");
    private final static QName _GetServiceInstanceReferenceDescriptorResponse_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "GetServiceInstanceReferenceDescriptorResponse");
    private final static QName _SignedInfo_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "SignedInfo");
    private final static QName _ExchangeServiceDataRequest_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "ExchangeServiceDataRequest");
    private final static QName _Object_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "Object");
    private final static QName _DeployServiceRequest_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "DeployServiceRequest");
    private final static QName _CardDesignOrigin_QNAME = new QName("http://namespaces.globalplatform.org/systems-profiles/1.1.2", "CardDesignOrigin");
    private final static QName _Material_QNAME = new QName("http://namespaces.globalplatform.org/systems-profiles/1.1.2", "Material");
    private final static QName _Type_QNAME = new QName("http://namespaces.globalplatform.org/systems-profiles/1.1.2", "Type");
    private final static QName _ValidCardProfileID_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "ValidCardProfileID");
    private final static QName _EnrollSSDOwnerCertificateRequest_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "EnrollSSDOwnerCertificateRequest");
    private final static QName _ExpectedDeliveryDate_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "ExpectedDeliveryDate");
    private final static QName _X509Data_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "X509Data");
    private final static QName _AuditCAInformationResponse_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "AuditCAInformationResponse");
    private final static QName _GetSEMobileSubscriptionIdentifierRequest_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "GetSEMobileSubscriptionIdentifierRequest");
    private final static QName _CardLifeCycleState_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "CardLifeCycleState");
    private final static QName _HandleMobileSubscriptionStatusChangeNotificationRequest_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "HandleMobileSubscriptionStatusChangeNotificationRequest");
    private final static QName _GetSECapabilityProfileIdResponse_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "GetSECapabilityProfileIdResponse");
    private final static QName _LoadDeviceApplicationRequest_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "LoadDeviceApplicationRequest");
    private final static QName _TrackTypeID_QNAME = new QName("http://namespaces.globalplatform.org/systems-profiles/1.1.2", "TrackTypeID");
    private final static QName _DeliveryDate_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "DeliveryDate");
    private final static QName _DeployServiceResponse_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "DeployServiceResponse");
    private final static QName _GetCAInformationResponse_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "GetCAInformationResponse");
    private final static QName _Name_QNAME = new QName("http://namespaces.globalplatform.org/systems-profiles/1.1.2", "Name");
    private final static QName _SendScriptResponse_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "SendScriptResponse");
    private final static QName _SECommandsGenerationAndRemoteExecutionRequest_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "SECommandsGenerationAndRemoteExecutionRequest");
    private final static QName _SignatureProperties_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "SignatureProperties");
    private final static QName _KeyName_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "KeyName");
    private final static QName _HandleSEMobileSubscriptionChangedNotificationRequest_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "HandleSEMobileSubscriptionChangedNotificationRequest");
    private final static QName _Description_QNAME = new QName("http://namespaces.globalplatform.org/systems-profiles/1.1.2", "Description");
    private final static QName _Red_QNAME = new QName("http://namespaces.globalplatform.org/systems-profiles/1.1.2", "Red");
    private final static QName _Topping_QNAME = new QName("http://namespaces.globalplatform.org/systems-profiles/1.1.2", "Topping");
    private final static QName _DeclareServiceInstanceReferenceResponse_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "DeclareServiceInstanceReferenceResponse");
    private final static QName _TerminateServiceResponse_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "TerminateServiceResponse");
    private final static QName _GetCAInformationRequest_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "GetCAInformationRequest");
    private final static QName _VerifyDMReceiptResponse_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "VerifyDMReceiptResponse");
    private final static QName _DeleteSCWSServicePortalRequest_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "DeleteSCWSServicePortalRequest");
    private final static QName _TerminateServiceRequest_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "TerminateServiceRequest");
    private final static QName _RetrievalMethod_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "RetrievalMethod");
    private final static QName _CardDesignOrientation_QNAME = new QName("http://namespaces.globalplatform.org/systems-profiles/1.1.2", "CardDesignOrientation");
    private final static QName _EMail_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "eMail");
    private final static QName _UnbindDeviceApplicationToSEApplicationResponse_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "UnbindDeviceApplicationToSEApplicationResponse");
    private final static QName _URL_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "URL");
    private final static QName _SignatureProperty_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "SignatureProperty");
    private final static QName _ConfigurationID_QNAME = new QName("http://namespaces.globalplatform.org/systems-profiles/1.1.2", "ConfigurationID");
    private final static QName _LoadSCWSServicePortalResponse_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "LoadSCWSServicePortalResponse");
    private final static QName _HandleSEDeviceStatusChangeNotificationRequest_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "HandleSEDeviceStatusChangeNotificationRequest");
    private final static QName _FaxNumber_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "FaxNumber");
    private final static QName _SuspendOrResumeServiceRequest_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "SuspendOrResumeServiceRequest");
    private final static QName _VerifyDMReceiptRequest_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "VerifyDMReceiptRequest");
    private final static QName _HandleServiceEnvironmentChangeNotificationRequest_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "HandleServiceEnvironmentChangeNotificationRequest");
    private final static QName _HandleActionDoneOnDeviceApplicationNotificationRequest_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "HandleActionDoneOnDeviceApplicationNotificationRequest");
    private final static QName _HandleSEDeviceChangedNotificationRequest_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "HandleSEDeviceChangedNotificationRequest");
    private final static QName _HandleEndServiceStateChangeNotificationRequest_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "HandleEndServiceStateChangeNotificationRequest");
    private final static QName _DeleteSCWSServicePortalResponse_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "DeleteSCWSServicePortalResponse");
    private final static QName _ExchangeServiceDataResponse_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "ExchangeServiceDataResponse");
    private final static QName _HumanReadableText_QNAME = new QName("http://namespaces.globalplatform.org/systems-profiles/1.1.2", "HumanReadableText");
    private final static QName _HandleMobileSubscriptionIdentifierChangedNotificationRequest_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "HandleMobileSubscriptionIdentifierChangedNotificationRequest");
    private final static QName _Reference_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "Reference");
    private final static QName _DeleteDeviceApplicationRequest_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "DeleteDeviceApplicationRequest");
    private final static QName _RSAKeyValue_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "RSAKeyValue");
    private final static QName _GetApplicationOrELFStatusRequest_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "GetApplicationOrELFStatusRequest");
    private final static QName _LoadDeviceApplicationResponse_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "LoadDeviceApplicationResponse");
    private final static QName _Signature_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "Signature");
    private final static QName _DSAKeyValue_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "DSAKeyValue");
    private final static QName _GenerateDMTokenResponse_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "GenerateDMTokenResponse");
    private final static QName _Underline_QNAME = new QName("http://namespaces.globalplatform.org/systems-profiles/1.1.2", "Underline");
    private final static QName _CheckGlobalEligibilityResponse_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "CheckGlobalEligibilityResponse");
    private final static QName _HumanReadableStartDigit_QNAME = new QName("http://namespaces.globalplatform.org/systems-profiles/1.1.2", "HumanReadableStartDigit");
    private final static QName _GetMobileSubscriptionAlternateIdentifierResponse_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "GetMobileSubscriptionAlternateIdentifierResponse");
    private final static QName _Unit_QNAME = new QName("http://namespaces.globalplatform.org/systems-profiles/1.1.2", "Unit");
    private final static QName _GetSEMobileSubscriptionIdentifierResponse_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "GetSEMobileSubscriptionIdentifierResponse");
    private final static QName _GetDeviceCapabilityProfileIdResponse_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "GetDeviceCapabilityProfileIdResponse");
    private final static QName _BindDeviceApplicationToSEApplicationRequest_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "BindDeviceApplicationToSEApplicationRequest");
    private final static QName _ActivationInfo_QNAME = new QName("http://www.gi-de.com/gd-extionsion-1.0.0", "ActivationInfo");
    private final static QName _SignatureValue_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "SignatureValue");
    private final static QName _UpgradeServiceRequest_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "UpgradeServiceRequest");
    private final static QName _UnbindDeviceApplicationToSEApplicationRequest_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "UnbindDeviceApplicationToSEApplicationRequest");
    private final static QName _DeleteDeviceApplicationResponse_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "DeleteDeviceApplicationResponse");
    private final static QName _Transform_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "Transform");
    private final static QName _HumanReadableCheckDigit_QNAME = new QName("http://namespaces.globalplatform.org/systems-profiles/1.1.2", "HumanReadableCheckDigit");
    private final static QName _PhoneNumber_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "PhoneNumber");
    private final static QName _CardStockID_QNAME = new QName("http://namespaces.globalplatform.org/systems-profiles/1.1.2", "CardStockID");
    private final static QName _ApplyResponse_QNAME = new QName("http://www.gi-de.com/gd-extionsion-1.0.0", "ApplyResponse");
    private final static QName _EntityInfo_QNAME = new QName("http://www.gi-de.com/gd-extionsion-1.0.0", "EntityInfo");
    private final static QName _ApplicationProfileUniqueID_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "ApplicationProfileUniqueID");
    private final static QName _DigestValue_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "DigestValue");
    private final static QName _ZPosition_QNAME = new QName("http://namespaces.globalplatform.org/systems-profiles/1.1.2", "ZPosition");
    private final static QName _BeginConversationResponse_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "BeginConversationResponse");
    private final static QName _GetServiceStateResponse_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "GetServiceStateResponse");
    private final static QName _MaterialID_QNAME = new QName("http://namespaces.globalplatform.org/systems-profiles/1.1.2", "MaterialID");
    private final static QName _KeyValue_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "KeyValue");
    private final static QName _GetDeviceCapabilityProfileIdRequest_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "GetDeviceCapabilityProfileIdRequest");
    private final static QName _HandleSEStatusChangeNotificationRequest_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "HandleSEStatusChangeNotificationRequest");
    private final static QName _CheckGlobalEligibilityRequest_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "CheckGlobalEligibilityRequest");
    private final static QName _PanUpdateInfo_QNAME = new QName("http://www.gi-de.com/gd-extionsion-1.0.0", "PanUpdateInfo");
    private final static QName _HandleActionDoneOnServiceNotificationRequest_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "HandleActionDoneOnServiceNotificationRequest");
    private final static QName _QuietZone_QNAME = new QName("http://namespaces.globalplatform.org/systems-profiles/1.1.2", "QuietZone");
    private final static QName _EnrollSSDOwnerCertificateResponse_QNAME = new QName("http://namespaces.globalplatform.org/systems-messaging/2.1.0", "EnrollSSDOwnerCertificateResponse");
    private final static QName _Script_QNAME = new QName("http://namespaces.globalplatform.org/systems-profiles/1.1.2", "Script");
    private final static QName _SignatureMethodTypeHMACOutputLength_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "HMACOutputLength");
    private final static QName _TransformTypeXPath_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "XPath");
    private final static QName _X509DataTypeX509IssuerSerial_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "X509IssuerSerial");
    private final static QName _X509DataTypeX509Certificate_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "X509Certificate");
    private final static QName _X509DataTypeX509SKI_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "X509SKI");
    private final static QName _X509DataTypeX509SubjectName_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "X509SubjectName");
    private final static QName _X509DataTypeX509CRL_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "X509CRL");
    private final static QName _FontSize_QNAME = new QName("http://namespaces.globalplatform.org/systems-profiles/1.1.2", "Size");
    private final static QName _FontForegroundColor_QNAME = new QName("http://namespaces.globalplatform.org/systems-profiles/1.1.2", "ForegroundColor");
    private final static QName _SPKIDataTypeSPKISexp_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "SPKISexp");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.gp
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Entity }
     * 
     */
    public Entity createEntity() {
        return new Entity();
    }

    /**
     * Create an instance of {@link GPHeader }
     * 
     */
    public GPHeader createGPHeader() {
        return new GPHeader();
    }

    /**
     * Create an instance of {@link EntityInfoType }
     * 
     */
    public EntityInfoType createEntityInfoType() {
        return new EntityInfoType();
    }

    /**
     * Create an instance of {@link ApplyResponseType }
     * 
     */
    public ApplyResponseType createApplyResponseType() {
        return new ApplyResponseType();
    }

    /**
     * Create an instance of {@link ActivationInfoType }
     * 
     */
    public ActivationInfoType createActivationInfoType() {
        return new ActivationInfoType();
    }

    /**
     * Create an instance of {@link PanUpdateInfoType }
     * 
     */
    public PanUpdateInfoType createPanUpdateInfoType() {
        return new PanUpdateInfoType();
    }

    /**
     * Create an instance of {@link HceCardInfoType }
     * 
     */
    public HceCardInfoType createHceCardInfoType() {
        return new HceCardInfoType();
    }

    /**
     * Create an instance of {@link ApplyInfoType }
     * 
     */
    public ApplyInfoType createApplyInfoType() {
        return new ApplyInfoType();
    }

    /**
     * Create an instance of {@link CheckGlobalEligibilityResponseType }
     * 
     */
    public CheckGlobalEligibilityResponseType createCheckGlobalEligibilityResponseType() {
        return new CheckGlobalEligibilityResponseType();
    }

    /**
     * Create an instance of {@link GetMobileSubscriptionAlternateIdentifierResponseType }
     * 
     */
    public GetMobileSubscriptionAlternateIdentifierResponseType createGetMobileSubscriptionAlternateIdentifierResponseType() {
        return new GetMobileSubscriptionAlternateIdentifierResponseType();
    }

    /**
     * Create an instance of {@link LoadDeviceApplicationResponseType }
     * 
     */
    public LoadDeviceApplicationResponseType createLoadDeviceApplicationResponseType() {
        return new LoadDeviceApplicationResponseType();
    }

    /**
     * Create an instance of {@link DeliveryModuleLog }
     * 
     */
    public DeliveryModuleLog createDeliveryModuleLog() {
        return new DeliveryModuleLog();
    }

    /**
     * Create an instance of {@link Error }
     * 
     */
    public Error createError() {
        return new Error();
    }

    /**
     * Create an instance of {@link EntityID }
     * 
     */
    public EntityID createEntityID() {
        return new EntityID();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link Entity.Contact }
     * 
     */
    public Entity.Contact createEntityContact() {
        return new Entity.Contact();
    }

    /**
     * Create an instance of {@link RequestedDeliveryDate }
     * 
     */
    public RequestedDeliveryDate createRequestedDeliveryDate() {
        return new RequestedDeliveryDate();
    }

    /**
     * Create an instance of {@link ShippingInformation }
     * 
     */
    public ShippingInformation createShippingInformation() {
        return new ShippingInformation();
    }

    /**
     * Create an instance of {@link Data }
     * 
     */
    public Data createData() {
        return new Data();
    }

    /**
     * Create an instance of {@link PackagingInformation }
     * 
     */
    public PackagingInformation createPackagingInformation() {
        return new PackagingInformation();
    }

    /**
     * Create an instance of {@link GenerateDMTokenResponseType }
     * 
     */
    public GenerateDMTokenResponseType createGenerateDMTokenResponseType() {
        return new GenerateDMTokenResponseType();
    }

    /**
     * Create an instance of {@link LogData }
     * 
     */
    public LogData createLogData() {
        return new LogData();
    }

    /**
     * Create an instance of {@link DataSet }
     * 
     */
    public DataSet createDataSet() {
        return new DataSet();
    }

    /**
     * Create an instance of {@link TransportKey }
     * 
     */
    public TransportKey createTransportKey() {
        return new TransportKey();
    }

    /**
     * Create an instance of {@link UpgradeServiceRequestType }
     * 
     */
    public UpgradeServiceRequestType createUpgradeServiceRequestType() {
        return new UpgradeServiceRequestType();
    }

    /**
     * Create an instance of {@link ProfileRequest }
     * 
     */
    public ProfileRequest createProfileRequest() {
        return new ProfileRequest();
    }

    /**
     * Create an instance of {@link ProfileIdentification }
     * 
     */
    public ProfileIdentification createProfileIdentification() {
        return new ProfileIdentification();
    }

    /**
     * Create an instance of {@link ModulesCommonData }
     * 
     */
    public ModulesCommonData createModulesCommonData() {
        return new ModulesCommonData();
    }

    /**
     * Create an instance of {@link UnbindDeviceApplicationToSEApplicationRequestType }
     * 
     */
    public UnbindDeviceApplicationToSEApplicationRequestType createUnbindDeviceApplicationToSEApplicationRequestType() {
        return new UnbindDeviceApplicationToSEApplicationRequestType();
    }

    /**
     * Create an instance of {@link DeleteDeviceApplicationResponseType }
     * 
     */
    public DeleteDeviceApplicationResponseType createDeleteDeviceApplicationResponseType() {
        return new DeleteDeviceApplicationResponseType();
    }

    /**
     * Create an instance of {@link GetSEMobileSubscriptionIdentifierResponseType }
     * 
     */
    public GetSEMobileSubscriptionIdentifierResponseType createGetSEMobileSubscriptionIdentifierResponseType() {
        return new GetSEMobileSubscriptionIdentifierResponseType();
    }

    /**
     * Create an instance of {@link ApplicationData }
     * 
     */
    public ApplicationData createApplicationData() {
        return new ApplicationData();
    }

    /**
     * Create an instance of {@link AID }
     * 
     */
    public AID createAID() {
        return new AID();
    }

    /**
     * Create an instance of {@link ProcessingStep }
     * 
     */
    public ProcessingStep createProcessingStep() {
        return new ProcessingStep();
    }

    /**
     * Create an instance of {@link PersoDeviceIns }
     * 
     */
    public PersoDeviceIns createPersoDeviceIns() {
        return new PersoDeviceIns();
    }

    /**
     * Create an instance of {@link ICCData }
     * 
     */
    public ICCData createICCData() {
        return new ICCData();
    }

    /**
     * Create an instance of {@link SignatureType }
     * 
     */
    public SignatureType createSignatureType() {
        return new SignatureType();
    }

    /**
     * Create an instance of {@link GetDeviceCapabilityProfileIdResponseType }
     * 
     */
    public GetDeviceCapabilityProfileIdResponseType createGetDeviceCapabilityProfileIdResponseType() {
        return new GetDeviceCapabilityProfileIdResponseType();
    }

    /**
     * Create an instance of {@link CardCommonConfigurationLog }
     * 
     */
    public CardCommonConfigurationLog createCardCommonConfigurationLog() {
        return new CardCommonConfigurationLog();
    }

    /**
     * Create an instance of {@link CollatorReturnCode }
     * 
     */
    public CollatorReturnCode createCollatorReturnCode() {
        return new CollatorReturnCode();
    }

    /**
     * Create an instance of {@link BindDeviceApplicationToSEApplicationRequestType }
     * 
     */
    public BindDeviceApplicationToSEApplicationRequestType createBindDeviceApplicationToSEApplicationRequestType() {
        return new BindDeviceApplicationToSEApplicationRequestType();
    }

    /**
     * Create an instance of {@link CommonLogContainer }
     * 
     */
    public CommonLogContainer createCommonLogContainer() {
        return new CommonLogContainer();
    }

    /**
     * Create an instance of {@link CommonLogIdentifierCode }
     * 
     */
    public CommonLogIdentifierCode createCommonLogIdentifierCode() {
        return new CommonLogIdentifierCode();
    }

    /**
     * Create an instance of {@link ApplicationCommonLog }
     * 
     */
    public ApplicationCommonLog createApplicationCommonLog() {
        return new ApplicationCommonLog();
    }

    /**
     * Create an instance of {@link ApplicationLog }
     * 
     */
    public ApplicationLog createApplicationLog() {
        return new ApplicationLog();
    }

    /**
     * Create an instance of {@link ProcessingStepResult }
     * 
     */
    public ProcessingStepResult createProcessingStepResult() {
        return new ProcessingStepResult();
    }

    /**
     * Create an instance of {@link SECommandResultType }
     * 
     */
    public SECommandResultType createSECommandResultType() {
        return new SECommandResultType();
    }

    /**
     * Create an instance of {@link ModuleLog }
     * 
     */
    public ModuleLog createModuleLog() {
        return new ModuleLog();
    }

    /**
     * Create an instance of {@link GetServiceStateResponseType }
     * 
     */
    public GetServiceStateResponseType createGetServiceStateResponseType() {
        return new GetServiceStateResponseType();
    }

    /**
     * Create an instance of {@link BeginConversationResponseType }
     * 
     */
    public BeginConversationResponseType createBeginConversationResponseType() {
        return new BeginConversationResponseType();
    }

    /**
     * Create an instance of {@link LFP }
     * 
     */
    public LFP createLFP() {
        return new LFP();
    }

    /**
     * Create an instance of {@link LoadFileProfile }
     * 
     */
    public LoadFileProfile createLoadFileProfile() {
        return new LoadFileProfile();
    }

    /**
     * Create an instance of {@link Revisions }
     * 
     */
    public Revisions createRevisions() {
        return new Revisions();
    }

    /**
     * Create an instance of {@link Revision }
     * 
     */
    public Revision createRevision() {
        return new Revision();
    }

    /**
     * Create an instance of {@link Signature }
     * 
     */
    public Signature createSignature() {
        return new Signature();
    }

    /**
     * Create an instance of {@link ConflictRules }
     * 
     */
    public ConflictRules createConflictRules() {
        return new ConflictRules();
    }

    /**
     * Create an instance of {@link ConflictRule }
     * 
     */
    public ConflictRule createConflictRule() {
        return new ConflictRule();
    }

    /**
     * Create an instance of {@link LoadFileInfo }
     * 
     */
    public LoadFileInfo createLoadFileInfo() {
        return new LoadFileInfo();
    }

    /**
     * Create an instance of {@link Modules }
     * 
     */
    public Modules createModules() {
        return new Modules();
    }

    /**
     * Create an instance of {@link Module }
     * 
     */
    public Module createModule() {
        return new Module();
    }

    /**
     * Create an instance of {@link ApplicationCode }
     * 
     */
    public ApplicationCode createApplicationCode() {
        return new ApplicationCode();
    }

    /**
     * Create an instance of {@link JobContainerLog }
     * 
     */
    public JobContainerLog createJobContainerLog() {
        return new JobContainerLog();
    }

    /**
     * Create an instance of {@link LogContainerHeader }
     * 
     */
    public LogContainerHeader createLogContainerHeader() {
        return new LogContainerHeader();
    }

    /**
     * Create an instance of {@link LogContainer }
     * 
     */
    public LogContainer createLogContainer() {
        return new LogContainer();
    }

    /**
     * Create an instance of {@link LogIdentifierCode }
     * 
     */
    public LogIdentifierCode createLogIdentifierCode() {
        return new LogIdentifierCode();
    }

    /**
     * Create an instance of {@link CardConfigurationLog }
     * 
     */
    public CardConfigurationLog createCardConfigurationLog() {
        return new CardConfigurationLog();
    }

    /**
     * Create an instance of {@link CRN }
     * 
     */
    public CRN createCRN() {
        return new CRN();
    }

    /**
     * Create an instance of {@link PhysicalCardIdentifier }
     * 
     */
    public PhysicalCardIdentifier createPhysicalCardIdentifier() {
        return new PhysicalCardIdentifier();
    }

    /**
     * Create an instance of {@link ApplicationCommonData }
     * 
     */
    public ApplicationCommonData createApplicationCommonData() {
        return new ApplicationCommonData();
    }

    /**
     * Create an instance of {@link GenericModule }
     * 
     */
    public GenericModule createGenericModule() {
        return new GenericModule();
    }

    /**
     * Create an instance of {@link ModuleData }
     * 
     */
    public ModuleData createModuleData() {
        return new ModuleData();
    }

    /**
     * Create an instance of {@link HandleActionDoneOnServiceNotificationRequestType }
     * 
     */
    public HandleActionDoneOnServiceNotificationRequestType createHandleActionDoneOnServiceNotificationRequestType() {
        return new HandleActionDoneOnServiceNotificationRequestType();
    }

    /**
     * Create an instance of {@link EnrollSSDOwnerCertificateResponseType }
     * 
     */
    public EnrollSSDOwnerCertificateResponseType createEnrollSSDOwnerCertificateResponseType() {
        return new EnrollSSDOwnerCertificateResponseType();
    }

    /**
     * Create an instance of {@link CheckGlobalEligibilityRequestType }
     * 
     */
    public CheckGlobalEligibilityRequestType createCheckGlobalEligibilityRequestType() {
        return new CheckGlobalEligibilityRequestType();
    }

    /**
     * Create an instance of {@link HandleSEStatusChangeNotificationRequestType }
     * 
     */
    public HandleSEStatusChangeNotificationRequestType createHandleSEStatusChangeNotificationRequestType() {
        return new HandleSEStatusChangeNotificationRequestType();
    }

    /**
     * Create an instance of {@link GetDeviceCapabilityProfileIdRequestType }
     * 
     */
    public GetDeviceCapabilityProfileIdRequestType createGetDeviceCapabilityProfileIdRequestType() {
        return new GetDeviceCapabilityProfileIdRequestType();
    }

    /**
     * Create an instance of {@link JobContainer }
     * 
     */
    public JobContainer createJobContainer() {
        return new JobContainer();
    }

    /**
     * Create an instance of {@link DataContainerHeader }
     * 
     */
    public DataContainerHeader createDataContainerHeader() {
        return new DataContainerHeader();
    }

    /**
     * Create an instance of {@link CommonDataContainer }
     * 
     */
    public CommonDataContainer createCommonDataContainer() {
        return new CommonDataContainer();
    }

    /**
     * Create an instance of {@link CommonModuleIdentifierCode }
     * 
     */
    public CommonModuleIdentifierCode createCommonModuleIdentifierCode() {
        return new CommonModuleIdentifierCode();
    }

    /**
     * Create an instance of {@link CardCommonConfiguration }
     * 
     */
    public CardCommonConfiguration createCardCommonConfiguration() {
        return new CardCommonConfiguration();
    }

    /**
     * Create an instance of {@link DeliveryModule }
     * 
     */
    public DeliveryModule createDeliveryModule() {
        return new DeliveryModule();
    }

    /**
     * Create an instance of {@link DataContainer }
     * 
     */
    public DataContainer createDataContainer() {
        return new DataContainer();
    }

    /**
     * Create an instance of {@link ModuleIdentifierCode }
     * 
     */
    public ModuleIdentifierCode createModuleIdentifierCode() {
        return new ModuleIdentifierCode();
    }

    /**
     * Create an instance of {@link CardConfiguration }
     * 
     */
    public CardConfiguration createCardConfiguration() {
        return new CardConfiguration();
    }

    /**
     * Create an instance of {@link DeleteSCWSServicePortalRequestType }
     * 
     */
    public DeleteSCWSServicePortalRequestType createDeleteSCWSServicePortalRequestType() {
        return new DeleteSCWSServicePortalRequestType();
    }

    /**
     * Create an instance of {@link TerminateServiceRequestType }
     * 
     */
    public TerminateServiceRequestType createTerminateServiceRequestType() {
        return new TerminateServiceRequestType();
    }

    /**
     * Create an instance of {@link MessageContext }
     * 
     */
    public MessageContext createMessageContext() {
        return new MessageContext();
    }

    /**
     * Create an instance of {@link TerminateServiceResponseType }
     * 
     */
    public TerminateServiceResponseType createTerminateServiceResponseType() {
        return new TerminateServiceResponseType();
    }

    /**
     * Create an instance of {@link ReturnCodeStep }
     * 
     */
    public ReturnCodeStep createReturnCodeStep() {
        return new ReturnCodeStep();
    }

    /**
     * Create an instance of {@link VerifyDMReceiptResponseType }
     * 
     */
    public VerifyDMReceiptResponseType createVerifyDMReceiptResponseType() {
        return new VerifyDMReceiptResponseType();
    }

    /**
     * Create an instance of {@link GetCAInformationRequestType }
     * 
     */
    public GetCAInformationRequestType createGetCAInformationRequestType() {
        return new GetCAInformationRequestType();
    }

    /**
     * Create an instance of {@link HandleSEDeviceStatusChangeNotificationRequestType }
     * 
     */
    public HandleSEDeviceStatusChangeNotificationRequestType createHandleSEDeviceStatusChangeNotificationRequestType() {
        return new HandleSEDeviceStatusChangeNotificationRequestType();
    }

    /**
     * Create an instance of {@link LoadSCWSServicePortalResponseType }
     * 
     */
    public LoadSCWSServicePortalResponseType createLoadSCWSServicePortalResponseType() {
        return new LoadSCWSServicePortalResponseType();
    }

    /**
     * Create an instance of {@link SuspendOrResumeServiceRequestType }
     * 
     */
    public SuspendOrResumeServiceRequestType createSuspendOrResumeServiceRequestType() {
        return new SuspendOrResumeServiceRequestType();
    }

    /**
     * Create an instance of {@link EnvironmentContainer }
     * 
     */
    public EnvironmentContainer createEnvironmentContainer() {
        return new EnvironmentContainer();
    }

    /**
     * Create an instance of {@link CardAuditTrail }
     * 
     */
    public CardAuditTrail createCardAuditTrail() {
        return new CardAuditTrail();
    }

    /**
     * Create an instance of {@link GPHeader.RequestingEntity }
     * 
     */
    public GPHeader.RequestingEntity createGPHeaderRequestingEntity() {
        return new GPHeader.RequestingEntity();
    }

    /**
     * Create an instance of {@link GPHeader.TargetEntity }
     * 
     */
    public GPHeader.TargetEntity createGPHeaderTargetEntity() {
        return new GPHeader.TargetEntity();
    }

    /**
     * Create an instance of {@link UnbindDeviceApplicationToSEApplicationResponseType }
     * 
     */
    public UnbindDeviceApplicationToSEApplicationResponseType createUnbindDeviceApplicationToSEApplicationResponseType() {
        return new UnbindDeviceApplicationToSEApplicationResponseType();
    }

    /**
     * Create an instance of {@link HandleSEDeviceChangedNotificationRequestType }
     * 
     */
    public HandleSEDeviceChangedNotificationRequestType createHandleSEDeviceChangedNotificationRequestType() {
        return new HandleSEDeviceChangedNotificationRequestType();
    }

    /**
     * Create an instance of {@link HandleEndServiceStateChangeNotificationRequestType }
     * 
     */
    public HandleEndServiceStateChangeNotificationRequestType createHandleEndServiceStateChangeNotificationRequestType() {
        return new HandleEndServiceStateChangeNotificationRequestType();
    }

    /**
     * Create an instance of {@link VerifyDMReceiptRequestType }
     * 
     */
    public VerifyDMReceiptRequestType createVerifyDMReceiptRequestType() {
        return new VerifyDMReceiptRequestType();
    }

    /**
     * Create an instance of {@link HandleServiceEnvironmentChangeNotificationRequestType }
     * 
     */
    public HandleServiceEnvironmentChangeNotificationRequestType createHandleServiceEnvironmentChangeNotificationRequestType() {
        return new HandleServiceEnvironmentChangeNotificationRequestType();
    }

    /**
     * Create an instance of {@link HandleActionDoneOnDeviceApplicationNotificationRequestType }
     * 
     */
    public HandleActionDoneOnDeviceApplicationNotificationRequestType createHandleActionDoneOnDeviceApplicationNotificationRequestType() {
        return new HandleActionDoneOnDeviceApplicationNotificationRequestType();
    }

    /**
     * Create an instance of {@link Information }
     * 
     */
    public Information createInformation() {
        return new Information();
    }

    /**
     * Create an instance of {@link GetApplicationOrELFStatusRequestType }
     * 
     */
    public GetApplicationOrELFStatusRequestType createGetApplicationOrELFStatusRequestType() {
        return new GetApplicationOrELFStatusRequestType();
    }

    /**
     * Create an instance of {@link ExchangeServiceDataResponseType }
     * 
     */
    public ExchangeServiceDataResponseType createExchangeServiceDataResponseType() {
        return new ExchangeServiceDataResponseType();
    }

    /**
     * Create an instance of {@link DeleteSCWSServicePortalResponseType }
     * 
     */
    public DeleteSCWSServicePortalResponseType createDeleteSCWSServicePortalResponseType() {
        return new DeleteSCWSServicePortalResponseType();
    }

    /**
     * Create an instance of {@link HandleMobileSubscriptionIdentifierChangedNotificationRequestType }
     * 
     */
    public HandleMobileSubscriptionIdentifierChangedNotificationRequestType createHandleMobileSubscriptionIdentifierChangedNotificationRequestType() {
        return new HandleMobileSubscriptionIdentifierChangedNotificationRequestType();
    }

    /**
     * Create an instance of {@link DeleteDeviceApplicationRequestType }
     * 
     */
    public DeleteDeviceApplicationRequestType createDeleteDeviceApplicationRequestType() {
        return new DeleteDeviceApplicationRequestType();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link KeyID }
     * 
     */
    public KeyID createKeyID() {
        return new KeyID();
    }

    /**
     * Create an instance of {@link LookupServiceInstanceReferenceResponseType }
     * 
     */
    public LookupServiceInstanceReferenceResponseType createLookupServiceInstanceReferenceResponseType() {
        return new LookupServiceInstanceReferenceResponseType();
    }

    /**
     * Create an instance of {@link ApplicationDataPerCRN }
     * 
     */
    public ApplicationDataPerCRN createApplicationDataPerCRN() {
        return new ApplicationDataPerCRN();
    }

    /**
     * Create an instance of {@link EndConversationResponseType }
     * 
     */
    public EndConversationResponseType createEndConversationResponseType() {
        return new EndConversationResponseType();
    }

    /**
     * Create an instance of {@link GetServiceInstanceReferenceDescriptorResponseType }
     * 
     */
    public GetServiceInstanceReferenceDescriptorResponseType createGetServiceInstanceReferenceDescriptorResponseType() {
        return new GetServiceInstanceReferenceDescriptorResponseType();
    }

    /**
     * Create an instance of {@link LoadFileName }
     * 
     */
    public LoadFileName createLoadFileName() {
        return new LoadFileName();
    }

    /**
     * Create an instance of {@link EnrollSSDOwnerCertificateRequestType }
     * 
     */
    public EnrollSSDOwnerCertificateRequestType createEnrollSSDOwnerCertificateRequestType() {
        return new EnrollSSDOwnerCertificateRequestType();
    }

    /**
     * Create an instance of {@link ApplicationDataNotification }
     * 
     */
    public ApplicationDataNotification createApplicationDataNotification() {
        return new ApplicationDataNotification();
    }

    /**
     * Create an instance of {@link ExchangeServiceDataRequestType }
     * 
     */
    public ExchangeServiceDataRequestType createExchangeServiceDataRequestType() {
        return new ExchangeServiceDataRequestType();
    }

    /**
     * Create an instance of {@link DeployServiceRequestType }
     * 
     */
    public DeployServiceRequestType createDeployServiceRequestType() {
        return new DeployServiceRequestType();
    }

    /**
     * Create an instance of {@link ApplicationAuditTrail }
     * 
     */
    public ApplicationAuditTrail createApplicationAuditTrail() {
        return new ApplicationAuditTrail();
    }

    /**
     * Create an instance of {@link ApplicationLogPerCRN }
     * 
     */
    public ApplicationLogPerCRN createApplicationLogPerCRN() {
        return new ApplicationLogPerCRN();
    }

    /**
     * Create an instance of {@link GetSECapabilityProfileIdResponseType }
     * 
     */
    public GetSECapabilityProfileIdResponseType createGetSECapabilityProfileIdResponseType() {
        return new GetSECapabilityProfileIdResponseType();
    }

    /**
     * Create an instance of {@link DeployServiceResponseType }
     * 
     */
    public DeployServiceResponseType createDeployServiceResponseType() {
        return new DeployServiceResponseType();
    }

    /**
     * Create an instance of {@link LoadDeviceApplicationRequestType }
     * 
     */
    public LoadDeviceApplicationRequestType createLoadDeviceApplicationRequestType() {
        return new LoadDeviceApplicationRequestType();
    }

    /**
     * Create an instance of {@link BatchAuditTrail }
     * 
     */
    public BatchAuditTrail createBatchAuditTrail() {
        return new BatchAuditTrail();
    }

    /**
     * Create an instance of {@link EnvironmentContainerLog }
     * 
     */
    public EnvironmentContainerLog createEnvironmentContainerLog() {
        return new EnvironmentContainerLog();
    }

    /**
     * Create an instance of {@link GetCAInformationResponseType }
     * 
     */
    public GetCAInformationResponseType createGetCAInformationResponseType() {
        return new GetCAInformationResponseType();
    }

    /**
     * Create an instance of {@link SendScriptResponseType }
     * 
     */
    public SendScriptResponseType createSendScriptResponseType() {
        return new SendScriptResponseType();
    }

    /**
     * Create an instance of {@link CardCustomization }
     * 
     */
    public CardCustomization createCardCustomization() {
        return new CardCustomization();
    }

    /**
     * Create an instance of {@link GetSEMobileSubscriptionIdentifierRequestType }
     * 
     */
    public GetSEMobileSubscriptionIdentifierRequestType createGetSEMobileSubscriptionIdentifierRequestType() {
        return new GetSEMobileSubscriptionIdentifierRequestType();
    }

    /**
     * Create an instance of {@link HandleMobileSubscriptionStatusChangeNotificationRequestType }
     * 
     */
    public HandleMobileSubscriptionStatusChangeNotificationRequestType createHandleMobileSubscriptionStatusChangeNotificationRequestType() {
        return new HandleMobileSubscriptionStatusChangeNotificationRequestType();
    }

    /**
     * Create an instance of {@link DeclareServiceInstanceReferenceResponseType }
     * 
     */
    public DeclareServiceInstanceReferenceResponseType createDeclareServiceInstanceReferenceResponseType() {
        return new DeclareServiceInstanceReferenceResponseType();
    }

    /**
     * Create an instance of {@link SECommandsGenerationAndRemoteExecutionRequestType }
     * 
     */
    public SECommandsGenerationAndRemoteExecutionRequestType createSECommandsGenerationAndRemoteExecutionRequestType() {
        return new SECommandsGenerationAndRemoteExecutionRequestType();
    }

    /**
     * Create an instance of {@link ApplicationDataRequest }
     * 
     */
    public ApplicationDataRequest createApplicationDataRequest() {
        return new ApplicationDataRequest();
    }

    /**
     * Create an instance of {@link HandleSEMobileSubscriptionChangedNotificationRequestType }
     * 
     */
    public HandleSEMobileSubscriptionChangedNotificationRequestType createHandleSEMobileSubscriptionChangedNotificationRequestType() {
        return new HandleSEMobileSubscriptionChangedNotificationRequestType();
    }

    /**
     * Create an instance of {@link AP }
     * 
     */
    public AP createAP() {
        return new AP();
    }

    /**
     * Create an instance of {@link ApplicationProfile }
     * 
     */
    public ApplicationProfile createApplicationProfile() {
        return new ApplicationProfile();
    }

    /**
     * Create an instance of {@link ApplicationInfo }
     * 
     */
    public ApplicationInfo createApplicationInfo() {
        return new ApplicationInfo();
    }

    /**
     * Create an instance of {@link Privileges }
     * 
     */
    public Privileges createPrivileges() {
        return new Privileges();
    }

    /**
     * Create an instance of {@link LifeCycles }
     * 
     */
    public LifeCycles createLifeCycles() {
        return new LifeCycles();
    }

    /**
     * Create an instance of {@link LifeCycle }
     * 
     */
    public LifeCycle createLifeCycle() {
        return new LifeCycle();
    }

    /**
     * Create an instance of {@link Key }
     * 
     */
    public Key createKey() {
        return new Key();
    }

    /**
     * Create an instance of {@link DataElement }
     * 
     */
    public DataElement createDataElement() {
        return new DataElement();
    }

    /**
     * Create an instance of {@link Function }
     * 
     */
    public Function createFunction() {
        return new Function();
    }

    /**
     * Create an instance of {@link SecureChannel }
     * 
     */
    public SecureChannel createSecureChannel() {
        return new SecureChannel();
    }

    /**
     * Create an instance of {@link OpenSecureChannel }
     * 
     */
    public OpenSecureChannel createOpenSecureChannel() {
        return new OpenSecureChannel();
    }

    /**
     * Create an instance of {@link KeyDeclaration }
     * 
     */
    public KeyDeclaration createKeyDeclaration() {
        return new KeyDeclaration();
    }

    /**
     * Create an instance of {@link CloseSecureChannel }
     * 
     */
    public CloseSecureChannel createCloseSecureChannel() {
        return new CloseSecureChannel();
    }

    /**
     * Create an instance of {@link Wrap }
     * 
     */
    public Wrap createWrap() {
        return new Wrap();
    }

    /**
     * Create an instance of {@link ScriptFragment }
     * 
     */
    public ScriptFragment createScriptFragment() {
        return new ScriptFragment();
    }

    /**
     * Create an instance of {@link Declaration }
     * 
     */
    public Declaration createDeclaration() {
        return new Declaration();
    }

    /**
     * Create an instance of {@link CPP }
     * 
     */
    public CPP createCPP() {
        return new CPP();
    }

    /**
     * Create an instance of {@link CardPrintingProfile }
     * 
     */
    public CardPrintingProfile createCardPrintingProfile() {
        return new CardPrintingProfile();
    }

    /**
     * Create an instance of {@link Emboss }
     * 
     */
    public Emboss createEmboss() {
        return new Emboss();
    }

    /**
     * Create an instance of {@link Label }
     * 
     */
    public Label createLabel() {
        return new Label();
    }

    /**
     * Create an instance of {@link MagneticEncodingType }
     * 
     */
    public MagneticEncodingType createMagneticEncodingType() {
        return new MagneticEncodingType();
    }

    /**
     * Create an instance of {@link Overlay }
     * 
     */
    public Overlay createOverlay() {
        return new Overlay();
    }

    /**
     * Create an instance of {@link Barcode }
     * 
     */
    public Barcode createBarcode() {
        return new Barcode();
    }

    /**
     * Create an instance of {@link Text }
     * 
     */
    public Text createText() {
        return new Text();
    }

    /**
     * Create an instance of {@link Image }
     * 
     */
    public Image createImage() {
        return new Image();
    }

    /**
     * Create an instance of {@link CheckMobileSubscriptionEligibilityResponseType }
     * 
     */
    public CheckMobileSubscriptionEligibilityResponseType createCheckMobileSubscriptionEligibilityResponseType() {
        return new CheckMobileSubscriptionEligibilityResponseType();
    }

    /**
     * Create an instance of {@link GenerateDMTokenRequestType }
     * 
     */
    public GenerateDMTokenRequestType createGenerateDMTokenRequestType() {
        return new GenerateDMTokenRequestType();
    }

    /**
     * Create an instance of {@link KeyExchange }
     * 
     */
    public KeyExchange createKeyExchange() {
        return new KeyExchange();
    }

    /**
     * Create an instance of {@link EndConversationRequestType }
     * 
     */
    public EndConversationRequestType createEndConversationRequestType() {
        return new EndConversationRequestType();
    }

    /**
     * Create an instance of {@link GPMessage }
     * 
     */
    public GPMessage createGPMessage() {
        return new GPMessage();
    }

    /**
     * Create an instance of {@link GPBody }
     * 
     */
    public GPBody createGPBody() {
        return new GPBody();
    }

    /**
     * Create an instance of {@link CP }
     * 
     */
    public CP createCP() {
        return new CP();
    }

    /**
     * Create an instance of {@link CardProfile }
     * 
     */
    public CardProfile createCardProfile() {
        return new CardProfile();
    }

    /**
     * Create an instance of {@link CardManufacturerProduct }
     * 
     */
    public CardManufacturerProduct createCardManufacturerProduct() {
        return new CardManufacturerProduct();
    }

    /**
     * Create an instance of {@link CardManufacturer }
     * 
     */
    public CardManufacturer createCardManufacturer() {
        return new CardManufacturer();
    }

    /**
     * Create an instance of {@link Chip }
     * 
     */
    public Chip createChip() {
        return new Chip();
    }

    /**
     * Create an instance of {@link Resources }
     * 
     */
    public Resources createResources() {
        return new Resources();
    }

    /**
     * Create an instance of {@link Powers }
     * 
     */
    public Powers createPowers() {
        return new Powers();
    }

    /**
     * Create an instance of {@link Power }
     * 
     */
    public Power createPower() {
        return new Power();
    }

    /**
     * Create an instance of {@link Clock }
     * 
     */
    public Clock createClock() {
        return new Clock();
    }

    /**
     * Create an instance of {@link Communication }
     * 
     */
    public Communication createCommunication() {
        return new Communication();
    }

    /**
     * Create an instance of {@link org.gp.Contact }
     * 
     */
    public org.gp.Contact createContact() {
        return new org.gp.Contact();
    }

    /**
     * Create an instance of {@link Protocols }
     * 
     */
    public Protocols createProtocols() {
        return new Protocols();
    }

    /**
     * Create an instance of {@link Protocol }
     * 
     */
    public Protocol createProtocol() {
        return new Protocol();
    }

    /**
     * Create an instance of {@link Contactless }
     * 
     */
    public Contactless createContactless() {
        return new Contactless();
    }

    /**
     * Create an instance of {@link CryptoEngine }
     * 
     */
    public CryptoEngine createCryptoEngine() {
        return new CryptoEngine();
    }

    /**
     * Create an instance of {@link KeyTypes }
     * 
     */
    public KeyTypes createKeyTypes() {
        return new KeyTypes();
    }

    /**
     * Create an instance of {@link KeyType }
     * 
     */
    public KeyType createKeyType() {
        return new KeyType();
    }

    /**
     * Create an instance of {@link Algorithm }
     * 
     */
    public Algorithm createAlgorithm() {
        return new Algorithm();
    }

    /**
     * Create an instance of {@link Platform }
     * 
     */
    public Platform createPlatform() {
        return new Platform();
    }

    /**
     * Create an instance of {@link LoadFileInstances }
     * 
     */
    public LoadFileInstances createLoadFileInstances() {
        return new LoadFileInstances();
    }

    /**
     * Create an instance of {@link LoadFileInstance }
     * 
     */
    public LoadFileInstance createLoadFileInstance() {
        return new LoadFileInstance();
    }

    /**
     * Create an instance of {@link ApplicationInstances }
     * 
     */
    public ApplicationInstances createApplicationInstances() {
        return new ApplicationInstances();
    }

    /**
     * Create an instance of {@link ApplicationInstance }
     * 
     */
    public ApplicationInstance createApplicationInstance() {
        return new ApplicationInstance();
    }

    /**
     * Create an instance of {@link CardInfo }
     * 
     */
    public CardInfo createCardInfo() {
        return new CardInfo();
    }

    /**
     * Create an instance of {@link ResourcesAvailable }
     * 
     */
    public ResourcesAvailable createResourcesAvailable() {
        return new ResourcesAvailable();
    }

    /**
     * Create an instance of {@link CPChanges }
     * 
     */
    public CPChanges createCPChanges() {
        return new CPChanges();
    }

    /**
     * Create an instance of {@link KP }
     * 
     */
    public KP createKP() {
        return new KP();
    }

    /**
     * Create an instance of {@link KeyProfile }
     * 
     */
    public KeyProfile createKeyProfile() {
        return new KeyProfile();
    }

    /**
     * Create an instance of {@link KeyInfo }
     * 
     */
    public KeyInfo createKeyInfo() {
        return new KeyInfo();
    }

    /**
     * Create an instance of {@link KeyPart }
     * 
     */
    public KeyPart createKeyPart() {
        return new KeyPart();
    }

    /**
     * Create an instance of {@link Attribute }
     * 
     */
    public Attribute createAttribute() {
        return new Attribute();
    }

    /**
     * Create an instance of {@link Usage }
     * 
     */
    public Usage createUsage() {
        return new Usage();
    }

    /**
     * Create an instance of {@link Value }
     * 
     */
    public Value createValue() {
        return new Value();
    }

    /**
     * Create an instance of {@link Component }
     * 
     */
    public Component createComponent() {
        return new Component();
    }

    /**
     * Create an instance of {@link BatchCardCustomization }
     * 
     */
    public BatchCardCustomization createBatchCardCustomization() {
        return new BatchCardCustomization();
    }

    /**
     * Create an instance of {@link GetSECapabilityProfileIdRequestType }
     * 
     */
    public GetSECapabilityProfileIdRequestType createGetSECapabilityProfileIdRequestType() {
        return new GetSECapabilityProfileIdRequestType();
    }

    /**
     * Create an instance of {@link CheckMobileSubscriptionEligibilityRequestType }
     * 
     */
    public CheckMobileSubscriptionEligibilityRequestType createCheckMobileSubscriptionEligibilityRequestType() {
        return new CheckMobileSubscriptionEligibilityRequestType();
    }

    /**
     * Create an instance of {@link HandleStartServiceStateChangeNotificationRequestType }
     * 
     */
    public HandleStartServiceStateChangeNotificationRequestType createHandleStartServiceStateChangeNotificationRequestType() {
        return new HandleStartServiceStateChangeNotificationRequestType();
    }

    /**
     * Create an instance of {@link GetMobileSubscriptionAlternateIdentifierRequestType }
     * 
     */
    public GetMobileSubscriptionAlternateIdentifierRequestType createGetMobileSubscriptionAlternateIdentifierRequestType() {
        return new GetMobileSubscriptionAlternateIdentifierRequestType();
    }

    /**
     * Create an instance of {@link GetMobileSubscriptionSEIdentifiersRequestType }
     * 
     */
    public GetMobileSubscriptionSEIdentifiersRequestType createGetMobileSubscriptionSEIdentifiersRequestType() {
        return new GetMobileSubscriptionSEIdentifiersRequestType();
    }

    /**
     * Create an instance of {@link GetMobileSubscriptionSEIdentifiersResponseType }
     * 
     */
    public GetMobileSubscriptionSEIdentifiersResponseType createGetMobileSubscriptionSEIdentifiersResponseType() {
        return new GetMobileSubscriptionSEIdentifiersResponseType();
    }

    /**
     * Create an instance of {@link HandleSERenewalNotificationRequestType }
     * 
     */
    public HandleSERenewalNotificationRequestType createHandleSERenewalNotificationRequestType() {
        return new HandleSERenewalNotificationRequestType();
    }

    /**
     * Create an instance of {@link LookupServiceInstanceReferenceRequestType }
     * 
     */
    public LookupServiceInstanceReferenceRequestType createLookupServiceInstanceReferenceRequestType() {
        return new LookupServiceInstanceReferenceRequestType();
    }

    /**
     * Create an instance of {@link DeclareServiceInstanceReferenceRequestType }
     * 
     */
    public DeclareServiceInstanceReferenceRequestType createDeclareServiceInstanceReferenceRequestType() {
        return new DeclareServiceInstanceReferenceRequestType();
    }

    /**
     * Create an instance of {@link GetServiceInstanceReferenceDescriptorRequestType }
     * 
     */
    public GetServiceInstanceReferenceDescriptorRequestType createGetServiceInstanceReferenceDescriptorRequestType() {
        return new GetServiceInstanceReferenceDescriptorRequestType();
    }

    /**
     * Create an instance of {@link GetServiceStateRequestType }
     * 
     */
    public GetServiceStateRequestType createGetServiceStateRequestType() {
        return new GetServiceStateRequestType();
    }

    /**
     * Create an instance of {@link UpgradeServiceResponseType }
     * 
     */
    public UpgradeServiceResponseType createUpgradeServiceResponseType() {
        return new UpgradeServiceResponseType();
    }

    /**
     * Create an instance of {@link SuspendOrResumeServiceResponseType }
     * 
     */
    public SuspendOrResumeServiceResponseType createSuspendOrResumeServiceResponseType() {
        return new SuspendOrResumeServiceResponseType();
    }

    /**
     * Create an instance of {@link SECommandsGenerationAndRemoteExecutionResponseType }
     * 
     */
    public SECommandsGenerationAndRemoteExecutionResponseType createSECommandsGenerationAndRemoteExecutionResponseType() {
        return new SECommandsGenerationAndRemoteExecutionResponseType();
    }

    /**
     * Create an instance of {@link BeginConversationRequestType }
     * 
     */
    public BeginConversationRequestType createBeginConversationRequestType() {
        return new BeginConversationRequestType();
    }

    /**
     * Create an instance of {@link SendScriptRequestType }
     * 
     */
    public SendScriptRequestType createSendScriptRequestType() {
        return new SendScriptRequestType();
    }

    /**
     * Create an instance of {@link GetApplicationOrELFStatusResponseType }
     * 
     */
    public GetApplicationOrELFStatusResponseType createGetApplicationOrELFStatusResponseType() {
        return new GetApplicationOrELFStatusResponseType();
    }

    /**
     * Create an instance of {@link GetSDFreeMemoryRequestType }
     * 
     */
    public GetSDFreeMemoryRequestType createGetSDFreeMemoryRequestType() {
        return new GetSDFreeMemoryRequestType();
    }

    /**
     * Create an instance of {@link GetSDFreeMemoryResponseType }
     * 
     */
    public GetSDFreeMemoryResponseType createGetSDFreeMemoryResponseType() {
        return new GetSDFreeMemoryResponseType();
    }

    /**
     * Create an instance of {@link LoadSCWSServicePortalRequestType }
     * 
     */
    public LoadSCWSServicePortalRequestType createLoadSCWSServicePortalRequestType() {
        return new LoadSCWSServicePortalRequestType();
    }

    /**
     * Create an instance of {@link BindDeviceApplicationToSEApplicationResponseType }
     * 
     */
    public BindDeviceApplicationToSEApplicationResponseType createBindDeviceApplicationToSEApplicationResponseType() {
        return new BindDeviceApplicationToSEApplicationResponseType();
    }

    /**
     * Create an instance of {@link CIN }
     * 
     */
    public CIN createCIN() {
        return new CIN();
    }

    /**
     * Create an instance of {@link CCMCommandStatusType }
     * 
     */
    public CCMCommandStatusType createCCMCommandStatusType() {
        return new CCMCommandStatusType();
    }

    /**
     * Create an instance of {@link CCMScenario1UsingPKCreateFirstSSDKeysetCommandResponseType }
     * 
     */
    public CCMScenario1UsingPKCreateFirstSSDKeysetCommandResponseType createCCMScenario1UsingPKCreateFirstSSDKeysetCommandResponseType() {
        return new CCMScenario1UsingPKCreateFirstSSDKeysetCommandResponseType();
    }

    /**
     * Create an instance of {@link CCCMScenario2BCreateFirstSSDKeysetCommandResponseType }
     * 
     */
    public CCCMScenario2BCreateFirstSSDKeysetCommandResponseType createCCCMScenario2BCreateFirstSSDKeysetCommandResponseType() {
        return new CCCMScenario2BCreateFirstSSDKeysetCommandResponseType();
    }

    /**
     * Create an instance of {@link LoadELFCommandType }
     * 
     */
    public LoadELFCommandType createLoadELFCommandType() {
        return new LoadELFCommandType();
    }

    /**
     * Create an instance of {@link GetServiceStateResponseDataType }
     * 
     */
    public GetServiceStateResponseDataType createGetServiceStateResponseDataType() {
        return new GetServiceStateResponseDataType();
    }

    /**
     * Create an instance of {@link CheckMobileSubscriptionEligibilityResponseDataType }
     * 
     */
    public CheckMobileSubscriptionEligibilityResponseDataType createCheckMobileSubscriptionEligibilityResponseDataType() {
        return new CheckMobileSubscriptionEligibilityResponseDataType();
    }

    /**
     * Create an instance of {@link DeleteDeviceApplicationResponseDataType }
     * 
     */
    public DeleteDeviceApplicationResponseDataType createDeleteDeviceApplicationResponseDataType() {
        return new DeleteDeviceApplicationResponseDataType();
    }

    /**
     * Create an instance of {@link InstantiateApplicationCommandType }
     * 
     */
    public InstantiateApplicationCommandType createInstantiateApplicationCommandType() {
        return new InstantiateApplicationCommandType();
    }

    /**
     * Create an instance of {@link ApplicationRegistryUpdateCommandType }
     * 
     */
    public ApplicationRegistryUpdateCommandType createApplicationRegistryUpdateCommandType() {
        return new ApplicationRegistryUpdateCommandType();
    }

    /**
     * Create an instance of {@link MobileNFCServiceResultContextType }
     * 
     */
    public MobileNFCServiceResultContextType createMobileNFCServiceResultContextType() {
        return new MobileNFCServiceResultContextType();
    }

    /**
     * Create an instance of {@link ELFComponentStatusType }
     * 
     */
    public ELFComponentStatusType createELFComponentStatusType() {
        return new ELFComponentStatusType();
    }

    /**
     * Create an instance of {@link GenerateDMTokenResponseDataType }
     * 
     */
    public GenerateDMTokenResponseDataType createGenerateDMTokenResponseDataType() {
        return new GenerateDMTokenResponseDataType();
    }

    /**
     * Create an instance of {@link StatusCodeDataType }
     * 
     */
    public StatusCodeDataType createStatusCodeDataType() {
        return new StatusCodeDataType();
    }

    /**
     * Create an instance of {@link GetSEMobileSubscriptionIdentifierResponseDataType }
     * 
     */
    public GetSEMobileSubscriptionIdentifierResponseDataType createGetSEMobileSubscriptionIdentifierResponseDataType() {
        return new GetSEMobileSubscriptionIdentifierResponseDataType();
    }

    /**
     * Create an instance of {@link CCCMScenario2ACreateFirstSSDKeysetCommandResponseType }
     * 
     */
    public CCCMScenario2ACreateFirstSSDKeysetCommandResponseType createCCCMScenario2ACreateFirstSSDKeysetCommandResponseType() {
        return new CCCMScenario2ACreateFirstSSDKeysetCommandResponseType();
    }

    /**
     * Create an instance of {@link BasicRequestType }
     * 
     */
    public BasicRequestType createBasicRequestType() {
        return new BasicRequestType();
    }

    /**
     * Create an instance of {@link BasicCreateFirstSSDKeysetCommandResponseType }
     * 
     */
    public BasicCreateFirstSSDKeysetCommandResponseType createBasicCreateFirstSSDKeysetCommandResponseType() {
        return new BasicCreateFirstSSDKeysetCommandResponseType();
    }

    /**
     * Create an instance of {@link DeployServiceResponseDataType }
     * 
     */
    public DeployServiceResponseDataType createDeployServiceResponseDataType() {
        return new DeployServiceResponseDataType();
    }

    /**
     * Create an instance of {@link CCCMScenario3CreateFirstSSDKeysetCommandType }
     * 
     */
    public CCCMScenario3CreateFirstSSDKeysetCommandType createCCCMScenario3CreateFirstSSDKeysetCommandType() {
        return new CCCMScenario3CreateFirstSSDKeysetCommandType();
    }

    /**
     * Create an instance of {@link SEAppIdAIDType }
     * 
     */
    public SEAppIdAIDType createSEAppIdAIDType() {
        return new SEAppIdAIDType();
    }

    /**
     * Create an instance of {@link GetSECapabilityProfileIdResponseDataType }
     * 
     */
    public GetSECapabilityProfileIdResponseDataType createGetSECapabilityProfileIdResponseDataType() {
        return new GetSECapabilityProfileIdResponseDataType();
    }

    /**
     * Create an instance of {@link TerminateServiceResponseDataType }
     * 
     */
    public TerminateServiceResponseDataType createTerminateServiceResponseDataType() {
        return new TerminateServiceResponseDataType();
    }

    /**
     * Create an instance of {@link ExchangeServiceDataCommandResultType }
     * 
     */
    public ExchangeServiceDataCommandResultType createExchangeServiceDataCommandResultType() {
        return new ExchangeServiceDataCommandResultType();
    }

    /**
     * Create an instance of {@link SendScriptResponseDataType }
     * 
     */
    public SendScriptResponseDataType createSendScriptResponseDataType() {
        return new SendScriptResponseDataType();
    }

    /**
     * Create an instance of {@link DeviceInstallationModeType }
     * 
     */
    public DeviceInstallationModeType createDeviceInstallationModeType() {
        return new DeviceInstallationModeType();
    }

    /**
     * Create an instance of {@link GetMobileSubscriptionSEIdentifiersResponseDataType }
     * 
     */
    public GetMobileSubscriptionSEIdentifiersResponseDataType createGetMobileSubscriptionSEIdentifiersResponseDataType() {
        return new GetMobileSubscriptionSEIdentifiersResponseDataType();
    }

    /**
     * Create an instance of {@link LoadDeviceApplicationResponseDataType }
     * 
     */
    public LoadDeviceApplicationResponseDataType createLoadDeviceApplicationResponseDataType() {
        return new LoadDeviceApplicationResponseDataType();
    }

    /**
     * Create an instance of {@link MobileNFCServiceContextType }
     * 
     */
    public MobileNFCServiceContextType createMobileNFCServiceContextType() {
        return new MobileNFCServiceContextType();
    }

    /**
     * Create an instance of {@link KeySetType }
     * 
     */
    public KeySetType createKeySetType() {
        return new KeySetType();
    }

    /**
     * Create an instance of {@link ExecutionStatusType }
     * 
     */
    public ExecutionStatusType createExecutionStatusType() {
        return new ExecutionStatusType();
    }

    /**
     * Create an instance of {@link MSIdMSISDNType }
     * 
     */
    public MSIdMSISDNType createMSIdMSISDNType() {
        return new MSIdMSISDNType();
    }

    /**
     * Create an instance of {@link MSIdGenericType }
     * 
     */
    public MSIdGenericType createMSIdGenericType() {
        return new MSIdGenericType();
    }

    /**
     * Create an instance of {@link InstallServiceCommandType }
     * 
     */
    public InstallServiceCommandType createInstallServiceCommandType() {
        return new InstallServiceCommandType();
    }

    /**
     * Create an instance of {@link InstantiateApplicationCommandResponseType }
     * 
     */
    public InstantiateApplicationCommandResponseType createInstantiateApplicationCommandResponseType() {
        return new InstantiateApplicationCommandResponseType();
    }

    /**
     * Create an instance of {@link MSIdExtendableType }
     * 
     */
    public MSIdExtendableType createMSIdExtendableType() {
        return new MSIdExtendableType();
    }

    /**
     * Create an instance of {@link ActivateServiceCommandType }
     * 
     */
    public ActivateServiceCommandType createActivateServiceCommandType() {
        return new ActivateServiceCommandType();
    }

    /**
     * Create an instance of {@link ServiceCommandResultType }
     * 
     */
    public ServiceCommandResultType createServiceCommandResultType() {
        return new ServiceCommandResultType();
    }

    /**
     * Create an instance of {@link SEIdICCIDType }
     * 
     */
    public SEIdICCIDType createSEIdICCIDType() {
        return new SEIdICCIDType();
    }

    /**
     * Create an instance of {@link GetSDFreeMemoryResponseDataType }
     * 
     */
    public GetSDFreeMemoryResponseDataType createGetSDFreeMemoryResponseDataType() {
        return new GetSDFreeMemoryResponseDataType();
    }

    /**
     * Create an instance of {@link ServiceCommandStatusCodeDataType }
     * 
     */
    public ServiceCommandStatusCodeDataType createServiceCommandStatusCodeDataType() {
        return new ServiceCommandStatusCodeDataType();
    }

    /**
     * Create an instance of {@link BasicCreateFirstSSDKeysetCommandType }
     * 
     */
    public BasicCreateFirstSSDKeysetCommandType createBasicCreateFirstSSDKeysetCommandType() {
        return new BasicCreateFirstSSDKeysetCommandType();
    }

    /**
     * Create an instance of {@link ExtensionsType }
     * 
     */
    public ExtensionsType createExtensionsType() {
        return new ExtensionsType();
    }

    /**
     * Create an instance of {@link SECommandsGenerationAndRemoteExecutionResponseResponseDataType }
     * 
     */
    public SECommandsGenerationAndRemoteExecutionResponseResponseDataType createSECommandsGenerationAndRemoteExecutionResponseResponseDataType() {
        return new SECommandsGenerationAndRemoteExecutionResponseResponseDataType();
    }

    /**
     * Create an instance of {@link EnrollSSDOwnerCertificateResponseDataType }
     * 
     */
    public EnrollSSDOwnerCertificateResponseDataType createEnrollSSDOwnerCertificateResponseDataType() {
        return new EnrollSSDOwnerCertificateResponseDataType();
    }

    /**
     * Create an instance of {@link CCCMScenario2BCreateFirstSSDKeysetCommandType }
     * 
     */
    public CCCMScenario2BCreateFirstSSDKeysetCommandType createCCCMScenario2BCreateFirstSSDKeysetCommandType() {
        return new CCCMScenario2BCreateFirstSSDKeysetCommandType();
    }

    /**
     * Create an instance of {@link CommandStatusCodeDataType }
     * 
     */
    public CommandStatusCodeDataType createCommandStatusCodeDataType() {
        return new CommandStatusCodeDataType();
    }

    /**
     * Create an instance of {@link ExtraditeCommandType }
     * 
     */
    public ExtraditeCommandType createExtraditeCommandType() {
        return new ExtraditeCommandType();
    }

    /**
     * Create an instance of {@link BasicRandomCreateFirstSSDKeysetCommandType }
     * 
     */
    public BasicRandomCreateFirstSSDKeysetCommandType createBasicRandomCreateFirstSSDKeysetCommandType() {
        return new BasicRandomCreateFirstSSDKeysetCommandType();
    }

    /**
     * Create an instance of {@link BeginConversationResponseDataType }
     * 
     */
    public BeginConversationResponseDataType createBeginConversationResponseDataType() {
        return new BeginConversationResponseDataType();
    }

    /**
     * Create an instance of {@link GetDeviceCapabilityProfileIdResponseDataType }
     * 
     */
    public GetDeviceCapabilityProfileIdResponseDataType createGetDeviceCapabilityProfileIdResponseDataType() {
        return new GetDeviceCapabilityProfileIdResponseDataType();
    }

    /**
     * Create an instance of {@link ExchangeServiceDataResponseDataType }
     * 
     */
    public ExchangeServiceDataResponseDataType createExchangeServiceDataResponseDataType() {
        return new ExchangeServiceDataResponseDataType();
    }

    /**
     * Create an instance of {@link GetCAInformationResponseDataType }
     * 
     */
    public GetCAInformationResponseDataType createGetCAInformationResponseDataType() {
        return new GetCAInformationResponseDataType();
    }

    /**
     * Create an instance of {@link SEIdGenericType }
     * 
     */
    public SEIdGenericType createSEIdGenericType() {
        return new SEIdGenericType();
    }

    /**
     * Create an instance of {@link ServiceVersionType }
     * 
     */
    public ServiceVersionType createServiceVersionType() {
        return new ServiceVersionType();
    }

    /**
     * Create an instance of {@link CCCMScenario3CreateFirstSSDKeysetCommandResponseType }
     * 
     */
    public CCCMScenario3CreateFirstSSDKeysetCommandResponseType createCCCMScenario3CreateFirstSSDKeysetCommandResponseType() {
        return new CCCMScenario3CreateFirstSSDKeysetCommandResponseType();
    }

    /**
     * Create an instance of {@link ServiceQualifierType }
     * 
     */
    public ServiceQualifierType createServiceQualifierType() {
        return new ServiceQualifierType();
    }

    /**
     * Create an instance of {@link SuspendOrResumeServiceResponseDataType }
     * 
     */
    public SuspendOrResumeServiceResponseDataType createSuspendOrResumeServiceResponseDataType() {
        return new SuspendOrResumeServiceResponseDataType();
    }

    /**
     * Create an instance of {@link CCCMScenario2ACreateFirstSSDKeysetCommandType }
     * 
     */
    public CCCMScenario2ACreateFirstSSDKeysetCommandType createCCCMScenario2ACreateFirstSSDKeysetCommandType() {
        return new CCCMScenario2ACreateFirstSSDKeysetCommandType();
    }

    /**
     * Create an instance of {@link NameValuePairType }
     * 
     */
    public NameValuePairType createNameValuePairType() {
        return new NameValuePairType();
    }

    /**
     * Create an instance of {@link BasicRandomCreateFirstSSDKeysetCommandResponseType }
     * 
     */
    public BasicRandomCreateFirstSSDKeysetCommandResponseType createBasicRandomCreateFirstSSDKeysetCommandResponseType() {
        return new BasicRandomCreateFirstSSDKeysetCommandResponseType();
    }

    /**
     * Create an instance of {@link CCCMScenario1UsingPKCreateFirstSSDKeysetCommandType }
     * 
     */
    public CCCMScenario1UsingPKCreateFirstSSDKeysetCommandType createCCCMScenario1UsingPKCreateFirstSSDKeysetCommandType() {
        return new CCCMScenario1UsingPKCreateFirstSSDKeysetCommandType();
    }

    /**
     * Create an instance of {@link BasicDiversifiedCreateFirstSSDKeysetCommandType }
     * 
     */
    public BasicDiversifiedCreateFirstSSDKeysetCommandType createBasicDiversifiedCreateFirstSSDKeysetCommandType() {
        return new BasicDiversifiedCreateFirstSSDKeysetCommandType();
    }

    /**
     * Create an instance of {@link GetApplicationOrELFStatusResponseDataType }
     * 
     */
    public GetApplicationOrELFStatusResponseDataType createGetApplicationOrELFStatusResponseDataType() {
        return new GetApplicationOrELFStatusResponseDataType();
    }

    /**
     * Create an instance of {@link GetMobileSubscriptionAlternateIdentifierResponseDataType }
     * 
     */
    public GetMobileSubscriptionAlternateIdentifierResponseDataType createGetMobileSubscriptionAlternateIdentifierResponseDataType() {
        return new GetMobileSubscriptionAlternateIdentifierResponseDataType();
    }

    /**
     * Create an instance of {@link ServiceIdentifierType }
     * 
     */
    public ServiceIdentifierType createServiceIdentifierType() {
        return new ServiceIdentifierType();
    }

    /**
     * Create an instance of {@link SDComponentStatusType }
     * 
     */
    public SDComponentStatusType createSDComponentStatusType() {
        return new SDComponentStatusType();
    }

    /**
     * Create an instance of {@link SDKeyType }
     * 
     */
    public SDKeyType createSDKeyType() {
        return new SDKeyType();
    }

    /**
     * Create an instance of {@link GetServiceInstanceReferenceDescriptorResponseDataType }
     * 
     */
    public GetServiceInstanceReferenceDescriptorResponseDataType createGetServiceInstanceReferenceDescriptorResponseDataType() {
        return new GetServiceInstanceReferenceDescriptorResponseDataType();
    }

    /**
     * Create an instance of {@link ApplicationComponentStatusType }
     * 
     */
    public ApplicationComponentStatusType createApplicationComponentStatusType() {
        return new ApplicationComponentStatusType();
    }

    /**
     * Create an instance of {@link SEIdExtendableType }
     * 
     */
    public SEIdExtendableType createSEIdExtendableType() {
        return new SEIdExtendableType();
    }

    /**
     * Create an instance of {@link SCP81KeySetProfileKeySetDescriptionType }
     * 
     */
    public SCP81KeySetProfileKeySetDescriptionType createSCP81KeySetProfileKeySetDescriptionType() {
        return new SCP81KeySetProfileKeySetDescriptionType();
    }

    /**
     * Create an instance of {@link CheckGlobalEligibilityResponseDataType }
     * 
     */
    public CheckGlobalEligibilityResponseDataType createCheckGlobalEligibilityResponseDataType() {
        return new CheckGlobalEligibilityResponseDataType();
    }

    /**
     * Create an instance of {@link MSIdAliasType }
     * 
     */
    public MSIdAliasType createMSIdAliasType() {
        return new MSIdAliasType();
    }

    /**
     * Create an instance of {@link BasicResponseType }
     * 
     */
    public BasicResponseType createBasicResponseType() {
        return new BasicResponseType();
    }

    /**
     * Create an instance of {@link BasicDiversifiedCreateFirstSSDKeysetCommandResponseType }
     * 
     */
    public BasicDiversifiedCreateFirstSSDKeysetCommandResponseType createBasicDiversifiedCreateFirstSSDKeysetCommandResponseType() {
        return new BasicDiversifiedCreateFirstSSDKeysetCommandResponseType();
    }

    /**
     * Create an instance of {@link UpgradeServiceResponseDataType }
     * 
     */
    public UpgradeServiceResponseDataType createUpgradeServiceResponseDataType() {
        return new UpgradeServiceResponseDataType();
    }

    /**
     * Create an instance of {@link ActivateServiceCommandResponseType }
     * 
     */
    public ActivateServiceCommandResponseType createActivateServiceCommandResponseType() {
        return new ActivateServiceCommandResponseType();
    }

    /**
     * Create an instance of {@link SimpleKeySetProfileKeySetDescriptionType }
     * 
     */
    public SimpleKeySetProfileKeySetDescriptionType createSimpleKeySetProfileKeySetDescriptionType() {
        return new SimpleKeySetProfileKeySetDescriptionType();
    }

    /**
     * Create an instance of {@link PersonalizeServiceCommandResponseType }
     * 
     */
    public PersonalizeServiceCommandResponseType createPersonalizeServiceCommandResponseType() {
        return new PersonalizeServiceCommandResponseType();
    }

    /**
     * Create an instance of {@link DeviceDeletionModeType }
     * 
     */
    public DeviceDeletionModeType createDeviceDeletionModeType() {
        return new DeviceDeletionModeType();
    }

    /**
     * Create an instance of {@link CCMCommandType }
     * 
     */
    public CCMCommandType createCCMCommandType() {
        return new CCMCommandType();
    }

    /**
     * Create an instance of {@link SetStatusCommandType }
     * 
     */
    public SetStatusCommandType createSetStatusCommandType() {
        return new SetStatusCommandType();
    }

    /**
     * Create an instance of {@link SEIdCardUniqueDataType }
     * 
     */
    public SEIdCardUniqueDataType createSEIdCardUniqueDataType() {
        return new SEIdCardUniqueDataType();
    }

    /**
     * Create an instance of {@link DeclareServiceInstanceReferenceResponseDataType }
     * 
     */
    public DeclareServiceInstanceReferenceResponseDataType createDeclareServiceInstanceReferenceResponseDataType() {
        return new DeclareServiceInstanceReferenceResponseDataType();
    }

    /**
     * Create an instance of {@link DeleteCommandType }
     * 
     */
    public DeleteCommandType createDeleteCommandType() {
        return new DeleteCommandType();
    }

    /**
     * Create an instance of {@link ServiceInstanceReferenceType }
     * 
     */
    public ServiceInstanceReferenceType createServiceInstanceReferenceType() {
        return new ServiceInstanceReferenceType();
    }

    /**
     * Create an instance of {@link DAPBlockType }
     * 
     */
    public DAPBlockType createDAPBlockType() {
        return new DAPBlockType();
    }

    /**
     * Create an instance of {@link ExchangeServiceDataStatusCodeDataType }
     * 
     */
    public ExchangeServiceDataStatusCodeDataType createExchangeServiceDataStatusCodeDataType() {
        return new ExchangeServiceDataStatusCodeDataType();
    }

    /**
     * Create an instance of {@link SEAppIdTARType }
     * 
     */
    public SEAppIdTARType createSEAppIdTARType() {
        return new SEAppIdTARType();
    }

    /**
     * Create an instance of {@link LookupServiceInstanceReferenceResponseDataType }
     * 
     */
    public LookupServiceInstanceReferenceResponseDataType createLookupServiceInstanceReferenceResponseDataType() {
        return new LookupServiceInstanceReferenceResponseDataType();
    }

    /**
     * Create an instance of {@link ExchangeServiceDataCommandType }
     * 
     */
    public ExchangeServiceDataCommandType createExchangeServiceDataCommandType() {
        return new ExchangeServiceDataCommandType();
    }

    /**
     * Create an instance of {@link PersonalizeServiceCommandType }
     * 
     */
    public PersonalizeServiceCommandType createPersonalizeServiceCommandType() {
        return new PersonalizeServiceCommandType();
    }

    /**
     * Create an instance of {@link MakeSelectableApplicationCommandType }
     * 
     */
    public MakeSelectableApplicationCommandType createMakeSelectableApplicationCommandType() {
        return new MakeSelectableApplicationCommandType();
    }

    /**
     * Create an instance of {@link InstallServiceCommandResponseType }
     * 
     */
    public InstallServiceCommandResponseType createInstallServiceCommandResponseType() {
        return new InstallServiceCommandResponseType();
    }

    /**
     * Create an instance of {@link SquareCorner }
     * 
     */
    public SquareCorner createSquareCorner() {
        return new SquareCorner();
    }

    /**
     * Create an instance of {@link BackgroundColor }
     * 
     */
    public BackgroundColor createBackgroundColor() {
        return new BackgroundColor();
    }

    /**
     * Create an instance of {@link RoundCorner }
     * 
     */
    public RoundCorner createRoundCorner() {
        return new RoundCorner();
    }

    /**
     * Create an instance of {@link XPositionType }
     * 
     */
    public XPositionType createXPositionType() {
        return new XPositionType();
    }

    /**
     * Create an instance of {@link RGB }
     * 
     */
    public RGB createRGB() {
        return new RGB();
    }

    /**
     * Create an instance of {@link CornerStyle }
     * 
     */
    public CornerStyle createCornerStyle() {
        return new CornerStyle();
    }

    /**
     * Create an instance of {@link Font }
     * 
     */
    public Font createFont() {
        return new Font();
    }

    /**
     * Create an instance of {@link Width }
     * 
     */
    public Width createWidth() {
        return new Width();
    }

    /**
     * Create an instance of {@link Size }
     * 
     */
    public Size createSize() {
        return new Size();
    }

    /**
     * Create an instance of {@link CornerRadius }
     * 
     */
    public CornerRadius createCornerRadius() {
        return new CornerRadius();
    }

    /**
     * Create an instance of {@link Border }
     * 
     */
    public Border createBorder() {
        return new Border();
    }

    /**
     * Create an instance of {@link Height }
     * 
     */
    public Height createHeight() {
        return new Height();
    }

    /**
     * Create an instance of {@link YPositionType }
     * 
     */
    public YPositionType createYPositionType() {
        return new YPositionType();
    }

    /**
     * Create an instance of {@link ForegroundColor }
     * 
     */
    public ForegroundColor createForegroundColor() {
        return new ForegroundColor();
    }

    /**
     * Create an instance of {@link PersoData }
     * 
     */
    public PersoData createPersoData() {
        return new PersoData();
    }

    /**
     * Create an instance of {@link KeyInfoType }
     * 
     */
    public KeyInfoType createKeyInfoType() {
        return new KeyInfoType();
    }

    /**
     * Create an instance of {@link SignedInfoType }
     * 
     */
    public SignedInfoType createSignedInfoType() {
        return new SignedInfoType();
    }

    /**
     * Create an instance of {@link RetrievalMethodType }
     * 
     */
    public RetrievalMethodType createRetrievalMethodType() {
        return new RetrievalMethodType();
    }

    /**
     * Create an instance of {@link DigestMethodType }
     * 
     */
    public DigestMethodType createDigestMethodType() {
        return new DigestMethodType();
    }

    /**
     * Create an instance of {@link SignatureMethodType }
     * 
     */
    public SignatureMethodType createSignatureMethodType() {
        return new SignatureMethodType();
    }

    /**
     * Create an instance of {@link SPKIDataType }
     * 
     */
    public SPKIDataType createSPKIDataType() {
        return new SPKIDataType();
    }

    /**
     * Create an instance of {@link X509DataType }
     * 
     */
    public X509DataType createX509DataType() {
        return new X509DataType();
    }

    /**
     * Create an instance of {@link PGPDataType }
     * 
     */
    public PGPDataType createPGPDataType() {
        return new PGPDataType();
    }

    /**
     * Create an instance of {@link DSAKeyValueType }
     * 
     */
    public DSAKeyValueType createDSAKeyValueType() {
        return new DSAKeyValueType();
    }

    /**
     * Create an instance of {@link ManifestType }
     * 
     */
    public ManifestType createManifestType() {
        return new ManifestType();
    }

    /**
     * Create an instance of {@link SignatureValueType }
     * 
     */
    public SignatureValueType createSignatureValueType() {
        return new SignatureValueType();
    }

    /**
     * Create an instance of {@link TransformsType }
     * 
     */
    public TransformsType createTransformsType() {
        return new TransformsType();
    }

    /**
     * Create an instance of {@link RSAKeyValueType }
     * 
     */
    public RSAKeyValueType createRSAKeyValueType() {
        return new RSAKeyValueType();
    }

    /**
     * Create an instance of {@link TransformType }
     * 
     */
    public TransformType createTransformType() {
        return new TransformType();
    }

    /**
     * Create an instance of {@link SignaturePropertyType }
     * 
     */
    public SignaturePropertyType createSignaturePropertyType() {
        return new SignaturePropertyType();
    }

    /**
     * Create an instance of {@link KeyValueType }
     * 
     */
    public KeyValueType createKeyValueType() {
        return new KeyValueType();
    }

    /**
     * Create an instance of {@link ReferenceType }
     * 
     */
    public ReferenceType createReferenceType() {
        return new ReferenceType();
    }

    /**
     * Create an instance of {@link CanonicalizationMethodType }
     * 
     */
    public CanonicalizationMethodType createCanonicalizationMethodType() {
        return new CanonicalizationMethodType();
    }

    /**
     * Create an instance of {@link SignaturePropertiesType }
     * 
     */
    public SignaturePropertiesType createSignaturePropertiesType() {
        return new SignaturePropertiesType();
    }

    /**
     * Create an instance of {@link ObjectType }
     * 
     */
    public ObjectType createObjectType() {
        return new ObjectType();
    }

    /**
     * Create an instance of {@link X509IssuerSerialType }
     * 
     */
    public X509IssuerSerialType createX509IssuerSerialType() {
        return new X509IssuerSerialType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "PGPKeyID", scope = PGPDataType.class)
    public JAXBElement<byte[]> createPGPDataTypePGPKeyID(byte[] value) {
        return new JAXBElement<byte[]>(_PGPDataTypePGPKeyID_QNAME, byte[].class, PGPDataType.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "PGPKeyPacket", scope = PGPDataType.class)
    public JAXBElement<byte[]> createPGPDataTypePGPKeyPacket(byte[] value) {
        return new JAXBElement<byte[]>(_PGPDataTypePGPKeyPacket_QNAME, byte[].class, PGPDataType.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PGPDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "PGPData")
    public JAXBElement<PGPDataType> createPGPData(PGPDataType value) {
        return new JAXBElement<PGPDataType>(_PGPData_QNAME, PGPDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EndConversationRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "EndConversationRequest")
    public JAXBElement<EndConversationRequestType> createEndConversationRequest(EndConversationRequestType value) {
        return new JAXBElement<EndConversationRequestType>(_EndConversationRequest_QNAME, EndConversationRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMobileSubscriptionAlternateIdentifierRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "GetMobileSubscriptionAlternateIdentifierRequest")
    public JAXBElement<GetMobileSubscriptionAlternateIdentifierRequestType> createGetMobileSubscriptionAlternateIdentifierRequest(GetMobileSubscriptionAlternateIdentifierRequestType value) {
        return new JAXBElement<GetMobileSubscriptionAlternateIdentifierRequestType>(_GetMobileSubscriptionAlternateIdentifierRequest_QNAME, GetMobileSubscriptionAlternateIdentifierRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-profiles/1.1.2", name = "value")
    public JAXBElement<BigDecimal> createValue(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Value_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSECapabilityProfileIdRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "GetSECapabilityProfileIdRequest")
    public JAXBElement<GetSECapabilityProfileIdRequestType> createGetSECapabilityProfileIdRequest(GetSECapabilityProfileIdRequestType value) {
        return new JAXBElement<GetSECapabilityProfileIdRequestType>(_GetSECapabilityProfileIdRequest_QNAME, GetSECapabilityProfileIdRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-profiles/1.1.2", name = "Side")
    public JAXBElement<String> createSide(String value) {
        return new JAXBElement<String>(_Side_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckMobileSubscriptionEligibilityResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "CheckMobileSubscriptionEligibilityResponse")
    public JAXBElement<CheckMobileSubscriptionEligibilityResponseType> createCheckMobileSubscriptionEligibilityResponse(CheckMobileSubscriptionEligibilityResponseType value) {
        return new JAXBElement<CheckMobileSubscriptionEligibilityResponseType>(_CheckMobileSubscriptionEligibilityResponse_QNAME, CheckMobileSubscriptionEligibilityResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-profiles/1.1.2", name = "CheckDigit")
    public JAXBElement<String> createCheckDigit(String value) {
        return new JAXBElement<String>(_CheckDigit_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SPKIDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "SPKIData")
    public JAXBElement<SPKIDataType> createSPKIData(SPKIDataType value) {
        return new JAXBElement<SPKIDataType>(_SPKIData_QNAME, SPKIDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerateDMTokenRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "GenerateDMTokenRequest")
    public JAXBElement<GenerateDMTokenRequestType> createGenerateDMTokenRequest(GenerateDMTokenRequestType value) {
        return new JAXBElement<GenerateDMTokenRequestType>(_GenerateDMTokenRequest_QNAME, GenerateDMTokenRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-profiles/1.1.2", name = "Blue")
    public JAXBElement<Short> createBlue(Short value) {
        return new JAXBElement<Short>(_Blue_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuspendOrResumeServiceResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "SuspendOrResumeServiceResponse")
    public JAXBElement<SuspendOrResumeServiceResponseType> createSuspendOrResumeServiceResponse(SuspendOrResumeServiceResponseType value) {
        return new JAXBElement<SuspendOrResumeServiceResponseType>(_SuspendOrResumeServiceResponse_QNAME, SuspendOrResumeServiceResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CanonicalizationMethodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "CanonicalizationMethod")
    public JAXBElement<CanonicalizationMethodType> createCanonicalizationMethod(CanonicalizationMethodType value) {
        return new JAXBElement<CanonicalizationMethodType>(_CanonicalizationMethod_QNAME, CanonicalizationMethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeclareServiceInstanceReferenceRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "DeclareServiceInstanceReferenceRequest")
    public JAXBElement<DeclareServiceInstanceReferenceRequestType> createDeclareServiceInstanceReferenceRequest(DeclareServiceInstanceReferenceRequestType value) {
        return new JAXBElement<DeclareServiceInstanceReferenceRequestType>(_DeclareServiceInstanceReferenceRequest_QNAME, DeclareServiceInstanceReferenceRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApplyInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gi-de.com/gd-extionsion-1.0.0", name = "ApplyInfo")
    public JAXBElement<ApplyInfoType> createApplyInfo(ApplyInfoType value) {
        return new JAXBElement<ApplyInfoType>(_ApplyInfo_QNAME, ApplyInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-profiles/1.1.2", name = "Style")
    public JAXBElement<String> createStyle(String value) {
        return new JAXBElement<String>(_Style_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HceCardInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gi-de.com/gd-extionsion-1.0.0", name = "HceCardInfo")
    public JAXBElement<HceCardInfoType> createHceCardInfo(HceCardInfoType value) {
        return new JAXBElement<HceCardInfoType>(_HceCardInfo_QNAME, HceCardInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCAInformationRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "AuditCAInformationRequest")
    public JAXBElement<GetCAInformationRequestType> createAuditCAInformationRequest(GetCAInformationRequestType value) {
        return new JAXBElement<GetCAInformationRequestType>(_AuditCAInformationRequest_QNAME, GetCAInformationRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HandleStartServiceStateChangeNotificationRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "HandleStartServiceStateChangeNotificationRequest")
    public JAXBElement<HandleStartServiceStateChangeNotificationRequestType> createHandleStartServiceStateChangeNotificationRequest(HandleStartServiceStateChangeNotificationRequestType value) {
        return new JAXBElement<HandleStartServiceStateChangeNotificationRequestType>(_HandleStartServiceStateChangeNotificationRequest_QNAME, HandleStartServiceStateChangeNotificationRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LookupServiceInstanceReferenceRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "LookupServiceInstanceReferenceRequest")
    public JAXBElement<LookupServiceInstanceReferenceRequestType> createLookupServiceInstanceReferenceRequest(LookupServiceInstanceReferenceRequestType value) {
        return new JAXBElement<LookupServiceInstanceReferenceRequestType>(_LookupServiceInstanceReferenceRequest_QNAME, LookupServiceInstanceReferenceRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransformsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "Transforms")
    public JAXBElement<TransformsType> createTransforms(TransformsType value) {
        return new JAXBElement<TransformsType>(_Transforms_QNAME, TransformsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManifestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "Manifest")
    public JAXBElement<ManifestType> createManifest(ManifestType value) {
        return new JAXBElement<ManifestType>(_Manifest_QNAME, ManifestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-profiles/1.1.2", name = "LineStyle")
    public JAXBElement<String> createLineStyle(String value) {
        return new JAXBElement<String>(_LineStyle_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BindDeviceApplicationToSEApplicationResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "BindDeviceApplicationToSEApplicationResponse")
    public JAXBElement<BindDeviceApplicationToSEApplicationResponseType> createBindDeviceApplicationToSEApplicationResponse(BindDeviceApplicationToSEApplicationResponseType value) {
        return new JAXBElement<BindDeviceApplicationToSEApplicationResponseType>(_BindDeviceApplicationToSEApplicationResponse_QNAME, BindDeviceApplicationToSEApplicationResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "ScriptFragment")
    public JAXBElement<String> createScriptFragment(String value) {
        return new JAXBElement<String>(_ScriptFragment_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadSCWSServicePortalRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "LoadSCWSServicePortalRequest")
    public JAXBElement<LoadSCWSServicePortalRequestType> createLoadSCWSServicePortalRequest(LoadSCWSServicePortalRequestType value) {
        return new JAXBElement<LoadSCWSServicePortalRequestType>(_LoadSCWSServicePortalRequest_QNAME, LoadSCWSServicePortalRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMobileSubscriptionSEIdentifiersResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "GetMobileSubscriptionSEIdentifiersResponse")
    public JAXBElement<GetMobileSubscriptionSEIdentifiersResponseType> createGetMobileSubscriptionSEIdentifiersResponse(GetMobileSubscriptionSEIdentifiersResponseType value) {
        return new JAXBElement<GetMobileSubscriptionSEIdentifiersResponseType>(_GetMobileSubscriptionSEIdentifiersResponse_QNAME, GetMobileSubscriptionSEIdentifiersResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-profiles/1.1.2", name = "Green")
    public JAXBElement<Short> createGreen(Short value) {
        return new JAXBElement<Short>(_Green_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignatureMethodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "SignatureMethod")
    public JAXBElement<SignatureMethodType> createSignatureMethod(SignatureMethodType value) {
        return new JAXBElement<SignatureMethodType>(_SignatureMethod_QNAME, SignatureMethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-profiles/1.1.2", name = "AnchorPosition")
    public JAXBElement<String> createAnchorPosition(String value) {
        return new JAXBElement<String>(_AnchorPosition_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeyInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "KeyInfo")
    public JAXBElement<KeyInfoType> createKeyInfo(KeyInfoType value) {
        return new JAXBElement<KeyInfoType>(_KeyInfo_QNAME, KeyInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-profiles/1.1.2", name = "WriteLevelStandard")
    public JAXBElement<String> createWriteLevelStandard(String value) {
        return new JAXBElement<String>(_WriteLevelStandard_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMobileSubscriptionSEIdentifiersRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "GetMobileSubscriptionSEIdentifiersRequest")
    public JAXBElement<GetMobileSubscriptionSEIdentifiersRequestType> createGetMobileSubscriptionSEIdentifiersRequest(GetMobileSubscriptionSEIdentifiersRequestType value) {
        return new JAXBElement<GetMobileSubscriptionSEIdentifiersRequestType>(_GetMobileSubscriptionSEIdentifiersRequest_QNAME, GetMobileSubscriptionSEIdentifiersRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HandleSERenewalNotificationRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "HandleSERenewalNotificationRequest")
    public JAXBElement<HandleSERenewalNotificationRequestType> createHandleSERenewalNotificationRequest(HandleSERenewalNotificationRequestType value) {
        return new JAXBElement<HandleSERenewalNotificationRequestType>(_HandleSERenewalNotificationRequest_QNAME, HandleSERenewalNotificationRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DigestMethodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "DigestMethod")
    public JAXBElement<DigestMethodType> createDigestMethod(DigestMethodType value) {
        return new JAXBElement<DigestMethodType>(_DigestMethod_QNAME, DigestMethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BeginConversationRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "BeginConversationRequest")
    public JAXBElement<BeginConversationRequestType> createBeginConversationRequest(BeginConversationRequestType value) {
        return new JAXBElement<BeginConversationRequestType>(_BeginConversationRequest_QNAME, BeginConversationRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSDFreeMemoryRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "GetSDFreeMemoryRequest")
    public JAXBElement<GetSDFreeMemoryRequestType> createGetSDFreeMemoryRequest(GetSDFreeMemoryRequestType value) {
        return new JAXBElement<GetSDFreeMemoryRequestType>(_GetSDFreeMemoryRequest_QNAME, GetSDFreeMemoryRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendScriptRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "SendScriptRequest")
    public JAXBElement<SendScriptRequestType> createSendScriptRequest(SendScriptRequestType value) {
        return new JAXBElement<SendScriptRequestType>(_SendScriptRequest_QNAME, SendScriptRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "MgmtData")
    public JAXBElement<String> createMgmtData(String value) {
        return new JAXBElement<String>(_MgmtData_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SECommandsGenerationAndRemoteExecutionResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "SECommandsGenerationAndRemoteExecutionResponse")
    public JAXBElement<SECommandsGenerationAndRemoteExecutionResponseType> createSECommandsGenerationAndRemoteExecutionResponse(SECommandsGenerationAndRemoteExecutionResponseType value) {
        return new JAXBElement<SECommandsGenerationAndRemoteExecutionResponseType>(_SECommandsGenerationAndRemoteExecutionResponse_QNAME, SECommandsGenerationAndRemoteExecutionResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-profiles/1.1.2", name = "DPI")
    public JAXBElement<Short> createDPI(Short value) {
        return new JAXBElement<Short>(_DPI_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "ProfileUniqueID")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    public JAXBElement<byte[]> createProfileUniqueID(byte[] value) {
        return new JAXBElement<byte[]>(_ProfileUniqueID_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServiceStateRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "GetServiceStateRequest")
    public JAXBElement<GetServiceStateRequestType> createGetServiceStateRequest(GetServiceStateRequestType value) {
        return new JAXBElement<GetServiceStateRequestType>(_GetServiceStateRequest_QNAME, GetServiceStateRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSDFreeMemoryResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "GetSDFreeMemoryResponse")
    public JAXBElement<GetSDFreeMemoryResponseType> createGetSDFreeMemoryResponse(GetSDFreeMemoryResponseType value) {
        return new JAXBElement<GetSDFreeMemoryResponseType>(_GetSDFreeMemoryResponse_QNAME, GetSDFreeMemoryResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckMobileSubscriptionEligibilityRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "CheckMobileSubscriptionEligibilityRequest")
    public JAXBElement<CheckMobileSubscriptionEligibilityRequestType> createCheckMobileSubscriptionEligibilityRequest(CheckMobileSubscriptionEligibilityRequestType value) {
        return new JAXBElement<CheckMobileSubscriptionEligibilityRequestType>(_CheckMobileSubscriptionEligibilityRequest_QNAME, CheckMobileSubscriptionEligibilityRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetApplicationOrELFStatusResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "GetApplicationOrELFStatusResponse")
    public JAXBElement<GetApplicationOrELFStatusResponseType> createGetApplicationOrELFStatusResponse(GetApplicationOrELFStatusResponseType value) {
        return new JAXBElement<GetApplicationOrELFStatusResponseType>(_GetApplicationOrELFStatusResponse_QNAME, GetApplicationOrELFStatusResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-profiles/1.1.2", name = "PersonalizationOrderConstraint")
    public JAXBElement<String> createPersonalizationOrderConstraint(String value) {
        return new JAXBElement<String>(_PersonalizationOrderConstraint_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpgradeServiceResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "UpgradeServiceResponse")
    public JAXBElement<UpgradeServiceResponseType> createUpgradeServiceResponse(UpgradeServiceResponseType value) {
        return new JAXBElement<UpgradeServiceResponseType>(_UpgradeServiceResponse_QNAME, UpgradeServiceResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServiceInstanceReferenceDescriptorRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "GetServiceInstanceReferenceDescriptorRequest")
    public JAXBElement<GetServiceInstanceReferenceDescriptorRequestType> createGetServiceInstanceReferenceDescriptorRequest(GetServiceInstanceReferenceDescriptorRequestType value) {
        return new JAXBElement<GetServiceInstanceReferenceDescriptorRequestType>(_GetServiceInstanceReferenceDescriptorRequest_QNAME, GetServiceInstanceReferenceDescriptorRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "MuteCardsNumber")
    public JAXBElement<Short> createMuteCardsNumber(Short value) {
        return new JAXBElement<Short>(_MuteCardsNumber_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LookupServiceInstanceReferenceResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "LookupServiceInstanceReferenceResponse")
    public JAXBElement<LookupServiceInstanceReferenceResponseType> createLookupServiceInstanceReferenceResponse(LookupServiceInstanceReferenceResponseType value) {
        return new JAXBElement<LookupServiceInstanceReferenceResponseType>(_LookupServiceInstanceReferenceResponse_QNAME, LookupServiceInstanceReferenceResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EndConversationResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "EndConversationResponse")
    public JAXBElement<EndConversationResponseType> createEndConversationResponse(EndConversationResponseType value) {
        return new JAXBElement<EndConversationResponseType>(_EndConversationResponse_QNAME, EndConversationResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServiceInstanceReferenceDescriptorResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "GetServiceInstanceReferenceDescriptorResponse")
    public JAXBElement<GetServiceInstanceReferenceDescriptorResponseType> createGetServiceInstanceReferenceDescriptorResponse(GetServiceInstanceReferenceDescriptorResponseType value) {
        return new JAXBElement<GetServiceInstanceReferenceDescriptorResponseType>(_GetServiceInstanceReferenceDescriptorResponse_QNAME, GetServiceInstanceReferenceDescriptorResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignedInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "SignedInfo")
    public JAXBElement<SignedInfoType> createSignedInfo(SignedInfoType value) {
        return new JAXBElement<SignedInfoType>(_SignedInfo_QNAME, SignedInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExchangeServiceDataRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "ExchangeServiceDataRequest")
    public JAXBElement<ExchangeServiceDataRequestType> createExchangeServiceDataRequest(ExchangeServiceDataRequestType value) {
        return new JAXBElement<ExchangeServiceDataRequestType>(_ExchangeServiceDataRequest_QNAME, ExchangeServiceDataRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObjectType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "Object")
    public JAXBElement<ObjectType> createObject(ObjectType value) {
        return new JAXBElement<ObjectType>(_Object_QNAME, ObjectType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeployServiceRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "DeployServiceRequest")
    public JAXBElement<DeployServiceRequestType> createDeployServiceRequest(DeployServiceRequestType value) {
        return new JAXBElement<DeployServiceRequestType>(_DeployServiceRequest_QNAME, DeployServiceRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-profiles/1.1.2", name = "CardDesignOrigin")
    public JAXBElement<String> createCardDesignOrigin(String value) {
        return new JAXBElement<String>(_CardDesignOrigin_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-profiles/1.1.2", name = "Material")
    public JAXBElement<String> createMaterial(String value) {
        return new JAXBElement<String>(_Material_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-profiles/1.1.2", name = "Type")
    public JAXBElement<String> createType(String value) {
        return new JAXBElement<String>(_Type_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "ValidCardProfileID")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    public JAXBElement<byte[]> createValidCardProfileID(byte[] value) {
        return new JAXBElement<byte[]>(_ValidCardProfileID_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnrollSSDOwnerCertificateRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "EnrollSSDOwnerCertificateRequest")
    public JAXBElement<EnrollSSDOwnerCertificateRequestType> createEnrollSSDOwnerCertificateRequest(EnrollSSDOwnerCertificateRequestType value) {
        return new JAXBElement<EnrollSSDOwnerCertificateRequestType>(_EnrollSSDOwnerCertificateRequest_QNAME, EnrollSSDOwnerCertificateRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "ExpectedDeliveryDate")
    public JAXBElement<Object> createExpectedDeliveryDate(Object value) {
        return new JAXBElement<Object>(_ExpectedDeliveryDate_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link X509DataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "X509Data")
    public JAXBElement<X509DataType> createX509Data(X509DataType value) {
        return new JAXBElement<X509DataType>(_X509Data_QNAME, X509DataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCAInformationResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "AuditCAInformationResponse")
    public JAXBElement<GetCAInformationResponseType> createAuditCAInformationResponse(GetCAInformationResponseType value) {
        return new JAXBElement<GetCAInformationResponseType>(_AuditCAInformationResponse_QNAME, GetCAInformationResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSEMobileSubscriptionIdentifierRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "GetSEMobileSubscriptionIdentifierRequest")
    public JAXBElement<GetSEMobileSubscriptionIdentifierRequestType> createGetSEMobileSubscriptionIdentifierRequest(GetSEMobileSubscriptionIdentifierRequestType value) {
        return new JAXBElement<GetSEMobileSubscriptionIdentifierRequestType>(_GetSEMobileSubscriptionIdentifierRequest_QNAME, GetSEMobileSubscriptionIdentifierRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "CardLifeCycleState")
    public JAXBElement<String> createCardLifeCycleState(String value) {
        return new JAXBElement<String>(_CardLifeCycleState_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HandleMobileSubscriptionStatusChangeNotificationRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "HandleMobileSubscriptionStatusChangeNotificationRequest")
    public JAXBElement<HandleMobileSubscriptionStatusChangeNotificationRequestType> createHandleMobileSubscriptionStatusChangeNotificationRequest(HandleMobileSubscriptionStatusChangeNotificationRequestType value) {
        return new JAXBElement<HandleMobileSubscriptionStatusChangeNotificationRequestType>(_HandleMobileSubscriptionStatusChangeNotificationRequest_QNAME, HandleMobileSubscriptionStatusChangeNotificationRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSECapabilityProfileIdResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "GetSECapabilityProfileIdResponse")
    public JAXBElement<GetSECapabilityProfileIdResponseType> createGetSECapabilityProfileIdResponse(GetSECapabilityProfileIdResponseType value) {
        return new JAXBElement<GetSECapabilityProfileIdResponseType>(_GetSECapabilityProfileIdResponse_QNAME, GetSECapabilityProfileIdResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadDeviceApplicationRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "LoadDeviceApplicationRequest")
    public JAXBElement<LoadDeviceApplicationRequestType> createLoadDeviceApplicationRequest(LoadDeviceApplicationRequestType value) {
        return new JAXBElement<LoadDeviceApplicationRequestType>(_LoadDeviceApplicationRequest_QNAME, LoadDeviceApplicationRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-profiles/1.1.2", name = "TrackTypeID")
    public JAXBElement<String> createTrackTypeID(String value) {
        return new JAXBElement<String>(_TrackTypeID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "DeliveryDate")
    public JAXBElement<Object> createDeliveryDate(Object value) {
        return new JAXBElement<Object>(_DeliveryDate_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeployServiceResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "DeployServiceResponse")
    public JAXBElement<DeployServiceResponseType> createDeployServiceResponse(DeployServiceResponseType value) {
        return new JAXBElement<DeployServiceResponseType>(_DeployServiceResponse_QNAME, DeployServiceResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCAInformationResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "GetCAInformationResponse")
    public JAXBElement<GetCAInformationResponseType> createGetCAInformationResponse(GetCAInformationResponseType value) {
        return new JAXBElement<GetCAInformationResponseType>(_GetCAInformationResponse_QNAME, GetCAInformationResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-profiles/1.1.2", name = "Name")
    public JAXBElement<String> createName(String value) {
        return new JAXBElement<String>(_Name_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendScriptResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "SendScriptResponse")
    public JAXBElement<SendScriptResponseType> createSendScriptResponse(SendScriptResponseType value) {
        return new JAXBElement<SendScriptResponseType>(_SendScriptResponse_QNAME, SendScriptResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SECommandsGenerationAndRemoteExecutionRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "SECommandsGenerationAndRemoteExecutionRequest")
    public JAXBElement<SECommandsGenerationAndRemoteExecutionRequestType> createSECommandsGenerationAndRemoteExecutionRequest(SECommandsGenerationAndRemoteExecutionRequestType value) {
        return new JAXBElement<SECommandsGenerationAndRemoteExecutionRequestType>(_SECommandsGenerationAndRemoteExecutionRequest_QNAME, SECommandsGenerationAndRemoteExecutionRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignaturePropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "SignatureProperties")
    public JAXBElement<SignaturePropertiesType> createSignatureProperties(SignaturePropertiesType value) {
        return new JAXBElement<SignaturePropertiesType>(_SignatureProperties_QNAME, SignaturePropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "KeyName")
    public JAXBElement<String> createKeyName(String value) {
        return new JAXBElement<String>(_KeyName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HandleSEMobileSubscriptionChangedNotificationRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "HandleSEMobileSubscriptionChangedNotificationRequest")
    public JAXBElement<HandleSEMobileSubscriptionChangedNotificationRequestType> createHandleSEMobileSubscriptionChangedNotificationRequest(HandleSEMobileSubscriptionChangedNotificationRequestType value) {
        return new JAXBElement<HandleSEMobileSubscriptionChangedNotificationRequestType>(_HandleSEMobileSubscriptionChangedNotificationRequest_QNAME, HandleSEMobileSubscriptionChangedNotificationRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-profiles/1.1.2", name = "Description")
    public JAXBElement<String> createDescription(String value) {
        return new JAXBElement<String>(_Description_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-profiles/1.1.2", name = "Red")
    public JAXBElement<Short> createRed(Short value) {
        return new JAXBElement<Short>(_Red_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-profiles/1.1.2", name = "Topping")
    public JAXBElement<String> createTopping(String value) {
        return new JAXBElement<String>(_Topping_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeclareServiceInstanceReferenceResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "DeclareServiceInstanceReferenceResponse")
    public JAXBElement<DeclareServiceInstanceReferenceResponseType> createDeclareServiceInstanceReferenceResponse(DeclareServiceInstanceReferenceResponseType value) {
        return new JAXBElement<DeclareServiceInstanceReferenceResponseType>(_DeclareServiceInstanceReferenceResponse_QNAME, DeclareServiceInstanceReferenceResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminateServiceResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "TerminateServiceResponse")
    public JAXBElement<TerminateServiceResponseType> createTerminateServiceResponse(TerminateServiceResponseType value) {
        return new JAXBElement<TerminateServiceResponseType>(_TerminateServiceResponse_QNAME, TerminateServiceResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCAInformationRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "GetCAInformationRequest")
    public JAXBElement<GetCAInformationRequestType> createGetCAInformationRequest(GetCAInformationRequestType value) {
        return new JAXBElement<GetCAInformationRequestType>(_GetCAInformationRequest_QNAME, GetCAInformationRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerifyDMReceiptResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "VerifyDMReceiptResponse")
    public JAXBElement<VerifyDMReceiptResponseType> createVerifyDMReceiptResponse(VerifyDMReceiptResponseType value) {
        return new JAXBElement<VerifyDMReceiptResponseType>(_VerifyDMReceiptResponse_QNAME, VerifyDMReceiptResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteSCWSServicePortalRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "DeleteSCWSServicePortalRequest")
    public JAXBElement<DeleteSCWSServicePortalRequestType> createDeleteSCWSServicePortalRequest(DeleteSCWSServicePortalRequestType value) {
        return new JAXBElement<DeleteSCWSServicePortalRequestType>(_DeleteSCWSServicePortalRequest_QNAME, DeleteSCWSServicePortalRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminateServiceRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "TerminateServiceRequest")
    public JAXBElement<TerminateServiceRequestType> createTerminateServiceRequest(TerminateServiceRequestType value) {
        return new JAXBElement<TerminateServiceRequestType>(_TerminateServiceRequest_QNAME, TerminateServiceRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrievalMethodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "RetrievalMethod")
    public JAXBElement<RetrievalMethodType> createRetrievalMethod(RetrievalMethodType value) {
        return new JAXBElement<RetrievalMethodType>(_RetrievalMethod_QNAME, RetrievalMethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-profiles/1.1.2", name = "CardDesignOrientation")
    public JAXBElement<String> createCardDesignOrientation(String value) {
        return new JAXBElement<String>(_CardDesignOrientation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "eMail")
    public JAXBElement<Object> createEMail(Object value) {
        return new JAXBElement<Object>(_EMail_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnbindDeviceApplicationToSEApplicationResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "UnbindDeviceApplicationToSEApplicationResponse")
    public JAXBElement<UnbindDeviceApplicationToSEApplicationResponseType> createUnbindDeviceApplicationToSEApplicationResponse(UnbindDeviceApplicationToSEApplicationResponseType value) {
        return new JAXBElement<UnbindDeviceApplicationToSEApplicationResponseType>(_UnbindDeviceApplicationToSEApplicationResponse_QNAME, UnbindDeviceApplicationToSEApplicationResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "URL")
    public JAXBElement<Object> createURL(Object value) {
        return new JAXBElement<Object>(_URL_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignaturePropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "SignatureProperty")
    public JAXBElement<SignaturePropertyType> createSignatureProperty(SignaturePropertyType value) {
        return new JAXBElement<SignaturePropertyType>(_SignatureProperty_QNAME, SignaturePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-profiles/1.1.2", name = "ConfigurationID")
    public JAXBElement<String> createConfigurationID(String value) {
        return new JAXBElement<String>(_ConfigurationID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadSCWSServicePortalResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "LoadSCWSServicePortalResponse")
    public JAXBElement<LoadSCWSServicePortalResponseType> createLoadSCWSServicePortalResponse(LoadSCWSServicePortalResponseType value) {
        return new JAXBElement<LoadSCWSServicePortalResponseType>(_LoadSCWSServicePortalResponse_QNAME, LoadSCWSServicePortalResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HandleSEDeviceStatusChangeNotificationRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "HandleSEDeviceStatusChangeNotificationRequest")
    public JAXBElement<HandleSEDeviceStatusChangeNotificationRequestType> createHandleSEDeviceStatusChangeNotificationRequest(HandleSEDeviceStatusChangeNotificationRequestType value) {
        return new JAXBElement<HandleSEDeviceStatusChangeNotificationRequestType>(_HandleSEDeviceStatusChangeNotificationRequest_QNAME, HandleSEDeviceStatusChangeNotificationRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "FaxNumber")
    public JAXBElement<Object> createFaxNumber(Object value) {
        return new JAXBElement<Object>(_FaxNumber_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuspendOrResumeServiceRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "SuspendOrResumeServiceRequest")
    public JAXBElement<SuspendOrResumeServiceRequestType> createSuspendOrResumeServiceRequest(SuspendOrResumeServiceRequestType value) {
        return new JAXBElement<SuspendOrResumeServiceRequestType>(_SuspendOrResumeServiceRequest_QNAME, SuspendOrResumeServiceRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerifyDMReceiptRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "VerifyDMReceiptRequest")
    public JAXBElement<VerifyDMReceiptRequestType> createVerifyDMReceiptRequest(VerifyDMReceiptRequestType value) {
        return new JAXBElement<VerifyDMReceiptRequestType>(_VerifyDMReceiptRequest_QNAME, VerifyDMReceiptRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HandleServiceEnvironmentChangeNotificationRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "HandleServiceEnvironmentChangeNotificationRequest")
    public JAXBElement<HandleServiceEnvironmentChangeNotificationRequestType> createHandleServiceEnvironmentChangeNotificationRequest(HandleServiceEnvironmentChangeNotificationRequestType value) {
        return new JAXBElement<HandleServiceEnvironmentChangeNotificationRequestType>(_HandleServiceEnvironmentChangeNotificationRequest_QNAME, HandleServiceEnvironmentChangeNotificationRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HandleActionDoneOnDeviceApplicationNotificationRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "HandleActionDoneOnDeviceApplicationNotificationRequest")
    public JAXBElement<HandleActionDoneOnDeviceApplicationNotificationRequestType> createHandleActionDoneOnDeviceApplicationNotificationRequest(HandleActionDoneOnDeviceApplicationNotificationRequestType value) {
        return new JAXBElement<HandleActionDoneOnDeviceApplicationNotificationRequestType>(_HandleActionDoneOnDeviceApplicationNotificationRequest_QNAME, HandleActionDoneOnDeviceApplicationNotificationRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HandleSEDeviceChangedNotificationRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "HandleSEDeviceChangedNotificationRequest")
    public JAXBElement<HandleSEDeviceChangedNotificationRequestType> createHandleSEDeviceChangedNotificationRequest(HandleSEDeviceChangedNotificationRequestType value) {
        return new JAXBElement<HandleSEDeviceChangedNotificationRequestType>(_HandleSEDeviceChangedNotificationRequest_QNAME, HandleSEDeviceChangedNotificationRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HandleEndServiceStateChangeNotificationRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "HandleEndServiceStateChangeNotificationRequest")
    public JAXBElement<HandleEndServiceStateChangeNotificationRequestType> createHandleEndServiceStateChangeNotificationRequest(HandleEndServiceStateChangeNotificationRequestType value) {
        return new JAXBElement<HandleEndServiceStateChangeNotificationRequestType>(_HandleEndServiceStateChangeNotificationRequest_QNAME, HandleEndServiceStateChangeNotificationRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteSCWSServicePortalResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "DeleteSCWSServicePortalResponse")
    public JAXBElement<DeleteSCWSServicePortalResponseType> createDeleteSCWSServicePortalResponse(DeleteSCWSServicePortalResponseType value) {
        return new JAXBElement<DeleteSCWSServicePortalResponseType>(_DeleteSCWSServicePortalResponse_QNAME, DeleteSCWSServicePortalResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExchangeServiceDataResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "ExchangeServiceDataResponse")
    public JAXBElement<ExchangeServiceDataResponseType> createExchangeServiceDataResponse(ExchangeServiceDataResponseType value) {
        return new JAXBElement<ExchangeServiceDataResponseType>(_ExchangeServiceDataResponse_QNAME, ExchangeServiceDataResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-profiles/1.1.2", name = "HumanReadableText")
    public JAXBElement<Boolean> createHumanReadableText(Boolean value) {
        return new JAXBElement<Boolean>(_HumanReadableText_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HandleMobileSubscriptionIdentifierChangedNotificationRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "HandleMobileSubscriptionIdentifierChangedNotificationRequest")
    public JAXBElement<HandleMobileSubscriptionIdentifierChangedNotificationRequestType> createHandleMobileSubscriptionIdentifierChangedNotificationRequest(HandleMobileSubscriptionIdentifierChangedNotificationRequestType value) {
        return new JAXBElement<HandleMobileSubscriptionIdentifierChangedNotificationRequestType>(_HandleMobileSubscriptionIdentifierChangedNotificationRequest_QNAME, HandleMobileSubscriptionIdentifierChangedNotificationRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "Reference")
    public JAXBElement<ReferenceType> createReference(ReferenceType value) {
        return new JAXBElement<ReferenceType>(_Reference_QNAME, ReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDeviceApplicationRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "DeleteDeviceApplicationRequest")
    public JAXBElement<DeleteDeviceApplicationRequestType> createDeleteDeviceApplicationRequest(DeleteDeviceApplicationRequestType value) {
        return new JAXBElement<DeleteDeviceApplicationRequestType>(_DeleteDeviceApplicationRequest_QNAME, DeleteDeviceApplicationRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RSAKeyValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "RSAKeyValue")
    public JAXBElement<RSAKeyValueType> createRSAKeyValue(RSAKeyValueType value) {
        return new JAXBElement<RSAKeyValueType>(_RSAKeyValue_QNAME, RSAKeyValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetApplicationOrELFStatusRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "GetApplicationOrELFStatusRequest")
    public JAXBElement<GetApplicationOrELFStatusRequestType> createGetApplicationOrELFStatusRequest(GetApplicationOrELFStatusRequestType value) {
        return new JAXBElement<GetApplicationOrELFStatusRequestType>(_GetApplicationOrELFStatusRequest_QNAME, GetApplicationOrELFStatusRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadDeviceApplicationResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "LoadDeviceApplicationResponse")
    public JAXBElement<LoadDeviceApplicationResponseType> createLoadDeviceApplicationResponse(LoadDeviceApplicationResponseType value) {
        return new JAXBElement<LoadDeviceApplicationResponseType>(_LoadDeviceApplicationResponse_QNAME, LoadDeviceApplicationResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignatureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "Signature")
    public JAXBElement<SignatureType> createSignature(SignatureType value) {
        return new JAXBElement<SignatureType>(_Signature_QNAME, SignatureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DSAKeyValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "DSAKeyValue")
    public JAXBElement<DSAKeyValueType> createDSAKeyValue(DSAKeyValueType value) {
        return new JAXBElement<DSAKeyValueType>(_DSAKeyValue_QNAME, DSAKeyValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerateDMTokenResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "GenerateDMTokenResponse")
    public JAXBElement<GenerateDMTokenResponseType> createGenerateDMTokenResponse(GenerateDMTokenResponseType value) {
        return new JAXBElement<GenerateDMTokenResponseType>(_GenerateDMTokenResponse_QNAME, GenerateDMTokenResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-profiles/1.1.2", name = "Underline")
    public JAXBElement<String> createUnderline(String value) {
        return new JAXBElement<String>(_Underline_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckGlobalEligibilityResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "CheckGlobalEligibilityResponse")
    public JAXBElement<CheckGlobalEligibilityResponseType> createCheckGlobalEligibilityResponse(CheckGlobalEligibilityResponseType value) {
        return new JAXBElement<CheckGlobalEligibilityResponseType>(_CheckGlobalEligibilityResponse_QNAME, CheckGlobalEligibilityResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-profiles/1.1.2", name = "HumanReadableStartDigit")
    public JAXBElement<Boolean> createHumanReadableStartDigit(Boolean value) {
        return new JAXBElement<Boolean>(_HumanReadableStartDigit_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMobileSubscriptionAlternateIdentifierResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "GetMobileSubscriptionAlternateIdentifierResponse")
    public JAXBElement<GetMobileSubscriptionAlternateIdentifierResponseType> createGetMobileSubscriptionAlternateIdentifierResponse(GetMobileSubscriptionAlternateIdentifierResponseType value) {
        return new JAXBElement<GetMobileSubscriptionAlternateIdentifierResponseType>(_GetMobileSubscriptionAlternateIdentifierResponse_QNAME, GetMobileSubscriptionAlternateIdentifierResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-profiles/1.1.2", name = "Unit")
    public JAXBElement<String> createUnit(String value) {
        return new JAXBElement<String>(_Unit_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSEMobileSubscriptionIdentifierResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "GetSEMobileSubscriptionIdentifierResponse")
    public JAXBElement<GetSEMobileSubscriptionIdentifierResponseType> createGetSEMobileSubscriptionIdentifierResponse(GetSEMobileSubscriptionIdentifierResponseType value) {
        return new JAXBElement<GetSEMobileSubscriptionIdentifierResponseType>(_GetSEMobileSubscriptionIdentifierResponse_QNAME, GetSEMobileSubscriptionIdentifierResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDeviceCapabilityProfileIdResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "GetDeviceCapabilityProfileIdResponse")
    public JAXBElement<GetDeviceCapabilityProfileIdResponseType> createGetDeviceCapabilityProfileIdResponse(GetDeviceCapabilityProfileIdResponseType value) {
        return new JAXBElement<GetDeviceCapabilityProfileIdResponseType>(_GetDeviceCapabilityProfileIdResponse_QNAME, GetDeviceCapabilityProfileIdResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BindDeviceApplicationToSEApplicationRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "BindDeviceApplicationToSEApplicationRequest")
    public JAXBElement<BindDeviceApplicationToSEApplicationRequestType> createBindDeviceApplicationToSEApplicationRequest(BindDeviceApplicationToSEApplicationRequestType value) {
        return new JAXBElement<BindDeviceApplicationToSEApplicationRequestType>(_BindDeviceApplicationToSEApplicationRequest_QNAME, BindDeviceApplicationToSEApplicationRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActivationInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gi-de.com/gd-extionsion-1.0.0", name = "ActivationInfo")
    public JAXBElement<ActivationInfoType> createActivationInfo(ActivationInfoType value) {
        return new JAXBElement<ActivationInfoType>(_ActivationInfo_QNAME, ActivationInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignatureValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "SignatureValue")
    public JAXBElement<SignatureValueType> createSignatureValue(SignatureValueType value) {
        return new JAXBElement<SignatureValueType>(_SignatureValue_QNAME, SignatureValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpgradeServiceRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "UpgradeServiceRequest")
    public JAXBElement<UpgradeServiceRequestType> createUpgradeServiceRequest(UpgradeServiceRequestType value) {
        return new JAXBElement<UpgradeServiceRequestType>(_UpgradeServiceRequest_QNAME, UpgradeServiceRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnbindDeviceApplicationToSEApplicationRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "UnbindDeviceApplicationToSEApplicationRequest")
    public JAXBElement<UnbindDeviceApplicationToSEApplicationRequestType> createUnbindDeviceApplicationToSEApplicationRequest(UnbindDeviceApplicationToSEApplicationRequestType value) {
        return new JAXBElement<UnbindDeviceApplicationToSEApplicationRequestType>(_UnbindDeviceApplicationToSEApplicationRequest_QNAME, UnbindDeviceApplicationToSEApplicationRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDeviceApplicationResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "DeleteDeviceApplicationResponse")
    public JAXBElement<DeleteDeviceApplicationResponseType> createDeleteDeviceApplicationResponse(DeleteDeviceApplicationResponseType value) {
        return new JAXBElement<DeleteDeviceApplicationResponseType>(_DeleteDeviceApplicationResponse_QNAME, DeleteDeviceApplicationResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransformType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "Transform")
    public JAXBElement<TransformType> createTransform(TransformType value) {
        return new JAXBElement<TransformType>(_Transform_QNAME, TransformType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-profiles/1.1.2", name = "HumanReadableCheckDigit")
    public JAXBElement<Boolean> createHumanReadableCheckDigit(Boolean value) {
        return new JAXBElement<Boolean>(_HumanReadableCheckDigit_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "PhoneNumber")
    public JAXBElement<Object> createPhoneNumber(Object value) {
        return new JAXBElement<Object>(_PhoneNumber_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-profiles/1.1.2", name = "CardStockID")
    public JAXBElement<String> createCardStockID(String value) {
        return new JAXBElement<String>(_CardStockID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApplyResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gi-de.com/gd-extionsion-1.0.0", name = "ApplyResponse")
    public JAXBElement<ApplyResponseType> createApplyResponse(ApplyResponseType value) {
        return new JAXBElement<ApplyResponseType>(_ApplyResponse_QNAME, ApplyResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gi-de.com/gd-extionsion-1.0.0", name = "EntityInfo")
    public JAXBElement<EntityInfoType> createEntityInfo(EntityInfoType value) {
        return new JAXBElement<EntityInfoType>(_EntityInfo_QNAME, EntityInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "ApplicationProfileUniqueID")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    public JAXBElement<byte[]> createApplicationProfileUniqueID(byte[] value) {
        return new JAXBElement<byte[]>(_ApplicationProfileUniqueID_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "DigestValue")
    public JAXBElement<byte[]> createDigestValue(byte[] value) {
        return new JAXBElement<byte[]>(_DigestValue_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-profiles/1.1.2", name = "ZPosition")
    public JAXBElement<Byte> createZPosition(Byte value) {
        return new JAXBElement<Byte>(_ZPosition_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BeginConversationResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "BeginConversationResponse")
    public JAXBElement<BeginConversationResponseType> createBeginConversationResponse(BeginConversationResponseType value) {
        return new JAXBElement<BeginConversationResponseType>(_BeginConversationResponse_QNAME, BeginConversationResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServiceStateResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "GetServiceStateResponse")
    public JAXBElement<GetServiceStateResponseType> createGetServiceStateResponse(GetServiceStateResponseType value) {
        return new JAXBElement<GetServiceStateResponseType>(_GetServiceStateResponse_QNAME, GetServiceStateResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-profiles/1.1.2", name = "MaterialID")
    public JAXBElement<String> createMaterialID(String value) {
        return new JAXBElement<String>(_MaterialID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeyValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "KeyValue")
    public JAXBElement<KeyValueType> createKeyValue(KeyValueType value) {
        return new JAXBElement<KeyValueType>(_KeyValue_QNAME, KeyValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDeviceCapabilityProfileIdRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "GetDeviceCapabilityProfileIdRequest")
    public JAXBElement<GetDeviceCapabilityProfileIdRequestType> createGetDeviceCapabilityProfileIdRequest(GetDeviceCapabilityProfileIdRequestType value) {
        return new JAXBElement<GetDeviceCapabilityProfileIdRequestType>(_GetDeviceCapabilityProfileIdRequest_QNAME, GetDeviceCapabilityProfileIdRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HandleSEStatusChangeNotificationRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "HandleSEStatusChangeNotificationRequest")
    public JAXBElement<HandleSEStatusChangeNotificationRequestType> createHandleSEStatusChangeNotificationRequest(HandleSEStatusChangeNotificationRequestType value) {
        return new JAXBElement<HandleSEStatusChangeNotificationRequestType>(_HandleSEStatusChangeNotificationRequest_QNAME, HandleSEStatusChangeNotificationRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckGlobalEligibilityRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "CheckGlobalEligibilityRequest")
    public JAXBElement<CheckGlobalEligibilityRequestType> createCheckGlobalEligibilityRequest(CheckGlobalEligibilityRequestType value) {
        return new JAXBElement<CheckGlobalEligibilityRequestType>(_CheckGlobalEligibilityRequest_QNAME, CheckGlobalEligibilityRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PanUpdateInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gi-de.com/gd-extionsion-1.0.0", name = "PanUpdateInfo")
    public JAXBElement<PanUpdateInfoType> createPanUpdateInfo(PanUpdateInfoType value) {
        return new JAXBElement<PanUpdateInfoType>(_PanUpdateInfo_QNAME, PanUpdateInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HandleActionDoneOnServiceNotificationRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "HandleActionDoneOnServiceNotificationRequest")
    public JAXBElement<HandleActionDoneOnServiceNotificationRequestType> createHandleActionDoneOnServiceNotificationRequest(HandleActionDoneOnServiceNotificationRequestType value) {
        return new JAXBElement<HandleActionDoneOnServiceNotificationRequestType>(_HandleActionDoneOnServiceNotificationRequest_QNAME, HandleActionDoneOnServiceNotificationRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-profiles/1.1.2", name = "QuietZone")
    public JAXBElement<String> createQuietZone(String value) {
        return new JAXBElement<String>(_QuietZone_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnrollSSDOwnerCertificateResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", name = "EnrollSSDOwnerCertificateResponse")
    public JAXBElement<EnrollSSDOwnerCertificateResponseType> createEnrollSSDOwnerCertificateResponse(EnrollSSDOwnerCertificateResponseType value) {
        return new JAXBElement<EnrollSSDOwnerCertificateResponseType>(_EnrollSSDOwnerCertificateResponse_QNAME, EnrollSSDOwnerCertificateResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-profiles/1.1.2", name = "Script")
    public JAXBElement<Object> createScript(Object value) {
        return new JAXBElement<Object>(_Script_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "HMACOutputLength", scope = SignatureMethodType.class)
    public JAXBElement<BigInteger> createSignatureMethodTypeHMACOutputLength(BigInteger value) {
        return new JAXBElement<BigInteger>(_SignatureMethodTypeHMACOutputLength_QNAME, BigInteger.class, SignatureMethodType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "XPath", scope = TransformType.class)
    public JAXBElement<String> createTransformTypeXPath(String value) {
        return new JAXBElement<String>(_TransformTypeXPath_QNAME, String.class, TransformType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link X509IssuerSerialType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "X509IssuerSerial", scope = X509DataType.class)
    public JAXBElement<X509IssuerSerialType> createX509DataTypeX509IssuerSerial(X509IssuerSerialType value) {
        return new JAXBElement<X509IssuerSerialType>(_X509DataTypeX509IssuerSerial_QNAME, X509IssuerSerialType.class, X509DataType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "X509Certificate", scope = X509DataType.class)
    public JAXBElement<byte[]> createX509DataTypeX509Certificate(byte[] value) {
        return new JAXBElement<byte[]>(_X509DataTypeX509Certificate_QNAME, byte[].class, X509DataType.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "X509SKI", scope = X509DataType.class)
    public JAXBElement<byte[]> createX509DataTypeX509SKI(byte[] value) {
        return new JAXBElement<byte[]>(_X509DataTypeX509SKI_QNAME, byte[].class, X509DataType.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "X509SubjectName", scope = X509DataType.class)
    public JAXBElement<String> createX509DataTypeX509SubjectName(String value) {
        return new JAXBElement<String>(_X509DataTypeX509SubjectName_QNAME, String.class, X509DataType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "X509CRL", scope = X509DataType.class)
    public JAXBElement<byte[]> createX509DataTypeX509CRL(byte[] value) {
        return new JAXBElement<byte[]>(_X509DataTypeX509CRL_QNAME, byte[].class, X509DataType.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Size }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-profiles/1.1.2", name = "Size", scope = Font.class)
    public JAXBElement<Size> createFontSize(Size value) {
        return new JAXBElement<Size>(_FontSize_QNAME, Size.class, Font.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForegroundColor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespaces.globalplatform.org/systems-profiles/1.1.2", name = "ForegroundColor", scope = Font.class)
    public JAXBElement<ForegroundColor> createFontForegroundColor(ForegroundColor value) {
        return new JAXBElement<ForegroundColor>(_FontForegroundColor_QNAME, ForegroundColor.class, Font.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "SPKISexp", scope = SPKIDataType.class)
    public JAXBElement<byte[]> createSPKIDataTypeSPKISexp(byte[] value) {
        return new JAXBElement<byte[]>(_SPKIDataTypeSPKISexp_QNAME, byte[].class, SPKIDataType.class, ((byte[]) value));
    }

}
