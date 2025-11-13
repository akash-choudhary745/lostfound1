# 🧳 Lost & Found Department Portal

A **JSP–Servlet–JDBC based web application** designed to help departments manage **lost and found items** efficiently.  
The portal allows users or departments to post, view, and manage items while maintaining a detailed **history** of all claimed items.

---

## 🚀 Features

### 👥 User Features
- Register and login securely.
- Add details about lost or found items (with description, date, location, image, etc.).
- View active lost/found listings.

### 🏢 Department Features
- Department login panel.
- View all **active items**.
- **Remove/claim** items — automatically moves them into a **History** table.
- Session-based department authentication.

### 📜 History Tracking
- Every time an item is marked as claimed or removed, its details are stored in the `history` table with:
  - Item Name
  - Item User
  - Claimed Status
  - Date of Action

---

## 🧩 Technologies Used

| Layer | Technologies |
|-------|---------------|
| Frontend | HTML, CSS, JSP |
| Backend | Java (Servlets, JDBC) |
| Database | MySQL |
| Server | Apache Tomcat |
| IDE | NetBeans / Eclipse |

---

## 🗄️ Database Structure

### `users`
| Column | Type | Description |
|---------|------|-------------|
| id | INT (PK) | Auto increment |
| username | VARCHAR(100) | Unique username |
| password_hash | VARCHAR(255) | Hashed password |
| fullname | VARCHAR(150) | User’s full name |
| created_at | TIMESTAMP | Default current timestamp |

---

### `departments`
| Column | Type | Description |
|---------|------|-------------|
| id | INT (PK) | Department ID |
| department_name | VARCHAR(150) | Department name |
| username | VARCHAR(100) | Department login username |
| password | VARCHAR(255) | Department login password |

---

### `items`
| Column | Type | Description |
|---------|------|-------------|
| id | INT (PK) | Auto increment |
| title | VARCHAR(200) | Item title |
| description | TEXT | Details of the item |
| category | VARCHAR(100) | Lost or Found |
| location | VARCHAR(200) | Where item was found/lost |
| date_found_lost | DATE | Date |
| image_path | VARCHAR(500) | Path to uploaded image |
| posted_by | INT (FK) | Refers to user ID |
| contact_info | VARCHAR(255) | User contact details |
| status | VARCHAR(50) | Default = 'open' |
| created_at | TIMESTAMP | Default current timestamp |

---

### `history`
| Column | Type | Description |
|---------|------|-------------|
| id | INT (PK) | Auto increment |
| item_name | VARCHAR(200) | Name of the item |
| item_user | VARCHAR(150) | Username or department who posted |
| status | VARCHAR(50) | e.g., Claimed |
| date | TIMESTAMP | Default current timestamp |

---

## 🧠 Servlet List

| Servlet | Purpose |
|----------|----------|
| `RegisterServlet.java` | Handles user registration |
| `LoginServlet.java` | Handles user and department login |
| `AddItemServlet.java` | Inserts new lost/found item |
| `RemoveItemServlet.java` | Removes an item & adds entry in history |
| `LogoutServlet.java` | Ends session |
| `DBConnection.java` | Provides database connection utility |

---

## ⚙️ Setup Instructions

1. **Clone the repository:**
   ```bash
   git clone https://github.com/YOUR_USERNAME/LostAndFoundPortal.git
# LostAndFoundPortal
