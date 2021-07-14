package br.com.ChronosAcademy;
/*
public class TabuadaCincoWhile {
    public static void main(String[] args) {
        int tabuada = 5;
        int cont =1;

        while(cont<11){
            System.out.println(tabuada + " x "+cont+" = "+tabuada * cont);
            cont =cont+1;
        }

    }
}*/
public class TabuadaCincoWhile {
    public static void main(String[] args) {
        int tabuada = 5;
        int cont =1;

        do{
            System.out.println(tabuada + " x "+cont+" = "+tabuada * cont);
            cont ++;
        }while (cont<11);

    }
}