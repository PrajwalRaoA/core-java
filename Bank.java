class Bank {
    private String name;
    private int code;
    private String branch;
    private int employees;
    private String type;

    public Bank() {
    }

    public Bank(String name, int code) {
        System.out.println("Initializing name and code");
        this.name = name;
        this.code = code;
    }

    public Bank(String name, int code, String branch) {
        this(name, code);
        System.out.println("Initializing branch");
        this.branch = branch;
    }

    public Bank(String name, int code, String branch, int employees) {
        this(name, code, branch);
        System.out.println("Initializing employees");
        this.employees = employees;
    }

    public Bank(String name, int code, String branch, int employees, String type) {
        this(name, code, branch, employees);
        System.out.println("Initializing type");
        this.type = type;
    }

    public String getName() { return name; }
    public int getCode() { return code; }
    public String getBranch() { return branch; }
    public int getEmployees() { return employees; }
    public String getType() { return type; }
}
