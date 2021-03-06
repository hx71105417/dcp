
package org.gp;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.1
 * 
 */
@WebService(name = "GlobalEligibilityInfo", targetNamespace = "http://globalplatform.org/globaleligibilityinfo")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface GlobalEligibilityInfo {


    /**
     * 
     * @param checkGlobalEligibilityRequest
     * @return
     *     returns org.gp.CheckGlobalEligibilityResponseType
     */
    @WebMethod(operationName = "CheckGlobalEligibility")
    @WebResult(name = "CheckGlobalEligibilityResponse", targetNamespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", partName = "CheckGlobalEligibilityResponse")
    public CheckGlobalEligibilityResponseType checkGlobalEligibility(
        @WebParam(name = "CheckGlobalEligibilityRequest", targetNamespace = "http://namespaces.globalplatform.org/systems-messaging/2.1.0", partName = "CheckGlobalEligibilityRequest")
        CheckGlobalEligibilityRequestType checkGlobalEligibilityRequest);

}
