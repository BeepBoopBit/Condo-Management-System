/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CMSClass;

/**
 *
 * @author wcbre
 */
public class Status extends CondoData{
    private final String[] _statuses = {"Available", "Sold"};
    
    public void replaceValue(int index, int status){
        _data.set(index, _statuses[status]);
    }
    
    @Override
    public void replaceValue(int index, String status){
        _data.set(index, status);
    }
    
    public void replaceValue(int index){
        int status = 0;
        if(_data.get(index) == null ? _statuses[0] == null : _data.get(index).equals(_statuses[0])){
            status = 1;
        }
        _data.set(index, _statuses[status]);
    }
}
