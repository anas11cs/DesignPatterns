/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingletonPackage;
import AbstractFactoryPattern.AbstractFactory;
import BuilderPattern.Builder;
/**
 *
 * @author DELL
 */
public class Singleton {
    
    public static void main(String[] args) {
        // SINGLETON PATTERN MANUAL - as simple as
        // Sessions in an application can be maintained using SINGLETON pattern
        // By hiding sessions implementation and just "grab and go"
        // Can be treated as a default functionality by a framework
        System.out.println("======= SINGLETON PATTERN BELOW =======");
        SingletonImplementation Sessions=SingletonImplementation.getInstance();
        Sessions.add("Anas");
        Sessions.add("Windy");
        Sessions.add("Windy");
        Sessions.remove("Kuch Bhi");
        Sessions.remove("Windy");
        System.out.println("======= ABSTRACT FACTORY PATTERN BELOW =======");
        AbstractFactory AF=new AbstractFactory();
        AF.mainAF();
        System.out.println("======= BUILDER PATTERN BELOW =======");
        Builder B=new Builder();
        B.mainB();
    }
    
}
