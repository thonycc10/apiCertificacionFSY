package com.thony.apifsy.service.impl;

import com.thony.apifsy.dao.PersonaDao;
import com.thony.apifsy.entity.Persona;
import com.thony.apifsy.service.PersonaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService {

    private final Logger log = LoggerFactory.getLogger(PersonaServiceImpl.class);

    @Autowired
    private PersonaDao personaDao;

    @Override
    public List<Persona> findAll() {
        return personaDao.findAll();
    }

    @Override
    public String findById(Integer dni, String password) {
        Persona persona = null;
        persona = personaDao.getPersonaByDocumento(dni);
        if (persona == null) {
                return "Este DNI: ".concat(dni.toString()).concat(" no esta asociado a níngun participante del FSY");
        } else {
            if (persona.getPassword().equals(password)) {
                return "SUCCESS";
            } else {
                return "CONTRASEÑA INCORRECTA";
            }
        }
    }
}
