package com.example.bankprojekt;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {


    Map <String, Konto> konti = new HashMap<>();

    Konto konto = new Konto("John", "1", 100);
    Konto konto1 = new Konto("Arne", "2", 1000);
    Konto konto2 = new Konto ("Bjarne", "3", 10);



    public void init() {

        konti.put(konto.getNavn(), konto);
        konti.put(konto1.getNavn(), konto1);
        konti.put(konto2.getNavn(), konto2);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        ServletContext servletContext = getServletContext();

        servletContext.setAttribute("konti",konti);

        String msg = "Her er en oversigt over de forskellige konti";

        request.setAttribute("msg", msg);

        request.getRequestDispatcher("index.jsp").forward(request, response);

    }

    public void destroy() {
    }
}