package tr.edu.hacettepe.bbm490;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created by mertcaliskan
 * on 21/11/14.
 */
public class MyBean implements InitializingBean, DisposableBean {

    private String message;

    public MyBean() {
        System.out.println("Constructor");
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void printMessage() {
        System.out.println("Greeting " + message);
    }

    public void destroy() throws Exception {
        System.out.println("disposableBean - destroy");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("initializingBean - afterPropertiesSet");
    }

    public void initialized() {
        System.out.println("initialized with init-method");
    }

    public void destroyed() {
        System.out.println("destroyed with destroy-method");
    }
}
