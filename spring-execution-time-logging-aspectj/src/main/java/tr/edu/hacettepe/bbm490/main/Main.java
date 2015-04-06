package tr.edu.hacettepe.bbm490.main;

import tr.edu.hacettepe.bbm490.bean.MyBean;
import tr.edu.hacettepe.bbm490.bean.MyOtherBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * User: mertcaliskan
 * Date: 25/06/14
 */
public class Main {

    public static void main(String... args) throws InterruptedException {
        ApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml", Main.class);
        MyBean myBean = context.getBean(MyBean.class);
        myBean.sayHello();

        MyOtherBean myOtherBean = context.getBean(MyOtherBean.class);
        myOtherBean.sayHelloDelayed();
    }
}
