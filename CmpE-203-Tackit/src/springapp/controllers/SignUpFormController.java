package springapp.controllers;

import org.springframework.validation.BindException;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.mvc.SimpleFormController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import springapp.beans.LogInBean;

public class SignUpFormController extends SimpleFormController {

    /** Logger for this class and subclasses */
    protected final Log logger = LogFactory.getLog("SignUpFormController");

	@Override
	protected ModelAndView onSubmit(HttpServletRequest request,	HttpServletResponse response, Object command, BindException errors)
			throws Exception {
		
		LogInBean formBean = ((LogInBean) command);
		
		String emailId = formBean.getEmailId();
		 
		 String city	= formBean.getCity();
		    
//	     logger.info("SignUpFormController: Email ID sent by user " + emailId);
//	     
//	     logger.info("SignUpFormController: city sent by user " + city);
//
//	     logger.info("SignUpFormController: LogInFormController: tenant is: "+request.getSession().getAttribute("tenant"));
//
//	     logger.info("SignUpFormController: returning from PriceIncreaseForm view to " + getSuccessView());

		return new ModelAndView(new RedirectView(this.getSuccessView()));
		//return super.onSubmit(request, response, command, errors);
	}
    

   

   
}