#creation of javaproj database v2
#Author: Paulo Gomes
#Description: 

DROP DATABASE IF EXISTS javaproj;
CREATE DATABASE javaproj;
USE javaproj;

-- Users table
CREATE TABLE users (
    user_id INT PRIMARY KEY AUTO_INCREMENT,
    user_name VARCHAR(100) NOT NULL,
    user_password VARCHAR(100) NOT NULL,
    user_type ENUM('retailer', 'consumer', 'charitable_organization') NOT NULL,
    user_email VARCHAR(100) UNIQUE NOT NULL
);

-- Products table
CREATE TABLE products (
    product_id INT PRIMARY KEY AUTO_INCREMENT,
    product_name VARCHAR(100) NOT NULL,
    user_id INT,
    price double,
    expiry_date DATE,
    FOREIGN KEY (user_id) REFERENCES users(user_id) ON UPDATE CASCADE ON DELETE CASCADE
);

-- Inventory table
CREATE TABLE inventory (
    inventory_id INT PRIMARY KEY AUTO_INCREMENT,
    product_id INT,
    quantity INT NOT NULL,
    location VARCHAR(100),
    user_id INT,
    FOREIGN KEY (product_id) REFERENCES products(product_id) ON UPDATE CASCADE ON DELETE CASCADE,
    FOREIGN KEY (user_id) REFERENCES users(user_id) ON UPDATE CASCADE ON DELETE CASCADE
);

-- Surplus food list table
CREATE TABLE surplus_food_list (
    surplus_id INT PRIMARY KEY AUTO_INCREMENT,
    product_id INT,
    quantity INT NOT NULL,
    expiry_date DATE,
    price double,
    status ENUM('donation', 'sale') NOT NULL,
    FOREIGN KEY (product_id) REFERENCES products(product_id) ON UPDATE CASCADE ON DELETE CASCADE
);

-- Claims table
CREATE TABLE claims (
    claim_id INT PRIMARY KEY AUTO_INCREMENT,
    user_id INT,
    surplus_id INT UNIQUE,
    FOREIGN KEY (user_id) REFERENCES users(user_id) ON UPDATE CASCADE ON DELETE CASCADE,
    FOREIGN KEY (surplus_id) REFERENCES surplus_food_list(surplus_id) ON UPDATE CASCADE ON DELETE CASCADE
);

-- Purchases table
CREATE TABLE purchases (
    purchase_id INT PRIMARY KEY AUTO_INCREMENT,
    user_id INT,
    surplus_id INT,
    FOREIGN KEY (user_id) REFERENCES users(user_id) ON UPDATE CASCADE ON DELETE CASCADE,
    FOREIGN KEY (surplus_id) REFERENCES surplus_food_list(surplus_id) ON UPDATE CASCADE ON DELETE CASCADE
);

-- Subscriptions table
CREATE TABLE subscriptions (
    subscription_id INT PRIMARY KEY AUTO_INCREMENT,
    user_id INT,
    location VARCHAR(100),
    communication_method ENUM('email', 'phone') NOT NULL,
    food_preferences VARCHAR(255),
    FOREIGN KEY (user_id) REFERENCES users(user_id) ON UPDATE CASCADE ON DELETE CASCADE
);

-- Subscription products table
CREATE TABLE subscription_products (
    subscription_id INT,
    product_id INT,
    PRIMARY KEY (subscription_id, product_id),
    FOREIGN KEY (subscription_id) REFERENCES subscriptions(subscription_id) ON UPDATE CASCADE ON DELETE CASCADE,
    FOREIGN KEY (product_id) REFERENCES products(product_id) ON UPDATE CASCADE ON DELETE CASCADE
);
