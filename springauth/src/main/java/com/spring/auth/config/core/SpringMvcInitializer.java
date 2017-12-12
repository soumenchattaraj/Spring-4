package com.spring.auth.config.core;

/*import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.spring.auth.config.AppConfig;*/

/*NOTE:
 * 1.This class is the alternative of Dispatcher Servlet Class what we use in web.xml
 * 2.Alternative of "org.springframework.web.servlet.DispatcherServlet" class.
 * 3.We can keep only either of them ie either the class in web.xml or this class which extends 
 * "AbstractAnnotationConfigDispatcherServletInitializer".
 * 4.Extending "AbstractAnnotationConfigDispatcherServletInitializer" will create a new dispatcher.
 * 5.Declaring dispatcher class along with this java class will throw duplicate dispatcher error
 * */
public class SpringMvcInitializer 
//extends AbstractAnnotationConfigDispatcherServletInitializer 
{

	/*@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { AppConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}*/
	
}