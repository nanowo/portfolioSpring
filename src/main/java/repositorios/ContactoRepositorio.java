package repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import com.portfolio.portfolioSpring.Contacto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ContactoRepositorio extends CrudRepository<Contacto, Long> {
    List<Contacto> findByNombre(String nombre);

}
