import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld bean_1 = (HelloWorld) applicationContext.getBean("helloworld");
        //  System.out.println(bean.getMessage());
        //Cat bean_1 = (Cat) applicationContext.getBean("cat");
        System.out.println(bean_1.getMessage());
       // System.out.println(bean.equals(bean_1));
        //   System.out.println(bean_1.getMessage());
        System.out.println(bean == bean_1);
        Cat cat = (Cat) applicationContext.getBean("cat");
        System.out.println(cat.getMessage());
        Cat cat1 = (Cat) applicationContext.getBean("cat");
        System.out.println(cat1.getMessage());
        //System.out.println(cat.equals(cat1));
        System.out.println(cat == cat1);

        // System.out.println(bean.equals(bean));
        //   System.out.println(bean_1.equals(bean_1));

    }
}