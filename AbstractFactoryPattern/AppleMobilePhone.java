/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactoryPattern;

/**
 *
 * @author DELL
 */
public class AppleMobilePhone implements Electronics {
    
    @Override
    public void ElectronicsType() {
        System.out.println("Apple:Mobile Phone Ordered.");
    }
    
}
