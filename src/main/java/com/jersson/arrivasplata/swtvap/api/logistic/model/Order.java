package com.jersson.arrivasplata.swtvap.api.logistic.model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.jersson.arrivasplata.swtvap.api.logistic.enums.Status;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Set;

@Data
@Entity
@Table(name = "swtvap_orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long orderId;

    @Column(name = "client_id")
    private Long clientId;

    @Column(name = "code", length = 50)
    private String code;

    @Column(name = "other_date", length = 50)
    private String otherDate;

    @Enumerated(EnumType.ORDINAL)
    private Status status;

    @Column(name = "address", length = 250)
    private String address;

    @Column(name = "subtotal", precision = 10, scale = 2)
    private BigDecimal subtotal;

    @Column(name = "taxes", precision = 10, scale = 2)
    private BigDecimal taxes;

    @Column(name = "discount_amount", precision = 10, scale = 2)
    private BigDecimal discountAmount;

    @Column(name = "total", precision = 10, scale = 2)
    private BigDecimal total;

    @Column(name = "pick_up")
    private Boolean pickUp;

    @Column(columnDefinition = "TEXT")
    private String otherDetails;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Dispatches> dispatches;

}
