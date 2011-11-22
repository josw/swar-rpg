package com.game.swar.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

@SuppressWarnings("serial")
public class DispatcherServlet extends org.springframework.web.servlet.DispatcherServlet {

    private static final Logger logger = Logger.getLogger(DispatcherServlet.class);

    @Override
    protected void doDispatch(HttpServletRequest request,
            HttpServletResponse response) throws Exception {
    	
        response.setHeader("Cache-Control","no-store");
        response.setHeader("Pragma","no-cache");
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setDateHeader("Expires",0);
        if (request.getProtocol().equals("HTTP/1.1"))
                response.setHeader("Cache-Control", "no-cache");
            super.doDispatch(request, response);

    }

	
}
