package com.xworkz.inheritance;

public class Father extends GrandFather
{
    public String name;

    public void familyDetails()
    {
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
        name="Nagarjuna";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
        super.name="Akineeni";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);

    }
}
