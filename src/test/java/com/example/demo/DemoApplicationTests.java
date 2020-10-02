package com.example.demo;

import com.example.demo.Archive.SystemController;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void showUsers() {
        SystemController systemController = new SystemController();
        systemController.createUser("Patrick", "1234", 23232323, 00000000, "kasgas", 12, 3245, "Hovedstaden");
        systemController.createUser("Patrick", "1234", 23232323, 00000000, "kasgas", 12, 3245, "Hovedstaden");
        systemController.createUser("Patrick", "1234", 23232323, 00000000, "kasgas", 12, 3245, "Hovedstaden");
        System.out.println(systemController.showUser());
    }

}
