public class MobileStoreRunner {
    public static void main(String[] args) {
        MobileStore m1 = new MobileStore("MobileHub", 101);
        System.out.println(m1.getName());
        System.out.println(m1.getId());
        System.out.println("--------");

        MobileStore m2 = new MobileStore("PhonePoint", 102, "Delhi");
        System.out.println(m2.getName());
        System.out.println(m2.getId());
        System.out.println(m2.getCity());
        System.out.println("--------");

        MobileStore m3 = new MobileStore("SmartWorld", 103, "Mumbai", 150);
        System.out.println(m3.getName());
        System.out.println(m3.getId());
        System.out.println(m3.getCity());
        System.out.println(m3.getModelsAvailable());
        System.out.println("--------");

        MobileStore m4 = new MobileStore("GadgetZone", 104, "Bangalore", 120, "Samsung");
        System.out.println(m4.getName());
        System.out.println(m4.getId());
        System.out.println(m4.getCity());
        System.out.println(m4.getModelsAvailable());
        System.out.println(m4.getBrandFocus());
        System.out.println("--------");

        MobileStore m5 = new MobileStore("PhoneMart", 105, "Hyderabad", 100, "Apple");
        System.out.println(m5.getName());
        System.out.println(m5.getId());
        System.out.println(m5.getCity());
        System.out.println(m5.getModelsAvailable());
        System.out.println(m5.getBrandFocus());
    }
}
