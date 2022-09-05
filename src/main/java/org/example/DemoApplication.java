package org.example;


//import org.example.configuration.VaultConfiguration;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;



@SpringBootApplication
public class DemoApplication {


	public static void main(String[] args) throws Throwable {

		try {

			SpringApplication.run(DemoApplication.class, args);
			//ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
			/*VaultConfiguration vaultCon= context.getBean(VaultConfiguration.class);
			System.out.println(vaultCon.getPassword());
			System.out.println(vaultCon.getUsername());*/

		} catch (Exception ex) {
			Throwable realCause = unwrap(ex);
			throw realCause;
		}
	}

	public static Throwable unwrap(Throwable ex) {
		
		if (ex != null && BeanCreationException.class.isAssignableFrom(ex.getClass())) {
			return unwrap(ex.getCause());
		} else {
			return ex;
		}
	}
}
