/**
https://www.youtube.com/watch?v=hk4rzwH9-kY&list=PLAma_mKffTOTTFqIkLXgHqVuL6xJhb0mr&index=8
*/


import somePackege.Cart;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "FirstServlet", value = "/FirstServlet")
public class FirstServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
/////////////////////////////////////////////////////////////////////////////////простой вывод
//        String name = request.getParameter("name");
//        String surname = request.getParameter("surname");
//
//        PrintWriter printWriter = response.getWriter();                           // выводит в браузер
//
//        // http://localhost:8080/hello-world?name=vasya&surname=petrov
//
//        printWriter.println("<html>");
//        printWriter.println("<h1> Hello world " + name + " " + surname + " </h1>");
//        printWriter.println("</html>");

/////////////////////////////////////////////////////////////////////////////////редирект/форвард
////        response.sendRedirect("https://www.google.com");      // redirect на гугл при открытии сервлета
////        response.sendRedirect("/testJsp.jsp");               // redirect на другой сервлет
//
//
//        RequestDispatcher dispatcher = request.getRequestDispatcher("/testJsp.jsp");
//        dispatcher.forward(request, response);                                          // только внутренний адрес при форварде в отличии от редиректа

/////////////////////////////////////////////////////////////////////////////////   сессия
//        HttpSession session = request.getSession();
//
//        String name = request.getParameter("name");
//        int quantity = Integer.parseInt(request.getParameter("quantity"));
//
//        Cart cart = (Cart) session.getAttribute("cart");
//
//        if (cart == null){
//            cart = new Cart();
//            cart.setName(name);
//            cart.setQuantity(quantity);
//            session.setAttribute("cart", cart);
//        }
//        else {
//            session.setAttribute("cart", cart);
////            cart.setName(name);                          // так тоже получится
////            cart.setQuantity(quantity);
//        }
//
//        Integer count = (Integer) session.getAttribute("count");
//
//        if(count == null){                                                  // считает каждый раз при обновлении
//            session.setAttribute("count",1);
//            count = 1;
//        }
//        else {
//            session.setAttribute("count", count + 1);
//        }
//
//        PrintWriter printWriter = response.getWriter();                           // выводит в браузер
//
//        printWriter.println("<html>");
//        printWriter.println("<h1> Your count is " + count + " </h1>");
//        printWriter.println("<h1> Your name is " + cart.getName() + " </h1>");
//        printWriter.println("<h1> Your quantity is " + cart.getQuantity() + " </h1>");
//        printWriter.println("</html>");
//
//        getServletContext().getRequestDispatcher("/showCart.jsp").forward(request,response); // включить для переадресации на jsp showCart


    }
}

