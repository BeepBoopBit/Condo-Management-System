package FileManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Istream {
    ArrayList<String> _names;
    ArrayList<String> _ages;
    ArrayList<String> _locations;
    ArrayList<String> _paymentOptions;
    ArrayList<ArrayList<String>> _details;
    ArrayList<ArrayList<String>> _amenities;

    public Istream(){
        _names = new ArrayList<>();
        _ages = new ArrayList<>();
        _locations = new ArrayList<>();
        _paymentOptions = new ArrayList<>();
        _details = new ArrayList<>();
        _amenities = new ArrayList<>();
    }
    
    public void read(String path){
        try{
            File myFile = new File(path);
            Scanner myReader = new Scanner(myFile);
            while(myReader.hasNextLine()){
                _names.add(myReader.nextLine());
                _ages.add(myReader.nextLine());
                _locations.add(myReader.nextLine());
                _paymentOptions.add(myReader.nextLine());
                ArrayList<String> tempDetails = new ArrayList<>();
                Collections.addAll(tempDetails, myReader.nextLine().split(" "));
                _details.add(tempDetails);
                ArrayList<String> tempAmenities = new ArrayList<>();        
                Collections.addAll(tempAmenities, myReader.nextLine().split(" "));
                _amenities.add(tempAmenities);
            }
        }catch(FileNotFoundException err){
            System.out.println("The file was not found");
        }
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
    
    // debug
    public void print(){
        for(int i = 0; i < _names.size(); ++i){
            System.out.println(_names.get(i));
        }
        for(int i = 0; i < _ages.size(); ++i){
            System.out.println(_ages.get(i));
        }
        for(int i = 0; i < _locations.size(); ++i){
            System.out.println(_locations.get(i));
        }
        for(int i = 0; i < _paymentOptions.size(); ++i){
            System.out.println(_paymentOptions.get(i));
        }
        System.out.println("");
        for(int i = 0; i < _details.size(); ++i){
            for(int j = 0; j < _details.get(i).size(); ++j){
                System.out.print(_details.get(i).get(j));
            }
            System.out.println("");
        }
        for(int i = 0; i < _amenities.size(); ++i){
            for(int j = 0; j < _amenities.get(i).size(); ++j){
                System.out.print(_amenities.get(i).get(j));
            }
            System.out.println("");
        }
    }
}


    