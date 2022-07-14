package FileManager;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ostream {
    private static Ostream _myOstream = null;
    private final String _credentialPath = "src/Data/credentials.dat";
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
