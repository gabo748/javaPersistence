package web;

import dominio.Estudiante;
import servicios.IEstudianteService;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/estudiantes")
public class EstudianteServlet extends HttpServlet {
    @Inject
    IEstudianteService iEstudianteService;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Estudiante> estudiantes = iEstudianteService.buscarTodosEstudiante();
        request.setAttribute("estudiantes", estudiantes);
        request.getRequestDispatcher("/listadoEstudiantes.jsp").forward(request, response);
    }
}

