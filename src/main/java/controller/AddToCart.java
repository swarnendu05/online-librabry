package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Book;
import model.Cart;

/**
 * Servlet implementation class AddToCart
 */
@WebServlet("/AddToCart")
public class AddToCart extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//. TODO Auto-generated method stub
		//doGet(request, response);
		response.setContentType("text/html;charset=UTF-8");
		 try (PrintWriter out = response.getWriter()) {
		
		 ArrayList<Cart> cartList = new ArrayList<>();
         int id = Integer.parseInt(request.getParameter("book_id"));
         Cart cm = new Cart();
         cm.setId(id);
         cm.setQuantity(1);
         System.out.println(id);
         HttpSession session = request.getSession();
         @SuppressWarnings("unchecked")
		ArrayList<Cart> cart_list = (ArrayList<Cart>) session.getAttribute("cart-list");
		
         if (cart_list == null) {
             cartList.add(cm);
             session.setAttribute("cart-list", cartList);
             //response.sendRedirect(request.getContextPath() +"/index.jsp");
         } else {
             cartList = cart_list;

             boolean exist = false;
             for (Cart c : cart_list) {
                 if (c.getId() == id) {
                     exist = true;
                     out.println("<h3 style='color:crimson; text-align: center'>Item Already in Cart. <a href='index.jsp'>GO to Cart Page</a></h3>");
                 }
             }

             if (!exist) {
                 cartList.add(cm);
                 response.sendRedirect(request.getContextPath() +"index.jsp");
             }
         }
		
		
		 }
	}

}
