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
public class AbstractFactory {
    public static void mainAF(){
        // ABSTRACT FACTORY PATTERN MANUAL - as simple as
        // that we have AbstractElectronics to implement abstractness and to initiate the logic of abstract factory
        // ElectronicsCompanyProducer comes to help
        // Then each company is created specifically but a product is fetched without specifying
        // But in return a specified product of that factory is returned
        AbstractElectronics Xiaomi=ElectronicsCompanyProducer.ProduceFactory("Mi");
        Electronics XiaomiProductOne=Xiaomi.getElectronics("HandsFree");
        XiaomiProductOne.ElectronicsType();
        Electronics XiaomiProductTwo=Xiaomi.getElectronics("MobilePhone");
        XiaomiProductTwo.ElectronicsType();
        
        AbstractElectronics SamsungC=ElectronicsCompanyProducer.ProduceFactory("Samsung");
        Electronics SamsungProductOne=SamsungC.getElectronics("HandsFree");
        SamsungProductOne.ElectronicsType();
        Electronics SamsungProductTwo=SamsungC.getElectronics("MobilePhone");
        SamsungProductTwo.ElectronicsType();
        
        AbstractElectronics AppleC=ElectronicsCompanyProducer.ProduceFactory("Apple");
        Electronics AppleProductOne=AppleC.getElectronics("HandsFree");
        AppleProductOne.ElectronicsType();        
        Electronics AppleProductTwo=AppleC.getElectronics("MobilePhone");
        AppleProductTwo.ElectronicsType();       
    }
}
