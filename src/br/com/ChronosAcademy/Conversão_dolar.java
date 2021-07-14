package br.com.ChronosAcademy;

public class Conversão_dolar {

        /*Com o valor da cotação do dólar e uma certa quantidade de dólares.
Calcular e exibir o valor correspondente em Reais (R$).
Your Solution */
        public static void main(String[] args) {
            double cotacao = 5.16, carteira_dolares = 800, conversao_br;

            conversao_br = carteira_dolares * cotacao;
            System.out.println("Na sua carteira tem: " +carteira_dolares+ " mas em reais tem: " + conversao_br + " em reais");
        }



}
