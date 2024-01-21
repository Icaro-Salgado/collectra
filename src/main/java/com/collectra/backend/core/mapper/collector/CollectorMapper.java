package com.collectra.backend.core.mapper.collector;

import com.collectra.backend.core.domain.Collector;
import com.collectra.backend.core.input.collector.CreateCollectorInput;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CollectorMapper {
  CollectorMapper INSTANCE = Mappers.getMapper(CollectorMapper.class);

  Collector from(CreateCollectorInput createCollectorInput);
}
