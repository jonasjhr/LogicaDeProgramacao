package br.com.ChronosAcademy;

public class Terreno_grande {
    public static void main(String[] args) {
        int base=50,altura=3,total;
        total = base*altura;

        if (total>100) {
            System.out.println("Terreno grande");
        }else{
            System.out.println("A area do seu terreno é: "+total);
        }
    }
}
