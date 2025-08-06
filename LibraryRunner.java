public class LibraryRunner {
    public static void main(String[] args) {
        Library l1 = new Library("City Library", 201);
        System.out.println(l1.getName());
        System.out.println(l1.getId());
        System.out.println("--------");

        Library l2 = new Library("Public Library", 202, "Chennai");
        System.out.println(l2.getName());
        System.out.println(l2.getId());
        System.out.println(l2.getCity());
        System.out.println("--------");

        Library l3 = new Library("Central Library", 203, "Mumbai", 25000);
        System.out.println(l3.getName());
        System.out.println(l3.getId());
        System.out.println(l3.getCity());
        System.out.println(l3.getNumberOfBooks());
        System.out.println("--------");

        Library l4 = new Library("University Library", 204, "Delhi", 30000, "Academic");
        System.out.println(l4.getName());
        System.out.println(l4.getId());
        System.out.println(l4.getCity());
        System.out.println(l4.getNumberOfBooks());
        System.out.println(l4.getType());
        System.out.println("--------");

        Library l5 = new Library("Digital Library", 205, "Hyderabad", 15000, "Online");
        System.out.println(l5.getName());
        System.out.println(l5.getId());
        System.out.println(l5.getCity());
        System.out.println(l5.getNumberOfBooks());
        System.out.println(l5.getType());
    }
}
