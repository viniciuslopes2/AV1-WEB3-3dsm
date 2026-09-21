package com.autobots.automanager.modelo;

import java.util.Optional;

import org.springframework.stereotype.Component;

import com.autobots.automanager.entidades.Documento;
import com.autobots.automanager.repositorios.DocumentoRepositorio;

@Component 
public class DocumentoSelecionador {
    public Documento selecionar(DocumentoRepositorio repositorio, long id) {
        Optional<Documento> achou = repositorio.findById(id);
        return achou.orElse(null);
    }
}
