package us.tx.state.hhsc.est;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class JustARestApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		new JustARestApplication()
		.configure(new SpringApplicationBuilder(JustARestApplication.class))
		.run(args);
	}
	

}
