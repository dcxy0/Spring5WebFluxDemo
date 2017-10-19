package xyz.suancaiyu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by puruidong on 2017/10/19.
 *
 * @author puruidong
 * @version 1.0 2017/10/19
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String index() {
        String home = "hello";
        return "home";
    }


}
