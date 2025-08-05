class Calculator
{
 public static void main(String[] args)
{
 int a=20;
 int b=10;
 char operator ='+';
 if(operator == '+')
{
 System.out.println("Addition is " +(a + b));
}
 else if(operator == '-')
{
 System.out.println("Subtraction is " +(a - b));
}
 if(operator == '*')
{
 System.out.println("Multiplication is " +(a * b));
}
 if(operator == '/')
{
 System.out.println("Addition is " +(a + b));
}
 if(operator == '%')
{
 System.out.println("Modulus is " +(a % b));
}
else{
 System.out.println("Invalid operator");
}
}
}