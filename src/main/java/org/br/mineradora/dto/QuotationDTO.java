package org.br.mineradora.dto;

import io.quarkus.arc.All;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

@Jacksonized
@Data
@Builder
@AllArgsConstructor
public class QuotationDTO {

    private Date date;
    private BigDecimal currencyPrice;
}
