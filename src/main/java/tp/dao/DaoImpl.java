package tp.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


@Repository("d1")
public class DaoImpl implements IDao{

    @Override
    public double getData() {
        System.out.println("Version base de données");
        double t=36;
        return t;
    }
}