package com.havrulyk.beerservice.web.model;

import java.time.OffsetDateTime;
import java.util.UUID;

public class BeerDto {
  private UUID id;
  private Integer version;

  private OffsetDateTime createdDate;
  private OffsetDateTime lastModifiedDate;
  //TODO: Finish
}
