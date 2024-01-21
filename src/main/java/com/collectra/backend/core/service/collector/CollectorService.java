package com.collectra.backend.core.service.collector;

import com.collectra.backend.core.domain.Collector;
import com.collectra.backend.core.input.collector.CreateCollectorInput;

public interface CollectorService {
  Collector createCollector(CreateCollectorInput input);
}
