/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntrySystem;

import FileManager.*;

public class EntryClass implements LoginSystem, RegisterSystem {
    final Istream _istream = Istream.getInstance();
    final Ostream _ostream = Ostream.getInstance();
    String[] _credentials;
    
    private static EntryClass _myEntry = null;
    
    public static EntryClass getInstance(){
        if(_myEntry == null){
            _myEntry = new EntryClass();
        }
        return _myEntry;
    }
    
    char _alphabeth[] = {
        'a','b','c','d','e',
        'f','g','h','i','j',
        'k','l','m','n','o',
        'p','q','r','s','t',
        'u','v','w','x','y','z', ' '
    };
    
    char _encryptedAlphabeth[] = {
        'b','c','d','e','f',
        'g','h','i','j','k',
        'l','m','n','o','p',
        'q','r','s','t','u',
        'v','w','x','y','z',
        'a', ' '
    };
    
    EntryClass(){
        _istream.readCredentials();
        _credentials = _istream.getCredentials();
    }
    
    public boolean login(String username, String password){
        _istream.readCredentials();
        return (_credentials[0] == null ? username == null : decrypt(_credentials[0]).equals(username)) && (_credentials[1] == null ? password == null : decrypt(_credentials[1]).equals(password));
    }
    public void register(String username, String password){
        _ostream.deleteData();
        _ostream.putData(encrypt(username) + ' ');
        _ostream.putData(encrypt(password) + "\n");
        _istream.readCredentials();
    }
    public String encrypt(String data){
        String newString = "";
        for(int i = 0; i < data.length(); ++i){
            char tempValue = data.charAt(i);
            int index = 0;
            for(int j = 0; j < 27; ++j){
                if(tempValue == _alphabeth[j]){
                    index = j;
                    break;
                }
            }
            newString += _encryptedAlphabeth[index];
        }
        return newString;
    }
    public String decrypt(String data){
        String newString = "";
        for(int i = 0; i < data.length(); ++i){
            char tempValue = data.charAt(i);
            int index = 0;
            for(int j = 0; j < 27; ++j){
                if(tempValue == _encryptedAlphabeth[j]){
                    index = j;
                    break;
                }
            }
            newString += _alphabeth[index];
        }
        return newString;
    }
}
