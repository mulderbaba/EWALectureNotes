package tr.edu.hacettepe.bbm490;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class WorkshopBeanConfiguration {

	@Bean
	public AccountService accountService() {
		AccountServiceImpl bean = new AccountServiceImpl();
		bean.setAccountDao(accountDao());
		return bean;
	}
	
	@Bean
	public AccountDao accountDao() {
		AccountDaoInMemoryImpl bean = new AccountDaoInMemoryImpl();
		//dependencies of accountDao bean will be injected here...
		return bean;
	}
}
