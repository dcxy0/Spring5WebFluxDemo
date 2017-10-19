package xyz.suancaiyu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Created by puruidong on 2017/10/19.
 *
 * @author puruidong
 * @version 1.0 2017/10/19
 */
@RestController
public class IndexController {

    @GetMapping("/user")
    public List<String> index() {
        List<String> lists = Arrays.asList(new String[]{"1", "2"});
        return lists;
    }

}
