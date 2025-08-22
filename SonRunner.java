package com.xworkz.inheritance;

public class SonRunner
{
    public static void main(String[] args)
    {
        Son  son = new Son();
        son.getSonDetails();

        Son son1 = new Son("nagachaitanya",100000,1);
        son1.getSonDetails();
    }
}
