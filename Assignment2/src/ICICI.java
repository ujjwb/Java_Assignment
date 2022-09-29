public class ICICI extends Bank {
    String ifsc, bankName;
    double rateOfInterest, balance;
    long accNumber;
    public ICICI() {
        ifsc="ICIC000099";
        rateOfInterest=3.5;
        accNumber=0;
        balance=0;
    }


    @Override
    void getDetails() {
        System.out.println("ICICI BANK");
        System.out.println("IFSC CODE: "+ifsc);
        System.out.println("INTEREST RATE: "+rateOfInterest);
    }

    @Override
    void printDetails() {
        System.out.println("ACCOUNT NUMBER: "+accNumber);
        System.out.println("BALANCE: "+balance);
    }
}