<%-- 
    Document   : Registration
    Created on : Jul. 30, 2024, 9:52:14 p.m.
    Author     : khush
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Registration Page</title>
        <link rel="stylesheet" href="views/css/style.css" />
    </head>
    <body class="primary-style bg body">
        <main class="main container center">
            <div class="login secondary-style bg">
                <form action="${pageContext.request.contextPath}/RegistrationController" method="post">
<!--                    <input type="hidden" name="action" value="register">-->

                    <fieldset class="popover-fieldset">
                        <h1 class="secondary-style txt popover-title">Registration</h1>
                        <label for="name" class="popover-label secondary-style txt">Name</label>
                        <input type="text" id="name" class="popover-input secondary-style txt" id="name">
                        <label for="email" class="popover-label secondary-style txt">Email</label>
                        <input type="text" id ="email" name="username" class="popover-input secondary-style txt">
                        <label for="password" class="popover-label secondary-style txt">Password</label>
                        <input type="password" id ="password" name="password" class="popover-input secondary-style txt">
                    </fieldset>
                    <fieldset class="popover-select">
                        <legend class="popover-title-radio secondary-style txt">Type</legend>
                        <div>
                            <input type="radio" class="popover-radio secondary-style txt" id="consumer" value="Consumer" name="type">
                            <label for="consumer" class="popover-label secondary-style txt">Consumer</label>
                        </div>
                        <div>
                            <input type="radio" class="popover-radio secondary-style txt" id="charitableOrganization" value="Charitable Organization" name="type">
                            <label for="charitableOrganization" class="popover-label secondary-style txt">Charitable organization </label>
                        </div>
                        <div>
                            <input type="radio" class="popover-radio secondary-style txt" id="retailer" value="Retailer" name="type">
                            <label for="retailer" class="popover-label secondary-style txt">Retailer</label>
                        </div>
                    </fieldset>

                    <button class="btn-style"> Sign up</button>
                </form>
                <div class="signup-group a-divider a-divider-break">
                    <p class="bg-secondary">Already have an account?</p>
                </div>
                <button class="btn-style"onclick="location.href = 'views/pages/Login.jsp'">Login</button> 

            </div>

        </main>
    </body>
</html>
