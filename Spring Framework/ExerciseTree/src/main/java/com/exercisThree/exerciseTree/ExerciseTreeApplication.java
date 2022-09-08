package com.exercisThree.exerciseTree;

import com.exercisThree.exerciseTree.Entity.Usuario;
import com.exercisThree.exerciseTree.Repositories.UsuarioRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ExerciseTreeApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ExerciseTreeApplication.class, args);
		UsuarioRepository userRepo = (UsuarioRepository) context.getBean("usuarioRepository");
		System.out.println(userRepo.count());
		Usuario user = new Usuario(null, "Sneijder");
		userRepo.save(user);
		System.out.println(userRepo.count());
		System.out.println(userRepo.findAll());
	}

}
