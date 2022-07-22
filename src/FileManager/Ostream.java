package FileManager;

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
    private static Ostream          _myOstream          = null;
    private final String            _credentialPath     = "src/Data/credentials.dat";
    private final String            _reportPath         = "src/Data/report.csv";
    private Ostream(){
        // Singleton
    }
    public static Ostream getInstance(){
        if(_myOstream == null){
            _myOstream = new Ostream();
        }
        return _myOstream;
    }
    
    // remove all registered users
    public void deleteData(){
        try{
            FileWriter myWriter = new FileWriter(_credentialPath);
            myWriter.close();
        }catch(IOException err){
            System.out.println("File wasn't deleted. Maybe it doesn't exists");
        }
    }
    
    // Delete the datai nside of report.csv
    public void deleteReport(){
        try{
            FileWriter myWriter = new FileWriter(_reportPath);
            myWriter.close();
        }catch(IOException err){
            System.out.println("File wasn't deleted. Maybe it doesn't exists");
        }
    }
    
    // Export individual table data to csv File (to be changed)
    public void exportData(ArrayList<String[]> data){
        try{
            File myObj = new File(_reportPath);
            if(myObj.createNewFile()){
                System.out.println("Report Created");
            }else{
                System.out.println("File Already Exists");
            }
        }catch(IOException err){
            System.out.println("File didn't get created.");
        }
        try{
            FileWriter myWriter = new FileWriter(_reportPath, true);
            for(int i = 0; i < data.size(); ++i){
                for(int j = 0; j < 4; ++j){
                    myWriter.append(data.get(i)[j] +",");
                }
                myWriter.append("\n");
            }
            myWriter.close();
        }catch(IOException err){
            System.out.println("File didn't get created.");
        }
    }
    
    // put the data to the credential (if registring)
    public void putCredentialData(String data){
        try{
            File myObj = new File(_credentialPath);
            if(myObj.createNewFile()){
                System.out.println("Credentials Created");
            }else{
                System.out.println("File Already Exists");
            }
        }catch(IOException err){
            System.out.println("File didn't get created.");
        }
        try{
            FileWriter myWriter = new FileWriter(_credentialPath, true);
            myWriter.append(data);
            myWriter.close();
        }catch(IOException err){
            System.out.println("File didn't get created.");
        }
    }
}
