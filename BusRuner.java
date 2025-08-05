class BusRuner
{
 public static void main(String[] args)
{
 System.out.println("BusSeries" +Bus.busSeries);
 System.out.println("busnumber" +Bus.busNumber);
  System.out.println("busmilage" +Bus.milage);
 System.out.println("busprice" +Bus.price);
int totalPrice;
totalPrice = Bus.getTotalPrice(5);
System.out.println("Total price of buses is" + totalPrice);
totalAmount = Bus.totalAmountinTrip();
System.out.println("Total amount in trip is" +totalAmount);
}
}


