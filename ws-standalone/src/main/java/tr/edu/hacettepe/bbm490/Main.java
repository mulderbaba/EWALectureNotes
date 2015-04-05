package tr.edu.hacettepe.bbm490;

import javax.xml.ws.Endpoint;

/**
 * Created by mertcaliskan
 * on 05/04/15.
 */
public class Main {

    public static void main(String... args) {
        Endpoint.publish("http://localhost:9999/ws/countryService", new StandaloneWebServiceImpl());
    }
}
