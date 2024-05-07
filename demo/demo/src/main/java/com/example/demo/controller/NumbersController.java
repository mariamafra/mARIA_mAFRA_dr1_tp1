package com.example.demo.controller;

import com.example.demo.model.Numbers;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/calculator")
public class NumbersController {
    @RequestMapping(value = {"/add"}, method = {RequestMethod.GET, RequestMethod.POST})
    public double add(@RequestBody Numbers numbers) {
        return numbers.getNum1() + numbers.getNum2();
    }

    @RequestMapping(value = {"/subtract"}, method = {RequestMethod.GET, RequestMethod.POST})
    public double subtract(@RequestBody Numbers numbers) {
        return numbers.getNum1() - numbers.getNum2();
    }

    @RequestMapping(value = {"/multiply"}, method = {RequestMethod.GET, RequestMethod.POST})
    public double multiply(@RequestBody Numbers numbers) {
        return numbers.getNum1() * numbers.getNum2();
    }

    @RequestMapping(value = {"/divide"}, method = {RequestMethod.GET, RequestMethod.POST})
    public double divide(@RequestBody Numbers numbers) {
        if (numbers.getNum2() == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return numbers.getNum1() / numbers.getNum2();
    }

    @RequestMapping(value = {"/power"}, method = {RequestMethod.GET, RequestMethod.POST})
    public double power(@RequestBody Numbers numbers) {
        return Math.pow(numbers.getNum1(), numbers.getNum2());
    }
}

