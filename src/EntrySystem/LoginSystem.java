package EntrySystem;

/**
 * @author Ryoji Bernardo
 * - Interface for Login System
 */
public interface LoginSystem extends EncryptionSystem{
    boolean login(String username, String password);
}


