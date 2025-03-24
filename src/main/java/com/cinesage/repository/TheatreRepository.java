package com.cinesage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cinesage.model.Theatre;

@Repository
public interface TheatreRepository extends JpaRepository<Theatre, Long> {

}
