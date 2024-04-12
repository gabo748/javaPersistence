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

@WebServlet("/insertarEstudiante")
public class InsertarEstudiante extends HttpServlet {
    @Inject
    IEstudianteService iEstudianteService;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Estudiante nuevoEstudiante = new Estudiante();
        nuevoEstudiante.setCarnet("PM0213");
        nuevoEstudiante.setApellidos("PANAMA");
        nuevoEstudiante.setNombres("Manuel");

        iEstudianteService.insertarEstudiante(nuevoEstudiante);

        Estudiante estudianteIngresado = iEstudianteService.buscarEstudiantePorCarnet(nuevoEstudiante);
        request.setAttribute("estudianteIngresado", estudianteIngresado);

        request.getRequestDispatcher("/insertarEstudiante.jsp").forward(request, response);
    }
}
