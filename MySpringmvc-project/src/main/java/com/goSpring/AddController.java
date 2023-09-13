package com.goSpring;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.goSpring.service.AddService;

@Controller
public class AddController {
	
	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("n1") int num1, @RequestParam("n2") int num2,HttpServletRequest req , HttpServletResponse res) {
		
//		int num1 = Integer.parseInt(req.getParameter("n1"));
//		int num2 = Integer.parseInt(req.getParameter("n2"));
		AddService as = new AddService();
		int sum = as.add(num1, num2);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display.jsp");
		mv.addObject("result", sum);

		return mv;
	}

}
