package net.webservicex;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * This class was generated by Apache CXF 3.2.0
 * 2017-11-07T22:28:24.555-03:00
 * Generated source version: 3.2.0
 */
@WebServiceClient(name = "GlobalWeather",
        wsdlLocation = "http://www.webservicex.com/globalweather.asmx?WSDL",
        targetNamespace = "http://www.webserviceX.NET")
public class GlobalWeather extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.webserviceX.NET", "GlobalWeather");
    public final static QName GlobalWeatherSoap = new QName("http://www.webserviceX.NET", "GlobalWeatherSoap");
    public final static QName GlobalWeatherSoap12 = new QName("http://www.webserviceX.NET", "GlobalWeatherSoap12");
    public final static QName GlobalWeatherHttpPost = new QName("http://www.webserviceX.NET", "GlobalWeatherHttpPost");
    public final static QName GlobalWeatherHttpGet = new QName("http://www.webserviceX.NET", "GlobalWeatherHttpGet");

    static {
        URL url = null;
        try {
            url = new URL("http://www.webservicex.com/globalweather.asmx?WSDL");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(GlobalWeather.class.getName())
                    .log(java.util.logging.Level.INFO,
                            "Can not initialize the default wsdl from {0}", "http://www.webservicex.com/globalweather.asmx?WSDL");
        }
        WSDL_LOCATION = url;
    }

    public GlobalWeather(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public GlobalWeather(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GlobalWeather() {
        super(WSDL_LOCATION, SERVICE);
    }

    public GlobalWeather(WebServiceFeature... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public GlobalWeather(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public GlobalWeather(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }


    /**
     * @return returns GlobalWeatherSoap
     */
    @WebEndpoint(name = "GlobalWeatherSoap")
    public GlobalWeatherSoap getGlobalWeatherSoap() {
        return super.getPort(GlobalWeatherSoap, GlobalWeatherSoap.class);
    }

    /**
     * @param features A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return returns GlobalWeatherSoap
     */
    @WebEndpoint(name = "GlobalWeatherSoap")
    public GlobalWeatherSoap getGlobalWeatherSoap(WebServiceFeature... features) {
        return super.getPort(GlobalWeatherSoap, GlobalWeatherSoap.class, features);
    }


    /**
     * @return returns GlobalWeatherSoap
     */
    @WebEndpoint(name = "GlobalWeatherSoap12")
    public GlobalWeatherSoap getGlobalWeatherSoap12() {
        return super.getPort(GlobalWeatherSoap12, GlobalWeatherSoap.class);
    }

    /**
     * @param features A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return returns GlobalWeatherSoap
     */
    @WebEndpoint(name = "GlobalWeatherSoap12")
    public GlobalWeatherSoap getGlobalWeatherSoap12(WebServiceFeature... features) {
        return super.getPort(GlobalWeatherSoap12, GlobalWeatherSoap.class, features);
    }


    /**
     * @return returns GlobalWeatherHttpPost
     */
    @WebEndpoint(name = "GlobalWeatherHttpPost")
    public GlobalWeatherHttpPost getGlobalWeatherHttpPost() {
        return super.getPort(GlobalWeatherHttpPost, GlobalWeatherHttpPost.class);
    }

    /**
     * @param features A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return returns GlobalWeatherHttpPost
     */
    @WebEndpoint(name = "GlobalWeatherHttpPost")
    public GlobalWeatherHttpPost getGlobalWeatherHttpPost(WebServiceFeature... features) {
        return super.getPort(GlobalWeatherHttpPost, GlobalWeatherHttpPost.class, features);
    }


    /**
     * @return returns GlobalWeatherHttpGet
     */
    @WebEndpoint(name = "GlobalWeatherHttpGet")
    public GlobalWeatherHttpGet getGlobalWeatherHttpGet() {
        return super.getPort(GlobalWeatherHttpGet, GlobalWeatherHttpGet.class);
    }

    /**
     * @param features A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return returns GlobalWeatherHttpGet
     */
    @WebEndpoint(name = "GlobalWeatherHttpGet")
    public GlobalWeatherHttpGet getGlobalWeatherHttpGet(WebServiceFeature... features) {
        return super.getPort(GlobalWeatherHttpGet, GlobalWeatherHttpGet.class, features);
    }

}
