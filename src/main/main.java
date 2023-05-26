package com.web.parcialweb;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface LibrosRepository extends CrudRepository<Libros, Long> {

  @Query("SELECT c FROM Canchas c WHERE Titulo = :nombre ")
  List<Libros> findByName(@Param("nombre") String name);
}
