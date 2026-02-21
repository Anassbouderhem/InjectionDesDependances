package tp.ext;

import org.springframework.stereotype.Repository;
import tp.dao.IDao;


@Repository("d2")

public class DaoImplV2 implements IDao {

    @Override
    public double getData() {
        System.out.println("Version capteurs ");
        double t = 15;
        return t;
    }
}
