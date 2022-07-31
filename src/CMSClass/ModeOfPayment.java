/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CMSClass;

/**
 * @author Renz Aguirre
 */
public class ModeOfPayment extends CondoData{
    private final String[] _modes = {"Full Payment", "Installation"};
    
    public void replaceValue(int index, int mode){
        _data.set(index, _modes[mode]);
    }
    
    @Override
    public void replaceValue(int index, String mode){
        _data.set(index, mode);
    }
    
    public void replaceValue(int index){
        int mode = 0;
        if(_data.get(index) == null ? _modes[0] == null : _data.get(index).equals(_modes[0])){
            mode = 1;
        }
        _data.set(index, _modes[mode]);
    }
}
