package com.jersson.arrivasplata.swtvap.api.logistic.model;

import com.jersson.arrivasplata.swtvap.api.logistic.enums.Status;
import lombok.Data;

import java.math.BigDecimal;
import java.sql.Timestamp;
@Data
public class DispatchesResponse {
    private Long id;
    private Long orderId;
    private Long providerId;
    private BigDecimal cost;
    private Timestamp date;
    private Status status;
    private String otherDetails;
}
