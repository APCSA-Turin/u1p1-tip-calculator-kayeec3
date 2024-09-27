package com.example.project;

public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      
        StringBuilder result = new StringBuilder();
        double totalTip = ((percent*0.01)*cost);
        //This is the total cost of the bill
        double billTip = totalTip + cost;
        //This is the cost per person without tip
        double costPerson = cost/people;
        //This is the tip cost per person
        double tipPerson = totalTip/people;
        //This is the total cost per person including tip
        double totalPerson = billTip/people;
        
        result.append("-------------------------------\n");
        result.append("Total bill before tip: ").append("$").append(cost).append("\n");; //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: ").append(percent).append("%\n");
        //Math.round rounds the decimal
        result.append("Total tip: ").append("$").append(Math.round(totalTip * 100.0) / 100.0).append("\n");
        result.append("Total Bill with tip: ").append("$").append(Math.round(billTip * 100.0) / 100.0).append("\n");
        result.append("Per person cost before tip: ").append("$").append(Math.round(costPerson * 100.0) / 100.0).append("\n");
        result.append("Tip per person: ").append("$").append(Math.round(tipPerson * 100.0) / 100.0).append("\n");
        result.append("Total cost per person: ").append("$").append(Math.round(totalPerson * 100.0) / 100.0).append("\n");
        result.append("-------------------------------\n");
        


        return result.toString();
    }
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people = 12;
        int percent = 15;
        double cost = 566.97;              
        System.out.println(calculateTip(people,percent,cost));
    }
}
        
