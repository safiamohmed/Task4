/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ieeep;

/**
 *
 * @author admin
 */
public class Geometry {
    private double rediuse;
    private double length;
    private double width;
    private double ℎ𝑒𝑖𝑔ℎ𝑡;
    private double 𝑏𝑎𝑠𝑒;
    public double circleArea(double rediuse){
        this.rediuse=rediuse;
        return Math.PI*Math.pow( this.rediuse, 2);
    }
    public double rectangleArea(double width,double length){
        this.length=length;
        this.width=width;
        return this.length*this.width;
    }
    public double triangleArea(double ℎ𝑒𝑖𝑔ℎ𝑡,double 𝑏𝑎𝑠𝑒 ){
        this.𝑏𝑎𝑠𝑒=𝑏𝑎𝑠𝑒;
        this.ℎ𝑒𝑖𝑔ℎ𝑡=ℎ𝑒𝑖𝑔ℎ𝑡;
        return  0.5*this.ℎ𝑒𝑖𝑔ℎ𝑡*this.𝑏𝑎𝑠𝑒;
    }
    
}
