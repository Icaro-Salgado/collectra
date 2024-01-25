package com.collectra.backend.core.domain;

import java.util.UUID;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class Collector {
  private UUID id;
  private String name;
}
