
package org.gp;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "GlobalEligibilityInfoService", targetNamespace = "http://globalplatform.org/globaleligibilityinfo", wsdlLocation = "file:/C:/workspaces/sts-3.6/samplews/src/main/resources/gp/wsdl/GlobalEligibilityInfo.wsdl")
public class GlobalEligibilityInfoService
    extends Service
{

    private final static URL GLOBALELIGIBILITYINFOSERVICE_WSDL_LOCATION;
    private final static WebServiceException GLOBALELIGIBILITYINFOSERVICE_EXCEPTION;
    private final static QName GLOBALELIGIBILITYINFOSERVICE_QNAME = new QName("http://globalplatform.org/globaleligibilityinfo", "GlobalEligibilityInfoService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/workspaces/sts-3.6/samplews/src/main/resources/gp/wsdl/GlobalEligibilityInfo.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        GLOBALELIGIBILITYINFOSERVICE_WSDL_LOCATION = url;
        GLOBALELIGIBILITYINFOSERVICE_EXCEPTION = e;
    }

    public GlobalEligibilityInfoService() {
        super(__getWsdlLocation(), GLOBALELIGIBILITYINFOSERVICE_QNAME);
    }

    public GlobalEligibilityInfoService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns GlobalEligibilityInfo
     */
    @WebEndpoint(name = "GlobalEligibilityInfoEndpoint")
    public GlobalEligibilityInfo getGlobalEligibilityInfoEndpoint() {
        return super.getPort(new QName("http://globalplatform.org/globaleligibilityinfo", "GlobalEligibilityInfoEndpoint"), GlobalEligibilityInfo.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GlobalEligibilityInfo
     */
    @WebEndpoint(name = "GlobalEligibilityInfoEndpoint")
    public GlobalEligibilityInfo getGlobalEligibilityInfoEndpoint(WebServiceFeature... features) {
        return super.getPort(new QName("http://globalplatform.org/globaleligibilityinfo", "GlobalEligibilityInfoEndpoint"), GlobalEligibilityInfo.class, features);
    }

    private static URL __getWsdlLocation() {
        if (GLOBALELIGIBILITYINFOSERVICE_EXCEPTION!= null) {
            throw GLOBALELIGIBILITYINFOSERVICE_EXCEPTION;
        }
        return GLOBALELIGIBILITYINFOSERVICE_WSDL_LOCATION;
    }

}
