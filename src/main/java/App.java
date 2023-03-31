import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld hW = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        System.out.println(hW.getMessage());
        System.out.println(bean == hW);


        Cat cat1 = (Cat) applicationContext.getBean("cats");
        Cat cat2 = (Cat) applicationContext.getBean("cats");
        System.out.println(cat1 == cat2);

    }
}