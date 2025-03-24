package com.cinesage.model;

import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.Data;

import java.util.List;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "celebrities")
public class Celebrity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long celebrityId;

    @Column
    private String celebrityName;

    @Column
    private List<Movie> moviesList;

}
