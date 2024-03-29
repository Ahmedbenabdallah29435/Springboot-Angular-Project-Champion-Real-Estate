package com.example.techmasterpi.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.OffsetDateTime;

@NoArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
public class Delivery {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer deliveryid;

    @Column
    private Long totaleprice;

    @Column
    private String servicedetail;

    @Column
    private String track;

    @Column
    private String state;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_delevery_id")
    private User userDelevery;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "relocation_delivery_id")
    private Relocation relocationDelivery;



}
