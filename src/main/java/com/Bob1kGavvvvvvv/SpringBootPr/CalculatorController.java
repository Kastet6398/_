package com.Bob1kGavvvvvvv.SpringBootPr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/calculator")
public class CalculatorController {

    @GetMapping("/add/{num1}/{num2}")
    public double add(@PathVariable("num1") double num1, @PathVariable("num2") double num2) {
        return num1 + num2;
    }

    @GetMapping("/subtract/{num1}/{num2}")
    public double subtract(@PathVariable("num1") double num1, @PathVariable("num2") double num2) {
        return num1 - num2;
    }

    @GetMapping("/multiply/{num1}/{num2}")
    public double multiply(@PathVariable("num1") double num1, @PathVariable("num2") double num2) {
        return num1 * num2;
    }

    @GetMapping("/divide/{num1}/{num2}")
    public double divide(@PathVariable("num1") double num1, @PathVariable("num2") double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
          return 0.0;
        }
    }
}

