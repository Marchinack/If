import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.println("Insira sua altrua:");
        double altura = sc.nextDouble();
System.out.println("Seu peso:");
        double massa = sc.nextDouble();
        double imc = massa / (altura * altura);
        System.out.printf("Seu imc é %.2f", imc);
        if (imc < 18.5) {
            System.out.println(" Abaixo do peso");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println(" Peso normal");
        } else if (imc >= 25 && imc < 30) {
            System.out.println(" Sobrepeso");
        } else if (imc >= 30) {
            System.out.println(" Obesidade");
        } 
    }
}
