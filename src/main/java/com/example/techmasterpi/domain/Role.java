package com.example.techmasterpi.domain;



import com.example.techmasterpi.model.roletype;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.OffsetDateTime;
import java.util.Set;



@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Enumerated(EnumType.STRING)
    private roletype roletype;

    @ManyToMany(mappedBy="roles", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<User> users;

@NoArgsConstructor
@Entity
@Table(name = "\"role\"")
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
public class Role {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer roleid;

    @Column
    private String typerole;

    @ManyToMany(mappedBy = "userRoleRoles")
    private Set<User> userRoleUsers;




}
