public class BankRunner {
    public static void main(String[] args) {
        Bank b1 = new Bank("SBI", 111);
        System.out.println(b1.getName());
        System.out.println(b1.getCode());
        System.out.println("--------");

        Bank b2 = new Bank("ICICI", 112, "Mumbai");
        System.out.println(b2.getName());
        System.out.println(b2.getCode());
        System.out.println(b2.getBranch());
        System.out.println("--------");

        Bank b3 = new Bank("HDFC", 113, "Bangalore", 500);
        System.out.println(b3.getName());
        System.out.println(b3.getCode());
        System.out.println(b3.getBranch());
        System.out.println(b3.getEmployees());
        System.out.println("--------");

        Bank b4 = new Bank("Canara", 114, "Chennai", 800, "Government");
        System.out.println(b4.getName());
        System.out.println(b4.getCode());
        System.out.println(b4.getBranch());
        System.out.println(b4.getEmployees());
        System.out.println(b4.getType());
        System.out.println("--------");

        Bank b5 = new Bank("Axis", 115, "Pune", 600, "Private");
        System.out.println(b5.getName());
        System.out.println(b5.getCode());
        System.out.println(b5.getBranch());
        System.out.println(b5.getEmployees());
        System.out.println(b5.getType());
    }
}
