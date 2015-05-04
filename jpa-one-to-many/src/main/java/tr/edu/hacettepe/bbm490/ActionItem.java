package tr.edu.hacettepe.bbm490;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by mertcaliskan
 * on 08/12/14.
 */
@Entity
public class ActionItem {

    private int id;
    private String name;

    public ActionItem() {
    }

    public ActionItem(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
