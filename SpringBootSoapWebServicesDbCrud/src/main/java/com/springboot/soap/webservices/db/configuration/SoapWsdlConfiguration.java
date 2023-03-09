package com.springboot.soap.webservices.db.configuration;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class SoapWsdlConfiguration 
{
	@Bean
	public ServletRegistrationBean requestDispatcher(ApplicationContext applicationContext)
	{
		MessageDispatcherServlet mds = new MessageDispatcherServlet();
		mds.setApplicationContext(applicationContext);
		mds.setTransformWsdlLocations(true);
		return new ServletRegistrationBean(mds, "/soapCrud/*");
	}
	
	@Bean
	public XsdSchema employeeSchema()
	{
		return new SimpleXsdSchema(new ClassPathResource("employeeDto.xsd"));
	}
	
	@Bean(name="soapWsdlService")
	public DefaultWsdl11Definition createWsdl(XsdSchema schema)
	{
		DefaultWsdl11Definition wsdl = new DefaultWsdl11Definition();
		wsdl.setPortTypeName("EmployeePort");
		wsdl.setLocationUri("/soapCrud");
		wsdl.setTargetNamespace("http://crud.db.webservices.soap.springboot.com/dto");
		wsdl.setSchema(schema);
		return wsdl;
	}
}
