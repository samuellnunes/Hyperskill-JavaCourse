import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class UserProfile implements Serializable {

    private static final long serialVersionUID = 26292552485L;

    private String login;
    private String email;
    private transient String password;

    public UserProfile(String login, String email, String password) {
        this.login = login;
        this.password = password;
        this.email = email;
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();

        String encryptedPassword = "";

        for (char c : password.toCharArray()) {
            encryptedPassword += (char) (c + 1);
        }

        out.writeObject(encryptedPassword);
    }

    private void readObject(ObjectInputStream in)
            throws IOException, ClassNotFoundException {

        in.defaultReadObject();

        String encryptedPassword = (String) in.readObject();
        String decryptedPassword = "";

        for (char c : encryptedPassword.toCharArray()) {
            decryptedPassword += (char) (c - 1);
        }

        password = decryptedPassword;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}