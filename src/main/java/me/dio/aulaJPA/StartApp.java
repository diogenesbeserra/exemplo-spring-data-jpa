package me.dio.aulaJPA;

import me.dio.aulaJPA.models.Usuario;
import me.dio.aulaJPA.repository.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements CommandLineRunner {

    @Autowired
    private UsuarioRepositorio repositorio;

    @Override
    public void run(String... args) throws Exception {
        Usuario user = new Usuario();
        user.setName("Diógenes");
        user.setUserName("Dfb");
        user.setPassword("senha");

        repositorio.save(user);

        for(Usuario u: repositorio.findAll()){
            System.out.println(u);
        }

    }
}
