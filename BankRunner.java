
class BankRunner {
    public static void main(String[] args) {
        Bank[] banks = new Bank[5];

        banks[0] = new Bank();
        banks[0].setName("SBI");
        banks[0].setCode("SBIN0001");

        banks[1] = new Bank();
        banks[1].setName("HDFC");
        banks[1].setCode("HDFC0002");

        banks[2] = new Bank();
        banks[2].setName("ICICI");
        banks[2].setCode("ICIC0003");

        banks[3] = new Bank();
        banks[3].setName("Axis");
        banks[3].setCode("AXIS0004");

        banks[4] = new Bank();
        banks[4].setName("Canara");
        banks[4].setCode("CANA0005");

        for (Bank b : banks) {
            System.out.println(b.getName());
            System.out.println(b.getCode());
        }
    }
}