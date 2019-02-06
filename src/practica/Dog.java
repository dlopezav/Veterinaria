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
public class Dog extends Pet implements ILicensable{
    private License license;
    
    public Dog(String name, License license) {
        super(name);
        this.name=name;
        this.license=license;
    }

    @Override
    public License ILicensable() {
        return null;
        
    }
    
    public void speak() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public License getLicense() {
        return license;
    }

    public void setLicense(License license) {
        this.license = license;
    }

    
    
}
