package contract.demo.springcontracttestingdemo;

import org.springframework.stereotype.Service;

@Service
public class EvenOddService {

    public String isPrimeNumber(int number){
        return Integer.parseInt(String.valueOf(number)) % 2 == 0 ? "Even" : "Odd";
    }
}
