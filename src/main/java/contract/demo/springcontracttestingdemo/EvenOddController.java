package contract.demo.springcontracttestingdemo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "validate/prime-number")
@Controller
public class EvenOddController {

    private EvenOddService evenOddService;

    @Autowired
    public EvenOddController(EvenOddService evenOddService) {
        this.evenOddService = evenOddService;
    }

    @GetMapping
    public String isNumberPrime(@RequestParam("number") Integer number) {
        return evenOddService.isPrimeNumber(number);
    }
}
