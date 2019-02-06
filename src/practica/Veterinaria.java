/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Veterinaria {
    
    private String name;
    private ArrayList<ISpeaking> Animals;

    public Veterinaria(String name) {
        this.Animals= new ArrayList<>();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        String x=null;
        for(ISpeaking a: Animals){
        }
        return null;
    }

    public void addAnimal(ISpeaking animal) {
        Animals.add(animal);
    }
    
    
    
    
}
