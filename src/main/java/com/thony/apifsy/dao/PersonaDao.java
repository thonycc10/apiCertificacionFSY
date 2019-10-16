package com.thony.apifsy.dao;

import com.thony.apifsy.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PersonaDao extends JpaRepository<Persona, Long> {

    @Query("select p from Persona p where p.dni =:dni")
    Persona getPersonaByDocumento(@Param("dni") Integer dni);

}
