package yooxinz.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import yooxinz.springcloud.Interface.HiClient;

/**
 * Created by star on 2018/9/9.
 */
@RestController
public class HiController {

    @Autowired
    HiClient hiClient;

    @GetMapping("/consumer")
    public String hi() {
        return hiClient.consumer();
    }
}
