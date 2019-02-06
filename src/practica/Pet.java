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
public abstract class Pet implements ISpeaking {
    protected String name;

    public Pet(String name) {
        this.name = name;
    }

    @Override
    public void speak() {
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
