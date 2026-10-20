package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;
import no.hvl.dat100.javel.oppgave4.Customers;
import no.hvl.dat100.javel.oppgave1.DayMain;
import no.hvl.dat100.javel.oppgave2.MonthPowerData;

public class InvoiceMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 5");
        System.out.println("==============");
    

        Customer c1 = new Customer("Customer 1", "customer1@email.com", 1001, PowerAgreementType.SPOTPRICE);
        Customer c2 = new Customer("Customer 2", "customer2@email.com", 1002, PowerAgreementType.POWERSUPPORT);
        Customer c3 = new Customer("Customer 3", "customer3@email.com", 1003, PowerAgreementType.NORGESPRICE);

        Invoice i1 = new Invoice(c1, "this month", CustomerPowerUsageData.usage_month_customer1, MonthPowerData.powerprices_month);
        Invoice i2 = new Invoice(c2, "this month", CustomerPowerUsageData.usage_month_customer2, MonthPowerData.powerprices_month);
        Invoice i3 = new Invoice(c3, "this month", CustomerPowerUsageData.usage_month_customer3, MonthPowerData.powerprices_month);

        i1.computeAmount();
        i2.computeAmount();
        i3.computeAmount();

        i1.printInvoice();
        System.out.println();
        i2.printInvoice();
        System.out.println();
        i3.printInvoice();
        System.out.println();

        Invoice[] invoices = new Invoice[3];
        invoices[0] = i1;
        invoices[1] = i2;
        invoices[2] = i3;

        Invoices.processInvoices(invoices);
    }
}
