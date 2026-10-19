package no.hvl.dat100.javel.oppgave3;

import no.hvl.dat100.javel.oppgave4.Customers;
import no.hvl.dat100.javel.oppgave1.DayMain;

public class CustomerMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 3");
        System.out.println("==============");

        // a, b, c og d)
        DayMain.nyDelOppgave("a, b, c og d)");

        Customer c1 = new Customer("Smith Alice", "smith@example.com", 1000, PowerAgreementType.POWERSUPPORT);

        System.out.println(c1.getName());
        System.out.println(c1.getEmail());
        System.out.println(c1.getCustomer_id());
        System.out.println(c1.getAgreement());
        System.out.println();

        System.out.println(c1.toString());
        System.out.println();

        c1.setName("Alice Smith");
        c1.setEmail("alice@example.com");
        c1.setCustomer_id(1001);
        c1.setAgreement(PowerAgreementType.SPOTPRICE);

        System.out.println(c1.toString());
    }
}
