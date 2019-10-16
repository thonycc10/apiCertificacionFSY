package com.thony.apifsy.controller;

import com.thony.apifsy.entity.Persona;
import com.thony.apifsy.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @GetMapping("/persona")
    public List<Persona> allPersona() {
        return personaService.findAll();
    }

    @GetMapping("/persona/{dni}/{password}")
    public ResponseEntity<?> accessSystem(@PathVariable Integer dni,
                                          @PathVariable String password) {
        String correcto = "";
        Map<String, Object> response = new HashMap<>();
        try {
            correcto = personaService.findById(dni, password);
            response.put("mensaje", correcto);
        } catch (DataAccessException e) {
            response.put("mensaje", "Error al realizar la consulta en la base de datos");
            response.put("error", e.getMessage().concat(":").concat(e.getMostSpecificCause().getMessage()));
            return new ResponseEntity<Map<String, Object> >(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return  new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);

    }
}
