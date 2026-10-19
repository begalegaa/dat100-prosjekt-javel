package no.hvl.dat100.javel.oppgave1;

import java.beans.Transient;

import no.hvl.dat100.javel.oppgave2.MonthlyPower;

public class DayMain {

    public static void main(String[] args) {

        // test data
        double[] powerusage_day = DayPowerData.powerusage_day;

        double[] powerprices_day = DayPowerData.powerprices_day;

        System.out.println("==============");
        System.out.println("OPPGAVE 1");
        System.out.print("==============");

        // a)
        nyDelOppgave("a)");
        DailyPower.printPowerPrices(powerprices_day);

        // b)
        nyDelOppgave("b)");
        DailyPower.printPowerUsage(powerusage_day);

        // c)
        nyDelOppgave("c)");
        System.out.printf("%.2f kWh ",DailyPower.computePowerUsage(powerusage_day));

        // d)
        nyDelOppgave("d)");
        System.out.printf("%.2f NOK ",DailyPower.computeSpotPrice(powerusage_day, powerprices_day));

        // f)
        nyDelOppgave("f)");
        System.out.printf("%.2f NOK ",DailyPower.computePowerSupport(powerusage_day, powerprices_day));

        // g)
        nyDelOppgave("g)");
        System.out.printf("%.2f NOK ",DailyPower.computeNorgesPrice(powerusage_day));

        // h)
        nyDelOppgave("h)");
        System.out.printf("%.2f kWh ",DailyPower.findPeakUsage(powerusage_day));

        // i)
        nyDelOppgave("i)");
        System.out.printf("%.2f kWh ",DailyPower.findAvgPower(powerusage_day));

    }

    public static void nyDelOppgave(String tittel) {
        
        System.out.println();
        System.out.println();
        System.out.println(tittel);
        System.out.println();

    }
}
