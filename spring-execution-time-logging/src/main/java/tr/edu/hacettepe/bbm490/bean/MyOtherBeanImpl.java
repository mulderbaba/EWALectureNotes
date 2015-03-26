package tr.edu.hacettepe.bbm490.bean;

import org.springframework.stereotype.Component;

/**
 * User: mertcaliskan
 * Date: 25/06/14
 */
@Component
public class MyOtherBeanImpl implements MyOtherBean {

    @Override
    public void sayHelloDelayed() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Hello..!");
    }
}
