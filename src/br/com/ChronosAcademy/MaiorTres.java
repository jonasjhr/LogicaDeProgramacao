package br.com.ChronosAcademy;

public class MaiorTres {

        public static void main(String[] args) {
        /*
        Com dois valores distintos exibir o maior deles
         */
            int valorA = 5;
            int valorB = 8;
            int valorC = 6;

            if (valorA>valorB && valorA>valorC){
                System.out.println("O maior valor é: "+valorA);
            }else if (valorB>valorA && valorB>valorC){
                System.out.println("Meu maior valor é: "+valorB);
            }else if (valorC>valorA && valorC>valorB){
                System.out.println("Meu maior valor é: "+valorC);
            }
        }



}
