package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.servise.CarService;


@Controller
@RequestMapping(value = "/cars")
public class CarController {

    @Autowired
    private final CarService carService;


    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping()
    public String showCars(@RequestParam(value = "count", defaultValue = "5") int ID_COUNT, ModelMap modelMap) {
        if (ID_COUNT > carService.cars().size()) {
            ID_COUNT = carService.cars().size();

        }

        modelMap.addAttribute("cars", carService.cars().subList(0, ID_COUNT));
        return "/cars";

    }

}
