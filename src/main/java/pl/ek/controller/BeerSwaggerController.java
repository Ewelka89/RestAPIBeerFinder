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

//    @Autowired
//    private BeerService service;
//
//    @GetMapping("/mapping")
//    private List<Beer> allBeers() {
//        return service.findAll();
//    }
//
//    @GetMapping("/findByName")
//    public List <Beer> findByName(String name) {
//        return service.findByName(name);
//    }
//
//    @GetMapping("/findByAbv")
//    public List<String> findByAlcoholByVolume(Double alcoholByVolume) {
//        return service.findByAlcoholByVolume(alcoholByVolume).stream().map(beer -> beer.getName()).collect(Collectors.toList());
//    }
//
//    @GetMapping("/findByMalt")
//    public Set <String> findBeerByMalt(String malt) {
//        return service.findBeerByMalt(malt).stream().map(beer -> beer.getName()).collect(Collectors.toSet());
//    }
//
//    @GetMapping("/findByHops")
//    public Set<String> findBeerByHops(String hops) {
//        return service.findBeerByHops(hops).stream().map(beer -> beer.getName()).collect(Collectors.toSet());
//    }

}
