package pl.ek.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.ek.domain.Beer;
import pl.ek.service.BeerSwaggerService;

import java.util.List;
import java.util.Set;

@RestController
public class BeerSwaggerController {

    @Autowired
    private BeerSwaggerService service;

    @GetMapping("/showAllBeers")
    private List<Beer> allBeers() {
        return service.findAll();
    }

    @GetMapping("/findByName")
    public List<Beer> findByName(String name) {
        return service.findByName(name);
    }

    @GetMapping("/findByAlcoholByVolume")
    public Set<String> findByAlcoholByVolume(Double alcoholByVolume) {
        return service.findByAlcoholByVolume(alcoholByVolume);
    }

    @GetMapping("/findByMalt")
    public Set<String> findBeerByMalt(String malt) {
        return service.findBeerByMalt(malt);
    }

    @GetMapping("/findByHops")
    public Set<String> findBeerByHops(String hops) {
        return service.findBeerByHops(hops);
    }

}
