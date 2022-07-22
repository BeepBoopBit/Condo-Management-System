package CMSClass;

import java.util.ArrayList;


/**
 * @author Renz Aguirre
 * - Used for STORING the data of individual units in floors
 * - ONE CondoData is equivalent to a SINGLE FLOOR
 */
public class CondoData {
    ArrayList<String>                   _UnitNo;
    ArrayList<String>                   _Cost;
    ArrayList<String>                   _ModeOfPayment;
    ArrayList<ArrayList<String>>        _Details;
    ArrayList<ArrayList<String>>        _Amenities;
    ArrayList<String>                   _Status;
    
    public CondoData(){
        _UnitNo             = new ArrayList<>();
        _Cost               = new ArrayList<>();
        _ModeOfPayment      = new ArrayList<>();
        _Details            = new ArrayList<>();
        _Amenities          = new ArrayList<>();
        _Status             = new ArrayList<>();
    }
    
    // Putters (Put individual Data not as a whole)
    /////////////////////////////////////////////////////////////////////
    public void putUnitNo(String data){
        _UnitNo.add(data);
    }
    public void putCost(String data){
        _Cost.add(data);
    }
    public void putModeOfPayment(String data){
        _ModeOfPayment.add(data);
    }
    public void putDetails(ArrayList<String> data){
        _Details.add(data);
    }
    public void putAmenities(ArrayList<String> data){
        _Amenities.add(data);
    }
    public void putStatus(String data){
        _Status.add(data);
    }
    /////////////////////////////////////////////////////////////////////
    
    // Get the Data
    /////////////////////////////////////////////////////////////////////
    public ArrayList<String> getUnitNo() {
        return _UnitNo;
    }
    public ArrayList<String> getCost() {
        return _Cost;
    }
    public ArrayList<String> getModeOfPayment() {
        return _ModeOfPayment;
    }
    public ArrayList<ArrayList<String>> getDetails() {
        return _Details;
    }
    public ArrayList<ArrayList<String>> getAmenities() {
        return _Amenities;
    }
    public ArrayList<String> getStatus() {
        return _Status;
    }

    // Set Data (as a whole)
    /////////////////////////////////////////////////////////////////////
    public void setUnitNo(ArrayList<String> _UnitNo) {
        this._UnitNo = _UnitNo;
    }
    public void setCost(ArrayList<String> _Cost) {
        this._Cost = _Cost;
    }
    public void setModeOfPayment(ArrayList<String> _ModeOfPayment) {
        this._ModeOfPayment = _ModeOfPayment;
    }
    public void setDetails(ArrayList<ArrayList<String>> _Details) {
        this._Details = _Details;
    }
    public void setAmenities(ArrayList<ArrayList<String>> _Amenities) {
        this._Amenities = _Amenities;
    }
    public void setStatus(ArrayList<String> _Status) {
        this._Status = _Status;
    }
    /////////////////////////////////////////////////////////////////////

    // Debugging
    /////////////////////////////////////////////////////////////////////
    public void print(){
        for(int i = 0; i <_UnitNo.size(); ++i){
            System.out.print(_UnitNo.get(i) + ' ');
        }
        System.out.println("");
        for(int i = 0; i <_Cost.size(); ++i){
            System.out.print(_Cost.get(i) + ' ');
        }
        System.out.println("");
        for(int i = 0; i <_ModeOfPayment.size(); ++i){
            System.out.print(_ModeOfPayment.get(i) + ' ');
        }
        System.out.println("");
        for(int i = 0; i <_Details.size(); ++i){
            for(int j = 0; j < _Details.get(i).size(); ++j){
                System.out.print(_Details.get(i).get(j) + ' ');
            }
        }
        System.out.println("");
        for(int i = 0; i <_Amenities.size(); ++i){
            for(int j = 0; j < _Amenities.get(i).size(); ++j){
                System.out.print(_Amenities.get(i).get(j) + ' ');
            }
        }
        System.out.println("");
    }
    /////////////////////////////////////////////////////////////////////


}
