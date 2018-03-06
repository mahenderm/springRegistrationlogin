package com.wipro.controller;

import java.util.Locale;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.itextpdf.text.pdf.PdfStructTreeController.returnType;
import com.sun.xml.internal.org.jvnet.staxex.NamespaceContextEx.Binding;
import com.wipro.model.Customer;
import com.wipro.services.CustomerService;
import com.wipro.validations.CustomerValidation;

@Controller
@RequestMapping(value="/customer")
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	
	public String showForm(ModelMap model){
		model.put("customerData", new Customer());
		return "registration/register";
	}
	@RequestMapping(value="/registe",method=RequestMethod.PUT)
	public String saveForm(ModelMap model,
			@ModelAttribute("customerData")@Valid Customer customer,
			BindingResult br, HttpSession session){
		CustomerValidation CustomerValidation=new CustomerValidation();
		if(br.hasErrors()){
			return "register/register";
		}else {
			customerService.saveCustomer(customer);
			session.setAttribute("customer", customer);
			return "redirect:success";
		}
	}

	//following 2 methods are used for login processing
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String showLogin(ModelMap model, HttpSession session ){
		if(session.getAttribute("customer")==null){
			model.put("customerData", new Customer());
			return"login/login";
		}else{
			return "redirect:success";
		}
	}
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String doLogin(ModelMap model, @ModelAttribute("customerData")
	Customer customer, HttpSession session){
		if(customer.getC_email()!=null&&customer.getC_password()!=null &&
				session.getAttribute("customer")==null){
				customer=customerService.loginCustomer(customer);
				if(customer!=null){
					session.setAttribute("customer", customer);
					return "redirect:success";
				}else{
					model.put("failed", "Login Failed.");
					return"login/login";
				}
		}else{
			return "redirect:success";
		}
	}
	//this method is used to logout
	public String logOut(ModelMap model, HttpSession session){
		session.removeAttribute("customer");
		return "redirect:login";
	}
	//this nethod is used to redirect to successpage
		@RequestMapping(value="/success", method=RequestMethod.GET)
	public String showSuccess(Locale locale, ModelMap model){
		model.put("success", new Customer());
		return "success";
	}
		
	}
			
				
	

