package EntrySystem;

/**
 * @author Ryoji Bernardo
 * - Interface for Register System
 */
public interface RegisterSystem extends EncryptionSystem{
    void register(String username, String password);
}
