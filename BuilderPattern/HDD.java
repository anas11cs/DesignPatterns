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
public class HDD implements StorageDisk
{
    int capa;
    @Override
    public String Name() {
        return "HDD";
    }

    @Override
    public String Capacity(int gb) {
        this.capa=gb;
        return "Capacity is"+gb;
    }

    @Override
    public Integer Price() {
        return 50;
    }
    
    @Override
    public int getCapacity() {
        return this.capa;
    }
}
