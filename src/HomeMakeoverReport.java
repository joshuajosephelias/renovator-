

import java.util.Arrays;

public class HomeMakeoverReport {

    public static void main(String[] args) {

        // Single-dimensiona
        String[] months = {"JAN", "FEB", "MAR", "APR", "MAY", "JUN"};

        // Two-dimensional array
        // Rows
        int[][] makeovers = {
                {8, 2, 5},   // Jan
                {7, 4, 5},   // Feb
                {5, 5, 2},   // Mar
                {2, 2, 3},   // Apr
                {7, 7, 9},   // Ma
                {7, 8, 5}    // Jun
        };




        //
        int[] monthlyTotals = new int[months.length];

        // ---- Report Header ----
        System.out.println("------------------------------------------------------------");
        System.out.println("HOME MAKEOVER REPORT");
        System.out.println("------------------------------------------------------------");
        System.out.printf("%-10s%-12s%-12s%-12s%n", "", "Bathrooms", "Kitchens", "Garden");

        // ---- Print monthly breakdown and calculate totals ----
        for (int i = 0; i < months.length; i++) {
            System.out.printf("%-10s%-12d%-12d%-12d%n",
                    months[i], makeovers[i][0], makeovers[i][1], makeovers[i][2]);

            int total = 0;
            for (int j = 0; j < makeovers[i].length; j++) {
                total += makeovers[i][j];
            }
            monthlyTotals[i] = total;
        }

        //
        System.out.println("------------------------------------------------------------");
        System.out.println("MONTHLY TOTALS");
        System.out.println("------------------------------------------------------------");

        for (int i = 0; i < monthlyTotals.length; i++) {
            String stars = (monthlyTotals[i] >= 15) ? "***" : "";
            System.out.printf("%-10s%-12d%s%n", months[i], monthlyTotals[i], stars);
        }

        System.out.println("------------------------------------------------------------");
    }
}