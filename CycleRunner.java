class CycleRunner
{
 public static void main(String[] args)
{
 Cycle cycle = new Cycle();
 cycle.setName("hero");
 System.out.println(cycle.getName());
 cycle.setPrice(10000);
 System.out.println(cycle.getPrice());
 cycle.setGears(5);
 System.out.println(cycle.getGears());
}
}