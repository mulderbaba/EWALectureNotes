package tr.edu.hacettepe.bbm490;

/**
 * Created by mertcaliskan
 * on 21/11/14.
 */
public class MyBean {

    private String message;

    public MyBean(String message) {
        this.message = message;
    }

    public void printMessage() {
        System.out.println("Greeting " + message);
    }
}
