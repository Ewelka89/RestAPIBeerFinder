package pl.ek.service;

import pl.ek.domain.Beer;

import java.util.List;
import java.util.Set;

public interface BeerService {

    List<Beer> findAll();

    List<Beer> findByName(String name);

    Set<Beer> findByAlcoholByVolume(Double alcoholByVolume);

    Set<Beer> findBeerByMalt(String malt);

    Set<Beer> findBeerByHops(String hops);
}


