package br.com.ChronosAcademy;

public class Celsius {
    /*Com o valor de uma temperatura em graus Celsius, calcular e exibir sua
    temperatura equivalente em Fahrenheit.
Dica:
Fahrenheit = celsius x 1.8 + 32   */
    public static void main(String[] args) {
        int C = 10;
        double F;

        F = C * 1.8 + 32;
        System.out.println("Sua temperatura em Fahrenheit é:"+F);
    }

}
