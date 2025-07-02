package com.invsales.product;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("test") // 👈 Activates application-test.yml (with H2 config)
@SpringBootTest
class InvsalesProductServiceApplicationTests {

    @Test
    void contextLoads() {
        // This test ensures the Spring context loads correctly.
    }
}
