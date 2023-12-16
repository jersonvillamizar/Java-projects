public class NumeroMayor {

    public static void main(String[] args) {
        
        int a = 5, b = 8, c = 10, mayor = 0;

        if (a > b && a > c) {
            mayor = a;
        } else if (b > c) {
            mayor = b;
        } else {
            mayor = c;
        }

        System.out.println("El numero mayor es: " + mayor);
    }
}
