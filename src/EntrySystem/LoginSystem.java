package EntrySystem;
public interface LoginSystem extends EncryptionSystem{
    boolean login(String username, String password);
}


