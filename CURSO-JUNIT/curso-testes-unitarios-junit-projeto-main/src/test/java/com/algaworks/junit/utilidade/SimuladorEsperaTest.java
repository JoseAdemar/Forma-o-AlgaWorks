package com.algaworks.junit.utilidade;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

import java.time.Duration;

class SimuladorEsperaTest {

   //@Disabled("Não é mais aplicavel")
    //@EnabledIfEnvironmentVariable(named = "ENV", matches = "DEV")
    @Test
    void deveEsperarEnaoDarTimeOut() {
//        Assumptions.assumeTrue("PROD".equals(System.getenv("ENV")),
//                () -> "Abortando teste: Não deve ser executado em PROD");
       // Assertions.assertTimeout(Duration.ofSeconds(1), () -> SimuladorEspera.esperar(Duration.ofMillis(10)));
        Assertions.assertTimeoutPreemptively(Duration.ofSeconds(1), () -> SimuladorEspera.esperar(Duration.ofMillis(10)));
        //Assertions.assertTimeout(Duration.ofSeconds(1), () -> SimuladorEspera.esperar(Duration.ofSeconds(10)));
    }
}