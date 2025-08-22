package com.xworkz.inheritance;

public class Son extends Father{
    public int salary;
    public int noOfFriends;

    public Son()
    {

    }
    public Son(String name,int salary, int noOfFriends)
    {
        this.name=name;
        this.salary=salary;
        this.noOfFriends=noOfFriends;
    }
    public void getSonDetails()
    {
        System.out.println("Son's details: name "+name+" salary "+salary+" noOfFriends "+noOfFriends);
    }
}
