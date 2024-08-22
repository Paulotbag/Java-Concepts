/**
* Author:  Paulo Granjeiro
*/

DROP DATABASE IF EXISTS javaproj;
CREATE DATABASE javaproj;
USE javaproj;

CREATE TABLE users (
    user_id INT PRIMARY KEY AUTO_INCREMENT,
    user_name VARCHAR(100) NOT NULL,
    user_surname VARCHAR(100) NOT NULL,
    user_password VARCHAR(100) NOT NULL,
    user_type ENUM('retailer', 'consumer', 'charitable_organization') NOT NULL,
    user_email VARCHAR(100) UNIQUE NOT NULL,
    user_phone VARCHAR(15),
    reward_points INT DEFAULT 0
);

CREATE TABLE retailers (
    retailer_id INT PRIMARY KEY AUTO_INCREMENT,
    user_id INT UNIQUE,
    retailer_name VARCHAR(100) NOT NULL,
    FOREIGN KEY (user_id) REFERENCES users(user_id)
);

CREATE TABLE charitable_organizations (
    charity_id INT PRIMARY KEY AUTO_INCREMENT,
    user_id INT UNIQUE,
    organization_name VARCHAR(100) NOT NULL,
    contact_person VARCHAR(100),
    FOREIGN KEY (user_id) REFERENCES users(user_id)
);

CREATE TABLE consumers (
    consumer_id INT PRIMARY KEY AUTO_INCREMENT,
    user_id INT UNIQUE,
    consumer_name VARCHAR(100) NOT NULL,
    consumer_surname VARCHAR(100) NOT NULL,
    phone_number VARCHAR(15),
    FOREIGN KEY (user_id) REFERENCES users(user_id)
);

CREATE TABLE products (
    product_id INT PRIMARY KEY AUTO_INCREMENT,
    product_name VARCHAR(100) NOT NULL,
    retailer_id INT,
    FOREIGN KEY (retailer_id) REFERENCES retailers(retailer_id)
);

CREATE TABLE inventory (
    inventory_id INT PRIMARY KEY AUTO_INCREMENT,
    product_id INT,
    retailer_id INT,
    quantity INT NOT NULL,
    expiry_date DATE,
    FOREIGN KEY (product_id) REFERENCES products(product_id),
    FOREIGN KEY (retailer_id) REFERENCES retailers(retailer_id)
);

CREATE TABLE surplus_food_list (
    surplus_id INT PRIMARY KEY AUTO_INCREMENT,
    product_id INT,
    quantity INT NOT NULL,
    expiry_date DATE,
    status ENUM('donation', 'sale') NOT NULL,
    FOREIGN KEY (product_id) REFERENCES products(product_id)
);

CREATE TABLE claims (
    claim_id INT PRIMARY KEY AUTO_INCREMENT,
    charity_id INT,
    surplus_id INT UNIQUE,  -- Enforce one-to-one relationship with surplus_food_list
    claim_date DATE,
    FOREIGN KEY (charity_id) REFERENCES charitable_organizations(charity_id),
    FOREIGN KEY (surplus_id) REFERENCES surplus_food_list(surplus_id)
);

CREATE TABLE purchases (
    purchase_id INT PRIMARY KEY AUTO_INCREMENT,
    consumer_id INT,
    surplus_id INT,
    purchase_date DATE,
    FOREIGN KEY (consumer_id) REFERENCES consumers(consumer_id),
    FOREIGN KEY (surplus_id) REFERENCES surplus_food_list(surplus_id)
);

CREATE TABLE subscriptions (
    subscription_id INT PRIMARY KEY AUTO_INCREMENT,
    consumer_id INT,
    location VARCHAR(100),
    communication_method ENUM('email', 'phone') NOT NULL,
    food_preferences VARCHAR(255),
    FOREIGN KEY (consumer_id) REFERENCES consumers(consumer_id)
);

CREATE TABLE subscription_products (
    subscription_id INT,
    product_id INT,
    PRIMARY KEY (subscription_id, product_id),
    FOREIGN KEY (subscription_id) REFERENCES subscriptions(subscription_id),
    FOREIGN KEY (product_id) REFERENCES products(product_id)
);

