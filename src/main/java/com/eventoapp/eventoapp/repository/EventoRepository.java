package com.eventoapp.eventoapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.eventoapp.eventoapp.models.Evento;

public interface EventoRepository extends CrudRepository<Evento , String>{

    Evento findByCodigo(int codigo);

}
