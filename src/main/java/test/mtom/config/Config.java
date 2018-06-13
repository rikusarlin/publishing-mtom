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
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import test.mtom.endpoint.PublishingServiceEndpoint;
import test.mtom.service.PdfGenerationService;

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
										@Value("${mtom-enabled}") Boolean mtomEnabled,
										LoggingInInterceptor inInterceptor, 
										LoggingOutInterceptor outInterceptor) {
		
		PdfGenerationService pdfGenerationService = new PdfGenerationService();
		EndpointImpl endpoint = new EndpointImpl(cxfBus, new PublishingServiceEndpoint(pdfGenerationService));
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