CREATE DATABASE lostfound_db CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;


-- CHARACTER SET utf8mb4	Defines the character encoding — how text is stored.
-- ✅ utf8mb4 is the recommended modern character set in MySQL because:
-- - It supports all Unicode characters, including emojis 😊 and special symbols.
-- - It’s more complete than older utf8, which could only handle 3-byte characters (and thus missed some characters).
-- COLLATE utf8mb4_unicode_ci	Defines the collation, i.e., the set of rules for comparing and sorting text.
-- - utf8mb4_unicode_ci means:
-- - utf8mb4 → Use the utf8mb4 character set.
-- - unicode → Use standard Unicode sorting rules.
-- - ci → Case-insensitive (e.g., 'ABC' = 'abc').


USE lostfound_db;

CREATE TABLE users (
  id INT AUTO_INCREMENT PRIMARY KEY,
  fullname VARCHAR(150) NOT NULL,
  email VARCHAR(150) NOT NULL UNIQUE,
  password_hash VARCHAR(255) NOT NULL, -- store hashed password
  role VARCHAR(50) DEFAULT 'user',
  created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);


select * from users;

SET SQL_SAFE_UPDATES = 0;  -- disable safe mode
delete from users;
SET SQL_SAFE_UPDATES = 1;    -- enable safe mode

CREATE TABLE items (
  id INT AUTO_INCREMENT PRIMARY KEY,
  title VARCHAR(200) NOT NULL,
  description TEXT,
  category VARCHAR(100),          -- "lost" or "found" or types
  location VARCHAR(200),
  date_found_lost DATE,
  image_path VARCHAR(500),
  posted_by INT,
  contact_info VARCHAR(255),
  status VARCHAR(50) DEFAULT 'open',
  created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  FOREIGN KEY (posted_by) REFERENCES users(id) ON DELETE SET NULL
);

select * from items;



CREATE TABLE messages (
    id INT AUTO_INCREMENT PRIMARY KEY,
    sender VARCHAR(100),
    receiver VARCHAR(100),
    message TEXT,
    timestamp TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

select * from messages;

ALTER TABLE items ADD COLUMN status VARCHAR(20) DEFAULT 'active';

CREATE TABLE departments (
  id INT AUTO_INCREMENT PRIMARY KEY,
  username VARCHAR(100) NOT NULL UNIQUE,
  password_hash VARCHAR(255) NOT NULL, -- ideally store a hash (bcrypt)
  fullname VARCHAR(150),
  created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

INSERT INTO departments (username, password_hash)
VALUES ('pritesh', 'qqqqq');

CREATE TABLE history (
  id INT AUTO_INCREMENT PRIMARY KEY,
  item_id INT,
  item_name VARCHAR(200),
  category VARCHAR(100),
  location VARCHAR(200),
  description TEXT,
  posted_by INT,
  posted_by_name VARCHAR(200),
  claimed_by VARCHAR(200),
  image_path VARCHAR(500),
  removed_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  status VARCHAR(50) DEFAULT 'Claimed'
);

select * from history;
