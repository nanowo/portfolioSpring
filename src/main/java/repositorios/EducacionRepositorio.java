package repositorios;

import com.portfolio.portfolioSpring.Educacion;
import com.portfolio.portfolioSpring.Lenguaje;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EducacionRepositorio extends JpaRepository<Educacion, Long> {
    List<Lenguaje> buscarPorCentro(String centro);
}
