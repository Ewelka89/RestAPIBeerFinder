package pl.ek.service;

import pl.ek.domain.Beer;

import java.util.List;
import java.util.Set;

public interface BeerSwaggerService {
    List<Beer> findAll();

    List<Beer> findByName(String name);

    Set<String> findByAlcoholByVolume(Double alcoholByVolume);

    Set<String> findBeerByMalt(String malt);

    Set<String> findBeerByHops(String hops);
}
