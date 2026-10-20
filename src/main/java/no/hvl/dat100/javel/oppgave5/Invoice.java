package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;
import no.hvl.dat100.javel.oppgave2.MonthlyPower;

import java.util.Arrays;

public class Invoice {

    private Customer c; // customer associated with this invoice
    private String month; // month that the invoice covers
    private double[][] usage; // power usage this month (per day and per hour)
    private double[][] prices; // power prices for this month

    private double amount; // power price for this month


    public Invoice(Customer c, String month, double[][] usage, double[][] power_prices) {

        this.c = c;
        this.month = month;
        this.usage = usage;
        prices = power_prices;
        amount = 0;

    }

    public void computeAmount() {

        PowerAgreementType agreement = c.getAgreement();

        if (agreement == PowerAgreementType.SPOTPRICE) {
            amount = MonthlyPower.computeSpotPrice(usage, prices);
        } else if (agreement == PowerAgreementType.POWERSUPPORT) {
            amount = MonthlyPower.computeSpotPrice(usage, prices) - MonthlyPower.computePowerSupport(usage, prices);
        } else {
            amount = MonthlyPower.computeNorgesPrice(usage);
        }

    }

    public void printInvoice() {

        System.out.println("Customer number: " + c.getCustomer_id() + "\nName: " + c.getName() + "\nEmail: " + c.getEmail() + "\nAgreement: " + c.getAgreement() + "\n");
        System.out.printf("Month: " + month + "\nUsage: %.2f kWh\nAmount: %.2f NOK\n", MonthlyPower.computePowerUsage(usage), amount);

    }
}
