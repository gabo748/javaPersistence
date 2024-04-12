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

@WebServlet("/eliminarEstudiante")
public class EliminarEstudiante extends HttpServlet {
    @Inject
    IEstudianteService iEstudianteService;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Estudiante estudianteParaEncontrar = new Estudiante();
        estudianteParaEncontrar.setIdestudiante(2);

        Estudiante estudianteABuscar = iEstudianteService.buscarEstudiantePorId(estudianteParaEncontrar);
        request.setAttribute("estudianteEliminado", estudianteABuscar);

        iEstudianteService.eliminarEstudiante(estudianteABuscar);

        request.getRequestDispatcher("/eliminarEstudiante.jsp").forward(request, response);
    }
}
