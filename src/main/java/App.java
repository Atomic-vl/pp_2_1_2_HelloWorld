import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld bean1 = (HelloWorld) applicationContext.getBean("helloworld");
        Cat cat = (Cat) applicationContext.getBean("catBean");
        Cat cat1 = (Cat) applicationContext.getBean("catBean");
        System.out.println(bean == bean1);
        System.out.println(bean);
        System.out.println(bean1);
        System.out.println(cat == cat1);
        System.out.println(cat);
        System.out.println(cat1);

    }
}