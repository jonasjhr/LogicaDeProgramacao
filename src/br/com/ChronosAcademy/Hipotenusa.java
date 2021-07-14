package br.com.ChronosAcademy;

public class Hipotenusa {
    public static void main(String[] args) {
        //Verificar se três valores quaisquer (A,B, C) que serão digitados formam ou não um triângulo retângulo.
        //        Lembre-se que o quadrado da hipotenusa é igual a soma dos quadrados dos catetos.

        int A=17,B=17,C=15,total_A,total_B,total_C;
        if (A>B && A>C || B > A && B > C || C > A && C > B){
            total_A = (A * A);
            total_B = (B * B);
            total_C = (C * C);
            if (total_A == total_B + total_C || total_B == total_A + total_C || total_C == total_B + total_A ){
                System.out.println("Temos um triangulo retangulo");
        }else{
            System.out.println("Não é um triangulo retangulo infelizmente");
            }

        }

    }
}