package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        GetPlanFactory planFactory = new GetPlanFactory();

        System.out.println("Enter the Plan type");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String planName = bufferedReader.readLine();

        System.out.println("Enter the number of units that consumed");

        int unitConsumed = Integer.parseInt(bufferedReader.readLine());

        Plan plan = planFactory.getPlan(planName);

        System.out.println("Bill Amount for " +planName + " of" + unitConsumed + " units is: ");
        plan.getRate();
        plan.calculateBill(unitConsumed);


    }
}