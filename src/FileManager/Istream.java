package FileManager;

import CMSClass.Condo;
import CMSClass.CondoData;
import CMSClass.Floor;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Ambraie 
 * - Class for all input-related operation (mainly on files) 
 * - Implements getting data from the floors
 */
public class Istream {

    // Use for Entry System
    private String[] _credential = {"USERNAME_E", "PASSWORD_E"};
    private String _credentialPath = "src/Data/credentials.dat";

    // Use to read individual Floors
    private String[] _floorPaths = {"src/Data/Floor01.dat", "src/Data/Floor02.dat",
        "src/Data/Floor03.dat", "src/Data/Floor04.dat",
        "src/Data/Floor05.dat"};

    // Get the Condo Class
    private final Condo _MyCondo = Condo.get_instance();

    // Variable for singleton
    private static Istream _myIstream = null;

    private Istream() {
        // SINGLETON
    }

    public static Istream getInstance() {
        if (_myIstream == null) {
            _myIstream = new Istream();
        }
        return _myIstream;
    }

    public void readCredentials() {
        // Try to Read and Store The File
        try {
            File myFile = new File(_credentialPath);
            Scanner myReader = new Scanner(myFile);
            // Try to get data or store it
            try {
                String[] creds = myReader.nextLine().split(" ");
                _credential[0] = creds[0];
                _credential[1] = creds[1];
            } // If there are no data to store
            catch (Exception err) {
                _credential[0] = null;
                _credential[1] = null;
            }
        } // If the File was not found, create the file
        catch (FileNotFoundException err) {
            FileWriter myWriter;
            try {
                myWriter = new FileWriter(_credentialPath);
                myWriter.close();
            } catch (IOException ex) {
                Logger.getLogger(Istream.class.getName()).log(Level.WARNING, null, ex);
            }
            // No Data
            _credential[0] = null;
            _credential[1] = null;
        }
    }

    public String[] getCredentials() {
        return _credential;
    }

    public void readFloors() {
        for (int i = 0; i < 5; ++i) {
            try {
                // Scanner and File stream
                File myFile = new File(_floorPaths[i]);
                Scanner myReader = new Scanner(myFile);
                // Condo Data
                Floor _myFloor = new Floor();
                while (myReader.hasNextLine()) {
                    // Unit
                    ArrayList<String> tempDetails = new ArrayList<>();
                    Collections.addAll(tempDetails, myReader.nextLine().split(","));
                    for (int j = 0; j < tempDetails.size(); ++j) {
                        _myFloor.putUnitNo(tempDetails.get(j));
                    }

                    // Cost
                    tempDetails = new ArrayList<>();
                    Collections.addAll(tempDetails, myReader.nextLine().split(","));
                    for (int j = 0; j < tempDetails.size(); ++j) {
                        _myFloor.putCost(tempDetails.get(j));
                    }

                    // Mode Of Payment
                    tempDetails = new ArrayList<>();
                    Collections.addAll(tempDetails, myReader.nextLine().split(","));
                    for (int j = 0; j < tempDetails.size(); ++j) {
                        _myFloor.putModeOfPayment(tempDetails.get(j));
                    }

                    // Details
                    tempDetails = new ArrayList<>();
                    Collections.addAll(tempDetails, myReader.nextLine().split(";"));
                    for (int j = 0; j < tempDetails.size(); ++j) {
                        ArrayList<String> tempDataValue = new ArrayList<>();
                        String[] tempArr = tempDetails.get(j).split(",");
                        Collections.addAll(tempDataValue, tempArr);
                        _myFloor.putDetails(tempDataValue);
                    }

                    // Amenities
                    tempDetails = new ArrayList<>();
                    Collections.addAll(tempDetails, myReader.nextLine().split(";"));
                    for (int j = 0; j < tempDetails.size(); ++j) {
                        ArrayList<String> tempDataValue = new ArrayList<>();
                        String[] tempArr = tempDetails.get(j).split(",");
                        Collections.addAll(tempDataValue, tempArr);
                        _myFloor.putAmenities(tempDataValue);
                    }

                    // Status
                    tempDetails = new ArrayList<>();
                    Collections.addAll(tempDetails, myReader.nextLine().split(","));
                    for (int j = 0; j < tempDetails.size(); ++j) {
                        _myFloor.putStatus(tempDetails.get(j));
                    }
                }
                // Add the floor data to the Condo Class
                _MyCondo.addFloor(_myFloor);
            } catch (FileNotFoundException err) {
                System.out.println("The file was not found");
            }
        }

    }

}
