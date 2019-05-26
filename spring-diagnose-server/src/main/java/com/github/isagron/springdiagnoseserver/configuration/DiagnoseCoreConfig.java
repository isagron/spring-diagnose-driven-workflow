package com.github.isagron.springdiagnoseserver.configuration;

import com.github.isagron.rabbitmqentrypoint.services.RabbitMqEntryPoint;
import com.innon.ddw.client.management.DdwManagementApi;
import com.innon.ddw.diagnose.DiagnoseManager;
import com.innon.ddw.diagnose.impl.DiagnosticMngService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.github.isagron.rabbitmqentrypoint"})
public class DiagnoseCoreConfig {


    @Bean
    public DiagnoseManager diagnoseManager(DdwManagementApi managementApi, RabbitMqEntryPoint mqEntryPoint){
        return new DiagnosticMngService(managementApi);
    }
//
//    public @Bean
//    MongoClient mongoClient() {
//        return new MongoClient("localhost");
//    }
//
//    public @Bean
//    MongoTemplate mongoTemplate() {
//        return new MongoTemplate(mongoClient(), "mydatabase");
//    }
}
