package main.java.lesson4;

import lesson2.ProgramRunner;

import java.math.BigDecimal;
import java.util.Calendar;

public class ControlFlow {
    public static void main(String [] args){


//        if (a<=40){
//            System.out.println("Not so good");
//        } else if (a>40 && a<=60){
//            System.out.println("Pretty good");
//        } System.out.println("Very good");

        int month = Calendar.getInstance().get(Calendar.MONTH);

        int year = Calendar.getInstance().get(Calendar.YEAR);

        System.out.println("Current year is: " + " year " + year);

        switch (month){
            case 0 :
                System.out.println("January");
                System.out.println("31 days");
                break;
            case 1 :
                System.out.println("February");

                if (year%4==0&&(!(year%100==0)||(year%400==0))){
                    System.out.println("29");
                } else System.out.println("28");

                break;
            case 2 :
                System.out.println("March");
                System.out.println("31 days");
                break;
            case 3 :
                System.out.println("April");
                System.out.println("30 days");
                break;
            case 4 :
                System.out.println("May");
                System.out.println("31 days");
                break;
            case 5 :
                System.out.println("June");
                System.out.println("31 days");
                break;
            case 6 :
                System.out.println("July");
                System.out.println("31 days");
                break;
            case 7 :
                System.out.println("August");
                System.out.println("31 days");
                break;
            case 8 :
                System.out.println("September");
                System.out.println("31 days");
                break;
            case 9 :
                System.out.println("October");
                System.out.println("31 days");
                break;
            case 10 :
                System.out.println("November");
                System.out.println("31 days");
                break;
            case 11 :
                System.out.println("December");
                System.out.println("31 days");
            default:
                System.out.println("That's weird");
                break;
        }
    }
}

class ClassName {

    public static void main(String[] args) {

        int a = 4;

        double result = Math.sqrt(a);

        System.out.println(result);

    }

}

class HomeWorkRunner{
    public static void main(String[] args) {
//
//        int a = 10;
//        int b = 8;
//        if (a>b){
//            System.out.println(a);
//        }else {
//            System.out.println(b);
//        }
//
//        int a1 = 13;
//        int d = 15;
//        int g = 10;
//        if (a1>g){
//            if (a1>d){
//                System.out.println(a1);
//            }else if (g>d){
//                System.out.println(g);
//            }else {
//                System.out.println(d);
//            }
//
//        }
//
//        int h = 12;
//        int j = 11;
//        int l = 8;
//        int p = 7;
//
//        if (h>j){
//            if (h>l) {
//                if (h<p){
//                    System.out.println(h);
//                }else {
//                    System.out.println(p);
//                }
//            }else {
//                if (l<p){
//                    System.out.println(l);
//                }else {
//                    if (p>j){
//                        System.out.println(p);
//                    }else {
//                        System.out.println(j);
//                    }
//                }
//            }
//        }else {
//            if (j>l){
//                if (j<p){
//                    System.out.println(j);
//                }else {
//                    if (p>h){
//                        if (p<l){
//                            System.out.println(l);
//                        }else{
//                            System.out.println(p);
//                        }
//                    }else {
//                        System.out.println(h);
//                    }
//                }
//            }else {
//                if (l<p){
//                    System.out.println(l);
//                }else {
//                    System.out.println(p);
//                }
//            }
//        }

        int max = getMax(12, 10, 4, 1);

        System.out.println(max);

    }

    private static int getMax(int a, int b, int c, int d) {

        int max = a;

        if (max < b){
            max = b;
        } else if (max < c){
            max = c;
        } else if (max < d){
            max = d;
        }
        return max;
    }
}