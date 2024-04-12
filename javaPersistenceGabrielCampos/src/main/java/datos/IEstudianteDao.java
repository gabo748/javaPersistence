package datos;

import dominio.Estudiante;

import javax.ejb.Local;
import java.util.List;



@Local
public interface IEstudianteDao {
    public List<Estudiante> buscarTodosEstudiante();
    public Estudiante buscarEstudiantePorId(Estudiante estudiante);
    public Estudiante buscarEstudiantePorCarnet(Estudiante estudiante);

    public void insertarEstudiante(Estudiante estudiante);

    public void modificarEstudiante(Estudiante estudiante);

    public void eliminarEstudiante(Estudiante estudiante);
}
