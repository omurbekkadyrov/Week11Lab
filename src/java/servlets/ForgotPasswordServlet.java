/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import services.AccountService;

/**
 *
 * @author 758243
 */
public class ForgotPasswordServlet extends HttpServlet 
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/forgot.jsp").forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String email = request.getParameter("email");
        AccountService as = new AccountService();
        if(as.forgotPassword(email, getServletContext().getRealPath("/WEB-INF")) == true)
        {
            request.setAttribute("message", "Successfully sent email.");
        }
        else
        {
            request.setAttribute("message", "Successfully sent email.");
        }
        request.getRequestDispatcher("/WEB-INF/forgot.jsp").forward(request, response);
    }
}
