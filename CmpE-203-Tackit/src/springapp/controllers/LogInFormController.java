package springapp.controllers;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.mvc.SimpleFormController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import springapp.beans.LogInBean;

public class LogInFormController extends SimpleFormController {

    /** Logger for this class and subclasses */
    protected final Log logger = LogFactory.getLog("LogInFormController");
    

    public ModelAndView onSubmit(Object command)
            throws ServletException {

        String emailId = ((LogInBean) command).getEmailId();
    
        logger.info("Email ID sent by user " + emailId);

        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        
        logger.info("LogInFormController: tenant is: "+request.getSession().getAttribute("tenant"));

        logger.info("returning from PriceIncreaseForm view to " + getSuccessView());

        return new ModelAndView(new RedirectView(this.getSuccessView()));
    }

   
}