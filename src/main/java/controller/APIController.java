package controller;

import model.Countries;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/countries")
public class APIController {

    @GetMapping
    public List<Countries> findAll(){
        return null;
    };
}
