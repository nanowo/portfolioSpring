package repositorios;
import com.portfolio.portfolioSpring.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface ProyectoRepositorio extends JpaRepository<Proyecto, Long> {
    List<Proyecto> findByNombre(String nombre);
}
