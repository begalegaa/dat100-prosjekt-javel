package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DayPowerData;
import no.hvl.dat100.javel.oppgave1.DayMain;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MonthMain {
    public static void main(String[] args) {

        // test data
        double[][] power_prices_month = MonthPowerData.powerprices_month;

        double[][] power_usage_month = MonthPowerData.powerusage_month;

        System.out.println("==============");
        System.out.println("OPPGAVE 2");
        System.out.println("==============");

        // a)
        DayMain.nyDelOppgave("a)");
        MonthlyPower.print_PowerUsage(power_usage_month);

        // b)
        DayMain.nyDelOppgave("b)");
        MonthlyPower.print_PowerPrices(power_prices_month);

        // c)
        DayMain.nyDelOppgave("c)");
        System.out.printf("%.2f, kWh ", MonthlyPower.computePowerUsage(power_usage_month));

        // d)
        DayMain.nyDelOppgave("d)");
        System.out.println("Threshold 3: " + MonthlyPower.exceedThreshold(power_usage_month, 3));
        System.out.println("Threshold 30000000: " + MonthlyPower.exceedThreshold(power_usage_month, 30000000));

        // e)
        DayMain.nyDelOppgave("e)");
        System.out.printf("%.2f, NOK ", MonthlyPower.computeSpotPrice(power_usage_month, power_prices_month));

        // f)
        DayMain.nyDelOppgave("f)");
        System.out.printf("%.2f, NOK ", MonthlyPower.computePowerSupport(power_usage_month, power_prices_month));

        // g)
        DayMain.nyDelOppgave("g)");
        System.out.printf("%.2f, NOK ", MonthlyPower.computeNorgesPrice(power_usage_month));

    }
}