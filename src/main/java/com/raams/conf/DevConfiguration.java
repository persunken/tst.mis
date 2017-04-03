package com.raams.conf;

import com.raams.conf.model.ConfigurationModel;
import com.raams.constants.BeanName;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by alex on 3/27/17.
 */
@Configuration
@Profile("dev")
public class DevConfiguration {

    @Bean(name = BeanName.BEAN_CONFIG)
    public ConfigurationModel getModel() {
        ConfigurationModel cm = new ConfigurationModel();
        cm.setAdminName("Dev");

        return cm;
    }

}
