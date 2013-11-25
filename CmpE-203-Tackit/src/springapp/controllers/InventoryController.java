package springapp.controllers;

import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.view.RedirectView;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import springapp.services.ProductManager;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class InventoryController implements Controller {

    protected final Log logger = LogFactory.getLog("InventoryController ");
    
    private ProductManager productManager;

    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String now = (new java.util.Date()).toString();
              
    	logger.info("Tenant is "+request.getSession().getAttribute("tenant"));
    	 Map<String, Object> myModel = new HashMap<String, Object>();
         myModel.put("now", now);
        // myModel.put("products", this.productManager.getProducts());

         return new ModelAndView("hello", "model", myModel);
    }

    public void setProductManager(ProductManager productManager) {
        this.productManager = productManager;
    }
    
}