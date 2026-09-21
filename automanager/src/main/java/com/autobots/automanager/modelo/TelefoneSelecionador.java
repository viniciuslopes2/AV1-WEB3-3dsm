package com.autobots.automanager.modelo;

import java.util.Optional;

import org.springframework.stereotype.Component;

import com.autobots.automanager.entidades.Telefone;
import com.autobots.automanager.repositorios.TelefoneRepositorio;

@Component
public class TelefoneSelecionador {
    public Telefone selecionar(TelefoneRepositorio repositorio, long id) {
        Optional<Telefone> achou = repositorio.findById(id);
        return achou.orElse(null);
    }
}
