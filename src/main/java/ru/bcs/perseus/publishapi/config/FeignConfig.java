package ru.bcs.perseus.publishapi.config;

import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import ru.bcs.perseus.publishapi.PublishApiApplication;

@Configuration
@EnableFeignClients(basePackageClasses = PublishApiApplication.class)
@ImportAutoConfiguration({FeignAutoConfiguration.class})
public class FeignConfig {

}
