package tacos.data.jpa;

import org.springframework.data.repository.CrudRepository;
import tacos.Taco;

public interface TacoRepository extends CrudRepository<Taco, Long> {
}
