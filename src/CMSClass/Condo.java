package CMSClass;

import java.util.ArrayList;

// Provide More Abstraction for CondoData
public class Condo{
    // List of Floors All With their corresponding data
    ArrayList<CondoData> _Floors;
    
    private static Condo _MyCondo = null;
    
    private Condo(){
        // initializes the Floor
        _Floors = new ArrayList<>();
    }
    
    public static Condo get_instance(){
        if(_MyCondo == null){
            _MyCondo = new Condo();
        }
        return _MyCondo;
    }
    
    public void addFloor(CondoData data){
        _Floors.add(data);
    }
    
    public CondoData getFloor(int index){
        return _Floors.get(index);
    }
    
    public String[] getUnitDataInFloor(int floorIndex, int unitIndex){
        return new String[]{_Floors.get(floorIndex).getUnitNo().get(unitIndex),
                            _Floors.get(floorIndex).getCost().get(unitIndex),
                            _Floors.get(floorIndex).getStatus().get(unitIndex)};
    }
    
    // Auxillary 
    public void printData(){
        for(int i = 0; i < _Floors.size(); ++i){
            _Floors.get(i).print();
        }
    }
}
