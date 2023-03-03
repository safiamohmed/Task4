/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ieeep;

/**
 *
 * @author admin
 */
public class Custom_exception extends RuntimeException {
    Custom_exception(String massege){
    super("You entered a number outside the range 1 to 4 when selecting\n" +
                                   "item from the list.");
    
    }
    
}
