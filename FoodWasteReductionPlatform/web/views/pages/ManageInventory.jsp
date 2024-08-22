<%-- 
    Document   : ManageInventory
    Created on : Jul. 28, 2024, 6:06:26 p.m.
    Author     : Khushpreet Kaur
--%>

<%@page import="java.util.List"%>
<%@page import="model.Inventory"%>
<%@page contentType="text/html;charset=UTF-8" language="java"%>
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>Item Management Page</title>
        <link rel="stylesheet" href="../css/style.css" />
    </head>
    <body class="body">
        <div class="shadow"></div>
        <jsp:include page="components/header.jsp" />
        <main class="main primary-style bg">
            <jsp:include page="components/popover.jsp" >
                <jsp:param name="title" value="Update Item" />
                <jsp:param name="button" value="Update" />
                <jsp:param name="id" value="update-popover" />
            </jsp:include>
            <article popover class="popover secondary-style bg" id="delete-popover">
                <a class="secondary-style exit-btn txt" href="../Retailer.html">&#x2718;</a>
                <fieldset class="popover-fieldset">
                    <legend class="secondary-style popover-title txt">Delete</legend>
                    <p class="secondary-style popover-message txt">
                        Do you want to delete this item?
                    </p>
                    <button class="btn btn-style">Delete</button>
                </fieldset>
            </article>
            <jsp:include page="components/popover.jsp" >
                <jsp:param name="title" value="Add Item" />
                <jsp:param name="button" value="Add" />
                <jsp:param name="id" value="item-popover" />
            </jsp:include>
            <h1 class="secondary-style page-title txt">Inventory Management</h1>
            <article class="grid-container bg">
                <div class="grid-item secondary-style bg txt">Item</div>
                <div class="grid-item secondary-style bg txt">Quantity</div>
                <div class="grid-item secondary-style bg txt">Expiration Date</div>
                <div class="grid-item secondary-style bg txt"></div>
                <% List<Inventory> inventorys = (List<Inventory>) request.getAttribute("inventorys");
                for (Inventory inventory : inventorys) {%>
                <div class="grid-item secondary-style bg txt"><%= inventory.getProductName()%></div>
                <div class="grid-item secondary-style bg txt"><%= inventory.getQuantity()%></div>
                <div class="grid-item secondary-style bg txt"><%= inventory.getExpirationDate()%></div>
                <div class="grid-item secondary-style bg txt">
                    <button popovertarget="update-popover" class="btn btn-style">
                        Update
                    </button>
                    <button popovertarget="delete-popover" class="btn btn-style">
                        Delete
                    </button>
                </div>
                <% } %>
                //end here
            </article>
            <button popovertarget="item-popover" style="width: 100%;" class="btn btn-style">
                Add Item
            </button>
        </main>
        <jsp:include page="components/footer.jsp" />
    </body>
</html>

