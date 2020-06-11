
package wsdl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the wsdl package. 
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

    private final static QName _GetAddressByNumberResponse_QNAME = new QName("http://lgs.com.cn/", "getAddressByNumberResponse");
    private final static QName _GetAddressByNumber_QNAME = new QName("http://lgs.com.cn/", "getAddressByNumber");
    private final static QName _AddResponse_QNAME = new QName("http://lgs.com.cn/", "addResponse");
    private final static QName _Add_QNAME = new QName("http://lgs.com.cn/", "add");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Add }
     * 
     */
    public Add createAdd() {
        return new Add();
    }

    /**
     * Create an instance of {@link AddResponse }
     * 
     */
    public AddResponse createAddResponse() {
        return new AddResponse();
    }

    /**
     * Create an instance of {@link GetAddressByNumber }
     * 
     */
    public GetAddressByNumber createGetAddressByNumber() {
        return new GetAddressByNumber();
    }

    /**
     * Create an instance of {@link GetAddressByNumberResponse }
     * 
     */
    public GetAddressByNumberResponse createGetAddressByNumberResponse() {
        return new GetAddressByNumberResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAddressByNumberResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lgs.com.cn/", name = "getAddressByNumberResponse")
    public JAXBElement<GetAddressByNumberResponse> createGetAddressByNumberResponse(GetAddressByNumberResponse value) {
        return new JAXBElement<GetAddressByNumberResponse>(_GetAddressByNumberResponse_QNAME, GetAddressByNumberResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAddressByNumber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lgs.com.cn/", name = "getAddressByNumber")
    public JAXBElement<GetAddressByNumber> createGetAddressByNumber(GetAddressByNumber value) {
        return new JAXBElement<GetAddressByNumber>(_GetAddressByNumber_QNAME, GetAddressByNumber.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lgs.com.cn/", name = "addResponse")
    public JAXBElement<AddResponse> createAddResponse(AddResponse value) {
        return new JAXBElement<AddResponse>(_AddResponse_QNAME, AddResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Add }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lgs.com.cn/", name = "add")
    public JAXBElement<Add> createAdd(Add value) {
        return new JAXBElement<Add>(_Add_QNAME, Add.class, null, value);
    }

}
