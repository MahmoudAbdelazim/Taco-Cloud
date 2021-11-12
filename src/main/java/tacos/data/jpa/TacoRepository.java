package tacos.data.jpa;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import tacos.Taco;

import java.net.URL;

public interface TacoRepository extends CrudRepository<Taco, Long>, PagingAndSortingRepository<Taco, Long> {
}