package CMSClass;

import java.util.ArrayList;


/**
 * @author Renz Aguirre
 */
public class CondoData {
    protected ArrayList<String> _data;
    
    CondoData(){
        _data = new ArrayList<>();
    }
    
    public void add(String value){
        _data.add(value);
    }
    
    public ArrayList<String> getData(){
        return _data;
    }
    
    public void setData(ArrayList<String> data){
        _data = data;
    }
    
    public void putData(String data){
        _data.add(data);
    }
    
    public void removeValue(int index){
        _data.remove(index);
    }
    
    public void removeValue(String value){
        _data.remove(value);
    }
    
    public void replaceValue(int index, String value){
        _data.set(index, value);
    }
    
    public boolean contains(String value){
        return _data.contains(value);
    }
    
}
