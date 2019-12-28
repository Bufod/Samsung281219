package com.company;


public class Main {
    public static void main(String[] args) {
        Callme callme = new Callme();
        Caller caller1 = new Caller("Добро пожаловать", callme);
        Caller caller2 = new Caller("в синхронизированный", callme);
        Caller caller3 = new Caller("мир!", callme);
        try {
            caller1.t.join();
            caller2.t.join();
            caller3.t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
