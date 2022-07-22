package FileManager;

import CMSClass.Condo;
import CMSClass.CondoData;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Istream {
    // Use for Entry System
    String[] _credential = {"USERNAME_E", "PASSWORD_E"};
    String _credentialPath = "src/Data/credentials.dat";
    
    // Use to read individual Floors
    String[] _floorPaths = {"src/Data/Floor01.dat","src/Data/Floor02.dat",
                       "src/Data/Floor03.dat", "src/Data/Floor04.dat",
                       "src/Data/Floor05.dat"};
    
    private final Condo _MyCondo = Condo.get_instance();
    
    // Variable for singleton
    private static Istream _myIstream = null;
   
    private Istream(){
        // SINGLETON
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
        }catch(Exception err){
            _credential[0] = null;
            _credential[1] = null;
        }
    }
    
    public String[] getCredentials(){
        return _credential;
    }
    
    public void readFloors(){
        for(int i = 0; i < 5; ++i){
            try{
                // Scanner and File stream
                File myFile = new File(_floorPaths[i]);
                Scanner myReader = new Scanner(myFile);
                // Condo Data
                CondoData _myFloor = new CondoData();
                while(myReader.hasNextLine()){
                    // Unit
                    ArrayList<String> tempDetails = new ArrayList<>();
                    Collections.addAll(tempDetails, myReader.nextLine().split(","));
                    for(int j = 0; j < tempDetails.size(); ++j){
                        _myFloor.putUnitNo(tempDetails.get(j));
                    }
                    
                    // Cost
                    tempDetails = new ArrayList<>();
                    Collections.addAll(tempDetails, myReader.nextLine().split(","));
                    for(int j = 0; j < tempDetails.size(); ++j){
                        _myFloor.putCost(tempDetails.get(j));
                    }
                    
                    // Mode Of Payment
                    tempDetails = new ArrayList<>();
                    Collections.addAll(tempDetails, myReader.nextLine().split(","));
                    for(int j = 0; j < tempDetails.size(); ++j){
                        _myFloor.putModeOfPayment(tempDetails.get(j));
                    }
                    
                    // Details
                    tempDetails = new ArrayList<>();
                    Collections.addAll(tempDetails, myReader.nextLine().split(";"));
                    for(int j = 0; j < tempDetails.size(); ++j){
                        ArrayList<String> tempDataValue = new ArrayList<>();
                        String[] tempArr = tempDetails.get(j).split(",");
                        Collections.addAll(tempDataValue, tempArr);
                        _myFloor.putDetails(tempDetails);
                    }
                    
                    
                    // Amenities
                    tempDetails = new ArrayList<>();
                    Collections.addAll(tempDetails, myReader.nextLine().split(";"));
                    for(int j = 0; j < tempDetails.size(); ++j){
                        ArrayList<String> tempDataValue = new ArrayList<>();
                        String[] tempArr = tempDetails.get(j).split(",");
                        Collections.addAll(tempDataValue, tempArr);
                        _myFloor.putAmenities(tempDetails);
                    }
                    
                    // Status
                    tempDetails = new ArrayList<>();
                    Collections.addAll(tempDetails, myReader.nextLine().split(","));
                    for(int j = 0; j < tempDetails.size(); ++j){
                        _myFloor.putStatus(tempDetails.get(j));
                    }
                }
                // Add the floor data to the Condo Class
                _MyCondo.addFloor(_myFloor);
            }catch(FileNotFoundException err){
                System.out.println("The file was not found");
            }
        }

    }
    
}


    