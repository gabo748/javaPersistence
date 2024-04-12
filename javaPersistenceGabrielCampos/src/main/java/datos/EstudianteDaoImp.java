package datos;

import dominio.Estudiante;

import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.*;
import java.util.List;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class EstudianteDaoImp implements IEstudianteDao {
    @PersistenceContext(unitName = "EstudiantePU")
    EntityManager em;

    @Override

    public List<Estudiante> buscarTodosEstudiante() {
        TypedQuery<Estudiante> q = em.createQuery("SELECT e FROM Estudiante e ORDER BY e.idestudiante", Estudiante.class);
        return q.getResultList();
    }

    @Override
    public Estudiante buscarEstudiantePorId(Estudiante estudiante) {
        return em.find(Estudiante.class, estudiante.getIdestudiante());
    }
    @Override
    public Estudiante buscarEstudiantePorCarnet(Estudiante estudiante) {
        Query q = em.createQuery("select e from Estudiante e where e.carnet = :carnet");
        q.setParameter("carnet", estudiante.getCarnet());
        return (Estudiante) q.getSingleResult();
    }
    @Override
    public void insertarEstudiante(Estudiante estudiante) {
        em.persist(estudiante);
    }
    @Override
    public void modificarEstudiante(Estudiante estudiante) {
        estudiante.setNombres("Karla");
        em.merge(estudiante);
    }
    @Override
    public void eliminarEstudiante(Estudiante estudiante) {
        em.remove(em.merge(estudiante));
    }
}
