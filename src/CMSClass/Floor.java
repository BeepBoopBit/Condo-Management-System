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
public class Floor {
    private Amenities       _Amenities;
    private Cost            _Cost;
    private Details         _Details;
    private ModeOfPayment   _ModeOfPayment;
    private Status          _Status;
    private Unit            _UnitNo;
    public Floor(){
        _Amenities      = new Amenities();
        _Cost           = new Cost();
        _Details        = new Details();
        _ModeOfPayment  = new ModeOfPayment();
        _Status         = new Status();
        _UnitNo         = new Unit();
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
        return _UnitNo.getData();
    }
    public ArrayList<String> getCost() {
        return _Cost.getData();
    }
    public ArrayList<String> getModeOfPayment() {
        return _ModeOfPayment.getData();
    }
    public ArrayList<ArrayList<String>> getDetails() {
        return _Details.get();
    }
    public ArrayList<ArrayList<String>> getAmenities() {
        return _Amenities.get();
    }
    public ArrayList<String> getStatus() {
        return _Status.getData();
    }

    // Set Data (as a whole)
    /////////////////////////////////////////////////////////////////////
    public void setUnitNo(ArrayList<String> _UnitNo) {
        this._UnitNo.setData(_UnitNo);
    }
    public void setCost(ArrayList<String> _Cost) {
        this._Cost.setData(_Cost);
    }
    public void setModeOfPayment(ArrayList<String> _ModeOfPayment) {
        this._ModeOfPayment.setData(_ModeOfPayment);
    }
    public void setDetails(ArrayList<ArrayList<String>> _Details) {
        this._Details.set(_Details);
    }
    public void setAmenities(ArrayList<ArrayList<String>> _Amenities) {
        this._Amenities.set(_Amenities);
    }
    public void setStatus(ArrayList<String> _Status) {
        this._Status.setData(_Status);
    }
    /////////////////////////////////////////////////////////////////////

}
