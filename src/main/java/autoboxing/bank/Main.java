package autoboxing.bank;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("J P Morgan Bank");

        bank.addBranch("Chase Bank");

        bank.addCustomer("Chase Bank", "Tim", 50.05);
        bank.addCustomer("Chase Bank", "Mike", 175.34);
        bank.addCustomer("Chase Bank", "Percy", 220.12);

        bank.addCustomerTransaction("Chase Bank", "Tim", 44.22);
        bank.addCustomerTransaction("Chase Bank", "Tim", 12.44);
        bank.addCustomerTransaction("Chase Bank", "Mike", 1.65);

        bank.listCustomers("Chase Bank", true);
        System.out.println();
        bank.listCustomers("Chase Bank", false);
    }
}