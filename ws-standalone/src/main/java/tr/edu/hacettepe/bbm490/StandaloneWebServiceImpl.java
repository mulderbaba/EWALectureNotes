package tr.edu.hacettepe.bbm490;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mertcaliskan
 * on 05/04/15.
 */
@WebService
public class StandaloneWebServiceImpl {

    @WebMethod
    public List<String> getAll() {
        List<String> countryList = new ArrayList<String>();
        countryList.add("Turkey");
        countryList.add("USA");

        return countryList;
    }
}
