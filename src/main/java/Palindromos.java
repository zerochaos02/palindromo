
public class Palindromos {
    public static void main(String[] args) {
    }

    public static boolean verificarPalindromo(String cadena) {
        return new StringBuilder(cadena).reverse().toString().equals(cadena);
    }

    public static boolean verificarPalindromo(int numero) {
        return (Integer.toString(numero)).equals(new StringBuilder(Integer.toString(numero)).reverse().toString());
    }
}