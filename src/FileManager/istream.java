package FileManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Istream {
    ArrayList<Data> _floors;
    String[] _paths = {"src/FileManager/Floor01.dat","src/FileManager/Floor02.dat",
                       "src/FileManager/Floor03.dat", "src/FileManager/Floor04.dat",
                       "src/FileManager/Floor05.dat"};
    private static Istream _myIstream = null;
    private Istream(){
        _floors = new ArrayList<>();
        for(int i = 0; i < 5; ++i){
            _floors.add(new Data());
        }
    }
    
    public static Istream getInstance(){
        if(_myIstream == null){
            _myIstream = new Istream();
        }
        return _myIstream;
    }
    
    public void read(){
        for(int i = 0; i < 5; ++i){
            try{
                File myFile = new File(_paths[i]);
                Scanner myReader = new Scanner(myFile);
                while(myReader.hasNextLine()){
                    _floors.get(i).putName(myReader.nextLine());
                    _floors.get(i).putAge(myReader.nextLine());
                    _floors.get(i).putLocation(myReader.nextLine());
                    _floors.get(i).putPaymentOption(myReader.nextLine());
                    ArrayList<String> tempDetails = new ArrayList<>();
                    Collections.addAll(tempDetails, myReader.nextLine().split(" "));
                    _floors.get(i).putDetails(tempDetails);
                    ArrayList<String> tempAmenities = new ArrayList<>();        
                    Collections.addAll(tempAmenities, myReader.nextLine().split(" "));
                    _floors.get(i).putAmenities(tempAmenities);
                    _floors.get(i).putTableData(myReader.nextLine().split(" "));
                }
            }catch(FileNotFoundException err){
                System.out.println("The file was not found");
            }
        }

    }

    public ArrayList<Data> getFloors() {
        return _floors;
    }
    
    
    // debug
    public void print(){
        for(int i = 0; i < 6; ++i){
            ArrayList<String> tempData = _floors.get(i).getNames();
            for(int j = 0; j < tempData.size(); ++j){
                System.out.println(tempData.get(j));
            }
            tempData = _floors.get(i).getAges();
            for(int j = 0; j < tempData.size(); ++j){
                System.out.println(tempData.get(j));
            }
            tempData = _floors.get(i).getLocations();
            for(int j = 0; j < tempData.size(); ++j){
                System.out.println(tempData.get(j));
            }
            tempData = _floors.get(i).getPaymentOptions();
            for(int j = 0; j < tempData.size(); ++j){
                System.out.println(tempData.get(j));
            }
            ArrayList<ArrayList<String>> tempDataData = _floors.get(i).getDetails();
            for(int j = 0; j < tempDataData.size(); ++j){
                for(int k = 0; k < tempDataData.get(j).size(); ++k){
                    System.out.print(tempDataData.get(j).get(k));
                }
                System.out.println("");
            }
            tempDataData = _floors.get(i).getAmenities();
            for(int j = 0; j < tempDataData.size(); ++j){
                for(int k = 0; k < tempDataData.get(j).size(); ++k){
                    System.out.print(tempDataData.get(j).get(k));
                }
                System.out.println("");
            }
        }
    }
}


    