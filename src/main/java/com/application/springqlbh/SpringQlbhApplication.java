package com.application.springqlbh;

import com.application.springqlbh.bill.CustomersBill;
import com.application.springqlbh.dal.CustomersDal;
import com.application.springqlbh.gui.CustomersGui;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.awt.*;

@Configuration
@SpringBootApplication
@EntityScan("com.application.springqlbh.dal")
@EnableJpaRepositories("com.application.springqlbh.dal")
public class SpringQlbhApplication implements CommandLineRunner{

    private CustomersGui customersGui;

    public static void main(String[] args) {
        new SpringApplicationBuilder(SpringQlbhApplication.class)
                .headless(false)
                .web(WebApplicationType.NONE)
                .run(args);
    }


    public SpringQlbhApplication(final CustomersDal customersDal) {
        this.customersGui = new CustomersGui(customersDal);
    }

    @Override
    public void run(String... args) throws Exception {
        EventQueue.invokeLater(() -> {
            customersGui.init();
        });
    }
}
