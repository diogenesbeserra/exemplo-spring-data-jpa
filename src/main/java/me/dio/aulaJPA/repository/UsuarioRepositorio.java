package me.dio.aulaJPA.repository;

import me.dio.aulaJPA.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Integer> {

    //Query Method
    List<Usuario> findByNameContaining(String name);

    //Query Method
    Usuario findByUserName(String username);

    //Query Override
    @Query("SELECT u FROM Usuario u WHERE u.name LIKE %:name%")
    List<Usuario> filtrarPorNome(@Param("name") String name);



}
