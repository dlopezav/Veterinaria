/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

/**
 *
 * @author Estudiante
 */
public class Cat extends Pet{
    
    public Cat(String name) {
        super(name);
    }
    
    public void speak() {
        System.out.println("Miau");
    }
}
