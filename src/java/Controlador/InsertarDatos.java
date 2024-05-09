package Controlador;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertarDatos extends HttpServlet {

    private static final String URL = "jdbc:mysql://localhost:3308/liberedu";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
  out.println("<!DOCTYPE html>");
           out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Registro Exitoso</title>");
            out.println("<style>");
            out.println("body { font-family: Arial, sans-serif; background-color: #f4f4f4; }");
            out.println("h1 { color: #333; }");
            out.println("ul { list-style-type: none; padding: 0; }");
            out.println("li { margin-bottom: 10px; }");
            out.println("</style>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Registro Exitoso</h1>");
            out.println("<p>Los datos que has enviado son:</p>");
            out.println("<ul>");
            out.println("<li><strong>Email:</strong> " + request.getParameter("Email") + "</li>");
            out.println("<li><strong>Contraseña:</strong> " + request.getParameter("Contrasena") + "</li>");
            out.println("<li><strong>Nombres:</strong> " + request.getParameter("Nombres") + "</li>");
            out.println("<li><strong>Apellidos:</strong> " + request.getParameter("Apellidos") + "</li>");
            out.println("<li><strong>Teléfono:</strong> " + request.getParameter("Telefono") + "</li>");
            out.println("</ul>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String Email = request.getParameter("Email");
        String Password = request.getParameter("Contrasena");
        String Nombres = request.getParameter("Nombres");
        String Apellidos = request.getParameter("Apellidos");
        String Telefono = request.getParameter("Telefono");
  
        insertarDatos(Nombres, Apellidos, Email, Telefono, Password);
        
       processRequest(request, response);
    }

    private void insertarDatos(String Nombres, String Apellidos, String Email, String Telefono, String Contrasena) {
        try (Connection conexion = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String sql = "INSERT INTO Rector(Nombres, Apellidos, Email, Telefono, Contrasena) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setString(1, Nombres);
            statement.setString(2, Apellidos);
            statement.setString(3, Email);
            statement.setString(4, Telefono);
            statement.setString(5, Contrasena);
            statement.executeUpdate();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
