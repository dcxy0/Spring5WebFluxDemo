package xyz.suancaiyu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by puruidong on 2017/10/19.
 *
 * @author puruidong
 * @version 1.0 2017/10/19
 */
@RestController
public class HomeController {

    @RequestMapping("/")
    public String index() {
        System.out.println("*---------------------------------");
        System.out.println("*---------------------------------");
        System.out.println("*---------------------------------");
        System.out.println("*---------------------------------");
        System.out.println("*---------------------------------");
        System.out.println("*---------------------------------");
        System.out.println("*---------------------------------");
        System.out.println("*---------------------------------");
        System.out.println("*---------------------------------");
        System.out.println("*---------------------------------");
        System.out.println("*---------------------------------");
        String home = "hello";
        return "home";
    }


}
