package model;

import java.sql.Timestamp;

public class User {
    private int id;
    private String fullname;
    private String email;
    private String passwordHash;
    private String role;
    private Timestamp createdAt;

    // Default constructor
    public User() {}

    // Parameterized constructor
    public User(int id, String fullname, String email, String passwordHash, String role, Timestamp createdAt) {
        this.id = id;
        this.fullname = fullname;
        this.email = email;
        this.passwordHash = passwordHash;
        this.role = role;
        this.createdAt = createdAt;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }
    
    public boolean setEmail(String email) 
    {
        boolean hasNumber = email.matches(".*\\d.*");
        if(hasNumber)
        {
        this.email = email;
        }
        this.email = email;

        return hasNumber;
    }

    public String getPasswordHash() {
        return passwordHash;
    }
    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    // toString()
    @Override
    public String toString() {
        return "User [id=" + id + ", fullname=" + fullname + ", email=" + email + 
               ", role=" + role + ", createdAt=" + createdAt + "]";
    }
}
