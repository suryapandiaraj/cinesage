package com.cinesage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cinesage.model.Celebrity;

@Repository
public interface CelebrityRepository extends JpaRepository<Celebrity, Long> {

}
