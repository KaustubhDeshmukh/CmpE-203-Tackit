package springapp.controllers;

import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.view.RedirectView;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.Session;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import springapp.services.ProductManager;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class RedirectController implements Controller {

    protected final Log logger = LogFactory.getLog("RedirectController");
    
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        
        String requestURI = request.getRequestURI();
        
        String tenant = requestURI.substring((requestURI.lastIndexOf("/")+1), requestURI.lastIndexOf("."));
        
        logger.info("tenant is "+tenant);
        
        if(request.getSession(false) ==null){
        	logger.warn("Session Inexistent: Starting a new one");
        	request.getSession().setAttribute("tenant",tenant);
        }
        else{
        	logger.info("Session existing");
        	request.getSession().setAttribute("tenant", tenant);
        	}
    	
    	return new ModelAndView(new RedirectView("hello.htm"));
    }

}