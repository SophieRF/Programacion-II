package com.example.myfirstapi.repositories;

import com.example.myfirstapi.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Long> {

}
