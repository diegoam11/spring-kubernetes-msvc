package org.cenpro.springcloud.msvc.cursos.repositories;

import org.cenpro.springcloud.msvc.cursos.entity.Curso;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CursoRepository extends CrudRepository<Curso, Long> {
    boolean existsByNombre(String email);
}
