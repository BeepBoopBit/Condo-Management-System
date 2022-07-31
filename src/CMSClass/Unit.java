/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CMSClass;

/**
 *
 * @author wcbre
 */
public class Unit extends CondoData{
    
    public boolean replaceValue(int index, int value){
        try{
            String valueStr = "U"+Integer.toString(value);
            _data.set(index, valueStr);
        }catch(Exception e){ // error value
            return false;
        }
        return true;
    }
}
