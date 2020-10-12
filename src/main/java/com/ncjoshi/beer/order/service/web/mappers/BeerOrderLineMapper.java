package com.ncjoshi.beer.order.service.web.mappers;

import com.ncjoshi.beer.order.service.domain.BeerOrderLine;
import com.ncjoshi.beer.order.service.web.model.BeerOrderLineDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerOrderLineMapper {
    BeerOrderLineDto beerOrderLineToDto(BeerOrderLine line);

    BeerOrderLine dtoToBeerOrderLine(BeerOrderLineDto dto);
}
