package repositorios;

import com.portfolio.portfolioSpring.Lenguaje;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LenguajeRepositorio extends JpaRepository<Lenguaje, Long> {

    List<Lenguaje> findByNombre(String nombre);
}
