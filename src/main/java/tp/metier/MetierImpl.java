package tp.metier;

import tp.dao.IDao;

public class MetierImpl implements IMetier {
    private IDao dao;

    /**
     * Constructeur pour injecter dans l'attribut dao
     * un objet d'une classe qui implémente l'interface IDAO
     * au moment de l'instantiation
     */
    public MetierImpl(IDao dao){
        this.dao=dao;
    }
    public MetierImpl() {
    }

    @Override
    public double calcul() {
        double t = dao.getData();
        double result = t * 20 * Math.log(12) + Math.sin(t);
        return result;
    }
    /**
     * Setter pour injecter dans l'attribut dao
     * un objet d'une classe qui implémente l'interface IDAO
     * après instantiation
     */

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
