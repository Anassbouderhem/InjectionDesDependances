package tp.presentation;

import tp.dao.DaoImpl;
import tp.metier.MetierImpl;

public class Presentation1 {
    public static void main(String[] args) {
        // injection des dépenadances statique
        DaoImpl d = new DaoImpl();
        MetierImpl metier = new MetierImpl(d); // Injection des dépandances via le constructeur
        metier.setDao(d); // Injection des dépandances via le setter
        System.out.println("Result = "+metier.calcul());
    }
}
