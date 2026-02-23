package Math;

import java.util.Scanner;

public class AreaAndPerimeter {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        int r= sc.nextInt();
        double area=r*r*((double)22/7);
        System.out.println("Area of Cirlce: "+area);
        double perimeter=2*((double)22/7)*r;
        System.out.println("Perimeter of Cirlce: "+perimeter);
    }
}
