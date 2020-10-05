package com.guillermo.conferencedemo.repositories;

import com.guillermo.conferencedemo.models.Session;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long>{

}
