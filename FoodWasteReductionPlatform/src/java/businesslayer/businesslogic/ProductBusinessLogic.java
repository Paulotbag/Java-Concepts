package businesslayer.businesslogic;

import java.sql.Connection;
import java.sql.SQLException;

import dataaccesslayer.impl.ProductDaoImpl;
import model.*;

public class ProductBusinessLogic {
    private ProductDaoImpl productDAO;

    public ProductBusinessLogic(Connection connection) {
        this.productDAO = new ProductDaoImpl(connection);
    }

    public void addProduct(Product product) throws SQLException {
        productDAO.addProduct(product);
    }

    public Product getProduct(int productId) throws SQLException {
        return productDAO.getProductByProductId(productId);
    }

}
