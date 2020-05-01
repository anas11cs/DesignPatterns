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
public class Ram implements TemporaryStorage
{
    int capa;
    @Override
    public String Capacity(int gb) {
        this.capa=gb;
        return "Capacity is"+gb;
    }

    @Override
    public Integer Price() {
        return 25;
    }

    @Override
    public int getCapacity() {
        return this.capa;
    }
    
}
