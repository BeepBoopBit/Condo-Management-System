package FileManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class istream {
    private ArrayList<String> _data;
    
    public istream(){
        _data = new ArrayList<>();
    }
    
    public void read(String path){
        try{
            File myFile = new File(path);
            Scanner myReader = new Scanner(myFile);
            while(myReader.hasNextLine()){
                _data.add(myReader.nextLine());
            }
        }catch(FileNotFoundException err){
            System.out.println("The file was not found");
        }
    }
    
    public ArrayList<String> getData(){
        return _data;
    }
}
