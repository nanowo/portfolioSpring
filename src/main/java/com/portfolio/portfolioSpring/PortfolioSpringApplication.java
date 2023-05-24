package com.portfolio.portfolioSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import repositorios.ContactoRepositorio;
import repositorios.EducacionRepositorio;
import repositorios.LenguajeRepositorio;
import repositorios.ProyectoRepositorio;

import java.util.List;


@SpringBootApplication
public class PortfolioSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(PortfolioSpringApplication.class, args);
	}



}


