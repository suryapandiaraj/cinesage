package com.cinesage.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cinesage.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query("select u from users u WHERE LOWER(userName) LIKE LOWER(CONCAT('%', :keyword, '%'))")
    List<User> searchUsers(@Param("keyword") String keyword);
}
