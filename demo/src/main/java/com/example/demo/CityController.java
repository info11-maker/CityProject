package com.example.demo;
import org.springframework.web.bind.annotation.*;

@RestController
public class CityController {
    CityRepository cityRepository = new CityRepository();

    @PostMapping("city")
    public String create(@RequestParam String countryName){
        return cityRepository.create(countryName);
    }

    @GetMapping("city/{id}")
    public String read(@PathVariable Integer id){
        return cityRepository.read(id);
    }

    @GetMapping("city")
    public String readAll(){
        return cityRepository.readAll();
    }

    @PutMapping("city/{id}")
    public String update(@PathVariable Integer id, @RequestParam String countryName){
        return cityRepository.update(id, countryName);
    }

    @DeleteMapping("city/{id}")
    public String delete(@PathVariable Integer id){
        return cityRepository.delete(id);
    }
}
/*@RestController
public class Grettings {

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}*/