package com.shelter.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

/**
 * Created by kenan on 2018/5/3.
 */
@RestController
@EnableAutoConfiguration
public class AdeptPool {

    private static final Logger logger = LoggerFactory.getLogger(AdeptPool.class);

    @RequestMapping("/adeptPool/test")
    public ModelMap test(){
        ModelMap map = new ModelMap();
        logger.debug("进入/adeptPool/test ****************");

        map.put("status", "200");
        map.put("msg", "hello word");
        return map;
    }
}
