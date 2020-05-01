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
public class TouchMouse implements Components
{

    @Override
    public String Name() {
        return "TouchMouse";
    }

    @Override
    public Integer price() {
        return 10;
    }
    
}
