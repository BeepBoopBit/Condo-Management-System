package FileManager;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Ostream {
    private static Ostream _myOstream = null;
    private final String _credentialPath = "src/Data/credentials.dat";
    private final String _reportPath = "src/Data/report.csv";
    public static Ostream getInstance(){
        if(_myOstream == null){
            _myOstream = new Ostream();
        }
        return _myOstream;
    }
    public void deleteData(){
        try{
            FileWriter myWriter = new FileWriter(_credentialPath);
            myWriter.close();
        }catch(IOException err){
            System.out.println("File didn't get created.");
        }

    }
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
                for(int j = 0; j < 5; ++j){
                    myWriter.append(data.get(i)[j] +",");
                }
                myWriter.append("\n");
            }
            myWriter.close();
        }catch(IOException err){
            System.out.println("File didn't get created.");
        }
    }
    public void putData(String data){
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
