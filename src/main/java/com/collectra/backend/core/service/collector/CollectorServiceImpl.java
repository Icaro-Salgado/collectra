package com.collectra.backend.core.service.collector;

import com.collectra.backend.core.dao.collector.CollectorDao;
import com.collectra.backend.core.domain.Collector;
import com.collectra.backend.core.input.collector.CreateCollectorInput;
import com.collectra.backend.core.mapper.collector.CollectorMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CollectorServiceImpl implements CollectorService {

  private final CollectorDao collectorDao;

  @Override
  public Collector createCollector(CreateCollectorInput input) {
    return collectorDao.create(CollectorMapper.INSTANCE.from(input));
  }
}
