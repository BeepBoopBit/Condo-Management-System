package CMSClass;

import java.util.ArrayList;


/**
 * @author Renz Aguirre
 * - Provide More Abstraction for CondoData
 * - Mainly the one that is used for all operation with regards to CondoData
 */
public class Condo{
    // List of Floors All With their corresponding data
    private ArrayList<Floor> _Floors;
    
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
    
    public int getFloorSize(){
        return _Floors.size();
    }
    
    public void addFloor(Floor data){
        _Floors.add(data);
    }
    
    public Floor getFloor(int index){
        return _Floors.get(index);
    }
    
    public ArrayList<Floor> getAllFloors(){
        return _Floors;
    }
    
    // Return in the form of String[] the relevant information for table view
    public String[] getUnitDataInFloor(int floorIndex, int unitIndex){
        return new String[]{_Floors.get(floorIndex).getUnitNo().get(unitIndex),
                            _Floors.get(floorIndex).getCost().get(unitIndex),
                            _Floors.get(floorIndex).getStatus().get(unitIndex)};
    }
    public void replaceUnitNo(int floorIndex, int rowIndex, String data){
        _Floors.get(floorIndex).getUnitNo().set(rowIndex, data);
    }  
    public void replaceCost(int floorIndex, int rowIndex, String data){
        _Floors.get(floorIndex).getCost().set(rowIndex, data);
    }  
    public void replaceModeOfPayment(int floorIndex, int rowIndex, String data){
        _Floors.get(floorIndex).getModeOfPayment().set(rowIndex, data);
    }
    public void replaceDetails(int floorIndex, int rowIndex, ArrayList<String> data){
        _Floors.get(floorIndex).getDetails().set(rowIndex, data);
    }    
    public void replaceAmenities(int floorIndex, int rowIndex, ArrayList<String> data){
        _Floors.get(floorIndex).getAmenities().set(rowIndex, data);
    } 
    public void replaceStatus(int floorIndex, int rowIndex, String data){
        _Floors.get(floorIndex).getStatus().set(rowIndex, data);
    }
    
}
