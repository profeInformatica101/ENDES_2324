import java.util.Scanner;

public class AreaRectangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double base, altura, area;
        
        System.out.println("Introduzca la base del rectángulo:");
        base = scanner.nextDouble();
        while(base <= 0) {
            System.out.println("Por favor, introduzca un número positivo para la base:");
            base = scanner.nextDouble();
        }
        
        System.out.println("Introduzca la altura del rectángulo:");
        altura = scanner.nextDouble();
        while(altura <= 0) {
            System.out.println("Por favor, introduzca un número positivo para la altura:");
            altura = scanner.nextDouble();
        }
        
        area = base * altura;
        System.out.println("El área del rectángulo es: " + area);
    }
}
