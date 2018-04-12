package us.tx.state.hhsc.est.jersy;

import org.glassfish.jersey.server.ResourceConfig;

import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig {

	public JerseyConfig() {
		register(Endpoint.class);
		register(ReverseEndpoint.class);
	}

}
