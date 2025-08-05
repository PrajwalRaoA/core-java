class Addition
{
public static void main(String[] args)
{
addition();
addition(122,234);
}
public static void addition()
{
System.out.println("without arguments");
 int a=17;
int b=344;
int c=a + b;
System.out.println("sum of two variables=" +c);
}
public static void addition(int a,int b)
{
System.out.println("with arguments");
 int c=a+b;
System.out.println("sum of two variables=" +c);
}
}
