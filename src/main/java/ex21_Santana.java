import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */
/*
Please enter the number of the month: 3
The name of the month is March
 */

public class ex21_Santana
{
    public static void main( String[] args )
    {
        System.out.println("Please enter the number of the month: ");
        Scanner in1 = new Scanner(System.in);
        String month = in1.nextLine();
        int n1 = Integer.parseInt(month);
        String theMonth="";
        switch(n1)
        {
            case 1:  theMonth = "January";
                break;
            case 2:  theMonth = "February";
                break;
            case 3:  theMonth = "March";
                break;
            case 4:  theMonth = "April";
                break;
            case 5:  theMonth = "May";
                break;
            case 6:  theMonth = "June";
                break;
            case 7:  theMonth = "July";
                break;
            case 8:  theMonth = "August";
                break;
            case 9:  theMonth = "September";
                break;
            case 10:  theMonth = "October";
                break;
            case 11:  theMonth = "November";
                break;
            case 12:  theMonth = "December";
                break;
        }
        System.out.printf("The name of the month is %s", theMonth);
    }
}
