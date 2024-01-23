package com.jersson.arrivasplata.swtvap.api.logistic.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.jersson.arrivasplata.swtvap.api.logistic.enums.Status;
import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Set;

@Data
@Entity
@Table(name = "swtvap_dispatches")
public class Dispatches {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long dispatchesId;

    @Column(name = "order_id")
    private Long orderId;

    @Column(name = "provider_id")
    private Long providerId;

    @Column(precision = 10, scale = 2)
    private BigDecimal cost;

    private Timestamp date;

    @Enumerated(EnumType.ORDINAL)
    private Status status;

    @Column(length = 250)
    private String otherDetails;

    @OneToOne
    @JoinColumn(name = "provider_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Provider provider;

    @OneToMany(mappedBy = "order_id", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Order> order;

}
