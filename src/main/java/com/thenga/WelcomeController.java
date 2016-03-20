package com.thenga;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Sheru on 19/03/16.
 */

@RestController
public class WelcomeController {

    @RequestMapping("")
    public String hello(){
        return "Hello Ummer Shervani";
    }


}
