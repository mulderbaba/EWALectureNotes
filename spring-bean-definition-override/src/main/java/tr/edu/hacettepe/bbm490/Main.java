package tr.edu.hacettepe.bbm490;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String... args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
                Configuration2.class, Configuration1.class);
        Foo foo = applicationContext.getBean(Foo.class);

        System.out.println(foo.getName());
    }
}
