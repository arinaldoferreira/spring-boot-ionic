package com.arinaldoferreira.cursojava;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.arinaldoferreira.cursojava.domain.Categoria;
import com.arinaldoferreira.cursojava.repositories.CategoriaRepository;

@SpringBootApplication
public class CursojavaApplication implements CommandLineRunner {
	
	@Autowired
	private CategoriaRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(CursojavaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritório");

		repo.saveAll(Arrays.asList(cat1, cat2));
	}

}
