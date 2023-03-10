package etu1777.framework.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import etu1777.framework.Mapping;
import etu1777.framework.Utils;

public class FrontServlet extends HttpServlet{
    HashMap<String, Mapping> mappingUrls;
    public void processRequest(HttpServletRequest req, HttpServletResponse res) throws IOException{
        String url=req.getRequestURI();
        Utils utils=new Utils();
        url=utils.getCoreURL(url);
        PrintWriter write=res.getWriter();
        write.println(url);
        write.println(utils.getAllPackagesClasses());
    }
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        processRequest(req, res);
    }
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        processRequest(req, res);
    }
}