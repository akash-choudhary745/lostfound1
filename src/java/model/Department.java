
package model;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class Department {
    
    private String username;
    private String fullname;
    private String hash_password;
    private int id;
    
    public Department(){}
    
    public Department(String username, String fullname, String hash_password)
    {
        this.username=username;
        this.fullname=fullname;
        this.hash_password=hash_password;
    }
    
     public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setFullName(String fullname)
    {
        this.fullname=fullname;
    }
    
    public void setUserName(String username)
    {
        this.username=username;
    }
    
     public void setHashPassword(String password) 
     {
        this.hash_password = generateHash(password);
    }
     
    
     private String generateHash(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256"); // Hash algorithm
            byte[] hashBytes = md.digest(password.getBytes());
            
            // Convert bytes to hexadecimal
            StringBuilder sb = new StringBuilder();
            for (byte b : hashBytes) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString(); // hashed password
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
     
    public String getFullName()
    {
        return fullname;
    }
    
    public String getUserName()
    {
        return username;
    }
    public String gethash_password()
    {
        return hash_password;
    }
}
