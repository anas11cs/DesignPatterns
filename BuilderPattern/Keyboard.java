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
public class Keyboard implements Components
{

    @Override
    public String Name() {
        return "Keyboard"; //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Integer price() {
        return 10;
    }
    
}
