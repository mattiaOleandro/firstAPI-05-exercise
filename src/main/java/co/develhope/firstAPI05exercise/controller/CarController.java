package co.develhope.firstAPI05exercise.controller;

import co.develhope.firstAPI05exercise.DTO.CarDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/cars")
public class CarController {

    @GetMapping("/getNewCar")
    public CarDTO getCar(CarDTO carDTO){
        return new CarDTO("H2TS-OND2","Fiat Punto", 7899.00);
    }

    @PostMapping("/postNewCar")
    public String postCar(@Valid @RequestBody CarDTO carDTO){
        System.out.println(carDTO.toString());
        return "New car created!";
    }
}
