package FileManager;

import CMSClass.Condo;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author Ambraie 
 * - Class for all output-related operation (mainly on files) 
 * - Implements putting data in a file
 */
public class Ostream {

    // Singleton varible
    private static Ostream _myOstream = null;
    private final String _credentialPath = "src/Data/credentials.dat";
    private final String _reportPath = "src/Data/report.csv";
    private final Condo _MyCondo = Condo.get_instance();
    private String[] _floorPaths = {"src/Data/Floor01.dat", "src/Data/Floor02.dat",
                            "src/Data/Floor03.dat", "src/Data/Floor04.dat",
                            "src/Data/Floor05.dat"};

    private Ostream() {
        // Singleton
    }

    public static Ostream getInstance() {
        if (_myOstream == null) {
            _myOstream = new Ostream();
        }
        return _myOstream;
    }

    // remove all registered users
    public void deleteData() {
        try {
            FileWriter myWriter = new FileWriter(_credentialPath);
            myWriter.close();
        } catch (IOException err) {
            System.out.println("File wasn't deleted. Maybe it doesn't exists");
        }
    }

    // Delete the datai nside of report.csv
    public void deleteReport() {
        try {
            FileWriter myWriter = new FileWriter(_reportPath);
            myWriter.close();
        } catch (IOException err) {
            System.out.println("File wasn't deleted. Maybe it doesn't exists");
        }
    }

    // Export individual table data to csv File (to be changed)
    public void exportReport(ArrayList<String[]> data) {
        // check if the file exists, if no create one, if yes, continue
        try {
            File myObj = new File(_reportPath);
            if (myObj.createNewFile()) {
                System.out.println("Report Created");
            } else {
                System.out.println("File Already Exists");
            }
        } catch (IOException err) {
            System.out.println("File didn't get created.");
        }
        // append to the _reportPath
        try {
            FileWriter myWriter = new FileWriter(_reportPath, true);
            myWriter.append("Unit Number, Status,\n");
            for (int i = 0; i < data.size(); ++i) {
                for (int j = 0; j < 2; ++j) {
                    myWriter.append(data.get(i)[j] + ",");
                }
                myWriter.append("\n");
            }
            myWriter.close();
        } catch (IOException err) {
            System.out.println("File didn't get created.");
        }
    }

    // put the data to the credential (if registring)
    public void putCredentialData(String data) {
        try {
            File myObj = new File(_credentialPath);
            if (myObj.createNewFile()) {
                System.out.println("Credentials Created");
            } else {
                System.out.println("File Already Exists");
            }
        } catch (IOException err) {
            System.out.println("File didn't get created.");
        }
        try {
            FileWriter myWriter = new FileWriter(_credentialPath, true);
            myWriter.append(data);
            myWriter.close();
        } catch (IOException err) {
            System.out.println("File didn't get created.");
        }
    }

    public void updateFiles() {
        for (int i = 0; i < _MyCondo.getFloorSize(); ++i) {
            String CondoUnit = "";
            String Cost = "";
            String ModeOfPayment = "";
            String Details = "";
            String Amenities = "";
            String Status = "";
            int unitSize = _MyCondo.getAllFloors().get(i).getUnitNo().size();
            for (int j = 0; j < unitSize; ++j) {
                CondoUnit += _MyCondo.getAllFloors().get(i).getUnitNo().get(j) + ',';
            }

            int costSize = _MyCondo.getAllFloors().get(i).getCost().size();
            for (int j = 0; j < costSize; ++j) {
                Cost += _MyCondo.getAllFloors().get(i).getCost().get(j) + ',';
            }

            int modeSize = _MyCondo.getAllFloors().get(i).getModeOfPayment().size();
            for (int j = 0; j < modeSize; ++j) {
                ModeOfPayment += _MyCondo.getAllFloors().get(i).getModeOfPayment().get(j) + ',';
            }

            int detailsSize = _MyCondo.getAllFloors().get(i).getDetails().size();
            for (int j = 0; j < detailsSize; ++j) {
                int tempSize = _MyCondo.getAllFloors().get(i).getDetails().get(j).size();
                for (int k = 0; k < tempSize; ++k) {
                    if (k == tempSize - 1) {
                        Details += _MyCondo.getAllFloors().get(i).getDetails().get(j).get(k);
                    } else {
                        Details += _MyCondo.getAllFloors().get(i).getDetails().get(j).get(k) + ',';
                    }
                }
                Details += ";";
            }

            int amenitiesSize = _MyCondo.getAllFloors().get(i).getAmenities().size();
            for (int j = 0; j < amenitiesSize; ++j) {
                int tempSize = _MyCondo.getAllFloors().get(i).getAmenities().get(j).size();
                for (int k = 0; k < tempSize; ++k) {
                    if (k == tempSize - 1) {
                        Amenities += _MyCondo.getAllFloors().get(i).getAmenities().get(j).get(k);
                    } else {
                        Amenities += _MyCondo.getAllFloors().get(i).getAmenities().get(j).get(k) + ',';
                    }
                }
                Amenities += ";";
            }

            int statusSize = _MyCondo.getAllFloors().get(i).getStatus().size();
            for (int j = 0; j < statusSize; ++j) {
                Status += _MyCondo.getAllFloors().get(i).getStatus().get(j) + ',';
            }
            // check if the file exists, if no create one, if yes, continue
            try {
                File myObj = new File(_floorPaths[i]);
                if (myObj.createNewFile()) {
                    System.out.println("Floor Created");
                } else {
                    System.out.println("File Already Exists");
                }
            } catch (IOException err) {
                System.out.println("File didn't get created.");
            }
            // append to the _reportPath
            try {
                FileWriter myWriter = new FileWriter(_floorPaths[i]);
                myWriter.append(CondoUnit);
                myWriter.append("\n");
                myWriter.append(Cost);
                myWriter.append("\n");
                myWriter.append(ModeOfPayment);
                myWriter.append("\n");
                myWriter.append(Details);
                myWriter.append("\n");
                myWriter.append(Amenities);
                myWriter.append("\n");
                myWriter.append(Status);
                myWriter.append("\n");
                myWriter.close();
            } catch (IOException err) {
                System.out.println("File didn't get created.");
            }
        }
    }
}
