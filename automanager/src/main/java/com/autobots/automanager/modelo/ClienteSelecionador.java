package com.autobots.automanager.modelo;

import java.util.Optional;

import org.springframework.stereotype.Component;

import com.autobots.automanager.entidades.Cliente;
import com.autobots.automanager.repositorios.ClienteRepositorio;

@Component 
public class ClienteSelecionador {
	public Cliente selecionar(ClienteRepositorio repositorio, long id) {
		Optional<Cliente> achou = repositorio.findById(id);
		return achou.orElse(null);
	}
}