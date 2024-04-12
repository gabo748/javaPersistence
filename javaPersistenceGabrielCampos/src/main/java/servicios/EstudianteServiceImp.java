package servicios;

import datos.IEstudianteDao;
import dominio.Estudiante;

import javax.ejb.Stateful;
import javax.enterprise.inject.Model;
import javax.inject.Inject;
import java.util.List;

@Stateful
public class EstudianteServiceImp implements IEstudianteService{
    @Inject
    private IEstudianteDao iEstudiante;
    @Override
    public List<Estudiante> buscarTodosEstudiante() {
        return iEstudiante.buscarTodosEstudiante();
    }
    @Override
    public Estudiante buscarEstudiantePorId(Estudiante estudiante) {
        return iEstudiante.buscarEstudiantePorId(estudiante);
    }
    @Override
    public Estudiante buscarEstudiantePorCarnet(Estudiante estudiante) {
        return iEstudiante.buscarEstudiantePorCarnet(estudiante);
    }
    @Override
    public void insertarEstudiante(Estudiante estudiante) {
        iEstudiante.insertarEstudiante(estudiante);
    }
    @Override
    public void modificarEstudiante(Estudiante estudiante) {
        iEstudiante.modificarEstudiante(estudiante);
    }
    @Override
    public void eliminarEstudiante(Estudiante estudiante) {
        iEstudiante.eliminarEstudiante(estudiante);
    }
}
