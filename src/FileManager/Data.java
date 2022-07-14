/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FileManager;

import java.util.ArrayList;

/**
 *
 * @author wcbre
 */
public class Data {
    ArrayList<String> _names;
    ArrayList<String> _ages;
    ArrayList<String> _locations;
    ArrayList<String> _paymentOptions;
    ArrayList<ArrayList<String>> _details;
    ArrayList<ArrayList<String>> _amenities;
    ArrayList<String[]> _tableData;

    public Data() {
        this._names = new ArrayList<>();
        this._ages = new ArrayList<>();
        this._locations = new ArrayList<>();
        this._paymentOptions = new ArrayList<>();
        this._details = new ArrayList<>();
        this._amenities = new ArrayList<>();
        this._tableData = new ArrayList<>();
    }
    
    public void putTableData(String[] data){
        _tableData.add(data);
    }
    public ArrayList<String[]> getTableData(){
        return _tableData;
    }
    public void putName(String Name){
        _names.add(Name);
    }
    public void putAge(String Age){
        _ages.add(Age);
    }
    public void putLocation(String Location){
        _locations.add(Location);
    }
    public void putPaymentOption(String PaymentOption){
        _paymentOptions.add(PaymentOption);
    }
    public void putDetails(ArrayList<String> Details){
        _details.add(Details);
    }
    public void putAmenities(ArrayList<String> Amenities){
        _amenities.add(Amenities);
    }
    public ArrayList<String> getNames() {
        return _names;
    }
    public ArrayList<String> getAges() {
        return _ages;
    }
    public ArrayList<String> getLocations() {
        return _locations;
    }

    public ArrayList<String> getPaymentOptions() {
        return _paymentOptions;
    }
    public ArrayList<ArrayList<String>> getDetails() {
        return _details;
    }
    public ArrayList<ArrayList<String>> getAmenities() {
        return _amenities;
    }
}
