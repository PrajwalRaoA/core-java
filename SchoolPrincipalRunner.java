class SchoolPrincipalRunner {
    public static void main(String[] args) {
        School school = new School("Green Valley High", "Mysore", 1200);
        System.out.println("School Details:");
        System.out.println("Name: " + school.getName());
        System.out.println("Location: " + school.getLocation());
        System.out.println("Students: " + school.getNumberOfStudents());

        Principal principal = new Principal("Dr. Kavitha", 50, "PhD in Education");
        school.setPrincipal(principal);

        System.out.println("\nPrincipal Details:");
        Principal p = school.getPrincipal();
        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());
        System.out.println("Qualification: " + p.getQualification());
    }
}
