package tr.edu.hacettepe.bbm490.bean;

import org.springframework.stereotype.Component;

/**
 * User: mertcaliskan
 * Date: 25/06/14
 */
@Component
public class MyBeanImpl implements MyBean {

    @Override
    public void sayHello() {
        System.out.println("Hello..!");
    }
}
