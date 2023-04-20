package com.example.javawww2;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "HelloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ServletContext context = getServletContext();
        List<Integer> list = (List<Integer>) context.getAttribute("list");

        if (list == null) {
            list = new ArrayList<>();
            context.setAttribute("list", list);
        }
        Random rand = new Random();
        int num = rand.nextInt(100);
        list.add(num);
        Collections.sort(list);

        StringBuilder sb = new StringBuilder();

        for (Integer n : list) {
            sb.append(n).append(" ");
        }

        response.setContentType("text/plain");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(sb.toString());
    }


}