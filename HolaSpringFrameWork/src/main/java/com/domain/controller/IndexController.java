package com.domain.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.domain.modelo.dao.AlumnoDAO;
import com.domain.modelo.dao.DAO;

import ar.edu.asap.practica0.modelo.PiedraPapelTijeraFactory;


@Controller
public class IndexController {

	@RequestMapping("/home")
    public String goIndex() {
    	
		return "Listado";
    }
	

	
	@RequestMapping("/listado")
	public String goListado(Model model) throws ClassNotFoundException, SQLException {

		List<com.domain.modelo.Model> alumnos= null ;
		DAO aluDao = new AlumnoDAO();
		try {
			alumnos = aluDao.leer(null);

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				System.out.println(alumnos);
		model.addAttribute("titulo", "Listado de alumnos");
		model.addAttribute("profesor", "Gabriel Casas");
		model.addAttribute("alumnos", alumnos);


		return "Listado";
	}
	

	@RequestMapping("/")
    public String goPresentacion() {
    	
		return "Presentacion";
    }
	@RequestMapping("/juego")
	public String goJuego(Model model) {
		List<PiedraPapelTijeraFactory> opciones = new ArrayList<PiedraPapelTijeraFactory>();
		 for(int i=1; i<6; i++) {
			 opciones.add(PiedraPapelTijeraFactory.getInstance(i));
		 }
		model.addAttribute("opciones", opciones);
		
		return "PiedraPapelTijeraLagartoSpock";
	}
	
	
	@RequestMapping("/resolverJuego") 
	public String goResolverJuego(@RequestParam(required = false) Integer selOpcion, Model model) {
		
		PiedraPapelTijeraFactory computadora = PiedraPapelTijeraFactory.getInstance((int)(Math.random()*5+1));
		PiedraPapelTijeraFactory jugador = PiedraPapelTijeraFactory.getInstance(selOpcion.intValue());
		
		jugador.comparar(computadora);
		
		model.addAttribute("jugador", jugador);
		model.addAttribute("computadora", computadora);
		model.addAttribute("resultado", jugador.getDescripcionResultado());	
        model.addAttribute("numero", selOpcion);
        
		return "Resultado";
	}
}
