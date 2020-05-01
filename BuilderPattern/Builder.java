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
public class Builder {
    // BUILD PATTERN MANUAL - as simple as
    // IN THIS BUILDER IS LaptopBuilder-Builder & it build Laptop-class
    // and Laptop-class adds the components to laptop to build it
    
      public static void mainB()
      
      {
      LaptopBuilder laptopBuilder = new LaptopBuilder();

      
      //1
      Laptop basicLaptop = laptopBuilder.manufactureBasicLaptop();
      System.out.println("Basic Laptop Build\n");
      basicLaptop.showSpecsAndPrice();
      System.out.println("\nTotal Cost=" +basicLaptop.getCost());

      //2
      Laptop professionallaptop = laptopBuilder.manufactureProfessionalLaptop();
      System.out.println("====\nProfessional Laptop");
      professionallaptop.showSpecsAndPrice();
      System.out.println("\nTotal Cost=" +professionallaptop.getCost());
      
      //3
      
      Laptop gaminglaptop = laptopBuilder.manufactureGamingLaptop();
      System.out.println("====\nGaming Laptop");
      gaminglaptop.showSpecsAndPrice();
      System.out.println("\nTotal Cost=" +gaminglaptop.getCost());
      //4
      
      Laptop developerlaptop = laptopBuilder.manufactureDeveloperLaptop();
      System.out.println("====\nProfessional Laptop\n");
      developerlaptop.showSpecsAndPrice();
      System.out.println("Total Cost=" +developerlaptop.getCost());
    }
}
