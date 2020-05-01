/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuilderPattern;

/**
 *
 * @author DELL
 */
public class Processor implements Components
{

    @Override
    public String Name() {
        return "Processor";
    }

    @Override
    public Integer price() {
        return 150;
    }
    
}
