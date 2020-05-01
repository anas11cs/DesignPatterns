/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuilderPattern;

import java.util.*;

/**
 *
 * @author DELL
 */
public class Laptop {
       private List<Components> components = new ArrayList<Components>();	
       private StorageDisk SD;
       private TemporaryStorage TS;
       
    public void addComponents(Components component){
      components.add(component);
   }
    public String addSD(String sd,int khapacity)
    {
        if(sd.contains("ssd"))
        {
            this.SD=new SSD();
            this.SD.Capacity(khapacity);
            return "SSD";
        }
        else
        {
           this.SD=new HDD();
           this.SD.Capacity(khapacity);
           return "HDD";
        }
    }
    public String addTS(int khapacity)
    {
            this.TS=new Ram();
            TS.Capacity(khapacity);
            return khapacity+"RAM";
    }
   public float getCost(){
      int cost = 0;
      for (Components comp : this.components) {
         cost += comp.price();
      }		
      return cost+this.SD.Price()+this.TS.Price();
   }

   public void showSpecsAndPrice(){
   
      System.out.println("Laptop Components:");
      for(Components comp : this.components) {
         System.out.println("Component Name : " + comp.Name()+"::Component Price : " + comp.price());
      }
      System.out.println("RAM Capacity:"+TS.getCapacity()+"::RAM Price:"
      +TS.Price()+"\nStorage Device Type:"+SD.Name()+"::Storage Device Capacity:"
      +SD.getCapacity()+"::Storage Device Price:"+SD.Price());
   }	
}
