import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromosTest {
    @Test
    void invertirCadena_test1() {
        String original = "aca";
        assertEquals(true, Palindromos.verificarPalindromo(original));
    }

    @Test
    void invertirCadena_test2() {
        String original = "acas";
        assertEquals(false, Palindromos.verificarPalindromo(original));
    }

    @Test
    void invertirCadena_test3() {
        String original = "h";
        assertEquals(true, Palindromos.verificarPalindromo(original));
    }

    @Test
    void invertirCadena_test4() {
        int original = 200;
        assertEquals(false, Palindromos.verificarPalindromo(original));
    }

    @Test
    void invertirCadena_test5() {
        String original = "";
        String expected = "";
        assertEquals(true, Palindromos.verificarPalindromo(original));
    }

    @Test
    void invertirCadena_test6() {
        String original = "aaabccbaaa";
        assertEquals(true, Palindromos.verificarPalindromo(original));
    }

    @Test
    void invertirCadena_test7() {
        String original = "ahabccbaaa";
        assertEquals(false, Palindromos.verificarPalindromo(original));
    }

    @Test
    void invertirCadena_test8() {
        String original = "La tele letal";
        assertEquals(false, Palindromos.verificarPalindromo(original));
    }
}