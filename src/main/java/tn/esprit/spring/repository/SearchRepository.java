package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.entity.Annonce2;

@Repository
public interface SearchRepository extends CrudRepository<Annonce2, Long> {

}
