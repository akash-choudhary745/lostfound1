package model;

import java.sql.Timestamp;
import java.sql.Date;

public class Item {
    private int id;
    private String title;
    private String description;
    private String category;
    private String location;
    private Date dateFoundLost;
    private String imagePath;
    private int postedBy;
    private String contactInfo;
    private String status; // e.g., "Lost", "Found", "Returned"
    private Timestamp createdAt;

    // Default constructor
    public Item() {}

    // Parameterized constructor
    public Item(int id, String title, String description, String category, String location,
                Date dateFoundLost, String imagePath, int postedBy, String contactInfo,
                String status, Timestamp createdAt) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.category = category;
        this.location = location;
        this.dateFoundLost = dateFoundLost;
        this.imagePath = imagePath;
        this.postedBy = postedBy;
        this.contactInfo = contactInfo;
        this.status = status;
        this.createdAt = createdAt;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    public Date getDateFoundLost() {
        return dateFoundLost;
    }
    public void setDateFoundLost(Date dateFoundLost) {
        this.dateFoundLost = dateFoundLost;
    }

    public String getImagePath() {
        return imagePath;
    }
    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public int getPostedBy() {
        return postedBy;
    }
    public void setPostedBy(int postedBy) {
        this.postedBy = postedBy;
    }

    public String getContactInfo() {
        return contactInfo;
    }
    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
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
        return "Item [id=" + id + ", title=" + title + ", category=" + category +
               ", location=" + location + ", status=" + status + ", postedBy=" + postedBy + "]";
    }
}
