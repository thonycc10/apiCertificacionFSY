package com.thony.apifsy.service;

import com.thony.apifsy.entity.Persona;

import java.util.List;

public interface PersonaService {

    public List<Persona> findAll();

    public String findById(Integer dni, String password);
}
