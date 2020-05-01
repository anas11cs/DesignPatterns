/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingletonPackage;
import java.util.*;
/**
 *
 * @author DELL
 */
public class SingletonImplementation {
    private static SingletonImplementation privateAccess=new SingletonImplementation();
    private static List<String> Sessions=new ArrayList<String>();
    
    private SingletonImplementation(){}
    
    public static SingletonImplementation getInstance(){
      return privateAccess;
   }
    public static boolean add(String Add_Session){
        if(Sessions.contains(Add_Session))
        {
            System.out.println("Session for "+Add_Session+" already exists");
            return false;
        }
        else
        {
            System.out.println("Session for "+Add_Session+" added");
            Sessions.add(Add_Session);
            return true;
        }
    }
    public static boolean remove(String Remove_Session){
        if(Sessions.contains(Remove_Session))
        {
            System.out.println("Session for "+Remove_Session+" Removed");            
            Sessions.remove(Remove_Session);
            return true;
        }
        else
        {
            System.out.println("Session for "+Remove_Session+" doesn't exists");
            return false;
        }
    }
}
