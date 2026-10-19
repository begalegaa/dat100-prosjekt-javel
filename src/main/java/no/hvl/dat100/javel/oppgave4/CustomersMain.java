package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;
import no.hvl.dat100.javel.oppgave1.DayMain;

public class CustomersMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 4");
        System.out.println("==============");
        
        // a, b og d)
        DayMain.nyDelOppgave("a, b og d)");
        Customers customers = new Customers(10);
        
        Customer c1 = new Customer("Example Person 1", "example@1.com", 1001, PowerAgreementType.SPOTPRICE);
        Customer c2 = new Customer("Example Person 2", "example@2.com", 1002, PowerAgreementType.NORGESPRICE);
        Customer c3 = new Customer("Example Person 3", "example@3.com", 1003, PowerAgreementType.POWERSUPPORT);
        Customer c4 = new Customer("Example Person 4", "example@4.com", 1004, PowerAgreementType.NORGESPRICE);

        customers.addCustomer(c1);
        customers.addCustomer(c2);
        customers.addCustomer(c3);
        customers.addCustomer(c4);

        System.out.println(customers.countNonNull());

        // c)
        DayMain.nyDelOppgave("c)");
        System.out.println(customers.getCustomer(1002));
        System.out.println(customers.getCustomer(9999));

        // e)
        DayMain.nyDelOppgave("e)");
        customers.removeCustomer(1001);
        System.out.println(customers.countNonNull());

        // f)
        DayMain.nyDelOppgave("f)");
        Customer[] all = customers.getCustomers();
        for (int i = 0; i < all.length; i++) {
            System.out.println(all[i]);
            System.out.println();
        }

    }
}
