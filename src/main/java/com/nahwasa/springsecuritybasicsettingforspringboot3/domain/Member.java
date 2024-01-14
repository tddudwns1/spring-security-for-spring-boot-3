package com.nahwasa.springsecuritybasicsettingforspringboot3.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import static jakarta.persistence.GenerationType.*;
import static lombok.AccessLevel.*;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor(access = PROTECTED)
public class Member {
    @Id @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Column(unique = true)
    private String userid;

    private String pw;

    private String roles;

    public static Member createUser(String userId, String pw) {
        return new Member(null, userId, pw, "USER");
    }
}
