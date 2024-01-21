package com.collectra.backend.infrastructure.controller.api;

import com.collectra.backend.core.input.collector.CreateCollectorInput;
import com.collectra.backend.core.service.collector.CollectorService;
import com.collectra.backend.infrastructure.dto.collector.CreateCollectorDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/collector")
public class CollectorController {
  private final CollectorService collectorService;

  @PostMapping
  ResponseEntity<?> create(@RequestBody CreateCollectorDto requestBody) {
    final var createdCollector =
        collectorService.createCollector(
            CreateCollectorInput.builder().name(requestBody.getName()).build());

    return ResponseEntity.status(HttpStatus.CREATED).body(createdCollector);
  }
}
