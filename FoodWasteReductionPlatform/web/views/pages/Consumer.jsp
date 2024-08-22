<%-- 
    Document   : Consumer
    Created on : Jul. 31, 2024, 8:26:22 p.m.
    Author     : khush
--%>

<%@page import="model.Product"%>
<%@page import="model.Inventory"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Consumer Page</title>
        <link rel="stylesheet" href="css/style.css" />
    </head>
    <body>
    <body class="body">
        <div class="shadow"></div>
        <jsp:include page="components/header.jsp" />
        <main class="main primary-style bg">
            <h1 class="secondary-style page-title txt">Purchase</h1>
            <article class="grid-container bg">
                <div class="grid-item secondary-style bg txt">Item</div>
                <div class="grid-item secondary-style bg txt">Quantity</div>
                <div class="grid-item secondary-style bg txt">Price</div>
                <div class="grid-item secondary-style bg txt">Expiration Date</div>

                <% List<Product> products = (List<Product>) request.getAttribute("products");
                for (Product product : products) {%>
                <div class="grid-item secondary-style bg txt"><%= product.getProductName()%></div>
                <div class="grid-item secondary-style bg txt">
                    <input type="text" class="" value="3" style="border:0; border-bottom: 0.1vh solid #333; text-align: center; width: 90%; font-size: 2.25vh;"><Br>
                    <p style="text-align: left;"><%= product.getQuantity()%></p>
                </div>
                <div class="grid-item secondary-style bg txt"><%= product.getPrice()%></div>
                <div class="grid-item secondary-style bg txt"><%= product.getExpirationDate()%></div>
                <% } %>
            </article>
            <button popovertarget="item-popover" style="width: 100%;" class="btn btn-style">
                Purchase Items
            </button>
        </main>
        <jsp:include page="components/footer.jsp" />
    </body>
</body>
</html>