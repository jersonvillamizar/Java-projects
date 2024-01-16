public class Circulo {
    public static void main(String[] args) throws Exception {
        // Escriba un programa que reciba como entrada el radio de un círculo y entregue como salida su perímetro y su área:
        
        int radio = Integer.parseInt(args[0]);
        double perimetro = 2 * Math.PI * radio;
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El perimetro es: " + perimetro);
        System.out.println("El area es: " + area);

    } 
}
