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
public class Retriever extends Dog{
    
    public Retriever(String name, License license) {
        super(name, license);
    }

    @Override
    public void speak() {
        System.out.println("Woof");
    }
    
}
