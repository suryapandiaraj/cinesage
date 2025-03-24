package com.cinesage.model;

import java.util.List;

import jakarta.persistence.*;

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
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;

    @Column
    private String userName;

    @Column
    private String eMail;

    @Column
    private String phone;

    @Column
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Ticket> ticketsList;

}
