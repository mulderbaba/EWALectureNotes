package tr.edu.hacettepe.bbm490;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Created by mertcaliskan
 * on 17/12/14.
 */
@MappedSuperclass
public abstract class User {

    @Id
    @GeneratedValue
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int employeeid) {
        this.id = employeeid;
    }
}
