package tr.edu.hacettepe.bbm490;

import javax.faces.bean.*;

/**
 * Created by mertcaliskan
 * on 15/12/14.
 */
@ManagedBean
@RequestScoped
public class HelloView {

    private String helloMessage = "Greetings all!";

    public String getMessage() {
        return helloMessage;
    }
}