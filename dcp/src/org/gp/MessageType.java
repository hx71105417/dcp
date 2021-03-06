
package org.gp;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for messageType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="messageType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AP"/>
 *     &lt;enumeration value="CP"/>
 *     &lt;enumeration value="CP_CHANGES"/>
 *     &lt;enumeration value="KP"/>
 *     &lt;enumeration value="KEY_EXCHANGE"/>
 *     &lt;enumeration value="LFP"/>
 *     &lt;enumeration value="PROFILE_REQUEST"/>
 *     &lt;enumeration value="BATCH_CARD_CUSTOMIZATION"/>
 *     &lt;enumeration value="CARD_CUSTOMIZATION"/>
 *     &lt;enumeration value="DATA_PREPARATION_REQUEST"/>
 *     &lt;enumeration value="APP_DATA_NOTIFICATION"/>
 *     &lt;enumeration value="BATCH_AUDIT_TRAIL"/>
 *     &lt;enumeration value="CARD_AUDIT_TRAIL"/>
 *     &lt;enumeration value="APPLICATION_AUDIT_TRAIL"/>
 *     &lt;enumeration value="ERROR"/>
 *     &lt;enumeration value="MIXED"/>
 *     &lt;enumeration value="CheckGlobalEligibilityRequest"/>
 *     &lt;enumeration value="CheckGlobalEligibilityResponse"/>
 *     &lt;enumeration value="GetDeviceCapabilityProfileIdRequest"/>
 *     &lt;enumeration value="GetDeviceCapabilityProfileIdResponse"/>
 *     &lt;enumeration value="GetSECapabilityProfileIdRequest"/>
 *     &lt;enumeration value="GetSECapabilityProfileIdResponse"/>
 *     &lt;enumeration value="CheckMobileSubscriptionEligibilityRequest"/>
 *     &lt;enumeration value="CheckMobileSubscriptionEligibilityResponse"/>
 *     &lt;enumeration value="HandleStartServiceStateChangeNotificationRequest"/>
 *     &lt;enumeration value="HandleEndServiceStateChangeNotificationRequest"/>
 *     &lt;enumeration value="GetMobileSubscriptionAlternateIdentifierRequest"/>
 *     &lt;enumeration value="GetMobileSubscriptionAlternateIdentifierResponse"/>
 *     &lt;enumeration value="GetSEMobileSubscriptionIdentifierRequest"/>
 *     &lt;enumeration value="GetSEMobileSubscriptionIdentifierResponse"/>
 *     &lt;enumeration value="GetMobileSubscriptionSEIdentifiersRequest"/>
 *     &lt;enumeration value="GetMobileSubscriptionSEIdentifiersResponse"/>
 *     &lt;enumeration value="HandleMobileSubscriptionIdentifierChangedNotificationRequest"/>
 *     &lt;enumeration value="HandleMobileSubscriptionStatusChangeNotificationRequest"/>
 *     &lt;enumeration value="HandleSERenewalNotificationRequest"/>
 *     &lt;enumeration value="HandleSEDeviceChangedNotificationRequest"/>
 *     &lt;enumeration value="HandleSEDeviceStatusChangeNotificationRequest"/>
 *     &lt;enumeration value="HandleSEMobileSubscriptionChangedNotificationRequest"/>
 *     &lt;enumeration value="HandleSEStatusChangeNotificationRequest"/>
 *     &lt;enumeration value="EnrollSSDOwnerCertificateRequest"/>
 *     &lt;enumeration value="EnrollSSDOwnerCertificateResponse"/>
 *     &lt;enumeration value="LookupServiceInstanceReferenceRequest"/>
 *     &lt;enumeration value="LookupServiceInstanceReferenceResponse"/>
 *     &lt;enumeration value="DeclareServiceInstanceReferenceRequest"/>
 *     &lt;enumeration value="DeclareServiceInstanceReferenceResponse"/>
 *     &lt;enumeration value="GetServiceInstanceReferenceDescriptorRequest"/>
 *     &lt;enumeration value="GetServiceInstanceReferenceDescriptorResponse"/>
 *     &lt;enumeration value="GetServiceStateRequest"/>
 *     &lt;enumeration value="GetServiceStateResponse"/>
 *     &lt;enumeration value="DeployServiceRequest"/>
 *     &lt;enumeration value="DeployServiceResponse"/>
 *     &lt;enumeration value="UpgradeServiceRequest"/>
 *     &lt;enumeration value="UpgradeServiceResponse"/>
 *     &lt;enumeration value="ExchangeServiceDataRequest"/>
 *     &lt;enumeration value="ExchangeServiceDataResponse"/>
 *     &lt;enumeration value="SuspendOrResumeServiceRequest"/>
 *     &lt;enumeration value="SuspendOrResumeServiceResponse"/>
 *     &lt;enumeration value="TerminateServiceRequest"/>
 *     &lt;enumeration value="TerminateServiceResponse"/>
 *     &lt;enumeration value="HandleServiceEnvironmentChangeNotificationRequest"/>
 *     &lt;enumeration value="HandleActionDoneOnServiceNotificationRequest"/>
 *     &lt;enumeration value="GetCAInformationRequest"/>
 *     &lt;enumeration value="GetCAInformationResponse"/>
 *     &lt;enumeration value="SECommandsGenerationAndRemoteExecutionRequest"/>
 *     &lt;enumeration value="SECommandsGenerationAndRemoteExecutionResponse"/>
 *     &lt;enumeration value="GenerateDMTokenRequest"/>
 *     &lt;enumeration value="GenerateDMTokenResponse"/>
 *     &lt;enumeration value="VerifyDMReceiptRequest"/>
 *     &lt;enumeration value="VerifyDMReceiptResponse"/>
 *     &lt;enumeration value="BeginConversationRequest"/>
 *     &lt;enumeration value="BeginConversationResponse"/>
 *     &lt;enumeration value="SendScriptRequest"/>
 *     &lt;enumeration value="SendScriptResponse"/>
 *     &lt;enumeration value="EndConversationRequest"/>
 *     &lt;enumeration value="EndConversationResponse"/>
 *     &lt;enumeration value="GetApplicationOrELFStatusRequest"/>
 *     &lt;enumeration value="GetApplicationOrELFStatusResponse"/>
 *     &lt;enumeration value="GetSDFreeMemoryRequest"/>
 *     &lt;enumeration value="GetSDFreeMemoryResponse"/>
 *     &lt;enumeration value="LoadSCWSServicePortalRequest"/>
 *     &lt;enumeration value="LoadSCWSServicePortalResponse"/>
 *     &lt;enumeration value="DeleteSCWSServicePortalRequest"/>
 *     &lt;enumeration value="DeleteSCWSServicePortalResponse"/>
 *     &lt;enumeration value="LoadDeviceApplicationRequest"/>
 *     &lt;enumeration value="LoadDeviceApplicationResponse"/>
 *     &lt;enumeration value="BindDeviceApplicationToSEApplicationRequest"/>
 *     &lt;enumeration value="BindDeviceApplicationToSEApplicationResponse"/>
 *     &lt;enumeration value="DeleteDeviceApplicationRequest"/>
 *     &lt;enumeration value="DeleteDeviceApplicationResponse"/>
 *     &lt;enumeration value="UnbindDeviceApplicationToSEApplicationRequest"/>
 *     &lt;enumeration value="UnbindDeviceApplicationToSEApplicationResponse"/>
 *     &lt;enumeration value="HandleActionDoneOnDeviceApplicationNotificationRequest"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "messageType")
@XmlEnum
public enum MessageType {

    AP("AP"),
    CP("CP"),
    CP_CHANGES("CP_CHANGES"),
    KP("KP"),
    KEY_EXCHANGE("KEY_EXCHANGE"),
    LFP("LFP"),
    PROFILE_REQUEST("PROFILE_REQUEST"),
    BATCH_CARD_CUSTOMIZATION("BATCH_CARD_CUSTOMIZATION"),
    CARD_CUSTOMIZATION("CARD_CUSTOMIZATION"),
    DATA_PREPARATION_REQUEST("DATA_PREPARATION_REQUEST"),
    APP_DATA_NOTIFICATION("APP_DATA_NOTIFICATION"),
    BATCH_AUDIT_TRAIL("BATCH_AUDIT_TRAIL"),
    CARD_AUDIT_TRAIL("CARD_AUDIT_TRAIL"),
    APPLICATION_AUDIT_TRAIL("APPLICATION_AUDIT_TRAIL"),
    ERROR("ERROR"),
    MIXED("MIXED"),
    @XmlEnumValue("CheckGlobalEligibilityRequest")
    CHECK_GLOBAL_ELIGIBILITY_REQUEST("CheckGlobalEligibilityRequest"),
    @XmlEnumValue("CheckGlobalEligibilityResponse")
    CHECK_GLOBAL_ELIGIBILITY_RESPONSE("CheckGlobalEligibilityResponse"),
    @XmlEnumValue("GetDeviceCapabilityProfileIdRequest")
    GET_DEVICE_CAPABILITY_PROFILE_ID_REQUEST("GetDeviceCapabilityProfileIdRequest"),
    @XmlEnumValue("GetDeviceCapabilityProfileIdResponse")
    GET_DEVICE_CAPABILITY_PROFILE_ID_RESPONSE("GetDeviceCapabilityProfileIdResponse"),
    @XmlEnumValue("GetSECapabilityProfileIdRequest")
    GET_SE_CAPABILITY_PROFILE_ID_REQUEST("GetSECapabilityProfileIdRequest"),
    @XmlEnumValue("GetSECapabilityProfileIdResponse")
    GET_SE_CAPABILITY_PROFILE_ID_RESPONSE("GetSECapabilityProfileIdResponse"),
    @XmlEnumValue("CheckMobileSubscriptionEligibilityRequest")
    CHECK_MOBILE_SUBSCRIPTION_ELIGIBILITY_REQUEST("CheckMobileSubscriptionEligibilityRequest"),
    @XmlEnumValue("CheckMobileSubscriptionEligibilityResponse")
    CHECK_MOBILE_SUBSCRIPTION_ELIGIBILITY_RESPONSE("CheckMobileSubscriptionEligibilityResponse"),
    @XmlEnumValue("HandleStartServiceStateChangeNotificationRequest")
    HANDLE_START_SERVICE_STATE_CHANGE_NOTIFICATION_REQUEST("HandleStartServiceStateChangeNotificationRequest"),
    @XmlEnumValue("HandleEndServiceStateChangeNotificationRequest")
    HANDLE_END_SERVICE_STATE_CHANGE_NOTIFICATION_REQUEST("HandleEndServiceStateChangeNotificationRequest"),
    @XmlEnumValue("GetMobileSubscriptionAlternateIdentifierRequest")
    GET_MOBILE_SUBSCRIPTION_ALTERNATE_IDENTIFIER_REQUEST("GetMobileSubscriptionAlternateIdentifierRequest"),
    @XmlEnumValue("GetMobileSubscriptionAlternateIdentifierResponse")
    GET_MOBILE_SUBSCRIPTION_ALTERNATE_IDENTIFIER_RESPONSE("GetMobileSubscriptionAlternateIdentifierResponse"),
    @XmlEnumValue("GetSEMobileSubscriptionIdentifierRequest")
    GET_SE_MOBILE_SUBSCRIPTION_IDENTIFIER_REQUEST("GetSEMobileSubscriptionIdentifierRequest"),
    @XmlEnumValue("GetSEMobileSubscriptionIdentifierResponse")
    GET_SE_MOBILE_SUBSCRIPTION_IDENTIFIER_RESPONSE("GetSEMobileSubscriptionIdentifierResponse"),
    @XmlEnumValue("GetMobileSubscriptionSEIdentifiersRequest")
    GET_MOBILE_SUBSCRIPTION_SE_IDENTIFIERS_REQUEST("GetMobileSubscriptionSEIdentifiersRequest"),
    @XmlEnumValue("GetMobileSubscriptionSEIdentifiersResponse")
    GET_MOBILE_SUBSCRIPTION_SE_IDENTIFIERS_RESPONSE("GetMobileSubscriptionSEIdentifiersResponse"),
    @XmlEnumValue("HandleMobileSubscriptionIdentifierChangedNotificationRequest")
    HANDLE_MOBILE_SUBSCRIPTION_IDENTIFIER_CHANGED_NOTIFICATION_REQUEST("HandleMobileSubscriptionIdentifierChangedNotificationRequest"),
    @XmlEnumValue("HandleMobileSubscriptionStatusChangeNotificationRequest")
    HANDLE_MOBILE_SUBSCRIPTION_STATUS_CHANGE_NOTIFICATION_REQUEST("HandleMobileSubscriptionStatusChangeNotificationRequest"),
    @XmlEnumValue("HandleSERenewalNotificationRequest")
    HANDLE_SE_RENEWAL_NOTIFICATION_REQUEST("HandleSERenewalNotificationRequest"),
    @XmlEnumValue("HandleSEDeviceChangedNotificationRequest")
    HANDLE_SE_DEVICE_CHANGED_NOTIFICATION_REQUEST("HandleSEDeviceChangedNotificationRequest"),
    @XmlEnumValue("HandleSEDeviceStatusChangeNotificationRequest")
    HANDLE_SE_DEVICE_STATUS_CHANGE_NOTIFICATION_REQUEST("HandleSEDeviceStatusChangeNotificationRequest"),
    @XmlEnumValue("HandleSEMobileSubscriptionChangedNotificationRequest")
    HANDLE_SE_MOBILE_SUBSCRIPTION_CHANGED_NOTIFICATION_REQUEST("HandleSEMobileSubscriptionChangedNotificationRequest"),
    @XmlEnumValue("HandleSEStatusChangeNotificationRequest")
    HANDLE_SE_STATUS_CHANGE_NOTIFICATION_REQUEST("HandleSEStatusChangeNotificationRequest"),
    @XmlEnumValue("EnrollSSDOwnerCertificateRequest")
    ENROLL_SSD_OWNER_CERTIFICATE_REQUEST("EnrollSSDOwnerCertificateRequest"),
    @XmlEnumValue("EnrollSSDOwnerCertificateResponse")
    ENROLL_SSD_OWNER_CERTIFICATE_RESPONSE("EnrollSSDOwnerCertificateResponse"),
    @XmlEnumValue("LookupServiceInstanceReferenceRequest")
    LOOKUP_SERVICE_INSTANCE_REFERENCE_REQUEST("LookupServiceInstanceReferenceRequest"),
    @XmlEnumValue("LookupServiceInstanceReferenceResponse")
    LOOKUP_SERVICE_INSTANCE_REFERENCE_RESPONSE("LookupServiceInstanceReferenceResponse"),
    @XmlEnumValue("DeclareServiceInstanceReferenceRequest")
    DECLARE_SERVICE_INSTANCE_REFERENCE_REQUEST("DeclareServiceInstanceReferenceRequest"),
    @XmlEnumValue("DeclareServiceInstanceReferenceResponse")
    DECLARE_SERVICE_INSTANCE_REFERENCE_RESPONSE("DeclareServiceInstanceReferenceResponse"),
    @XmlEnumValue("GetServiceInstanceReferenceDescriptorRequest")
    GET_SERVICE_INSTANCE_REFERENCE_DESCRIPTOR_REQUEST("GetServiceInstanceReferenceDescriptorRequest"),
    @XmlEnumValue("GetServiceInstanceReferenceDescriptorResponse")
    GET_SERVICE_INSTANCE_REFERENCE_DESCRIPTOR_RESPONSE("GetServiceInstanceReferenceDescriptorResponse"),
    @XmlEnumValue("GetServiceStateRequest")
    GET_SERVICE_STATE_REQUEST("GetServiceStateRequest"),
    @XmlEnumValue("GetServiceStateResponse")
    GET_SERVICE_STATE_RESPONSE("GetServiceStateResponse"),
    @XmlEnumValue("DeployServiceRequest")
    DEPLOY_SERVICE_REQUEST("DeployServiceRequest"),
    @XmlEnumValue("DeployServiceResponse")
    DEPLOY_SERVICE_RESPONSE("DeployServiceResponse"),
    @XmlEnumValue("UpgradeServiceRequest")
    UPGRADE_SERVICE_REQUEST("UpgradeServiceRequest"),
    @XmlEnumValue("UpgradeServiceResponse")
    UPGRADE_SERVICE_RESPONSE("UpgradeServiceResponse"),
    @XmlEnumValue("ExchangeServiceDataRequest")
    EXCHANGE_SERVICE_DATA_REQUEST("ExchangeServiceDataRequest"),
    @XmlEnumValue("ExchangeServiceDataResponse")
    EXCHANGE_SERVICE_DATA_RESPONSE("ExchangeServiceDataResponse"),
    @XmlEnumValue("SuspendOrResumeServiceRequest")
    SUSPEND_OR_RESUME_SERVICE_REQUEST("SuspendOrResumeServiceRequest"),
    @XmlEnumValue("SuspendOrResumeServiceResponse")
    SUSPEND_OR_RESUME_SERVICE_RESPONSE("SuspendOrResumeServiceResponse"),
    @XmlEnumValue("TerminateServiceRequest")
    TERMINATE_SERVICE_REQUEST("TerminateServiceRequest"),
    @XmlEnumValue("TerminateServiceResponse")
    TERMINATE_SERVICE_RESPONSE("TerminateServiceResponse"),
    @XmlEnumValue("HandleServiceEnvironmentChangeNotificationRequest")
    HANDLE_SERVICE_ENVIRONMENT_CHANGE_NOTIFICATION_REQUEST("HandleServiceEnvironmentChangeNotificationRequest"),
    @XmlEnumValue("HandleActionDoneOnServiceNotificationRequest")
    HANDLE_ACTION_DONE_ON_SERVICE_NOTIFICATION_REQUEST("HandleActionDoneOnServiceNotificationRequest"),
    @XmlEnumValue("GetCAInformationRequest")
    GET_CA_INFORMATION_REQUEST("GetCAInformationRequest"),
    @XmlEnumValue("GetCAInformationResponse")
    GET_CA_INFORMATION_RESPONSE("GetCAInformationResponse"),
    @XmlEnumValue("SECommandsGenerationAndRemoteExecutionRequest")
    SE_COMMANDS_GENERATION_AND_REMOTE_EXECUTION_REQUEST("SECommandsGenerationAndRemoteExecutionRequest"),
    @XmlEnumValue("SECommandsGenerationAndRemoteExecutionResponse")
    SE_COMMANDS_GENERATION_AND_REMOTE_EXECUTION_RESPONSE("SECommandsGenerationAndRemoteExecutionResponse"),
    @XmlEnumValue("GenerateDMTokenRequest")
    GENERATE_DM_TOKEN_REQUEST("GenerateDMTokenRequest"),
    @XmlEnumValue("GenerateDMTokenResponse")
    GENERATE_DM_TOKEN_RESPONSE("GenerateDMTokenResponse"),
    @XmlEnumValue("VerifyDMReceiptRequest")
    VERIFY_DM_RECEIPT_REQUEST("VerifyDMReceiptRequest"),
    @XmlEnumValue("VerifyDMReceiptResponse")
    VERIFY_DM_RECEIPT_RESPONSE("VerifyDMReceiptResponse"),
    @XmlEnumValue("BeginConversationRequest")
    BEGIN_CONVERSATION_REQUEST("BeginConversationRequest"),
    @XmlEnumValue("BeginConversationResponse")
    BEGIN_CONVERSATION_RESPONSE("BeginConversationResponse"),
    @XmlEnumValue("SendScriptRequest")
    SEND_SCRIPT_REQUEST("SendScriptRequest"),
    @XmlEnumValue("SendScriptResponse")
    SEND_SCRIPT_RESPONSE("SendScriptResponse"),
    @XmlEnumValue("EndConversationRequest")
    END_CONVERSATION_REQUEST("EndConversationRequest"),
    @XmlEnumValue("EndConversationResponse")
    END_CONVERSATION_RESPONSE("EndConversationResponse"),
    @XmlEnumValue("GetApplicationOrELFStatusRequest")
    GET_APPLICATION_OR_ELF_STATUS_REQUEST("GetApplicationOrELFStatusRequest"),
    @XmlEnumValue("GetApplicationOrELFStatusResponse")
    GET_APPLICATION_OR_ELF_STATUS_RESPONSE("GetApplicationOrELFStatusResponse"),
    @XmlEnumValue("GetSDFreeMemoryRequest")
    GET_SD_FREE_MEMORY_REQUEST("GetSDFreeMemoryRequest"),
    @XmlEnumValue("GetSDFreeMemoryResponse")
    GET_SD_FREE_MEMORY_RESPONSE("GetSDFreeMemoryResponse"),
    @XmlEnumValue("LoadSCWSServicePortalRequest")
    LOAD_SCWS_SERVICE_PORTAL_REQUEST("LoadSCWSServicePortalRequest"),
    @XmlEnumValue("LoadSCWSServicePortalResponse")
    LOAD_SCWS_SERVICE_PORTAL_RESPONSE("LoadSCWSServicePortalResponse"),
    @XmlEnumValue("DeleteSCWSServicePortalRequest")
    DELETE_SCWS_SERVICE_PORTAL_REQUEST("DeleteSCWSServicePortalRequest"),
    @XmlEnumValue("DeleteSCWSServicePortalResponse")
    DELETE_SCWS_SERVICE_PORTAL_RESPONSE("DeleteSCWSServicePortalResponse"),
    @XmlEnumValue("LoadDeviceApplicationRequest")
    LOAD_DEVICE_APPLICATION_REQUEST("LoadDeviceApplicationRequest"),
    @XmlEnumValue("LoadDeviceApplicationResponse")
    LOAD_DEVICE_APPLICATION_RESPONSE("LoadDeviceApplicationResponse"),
    @XmlEnumValue("BindDeviceApplicationToSEApplicationRequest")
    BIND_DEVICE_APPLICATION_TO_SE_APPLICATION_REQUEST("BindDeviceApplicationToSEApplicationRequest"),
    @XmlEnumValue("BindDeviceApplicationToSEApplicationResponse")
    BIND_DEVICE_APPLICATION_TO_SE_APPLICATION_RESPONSE("BindDeviceApplicationToSEApplicationResponse"),
    @XmlEnumValue("DeleteDeviceApplicationRequest")
    DELETE_DEVICE_APPLICATION_REQUEST("DeleteDeviceApplicationRequest"),
    @XmlEnumValue("DeleteDeviceApplicationResponse")
    DELETE_DEVICE_APPLICATION_RESPONSE("DeleteDeviceApplicationResponse"),
    @XmlEnumValue("UnbindDeviceApplicationToSEApplicationRequest")
    UNBIND_DEVICE_APPLICATION_TO_SE_APPLICATION_REQUEST("UnbindDeviceApplicationToSEApplicationRequest"),
    @XmlEnumValue("UnbindDeviceApplicationToSEApplicationResponse")
    UNBIND_DEVICE_APPLICATION_TO_SE_APPLICATION_RESPONSE("UnbindDeviceApplicationToSEApplicationResponse"),
    @XmlEnumValue("HandleActionDoneOnDeviceApplicationNotificationRequest")
    HANDLE_ACTION_DONE_ON_DEVICE_APPLICATION_NOTIFICATION_REQUEST("HandleActionDoneOnDeviceApplicationNotificationRequest");
    private final String value;

    MessageType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MessageType fromValue(String v) {
        for (MessageType c: MessageType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
