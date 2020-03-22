package cn.xiaoyu.kafkaelk.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class ELKController {
    private static final Logger logger = LoggerFactory.getLogger(ELKController.class);

    @GetMapping(value = "/elk")
    public String helloWorld() {
        String response = "Hello user ! " + new Date();
        logger.info("/elk - &gt; {}", response);
        return response;
    }
}
