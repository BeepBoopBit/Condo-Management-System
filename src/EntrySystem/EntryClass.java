package EntrySystem;

import FileManager.*;

/**
 * @author Ryoji Bernardo 
 * - Implements Login and Register System
 */
public class EntryClass implements LoginSystem, RegisterSystem {

    private final Istream _istream = Istream.getInstance();
    private final Ostream _ostream = Ostream.getInstance();
    // Singleton Variable
    private static EntryClass _myEntry = null;

    // Use for encryption
    private char _alphabeth[] =     {'a', 'b', 'c', 'd', 'e',
                                     'f', 'g', 'h', 'i', 'j',
                                     'k', 'l', 'm', 'n', 'o',
                                     'p', 'q', 'r', 's', 't',
                                     'u', 'v', 'w', 'x', 'y', 'z', ' '};
    
    private char _encryptedAlphabeth[] =    {'b', 'c', 'd', 'e', 'f',
                                             'g', 'h', 'i', 'j', 'k',
                                             'l', 'm', 'n', 'o', 'p',
                                             'q', 'r', 's', 't', 'u',
                                             'v', 'w', 'x', 'y', 'z', 'a', ' '};

    // Stores the credentials of the user
    private String[] _credentials;

    private EntryClass() {
        _istream.readCredentials();
        _credentials = _istream.getCredentials();
    }

    public static EntryClass getInstance() {
        if (_myEntry == null) {
            _myEntry = new EntryClass();
        }
        return _myEntry;
    }

    // Returns a bool if the logging in is successfuly
    public boolean login(String username, String password) {
        _istream.readCredentials();
        return (_credentials[0] == null ? username == null : decrypt(_credentials[0]).equals(username)) && (_credentials[1] == null ? password == null : decrypt(_credentials[1]).equals(password));
    }

    // register a new user to the CMS (Currenly only support replacing the new user)
    public void register(String username, String password) {
        _ostream.deleteData();
        _ostream.putCredentialData(encrypt(username) + ' ');
        _ostream.putCredentialData(encrypt(password) + "\n");
        _istream.readCredentials();
    }

    // Returns the encrypted data
    public String encrypt(String data) {
        String newString = "";
        for (int i = 0; i < data.length(); ++i) {
            char tempValue = data.charAt(i);
            int index = 0;
            for (int j = 0; j < 27; ++j) {
                if (tempValue == _alphabeth[j]) {
                    index = j;
                    break;
                }
            }
            newString += _encryptedAlphabeth[index];
        }
        return newString;
    }

    // Returns the decrypted data
    public String decrypt(String data) {
        String newString = "";
        for (int i = 0; i < data.length(); ++i) {
            char tempValue = data.charAt(i);
            int index = 0;
            for (int j = 0; j < 27; ++j) {
                if (tempValue == _encryptedAlphabeth[j]) {
                    index = j;
                    break;
                }
            }
            newString += _alphabeth[index];
        }
        return newString;
    }
}
