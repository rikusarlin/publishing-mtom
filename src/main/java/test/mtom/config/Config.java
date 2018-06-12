package test.mtom.config;

import org.apache.cxf.Bus;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

import test.mtom.endpoint.VastaanotaAineistoServiceEndpoint;

@Configuration
@ImportResource({ "classpath:META-INF/cxf/cxf.xml" })
@PropertySource("classpath:application.properties")
public class Config {

	@Bean
	public ServletRegistrationBean servletRegistrationBean(ApplicationContext context) {
		return new ServletRegistrationBean(new CXFServlet(), "/*");
	}

	@Bean
	public EndpointImpl publishingServiceEndpoint(Bus cxfBus, 
										VastaanotaAineistoServiceEndpoint vastaanotaAineistoServiceEndpoint,
										@Value("${mtom-enabled}") Boolean mtomEnabled,
										LoggingInInterceptor inInterceptor, 
										LoggingOutInterceptor outInterceptor) {
		
		EndpointImpl endpoint = new EndpointImpl(cxfBus, vastaanotaAineistoServiceEndpoint);
		endpoint.getInInterceptors().add(inInterceptor);
		endpoint.getOutInterceptors().add(outInterceptor);
		endpoint.getProperties().put("mtom-enabled", mtomEnabled);
		endpoint.publish("http://localhost:8080/publishing/service");
		return endpoint;
	}

	@Bean
	public LoggingInInterceptor loggingInInterceptor() {
		LoggingInInterceptor inInterceptor = new LoggingInInterceptor();
		inInterceptor.setPrettyLogging(true);
		return inInterceptor;
	}

	@Bean
	public LoggingOutInterceptor loggingOutInterceptor() {
		LoggingOutInterceptor outInterceptor = new LoggingOutInterceptor();
		outInterceptor.setPrettyLogging(true);
		return outInterceptor;
	}
}