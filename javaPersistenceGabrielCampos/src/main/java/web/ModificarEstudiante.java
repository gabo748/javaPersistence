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

@WebServlet("/modificarEstudiante")
public class ModificarEstudiante extends HttpServlet {
    @Inject
    IEstudianteService iEstudianteService;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Estudiante estudianteAbuscar = new Estudiante();
        estudianteAbuscar.setIdestudiante(2);

        Estudiante estudianteModificado = iEstudianteService.buscarEstudiantePorId(estudianteAbuscar);

        iEstudianteService.modificarEstudiante(estudianteModificado);

        request.setAttribute("estudianteModificado", estudianteModificado);


        request.getRequestDispatcher("/estudianteModificar.jsp").forward(request, response);
    }
}
