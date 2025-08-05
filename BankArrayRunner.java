public class BankArrayRunner {
    public static void main(String[] args) {
        Bank[] banks = new Bank[5];

        for (int i = 0; i < banks.length; i++) {
            banks[i] = new Bank();
            banks[i].setName("Bank " + (i + 1));
            banks[i].setBranch("Branch " + (i + 1));
        }

        for (int i = 0; i < banks.length; i++) {
            System.out.println("Bank ===== " + (i + 1));
            System.out.println(banks[i].getName());
            System.out.println(banks[i].getBranch());
        }
    }
}
