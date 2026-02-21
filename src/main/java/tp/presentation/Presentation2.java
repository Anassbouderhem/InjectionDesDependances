package tp.presentation;

import tp.dao.IDao;
import tp.metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Presentation2 {
    // FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(new File("config.txt"));
        // Instanciation dynamique
        String daoClassName = scanner.nextLine();
        Class cDao = Class.forName(daoClassName);
        IDao d =(IDao) cDao.newInstance();

        String metierClassName = scanner.nextLine();
        Class cMetier = Class.forName(metierClassName);
        // Injection dynamique via constructeur
        IMetier metier =(IMetier) cMetier.getConstructor(IDao.class).newInstance(d);

        //Injection dynamique via setter
        //IMetier metier =(IMetier) cMetier.getConstructor().newInstance();
        //Method setDao = cMetier.getDeclaredMethod("setDao",IDao.class);
        //setDao.invoke(metier,d);

        System.out.println("Result = "+metier.calcul());
    }
}
