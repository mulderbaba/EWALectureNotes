package tr.edu.hacettepe.bbm490;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by mertcaliskan
 * on 08/12/14.
 */
@Entity
public class Department {

    private int id;
    private String name;
    private Set<Employee> employees = new HashSet<Employee>();

    public Department() {
    }

    public Department(String name, Employee... employees) {
        this.name = name;
        HashSet<Employee> employeeSet = new HashSet<Employee>();
        employeeSet.addAll(Arrays.asList(employees));
        this.employees = employeeSet;
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

    @ManyToMany
    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }
}
