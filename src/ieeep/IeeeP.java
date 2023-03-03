/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ieeep;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class IeeeP {  
    public static void main(String[] args) throws FileNotFoundException, IOException,Custom_exception {
          Geometry g=new Geometry();  
          File fin =new File("data.txt");
          File fout =new File("out.txt");
          FileWriter prout = new FileWriter(fout,true);
          
          PrintWriter outputt = new PrintWriter(prout);
          Scanner input =new Scanner (fin);
            
            
            
            
            
           
            int choice;
            do{
                outputt.println("Enter your choice (1-4):");
                outputt.println("1. Calculate the Area of a Circle");
                outputt.println("2. Calculate the Area of a Rectangle");
                outputt.println("3. Calculate the Area of a Triangle");
                outputt.println("4. Quit");
                
                
                choice=input.nextInt();
                
                
                
                
                switch(choice) {
                    case 1:
                        outputt.print("Enter radius of circle: ");
                        double r = input.nextDouble();
                        
                        outputt.println("Area of circle = " + g.circleArea(r));
                        break;
                        
                    case 2:
                        System.out.print("Enter width of rectangle: ");
                        double width = input.nextDouble();
                        System.out.print("Enter length of rectangle: ");
                        double length = input.nextDouble();
                        
                        outputt.println("Area of rectangle = " + g.rectangleArea(width, length));
                        break;
                        
                    case 3:
                        outputt.print("Enter ℎ𝑒𝑖𝑔ℎ𝑡 of triangle: ");
                        double ℎ𝑒𝑖𝑔ℎ𝑡 = input.nextDouble();
                        outputt.print("Enter 𝑏𝑎𝑠𝑒 of c: ");
                        double 𝑏𝑎𝑠𝑒 = input.nextDouble();
                        outputt.println(" Area of rectangle  = " + g.triangleArea(ℎ𝑒𝑖𝑔ℎ𝑡, 𝑏𝑎𝑠𝑒));
                        break;
                    case 4:
                        
                        break;
                        
                        
                }}while(choice<4);
            
            
            
            
            
            outputt.close();
        }

    }
    
    

