package servlets;

import storage.Repository;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ListUsersServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Repository repository = Repository.getInstance();
        List<String> user = repository.list();
        req.setAttribute("userNames", user);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("jsp/listUsers.jsp");
        requestDispatcher.forward(req, resp);
    }
}
