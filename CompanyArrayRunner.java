public class CompanyArrayRunner {
    public static void main(String[] args) {
        Company[] companies = new Company[5];

        for (int i = 0; i < companies.length; i++) {
            companies[i] = new Company();
            companies[i].setName("Company " + (i + 1));
            companies[i].setIndustry("Industry " + (i + 1));
        }

        for (int i = 0; i < companies.length; i++) {
            System.out.println("Company ===== " + (i + 1));
            System.out.println(companies[i].getName());
            System.out.println(companies[i].getIndustry());
        }
    }
}
