package tr.edu.hacettepe.bbm490;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by mertcaliskan
 * on 21/11/14.
 */
public class Main {

    public static void main(String... args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");

        MyBean obj = (MyBean) context.getBean("myBean");
        obj.printMessage();

        ((ConfigurableApplicationContext) context).close();
    }
}