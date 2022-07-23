package EntrySystem;

/**
 * @author Ryoji Bernardo
 * - An interface for encrypting and decrypting string data
 */
public interface EncryptionSystem {
    String encrypt(String data);
    String decrypt(String data);  
}
