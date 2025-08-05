class Bike {
 static String name="Bullet";
 static String company="Royal enfield";
 static float price=100000;
 static String colour="black";
 static float milage=35;

public static void main(String[] args) 
{
 String Name=nameofBike();
 System.out.println(Name);

 String Company=nameofCompany();
 System.out.println(Company);

 float Price=priceofBike();
 System.out.println(Price);

 String Colour=colourofBike();
System .out.println(Colour);

 float Milage=milageofBike();
 System.out.println(Milage);

 }
public static String nameofBike()
{
 return name;
}
public static String nameofCompany()
{
 return company;
}
public static float priceofBike()
{
 return price;
}
public static String colourofBike()
{
 return colour;
}
public static float milageofBike()
{
 return milage;
}
}