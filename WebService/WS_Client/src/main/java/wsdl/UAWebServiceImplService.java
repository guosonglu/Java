
package wsdl;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "UAWebServiceImplService", targetNamespace = "http://lgs.com.cn/", wsdlLocation = "http://127.0.0.1:8888/mobile?wsdl")
public class UAWebServiceImplService
    extends Service
{

    private final static URL UAWEBSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException UAWEBSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName UAWEBSERVICEIMPLSERVICE_QNAME = new QName("http://lgs.com.cn/", "UAWebServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://127.0.0.1:8888/mobile?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        UAWEBSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        UAWEBSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public UAWebServiceImplService() {
        super(__getWsdlLocation(), UAWEBSERVICEIMPLSERVICE_QNAME);
    }

    public UAWebServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), UAWEBSERVICEIMPLSERVICE_QNAME, features);
    }

    public UAWebServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, UAWEBSERVICEIMPLSERVICE_QNAME);
    }

    public UAWebServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, UAWEBSERVICEIMPLSERVICE_QNAME, features);
    }

    public UAWebServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UAWebServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns UAWebServiceImpl
     */
    @WebEndpoint(name = "UAWebServiceImplPort")
    public UAWebServiceImpl getUAWebServiceImplPort() {
        return super.getPort(new QName("http://lgs.com.cn/", "UAWebServiceImplPort"), UAWebServiceImpl.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UAWebServiceImpl
     */
    @WebEndpoint(name = "UAWebServiceImplPort")
    public UAWebServiceImpl getUAWebServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://lgs.com.cn/", "UAWebServiceImplPort"), UAWebServiceImpl.class, features);
    }

    private static URL __getWsdlLocation() {
        if (UAWEBSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw UAWEBSERVICEIMPLSERVICE_EXCEPTION;
        }
        return UAWEBSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
