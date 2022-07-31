/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CMSClass;

import java.util.ArrayList;

/**
 *
 * @author wcbre
 */
public class Details extends CondoData{
    private ArrayList<ArrayList<String>> _nData; // nested data
    
    Details(){
        _nData = new ArrayList<>();
    }
    
    public ArrayList<ArrayList<String>> getNData(){
        return _nData;
    }
    @Override
    public void removeValue(int index){
        _nData.remove(index);
    }
    
    @Override
    // effectively remove 'values' inside of all 'floors'
    public void removeValue(String value){
        for(int i = 0; i < _nData.size(); ++i){
            _nData.get(i).remove(value);
        }
    }
    
    public void set(ArrayList<ArrayList<String>> data){
        _nData = data;
    }
    
    public ArrayList<ArrayList<String>> get(){
        return _nData;
    }
    
    public void add(ArrayList<String> data){
        _nData.add(data);
    }
    
    public void removeValue(int floor, int index){
        _nData.get(floor).remove(index);
    }
    
    public void removeValue(int floor, String value){
        _nData.get(floor).remove(value);
    }
    
    public void replaceValue(int floor, int index, String value){
        _nData.get(floor).set(index, value);
    }
    
    public boolean contains(int floor, String value){
        return _nData.get(floor).contains(value);
    }
}
