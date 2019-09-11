package types;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Auther DRevelation
 * @Date 2019-07-26 16:04
 * @Desc
 */
@WebServlet(name = "/myServlet")
public class MyServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("--- init() ---");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        writer.write("hello servlet");
    }
}
