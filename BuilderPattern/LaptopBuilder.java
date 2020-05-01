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
public class LaptopBuilder {

   public Laptop manufactureBasicLaptop (){
      Laptop laptop = new Laptop();
      laptop.addComponents(new PhysicalPorts());
      laptop.addComponents(new TouchMouse());
      laptop.addComponents(new Keyboard());
      laptop.addSD("hdd",512);
      laptop.addTS(4);
      return laptop;
   }   

   public Laptop manufactureProfessionalLaptop (){
      Laptop laptop = new Laptop();
      laptop.addComponents(new PhysicalPorts());
      laptop.addComponents(new TouchMouse());
      laptop.addComponents(new Keyboard());
      laptop.addComponents(new ExternalPorts());
      laptop.addSD("hdd",512);
      laptop.addTS(8);
      return laptop;
   }
    public Laptop manufactureGamingLaptop (){
      Laptop laptop = new Laptop();
      laptop.addComponents(new PhysicalPorts());
      laptop.addComponents(new TouchMouse());
      laptop.addComponents(new Keyboard());
      laptop.addComponents(new ExternalPorts());
      laptop.addComponents(new GPU());
      laptop.addComponents(new GamingKit());
      laptop.addSD("ssd",2);
      laptop.addTS(32);
      return laptop;
   }
    public Laptop manufactureDeveloperLaptop (){
      Laptop laptop = new Laptop();
      laptop.addComponents(new PhysicalPorts());
      laptop.addComponents(new TouchMouse());
      laptop.addComponents(new Keyboard());
      laptop.addComponents(new ExternalPorts());
      laptop.addComponents(new GPU());
      laptop.addSD("ssd",1);
      laptop.addTS(32);
      return laptop;
   }
}