//package run;
//
//import com.classes_Ky.ManageInventory;
//
//import java.util.Date;
//
//public class App {
//    public static void main(String[] args) {
//        ManageInventory inventoryService = new ManageInventory();
//
//        // Example Product
//        Product product = new Product();
//        product.setProductName("Organic Apples");
//        product.setRetailerId(1);
//
//        // Add Product
//        System.out.println("Adding Product...");
//        inventoryService.addProduct(product);
//
//        // Update Product
//        product.setProductName("Fresh Organic Apples");
//        System.out.println("Updating Product...");
//        inventoryService.updateProduct(product);
//
//        // Delete Product
//        System.out.println("Deleting Product...");
//        inventoryService.deleteProduct(product.getProductId());
//
//        // Example Inventory
//        Inventory inventory = new Inventory();
//        inventory.setProductId(1); // Assuming product ID 1
//        inventory.setRetailerId(1); // Assuming retailer ID 1
//        inventory.setQuantity(50);
//        inventory.setExpiryDate(new Date());
//
//        // Add Inventory
//        System.out.println("Adding Inventory...");
//        inventoryService.addInventory(inventory);
//
//        // Update Inventory
//        inventory.setQuantity(30);
//        System.out.println("Updating Inventory...");
//        inventoryService.updateInventory(inventory);
//
//        // Delete Inventory
//        System.out.println("Deleting Inventory...");
//        inventoryService.deleteInventory(inventory.getInventoryId());
//
//        // Flag Surplus
//        System.out.println("Flagging Surplus...");
//        inventoryService.flagSurplus();
//
//        // List Surplus as Donate
//        System.out.println("Listing Surplus as Donate...");
//        inventoryService.listSurplusAsDonate();
//
//        // List Surplus as Sell
//        System.out.println("Listing Surplus as Sell...");
//        inventoryService.listSurplusAsSell();
//
//        // List Surplus as Donate or Sell with quantities
//        System.out.println("Listing Surplus as Donate or Sell...");
//        inventoryService.listSurplusAsDonateOrSell(20, 30); // Example quantities
//    }
//}
