class School {
    private String name;
    private String location;
    private int numberOfStudents;
    private Principal principal;

    public School() {
    }

    public School(String name, String location, int numberOfStudents) {
        this.name = name;
        this.location = location;
        this.numberOfStudents = numberOfStudents;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setPrincipal(Principal principal) {
        this.principal = principal;
    }

    public Principal getPrincipal() {
        return principal;
    }
}

