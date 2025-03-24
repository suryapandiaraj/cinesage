package com.cinesage.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.query.Param;

import com.cinesage.model.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

    @Query("select m from movies m WHERE LOWER(movieName) like LOWER(CONCAT('%', :keyword, '%'))")
    List<Movie> searchMovies(@Param("keyword") String keyword);

}
