package spring.config;

import org.springframework.context.annotation.*;
import org.springframework.web.servlet.*;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.*;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "spring")

public class AppConfig extends WebMvcConfigurerAdapter
{
	@Bean

	public ViewResolver viewResolver()
	{
		InternalResourceViewResolver viewResolver 
								= new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
		
		//© 2017 E. S. Boese. All Rights Reserved
	}

	@Override
	
	public void configureDefaultServletHandling(
			DefaultServletHandlerConfigurer configurer)
	{
		configurer.enable();
	}
}