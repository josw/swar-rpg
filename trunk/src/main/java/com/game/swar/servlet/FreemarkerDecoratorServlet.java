package com.game.swar.servlet;

import java.util.Iterator;
import java.util.Set;

import javax.servlet.ServletException;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import freemarker.template.Configuration;

@SuppressWarnings("serial")
public class FreemarkerDecoratorServlet extends com.opensymphony.module.sitemesh.freemarker.FreemarkerDecoratorServlet {

	@Override
	public void init() throws ServletException {
		super.init();
		WebApplicationContext ctx = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
		Configuration springConfiguration = (Configuration) ctx.getBean("freemarkerConfiguration");

		@SuppressWarnings("unchecked")
		Set<String> keys = springConfiguration.getSharedVariableNames();
		for(Iterator<String> it = keys.iterator(); it.hasNext();) {
			String name = it.next();
			getConfiguration().setSharedVariable(name, springConfiguration.getSharedVariable(name));
		}
	}
}
