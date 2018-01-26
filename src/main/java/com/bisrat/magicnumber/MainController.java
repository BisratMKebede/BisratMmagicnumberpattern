package com.bisrat.magicnumber;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class MainController {


    @RequestMapping("/BisratM")
    public String showWName(@RequestParam("Number") int number)


    {
        String c = "";
        String a = "";

        while (number > 1){
            if(number % 2 == 0){

                c += String.valueOf(number) + " " ;

               number = number / 2;

            }

            else if (number % 2 != 0) {

                c += String.valueOf(number) + " " ;

                number = (3 * number) + 1;

            }




        }
        c += String.valueOf(number);

        return c  ;
    }
}
