package com.example.javawww2;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
@WebListener
public class Listener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent event) {
        List<Integer> list = new ArrayList<>();
        ServletContext context = event.getServletContext();
        context.setAttribute("list", list);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
    }
}
