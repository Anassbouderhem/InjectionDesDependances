package tp.ext;

import tp.dao.IDao;

public class DaoImplV2 implements IDao {

    @Override
    public double getData() {
        System.out.println("Version capteurs ");
        double t = 15;
        return t;
    }
}
