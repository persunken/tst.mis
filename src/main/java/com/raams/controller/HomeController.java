package com.raams.controller;

import com.raams.conf.model.ConfigurationModel;
import com.raams.constants.BeanName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by alex on 3/27/17.
 */
@RestController
public class HomeController {

    @Autowired
    @Qualifier(BeanName.BEAN_CONFIG)
    ConfigurationModel cm;

    @RequestMapping("/")
    public String home() {
        return cm.getAdminName();
    }

}
