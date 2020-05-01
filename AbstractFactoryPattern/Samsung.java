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
public class Samsung extends AbstractElectronics
{

    @Override
    public Electronics getElectronics(String Name) {
        if(Name.contains("HandsFree"))
        {
            return new SamsungHandsFree();
        }
        else
        {
            return new SamsungMobilePhone();
        }
    }

}
