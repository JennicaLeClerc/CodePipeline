package com.revature.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
//import java.io.PrintWriter;

/** Servlet Hierarchy
 * Servlet - Interface
 * GenericServlet - Abstract Class
 * HttpServlet - Abstract Class
 * MyServlet(HelloServlet) - Concrete Class
 */

/**
 * Servlet Lifecycle
 * init - initial state of the servlet object
 * service - wired up and available for service within the servlet container
 * destroy - decommission the servlet and allow it to be garbage collected
 */

@WebServlet(urlPatterns = {"/annotation"})
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // this endpoint will print hello world from servlets
        // headers - such as content type
        // body
        // status

        resp.setHeader("Content-Type", "text/html");
        resp.setStatus(200);
        resp.getOutputStream().println("Hello web from Servlets!");
        // TODO: Fix // Just using as a tester
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String title = req.getParameter("title");
        String singer = req.getParameter("singer");

        resp.setHeader("Content-Type", "text/html");
        resp.setStatus(200);
        resp.getOutputStream().println("Title :: " + title);
        resp.getOutputStream().println("Singer :: " + singer);

        System.out.println("Title :: " + title);
        System.out.println("Singer :: " + singer);
    }
}
