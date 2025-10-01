package com.example.week2;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class RequestController {
    @GetMapping("/hello")
        public String hello() {
            return "Hello";

    }
    @GetMapping("/greet/{name}")
        public String greetByName(@PathVariable String name){
            return "Hello " + name + "!";
    }

    @GetMapping("/details")
        public String details(@RequestParam String name, @RequestParam int age) {
            return "Hello " + name + "Age:" + age;
    }
    @GetMapping("/person")
        public person getPerson(){
            return new person("Anzelina", 67);
    }

    @GetMapping("/Calculator")
    public calculator getCalculator(@RequestParam double num1,
                                    @RequestParam double num2,
                                    @RequestParam String Operator){
        switch (Operator){
            case "add":
                return new calculator("add",  num1 + num2);
            case "subtract":
                return new calculator("subtract",  num1 - num2);
            case "multiply":
                return new calculator("multiply",  num1 * num2);
            case "divide":
                if(num2 == 0){
                    return new calculator("Cannot divide by zero", 0);
                }
                else{
                    return new calculator("divide",  num2 / num1);
                }
            default:
                return new calculator("Cannot do calculation", 0);
        }

    }

}
