package com.invsales.product;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest(classes = InvsalesProductServiceApplication.class)
@ActiveProfiles("test")
class InvsalesProductServiceApplicationTests {

    @Test
    void contextLoads() {
    }
}
