package Conditions;

import java.util.Scanner;

public class GradePointAverage {


    public static void main(String[] args) {

//import scanner class
        Scanner input = new Scanner(System.in);
        //create variables

        int math, chemistry, physics, english, history, music;


        //get grade point for each class from user

        System.out.print("Your Math Grade: ");
        math = input.nextInt();
        System.out.print("Your Chemistry Grade: ");
        chemistry = input.nextInt();
        System.out.print("Your Physics Grade: ");
        physics = input.nextInt();
        System.out.print("Your English Grade: ");
        english = input.nextInt();
        System.out.print("Your History Grade: ");
        history = input.nextInt();
        System.out.print("Your Music Grade: ");
        music = input.nextInt();
        double average=(math+chemistry+physics+english+history+music)/6;
        System.out.println("Your Average is:" +average);
        System.out.print("Result: ");
        System.out.println(average<60?"Fail":"Success");
    }
}
