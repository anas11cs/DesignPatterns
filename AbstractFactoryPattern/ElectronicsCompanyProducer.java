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
public class ElectronicsCompanyProducer
{
    public static AbstractElectronics ProduceFactory(String Name)
    {
        if(Name.contains("Mi"))
        {
            return new Mi();
        }
        else if(Name.contains("Samsung"))
        {
            return new Samsung();
        }
        else
        {
            return new Apple();
        }
    }
}
