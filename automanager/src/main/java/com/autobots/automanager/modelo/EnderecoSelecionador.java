package com.autobots.automanager.modelo;

import java.util.Optional;

import org.springframework.stereotype.Component;

import com.autobots.automanager.entidades.Endereco;
import com.autobots.automanager.repositorios.EnderecoRepositorio;

@Component 
public class EnderecoSelecionador {
    public Endereco selecionar(EnderecoRepositorio repositorio, long id) {
        Optional<Endereco> achou = repositorio.findById(id);
        return achou.orElse(null);
    }
}
