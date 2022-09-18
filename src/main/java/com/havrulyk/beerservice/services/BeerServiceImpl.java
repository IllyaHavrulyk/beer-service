package com.havrulyk.beerservice.services;

import com.havrulyk.beerservice.domain.Beer;
import com.havrulyk.beerservice.repositories.BeerRepository;
import com.havrulyk.beerservice.web.controller.NotFoundException;
import com.havrulyk.beerservice.web.mapper.BeerMapper;
import com.havrulyk.beerservice.web.model.BeerDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@RequiredArgsConstructor
@Service
public class BeerServiceImpl implements BeerService {
    private final BeerRepository beerRepository;
    private final BeerMapper beerMapper;

    @Override
    public BeerDto getById(UUID beerId) {
        return beerMapper
                .beerToBeerDto(beerRepository
                        .findById(beerId)
                        .orElseThrow(NotFoundException::new));
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        Beer beerToSave = beerMapper.beerDtoToBeer(beerDto);
        return beerMapper.beerToBeerDto(beerRepository.save(beerToSave));
    }

    @Override
    public BeerDto updateBeer(UUID beerId, BeerDto beerDto) {
        Beer beerToUpdate = beerRepository.findById(beerId).orElseThrow(NotFoundException::new);
        beerToUpdate.setBeerName(beerDto.getBeerName());
        beerToUpdate.setBeerStyle(beerDto.getBeerStyle().name());
        beerToUpdate.setPrice(beerDto.getPrice());

        return beerMapper.beerToBeerDto(beerRepository.save(beerToUpdate));
    }
}
