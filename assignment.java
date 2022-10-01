class Bank {
    String city;
    Float roi;
    Bank(String city, float roi) {
        this.city = city;
        this.roi = roi;
    }
    public void getDetails() {
        System.out.println("City " + city);
        System.out.println("Rate of interest " + roi);
    }
}
class SBI extends Bank {
    String branchId;
    public SBI(String city, float roi, String branchId) {
        super(city, roi);
        this.branchId = branchId;
    }
    public void getDetails() {
        super.getDetails();
        System.out.println("BranchId " + branchId);
    }
}
class BOI extends Bank {
    String branchId;
    public BOI(String city, float roi, String branchId) {
        super(city, roi);
        this.branchId = branchId;
    }
    public void getDetails() {
        super.getDetails();
        System.out.println("BranchId " + branchId);
    }
}
class ICICI extends Bank {
    String branchId;
    public ICICI(String city, float roi, String branchId) {
        super(city, roi);
        this.branchId = branchId;
    }
    public void getDetails() {
        super.getDetails();
        System.out.println("BranchId " + branchId);
    }
}
public class assignment {
    public static void main(String[] args) {
        Bank bank = new Bank("Noida", 1.2f);
        SBI sbiBranch = new SBI("Sector 37",1.0f,"S37");
        BOI boiBranch = new BOI("Sector 62",1.5f,"S62");
        ICICI iciciBranch = new ICICI("Sector 2",2.0f,"S02");
        bank.getDetails();
        sbiBranch.getDetails();
        boiBranch.getDetails();
        iciciBranch.getDetails();
    }
}
