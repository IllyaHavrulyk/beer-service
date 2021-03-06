package com.havrulyk.beerservice.web.controller;

import com.havrulyk.beerservice.web.model.BeerDto;
import java.util.UUID;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

  @GetMapping(value = "/{beerId}")
  public ResponseEntity<BeerDto> getBeerById(@PathVariable("beerId")UUID beerId){
    //TODO: impl
    return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK);
  }

  @PostMapping
  public ResponseEntity<Void> saveNewBeer(@RequestBody BeerDto beerDto){
    //TODO: impl
    return new ResponseEntity<>(HttpStatus.CREATED);
  }

  @PutMapping(value = "/{beerId}")
  public ResponseEntity<Void> updateBeerById(@PathVariable("beerId") UUID beerId, @RequestBody BeerDto beerDto){
    //TODO: impl
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  }
}
