This project involved creating a Food Waste Reduction Platform designed to connect food retailers, consumers, and charitable organizations. The goal was to build a system that helps reduce food waste by efficiently redistributing surplus food. Here's what the project entailed:

User Registration and Authentication: The platform allows users (retailers, consumers, and charitable organizations) to create accounts, log in, and log out.

Retailer Functionality:

Inventory Management: Retailers could manage their food inventory by adding items, updating quantities, and setting expiration dates.
Surplus Food Identification: The system automatically flagged food items nearing expiration (within one week) as surplus.
Listing Surplus Food: Retailers could list these surplus items for donation or sale at a discounted price.
Charitable Organizations:

Claim Food: Charitable organizations could claim surplus food items listed for donation.
Inventory Update: The retailer’s inventory would automatically update when an item was claimed.
Consumers:

Purchase Food: Consumers could purchase surplus food at discounted rates (though no real transactions took place).
Inventory Update: The retailer’s inventory was updated once a purchase was made.
Surplus Food Alerts:

User Subscription: Users could subscribe to receive notifications about surplus food based on their location, preferred communication method (email or phone), and food preferences.
Automatic Notifications: The system sent alerts to subscribed users whenever new surplus food was listed.
Bonus Feature: The project included an additional unique feature not listed in the original requirements, which was detailed in the high-level design report.

Database Design: The system used a relational database (RDBMS) named "FWRP" to store and manage data. The database was structured to handle all the functional requirements, including user accounts, inventory, and surplus food tracking.

3-Tier Architecture: The platform followed a 3-tier architecture:

Presentation Layer: Handled user interaction.
Business Layer: Managed business logic and processing.
Database Layer: Managed data storage and retrieval.
Version Control: The project used GitHub for version control, with team members collaborating through branches and pull requests.

JUnit Testing: JUnit tests were written to ensure the code was reliable and met the requirements.

Solution and Demonstration: The final solution was built using Java/J2EE, incorporating design patterns covered in the course. The project was demonstrated in class, supported by a brief PowerPoint presentation.

NOTE: Code is not fully implemented. It still has work to be done before working 100%. The controllers must be improved to work on their pages. Some files must be deleted as they are not used. This code was done in collaboration with other students that were learning alongside me.