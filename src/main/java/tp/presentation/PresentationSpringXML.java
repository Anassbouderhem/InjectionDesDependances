package tp.presentation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import tp.metier.IMetier;

public class PresentationSpringXML {
    public static void main(String[] args) {
        ApplicationContext springContext = new ClassPathXmlApplicationContext("config.xml");
        IMetier metier = (IMetier) springContext.getBean("metier");
        //IMetier metier = springContext.getBean(IMetier.class);
        System.out.println("Result = "+metier.calcul());
    }
}
