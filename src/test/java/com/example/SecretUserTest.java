package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SecretUserTest {

    @Test
    void hasSecretShouldBeTrue() {
        // Das Secret wird im Workflow als Umgebungsvariable APP_SECRET_TOKEN gesetzt
        assertTrue(SecretUser.hasSecret(), "APP_SECRET_TOKEN ist nicht gesetzt");
    }
}
