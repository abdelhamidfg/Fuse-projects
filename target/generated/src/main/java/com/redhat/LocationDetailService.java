package com.redhat;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.3.6.fuse-780029-redhat-00001
 * 2021-12-26T00:02:28.766+04:00
 * Generated source version: 3.3.6.fuse-780029-redhat-00001
 *
 */
@WebServiceClient(name = "LocationDetailService",
                  wsdlLocation = "file:/C:/Users/Abdel/workspace5/locationSOAP-REST/src/main/resources/wsdl/location.wsdl",
                  targetNamespace = "http://redhat.com/")
public class LocationDetailService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://redhat.com/", "LocationDetailService");
    public final static QName LocationDetailServicePort = new QName("http://redhat.com/", "LocationDetailServicePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/Abdel/workspace5/locationSOAP-REST/src/main/resources/wsdl/location.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(LocationDetailService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/Abdel/workspace5/locationSOAP-REST/src/main/resources/wsdl/location.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public LocationDetailService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public LocationDetailService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public LocationDetailService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public LocationDetailService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public LocationDetailService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public LocationDetailService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns LocationDetailServicePortType
     */
    @WebEndpoint(name = "LocationDetailServicePort")
    public LocationDetailServicePortType getLocationDetailServicePort() {
        return super.getPort(LocationDetailServicePort, LocationDetailServicePortType.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns LocationDetailServicePortType
     */
    @WebEndpoint(name = "LocationDetailServicePort")
    public LocationDetailServicePortType getLocationDetailServicePort(WebServiceFeature... features) {
        return super.getPort(LocationDetailServicePort, LocationDetailServicePortType.class, features);
    }

}
