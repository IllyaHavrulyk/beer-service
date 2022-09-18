package com.havrulyk.beerservice.web.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {
  @Null
  private UUID id;
  @Null
  private Integer version;

  @Null
  @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssZ", shape = JsonFormat.Shape.STRING)
  private OffsetDateTime createdDate;

  @Null
  @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssZ", shape = JsonFormat.Shape.STRING)
  private OffsetDateTime lastModifiedDate;

  @NotBlank
  @Size(min = 3, max = 100)
  private String beerName;

  @NotNull(message = "Beer style cannot be absent.")
  private BeerStyleEnum beerStyle;

  @NotNull
  private String upc;

  @Positive
  @NotNull
  @JsonFormat(shape = JsonFormat.Shape.STRING)
  private BigDecimal price;

  @Positive
  private Integer quantityOnHand;
}
