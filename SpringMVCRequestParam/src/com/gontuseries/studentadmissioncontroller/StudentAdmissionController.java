package com.gontuseries.studentadmissioncontroller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class StudentAdmissionController {
	 @RequestMapping(value="/admissionForm.html", method=RequestMethod.GET)
		public ModelAndView getAdmissionForm()
		{
		  ModelAndView model=new ModelAndView("AdmissionForm");
			
			return model;
        }
	 
	/* @RequestMapping(value="/submitAdmissionForm.html", method=RequestMethod.POST)
		public ModelAndView submitAdmissionForm(@RequestParam(value="studentName" ,defaultValue="Mr.abcc") String name,@RequestParam("studentHobby") String hobby)
		{
		  ModelAndView model=new ModelAndView("AdmissionSuccess");
		  model.addObject("msg","Detail submitted by you:: Name: "+name+ ", Hobby: "+hobby  );
			
			return model;
     }
	 */
	 @RequestMapping(value="/submitAdmissionForm.html", method=RequestMethod.POST)
	 public ModelAndView submitAdmissionForm(@RequestParam Map<String,String> reqpar)
		{
		      String name=reqpar.get("studentName");
		      String hobby=reqpar.get("studentHobby");
		     
		      ModelAndView model=new ModelAndView("AdmissionSuccess");
			  model.addObject("msg","Detail submitted by you:: Name: "+name+ ", Hobby: "+ hobby );
				
				return model;
	 
}
	 
}