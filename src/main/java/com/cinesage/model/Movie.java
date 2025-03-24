package com.cinesage.model;

import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
// @Getter
// @Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "movies")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long movieId;

    @Column
    private int year;

    @Column
    @ManyToMany
    private List<Celebrity> cast;

    @Enumerated(EnumType.STRING)
    @Column
    private Genre genre;

}
