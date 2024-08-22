#creation of javaproj database v2
#Author: Paulo Gomes
#Description: 

DROP DATABASE IF EXISTS javaproj;
CREATE DATABASE javaproj;
USE javaproj;

-- Users table with subscription preferences and notification option
CREATE TABLE users (
    user_id INT PRIMARY KEY AUTO_INCREMENT,
    user_name VARCHAR(100) NOT NULL,
    user_password VARCHAR(100) NOT NULL,
    user_type ENUM('retailer', 'consumer', 'charitable_organization') NOT NULL,
    user_email VARCHAR(100) UNIQUE NOT NULL,
    location VARCHAR(100),
    communication_method ENUM('email', 'phone') NOT NULL,
    food_preferences VARCHAR(255),
    notify_all_locations BOOLEAN DEFAULT FALSE
);

-- Combined Products and Inventory table
CREATE TABLE product_inventory (
    product_id INT PRIMARY KEY AUTO_INCREMENT,
    product_name VARCHAR(100) NOT NULL,
    user_id INT,
    price DOUBLE(10, 2),
    expiry_date DATE,
    quantity INT NOT NULL,
    FOREIGN KEY (user_id) REFERENCES users(user_id) ON UPDATE CASCADE ON DELETE CASCADE
);

-- Surplus Food List table
-- CREATE TABLE surplus_food_list (
--     surplus_id INT PRIMARY KEY AUTO_INCREMENT,
--     product_id INT,
--     quantity INT NOT NULL,
--     expiry_date DATE,
--     price DOUBLE(10, 2),
--     status ENUM('donation', 'sale') NOT NULL,
--     location VARCHAR(100),
--     FOREIGN KEY (product_id) REFERENCES product_inventory(product_id) ON UPDATE CASCADE ON DELETE CASCADE
-- );

CREATE TABLE surplus_food_list (
    surplus_id INT PRIMARY KEY AUTO_INCREMENT,
    product_id INT,
    discount INT, 
    status ENUM('donation', 'sale') NOT NULL,
    location VARCHAR(100),
    FOREIGN KEY (product_id) REFERENCES product_inventory(product_id) ON UPDATE CASCADE ON DELETE CASCADE
);

-- Combined Claims and Purchases table
CREATE TABLE transactions (
    transaction_id INT PRIMARY KEY AUTO_INCREMENT,
    user_id INT,
    surplus_id INT,
    transaction_type ENUM('claim', 'purchase') NOT NULL,
    FOREIGN KEY (user_id) REFERENCES users(user_id) ON UPDATE CASCADE ON DELETE CASCADE,
    FOREIGN KEY (surplus_id) REFERENCES surplus_food_list(surplus_id) ON UPDATE CASCADE ON DELETE CASCADE
);


CREATE VIEW charity_view AS
SELECT surplus_food_list.surplus_id, surplus_food_list.discount,
surplus_food_list.status, users.location, product_inventory.product_name,
product_inventory.expiry_date, product_inventory.quantity
FROM surplus_food_list
JOIN product_inventory ON surplus_food_list.product_id = product_inventory.product_id
JOIN users ON product_inventory.user_id = users.user_id
WHERE surplus_food_list.status = 'donation';

CREATE VIEW consumer_view AS
SELECT surplus_food_list.surplus_id, surplus_food_list.discount,
surplus_food_list.status, users.location, product_inventory.product_name,
product_inventory.expiry_date, product_inventory.quantity
FROM surplus_food_list
JOIN product_inventory ON surplus_food_list.product_id = product_inventory.product_id
JOIN users ON product_inventory.user_id = users.user_id
WHERE surplus_food_list.status = 'sale';