package tp.ext;

import org.springframework.stereotype.Component;
import tp.dao.IDao;


@Component("d2")

public class DaoImplV2 implements IDao {

    @Override
    public double getData() {
        System.out.println("Version capteurs ");
        double t = 15;
        return t;
    }
}
