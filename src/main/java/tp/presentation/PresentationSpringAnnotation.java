package tp.presentation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import tp.metier.IMetier;

public class PresentationSpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext("tp");
        IMetier metier = applicationContext.getBean(IMetier.class);
        System.out.println("Result = "+metier.calcul());
    }
}
