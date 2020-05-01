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
public class Mi extends AbstractElectronics
{   

    @Override
    public Electronics getElectronics(String Name) {
        if(Name.contains("HandsFree"))
        {
            return new MiHandsFree();
        }
        else
        {
            return new MiMobilePhone();
        }
    }

}
