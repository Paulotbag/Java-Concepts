package dataaccesslayer.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.*;
import dataaccesslayer.database.DatabaseConnection;

public class ProductDaoImpl {
    private Connection connection;
    
    public ProductDaoImpl(Connection connection) {
        this.connection = connection;
    } //khushi

    // Add a new product to the database
    public void addProduct(Product product) throws SQLException {
        String sql = "INSERT INTO products (product_name, user_id, price, expiry_date) VALUES (?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, product.getProductName());
            stmt.setInt(2, product.getUserId());
            stmt.setDouble(3, product.getPrice());
            stmt.setDate(4, product.getExpiryDate());
            stmt.executeUpdate();
        }
    }
    
    // Update an existing product in the database
    public void updateProduct(Product product) throws SQLException {
        String sql = "UPDATE products SET product_name = ?, user_id = ?, price = ?, expiry_date = ? WHERE product_id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, product.getProductName());
            stmt.setInt(2, product.getUserId());
            stmt.setDouble(3, product.getPrice());
            stmt.setDate(4, product.getExpiryDate());
            stmt.setInt(5, product.getProductId());
            stmt.executeUpdate();
        }
    }
    
    // Delete a product from the database
    public void deleteProduct(int productId) throws SQLException {
        String sql = "DELETE FROM products WHERE product_id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, productId);
            stmt.executeUpdate();
        }
    }
    
    // Retrieve a product from the database
    public Product getProductByProductId(int productId) throws SQLException {
        String sql = "SELECT * FROM products WHERE product_id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, productId);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                Product product = new Product();
                product.setProductId(rs.getInt("product_id"));
                product.setProductName(rs.getString("product_name"));
                product.setUserId(rs.getInt("user_id"));
                product.setUserId(rs.getInt("price"));
                product.setUserId(rs.getInt("expiry_date"));
                return product;
            }
        }
        return null;
    }
}
