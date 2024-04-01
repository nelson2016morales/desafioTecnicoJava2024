package com.ejercicioJava.jpa.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ejercicioJava.jpa.entity.Telefonos;

public interface TelefonosRepository extends JpaRepository<Telefonos, UUID>{

}
