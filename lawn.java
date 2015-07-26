/* lawn.java
 * Name: Jessica Xie
 * User: jqxie
 * This program returns five numbers: the length and width of a rectangular lot,
 * the length and width of a rectangular house on the lot, and the rate at which
 * the lawn will be mowed.
 */

import java.util.*;

class lawn{
    public static void main(String[] args){
        double j, k, x, y, lotLW, houseLW, mowRate, mowTime, area;
        int h, m, s;
        Scanner scan = new Scanner(System.in);

        //output
        String a = "hours";
        String b = "minutes";
        String c = "seconds";

        System.out.print("Enter the length and width of the lot, in feet: ");
        x = scan.nextDouble(); //length
        y = scan.nextDouble(); //width
        lotLW = x*y; // lot area
        System.out.print("Enter the length and width of the house, in feet: ");
        j = scan.nextDouble(); //length
        k = scan.nextDouble(); //width
        houseLW = j*k; //house area
        area = lotLW-houseLW; //total area
        System.out.print("The area is: ");
        System.out.println(area);
        System.out.print("Enter the mowing rate, in square feet per second: ");
        mowRate = scan.nextDouble();
        mowTime = area/mowRate;

        s = (int)Math.round(mowTime);
        m = s/60;
        s = s%60;
        h = m/60;
        m = m%60;
        // if statement
        if(h==1){
                a = "hour";
        }if(m==1){
                b = "minute";
        }if(s==1){
                c = "second";
        }

        System.out.print("The mowing time is ");
        System.out.println(h+" "+a+" "+m+" "+b+" "+s+" "+c);
     }
}
