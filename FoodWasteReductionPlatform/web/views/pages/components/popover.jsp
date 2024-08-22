<%-- 
    Document   : popover
    Created on : Jul. 30, 2024, 9:22:04 p.m.
    Author     : khush
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<article popover class="popover secondary-style bg" id="${param.id}">
    <a class="secondary-style exit-btn txt" href="../Retailer.html">&#x2718;</a>
    <form action="${param.formAction}}">
        <fieldset class="popover-fieldset">
            <legend class="secondary-style popover-title txt">${param.title}</legend>
            <label for="add-item-name" class="popover-label secondary-style txt">Item Name</label>
            <input type="text" id="add-item-name" class="popover-input secondary-style txt" />
            <label for="add-quantity" class="popover-label secondary-style txt">Quantity</label>
            <input type="number" id="add-quantity" class="popover-input secondary-style txt" />
            <label for="add-expiration-date" class="popover-label secondary-style txt">Expiration date</label>
            <input type="date" id="add-expiration-date" class="popover-input secondary-style txt" />
            <button type="submit" form="update-form" class="btn btn-style">
                ${param.button}
            </button>
        </fieldset>
    </form>
</article>
