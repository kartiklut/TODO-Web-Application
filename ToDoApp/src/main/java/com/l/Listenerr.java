package com.l;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.entities.Todo;

//This class will automatically runs when we deployed it on server and a context object will be created which is same for all 
//We have to configure it in web.xml
public class Listenerr implements ServletContextListener {

	public void contextDestroyed(ServletContextEvent arg0) {
		
		
	}

	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("Context Object Created");
		List<Todo> list=new ArrayList<Todo>();
		ServletContext context=arg0.getServletContext();
		context.setAttribute("list",list );
	}

	

}
