package com.cinesage.model;

import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.Data;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "theatres")
public class Theatre {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long theatreId;

    @Column
    private String theatreName;

    @Column
    private int screenCount;

    @Column
    private Movie currentMovie;

}
