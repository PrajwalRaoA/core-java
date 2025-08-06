public class SchoolRunner {
    public static void main(String[] args) {
        School s1 = new School("Oxford", 1001);
        System.out.println(s1.getName());
        System.out.println(s1.getCode());
        System.out.println("--------");

        School s2 = new School("Cambridge", 1002, "London");
        System.out.println(s2.getName());
        System.out.println(s2.getCode());
        System.out.println(s2.getCity());
        System.out.println("--------");

        School s3 = new School("DAV", 1003, "Delhi", 1200);
        System.out.println(s3.getName());
        System.out.println(s3.getCode());
        System.out.println(s3.getCity());
        System.out.println(s3.getStrength());
        System.out.println("--------");

        School s4 = new School("NPS", 1004, "Bangalore", 900, "Private");
        System.out.println(s4.getName());
        System.out.println(s4.getCode());
        System.out.println(s4.getCity());
        System.out.println(s4.getStrength());
        System.out.println(s4.getType());
        System.out.println("--------");

        School s5 = new School("Kendriya Vidyalaya", 1005, "Mysore", 1000, "Government");
        System.out.println(s5.getName());
        System.out.println(s5.getCode());
        System.out.println(s5.getCity());
        System.out.println(s5.getStrength());
        System.out.println(s5.getType());
    }
}
