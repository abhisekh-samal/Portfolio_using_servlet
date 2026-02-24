import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Portfolio extends HttpServlet {

    protected void doGet(HttpServletRequest req,
            HttpServletResponse res)
            throws IOException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        out.println("<html><body>");

        out.println("<h2>Welcome to My Portfolio</h2>");

        out.println("<h3>About Me</h3>");
        out.println("<table border='1'>");
        out.println("<tr>");
        out.println("<td><img src='portfolio.jpg' width='150' height='150'></td>");
        out.println("<td>");
        out.println("<b>Name:</b> Abhisekh samal <br>");
        out.println("<b>About Me:</b> Passionate software developer skilled in Java, Web Development and Data Science.");
        out.println("</td>");
        out.println("</tr>");
        out.println("</table>");

        out.println("<h3>Skills</h3>");
        out.println("<ul>");
        out.println("<li>Java</li>");
        out.println("<li>HTML</li>");
        out.println("<li>CSS</li>");
        out.println("<li>Python</li>");
        out.println("</ul>");

        out.println("<h3>Projects</h3>");
        out.println("<table border='1'>");
        out.println("<tr><th>Project Name</th><th>Description</th></tr>");

        out.println("<tr>");
        out.println("<td>EmoCare</td>");
        out.println("<td>EmoCare is an AI-powered emotion-aware journaling and mental well-being support system. It processes daily journal entries using NLP and sentiment analysis to detect emotional states like stress or happiness.</td>");
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td>Assessment Stimulator</td>");
        out.println("<td>A Java-based application designed to simulate an online examination environment using JDBC for secure database storage of user credentials and questions.\r\n" + //
                        "\r\n" + //
                        "n environment using JDBC for secure database storage of user credentials and questions.\r\n" + //
                        "\r\n" + //
                        "</td>");
        out.println("</tr>");

        out.println("</table>");

        out.println("<h3>Contact Form (GET Method)</h3>");
        out.println("<form method='get' action='Portfolio'>");
        out.println("Name: <input type='text' name='name'><br><br>");
        out.println("Email: <input type='email' name='email'><br><br>");
        out.println("<input type='submit' value='Submit'>");
        out.println("</form>");

        String name = req.getParameter("name");
        String email = req.getParameter("email");

        if (name != null && email != null) {
            out.println("<h4>Contact Details</h4>");
            out.println("Name: " + name + "<br>");
            out.println("Email: " + email);
        }

        out.println("</body></html>");
    }

    protected void doPost(HttpServletRequest req,
            HttpServletResponse res)
            throws IOException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        String name = req.getParameter("pname");
        String email = req.getParameter("pemail");

        out.println("<html><body>");
        out.println("<h3>POST Contact Details Received</h3>");
        out.println("Name: " + name + "<br>");
        out.println("Email: " + email);
        out.println("</body></html>");
    }
}