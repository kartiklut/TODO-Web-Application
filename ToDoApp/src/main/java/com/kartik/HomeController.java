package com.kartik;

import java.util.Date;
import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.entities.Todo;

@Controller
public class HomeController {
	
	@Autowired
	ServletContext context;	
	
	@RequestMapping("/home")
	public String getHome(Model m)
	{
		m.addAttribute("page","home");
		
		
		return "home";
	}
	
	@RequestMapping("/add")
	public String getAdd(Model m)
	{
		Todo t=new Todo();
		m.addAttribute("page","add");
		m.addAttribute("todo",t);
		return "home";
	}
	
	@RequestMapping("/view")
	public String getViewAll(Model m)
	{
		m.addAttribute("page","view");
		List<Todo> list=(List<Todo>)context.getAttribute("list");
		m.addAttribute("todos", list);
		return "home";
	}
	 
	@RequestMapping(value ="/saveTodo" ,method=RequestMethod.POST)  //post method cuz by default it accepts get request and we added post request there.
	public String saveTodo(@ModelAttribute("todo") Todo t,Model m)  //Here we add that todo which we added in the spring form and saved all the data coming from there in (Todo t).
	{
		t.setDate(new Date());
		System.out.println(t);
		List<Todo> list=(List<Todo>)context.getAttribute("list");
		list.add(t);
		m.addAttribute("msg","TODO Added Successfully");
		return "home";
	}

}
