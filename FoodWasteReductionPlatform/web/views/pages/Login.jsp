<%-- 
    Document   : Login
    Created on : Jul. 30, 2024, 8:43:18 p.m.
    Author     : khushpreet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Html.html to edit this template
-->
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>Login Page</title>
        <link rel="stylesheet" href="../css/style.css" />
    </head>
    <body class="primary-style bg body">
        <main class="main container center">
            <div class="login secondary-style bg">
                <form action="user" method="post">
                    <input type="hidden" name="action" value="login">
                    <fieldset class="popover-fieldset">
                        <h1 class="secondary-style txt popover-title">Login</h1>
                        <label for="username" class="popover-label secondary-style txt"
                               >Username</label
                        >
                        <input
                            type="text"
                            id="username"
                            name="username"
                            class="popover-input secondary-style txt"
                            />
                        <label for="password" class="popover-label secondary-style txt"
                               >Password</label
                        >
                        <input
                            type="password"
                            id="password"
                            name="password"
                            class="popover-input secondary-style txt"
                            />
                    </fieldset>
                    <button class="btn-style">Login</button>
                </form>
                <div class="signup-group a-divider a-divider-break">
                    <p class="bg-secondary">New User?</p>
                </div>
                <button class="btn-style" onclick="location.href = '../../Registration.jsp'">
                    Register
                </button>
            </div>
        </main>
    </body>
</html>

