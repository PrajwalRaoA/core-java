public class HospitalRunner {
    public static void main(String[] args) {
        Hospital h1 = new Hospital("Apollo", 201);
        System.out.println(h1.getName());
        System.out.println(h1.getId());
        System.out.println("--------");

        Hospital h2 = new Hospital("Fortis", 202, "Delhi");
        System.out.println(h2.getName());
        System.out.println(h2.getId());
        System.out.println(h2.getCity());
        System.out.println("--------");

        Hospital h3 = new Hospital("Narayana", 203, "Bangalore", 150);
        System.out.println(h3.getName());
        System.out.println(h3.getId());
        System.out.println(h3.getCity());
        System.out.println(h3.getBeds());
        System.out.println("--------");

        Hospital h4 = new Hospital("AIIMS", 204, "Bhopal", 250, "Government");
        System.out.println(h4.getName());
        System.out.println(h4.getId());
        System.out.println(h4.getCity());
        System.out.println(h4.getBeds());
        System.out.println(h4.getType());
        System.out.println("--------");

        Hospital h5 = new Hospital("Manipal", 205, "Udupi", 100, "Private");
        System.out.println(h5.getName());
        System.out.println(h5.getId());
        System.out.println(h5.getCity());
        System.out.println(h5.getBeds());
        System.out.println(h5.getType());
    }
}
