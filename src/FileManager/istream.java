package FileManager;

import CMSClass.CondoData;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Istream {
    String[] _credential = {"USERNAME_E", "PASSWORD_E"};
    String _credentialPath = "src/Data/credentials.dat";
    
    
    ArrayList<CondoData> _floors;
    String[] _floorPaths = {"src/Data/Floor01.dat","src/Data/Floor02.dat",
                       "src/Data/Floor03.dat", "src/Data/Floor04.dat",
                       "src/Data/Floor05.dat"};
    private static Istream _myIstream = null;
    private Istream(){
        _floors = new ArrayList<>();
        for(int i = 0; i < 5; ++i){
            _floors.add(new CondoData());
        }
    }
    
    public static Istream getInstance(){
        if(_myIstream == null){
            _myIstream = new Istream();
        }
        return _myIstream;
    }
    
    public void readCredentials(){
        try{
            File myFile = new File(_credentialPath);
            Scanner myReader = new Scanner(myFile);
            String[] creds = myReader.nextLine().split(" ");
            _credential[0] = creds[0];
            _credential[1] = creds[1];
        }catch(FileNotFoundException err){
            System.out.println("The file was not found");
        }
    }
    
    public String[] getCredentials(){
        return _credential;
    }
    
    public void readFloors(){
        for(int i = 0; i < 5; ++i){
            try{
                File myFile = new File(_floorPaths[i]);
                Scanner myReader = new Scanner(myFile);
                while(myReader.hasNextLine()){
                    _floors.get(i).putName(myReader.nextLine());
                    _floors.get(i).putAge(myReader.nextLine());
                    _floors.get(i).putPaymentOption(myReader.nextLine());
                    ArrayList<String> tempDetails = new ArrayList<>();
                    Collections.addAll(tempDetails, myReader.nextLine().split(","));
                    _floors.get(i).putDetails(tempDetails);
                    ArrayList<String> tempAmenities = new ArrayList<>();        
                    Collections.addAll(tempAmenities, myReader.nextLine().split(","));
                    _floors.get(i).putAmenities(tempAmenities);
                    _floors.get(i).putTableData(myReader.nextLine().split(","));
                }
            }catch(FileNotFoundException err){
                System.out.println("The file was not found");
            }
        }

    }

    public ArrayList<CondoData> getFloors() {
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


    