package DomæneObjekter;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KontoTest {

    Konto konto;



    @BeforeEach
    void setUp() {
        konto = new Konto("Arne", "password", 100);
    }

    @Test
    void indsæt() {

        assertEquals(200, konto.indsæt(100));

    }

    @Test
    void indsætNegativ() {

        assertEquals(100,konto.indsæt(-100));

    }

    @Test
    void hæv() {

        assertEquals(50, konto.hæv(50));
    }

    @Test
    void hævNegativt() {

        assertEquals(100, konto.hæv(-50));
    }


}