package tr.edu.baskent.workshop;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import tr.edu.hacettepe.bbm490.dao.UserDao;
import tr.edu.hacettepe.bbm490.domain.Address;
import tr.edu.hacettepe.bbm490.domain.User;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.Matchers.empty;
import static org.junit.Assert.*;

/**
 * Created by mertcaliskan
 * on 19/12/14.
 */
public class UserDaoTests extends BaseIntegrationTestCase {

    @Autowired
    private UserDao dao;

    @Test
    public void userSavedSuccessfully() {
        User user = new User("John", null, "dog", 1);
        Address address1 = new Address("Guncicekleri Sok", null, "Cankaya", "Ankara", "TR", 33333);
        Address address2 = new Address("Lale Sok", null, "Balgat", "Ankara", "TR", 44444);
        user.getAddresses().add(address1);
        user.getAddresses().add(address2);

        dao.save(user);

        User fetchedUser = dao.find(user.getId());
        assertNotNull(fetchedUser);
        assertNotNull(fetchedUser.getAddresses());
        assertThat(fetchedUser.getAddresses(), is(not(empty())));
        assertThat(fetchedUser.getAddresses().size(), is(2));
        assertThat(fetchedUser.getAddresses().get(0).getAddressline1(), is("Guncicekleri Sok"));
        assertThat(fetchedUser.getAddresses().get(0).getCounty(), is("Cankaya"));
        assertThat(fetchedUser.getAddresses().get(0).getCity(), is("Ankara"));
        assertThat(fetchedUser.getAddresses().get(0).getCountry(), is("TR"));
        assertThat(fetchedUser.getAddresses().get(0).getZip(), is(33333));

        dao.remove(fetchedUser);
        User fetchedUser2 = dao.find(fetchedUser.getId());
        assertNull(fetchedUser2);
    }
}
