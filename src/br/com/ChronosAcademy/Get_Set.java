package br.com.ChronosAcademy;

public class Get_Set {
    static String hello = "bem vindo";

    public static void main(String[] args) {
        setHello("testando");
        System.out.println(getHello());
    }

    public static String getHello(){
        return hello;
    }

    public static void  setHello (String hello){
        Get_Set.hello = hello;
    }
}
