package br.com.ChronosAcademy;

public class DoisDistintos {
    public static void main(String[] args) {
        int A=5,B=5;
        if (A>B){
            System.out.println("Valor A= "+A+" Valor B= "+B+" Dessa forma,o menor valor é: "+B);
        }else if(B>A){
            System.out.println("Valor A= "+A+" Valor B= "+B+" Dessa forma,o menor valor é: "+A);
        }else{
            System.out.println("Valor A= "+A+" Valor B= "+B+" Dessa forma, os valores são iguais");
        }
    }
}
