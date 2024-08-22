<%-- 
    Document   : UserView
    Created on : Jul. 31, 2024, 8:47:19 p.m.
    Author     : khush
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>Registration Page</title>
        <link rel="stylesheet" href="css/style.css" />
    </head>
    <body class="primary-style bg body">
        <jsp:include page="components/header.jsp" />
        <main class="main container center">
            <div class="login secondary-style bg">
                <form>
                    <fieldset class="popover-fieldset">
                        <h1 class="secondary-style txt popover-title">User View</h1>
                        <h2 for="name" class="popover-label secondary-style txt">Name</h2>
                        <p type="text" class="popover-input secondary-style txt" id="name">
                            Khushpreet Kaur
                        </p>
                        <h2 for="email" class="popover-label secondary-style txt">Email</h2>
                        <p
                            type="text"
                            id="email"
                            name="username"
                            class="popover-input secondary-style txt"
                            >
                            khushisainikhushi148@gmail.com
                        </p>
                        <h2 for="password" class="popover-label secondary-style txt">
                            Password
                        </h2>
                        <p
                            type="password"
                            id="password"
                            name="password"
                            class="popover-input secondary-style txt"
                            >
                            *******
                        </p>
                        <h2 class="popover-label secondary-style txt">Type</h2>
                        <p class="popover-input secondary-style txt">Consumer</p>
                    </fieldset>
                </form>
                <button class="btn-style" onclick="location.href = 'UserSettings.html'">
                    Edit Information
                </button>
                <br>
                <button class="btn-style" onclick="location.href = 'Login.html'">
                    Delete User
                </button>
            </div>
        </main>
        <jsp:include page="components/footer.jsp" />
    </body>
</html>

