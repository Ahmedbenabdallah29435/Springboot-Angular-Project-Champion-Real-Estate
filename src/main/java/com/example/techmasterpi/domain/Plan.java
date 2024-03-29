package com.example.techmasterpi.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.OffsetDateTime;
import java.util.Set;

@NoArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
public class Plan {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer planid;

    @Column
    private String title;

    @Column
    private String picture;

    @Column
    private Double price;

    @Column
    private Double realizationprice;

    @Column
    private Integer livingroom;

    @Column
    private Integer kitchen;

    @Column
    private Integer wc;

    @Column
    private Integer room1;

    @Column
    private Integer room2;



    @Column


    private String description;

    @OneToMany(mappedBy = "planContractPlan")
    private Set<ContractPlan> planContractPlanContractPlans;



}
