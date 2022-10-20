package me.dio.aulaJPA;

import me.dio.aulaJPA.models.Usuario;
import me.dio.aulaJPA.repository.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StartApp implements CommandLineRunner {

    @Autowired
    private UsuarioRepositorio repositorio;

    @Override
    public void run(String... args) throws Exception {
        // Query Method
        List<Usuario> users = repositorio.findByNameContaining("Diógenes");
        for(Usuario u: users){
            System.out.println(u);
        }


        List<Usuario> users2 = repositorio.filtrarPorNome("Pietra");

        for(Usuario u: users2){
            System.out.println(u);
        }


        Usuario user = new Usuario();
        user.setName("Pietra");
        user.setUserName("PS");
        user.setPassword("senha");

//        repositorio.save(user);

//        for(Usuario u: repositorio.findAll()){
//            System.out.println(u);
//        }



    }
}
