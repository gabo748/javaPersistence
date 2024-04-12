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

@WebServlet("/buscarEstudiante")
public class BuscarEstudianteServlet extends HttpServlet {
    @Inject
    IEstudianteService iEstudianteService;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Estudiante estudianteBuscarPorId = new Estudiante();
        estudianteBuscarPorId.setIdestudiante(1);

        Estudiante estudianteBuscarPorCarnet = new Estudiante();
        estudianteBuscarPorCarnet.setCarnet("CL100422");


        request.setAttribute("estudianteID", estudianteBuscarPorId.getIdestudiante());
        request.setAttribute("estudianteCarnet", estudianteBuscarPorCarnet.getCarnet());

        Estudiante estudiante1 = iEstudianteService.buscarEstudiantePorId(estudianteBuscarPorId);
        request.setAttribute("estudiante1", estudiante1);

        Estudiante estudiante2 = iEstudianteService.buscarEstudiantePorCarnet(estudianteBuscarPorCarnet);
        request.setAttribute("estudiante2", estudiante2);

        request.getRequestDispatcher("/buscarEstudiante.jsp").forward(request, response);
    }
}
