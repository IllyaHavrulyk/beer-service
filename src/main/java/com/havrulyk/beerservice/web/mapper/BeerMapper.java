package com.havrulyk.beerservice.web.mapper;

import com.havrulyk.beerservice.domain.Beer;
import com.havrulyk.beerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto beerDto);
}
