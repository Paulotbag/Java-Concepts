<%-- 
    Document   : UserSettings
    Created on : Jul. 31, 2024, 8:46:47 p.m.
    Author     : khush
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>User Settings</title>
        <link rel="stylesheet" href="css/style.css" />
    </head>
    <body class="primary-style bg body">
        <jsp:include page="components/header.jsp" />
        <main class="main container center">
            <div class="login secondary-style bg">
                <form>
                    <fieldset class="popover-fieldset">
                        <h1 class="secondary-style txt popover-title">Edit User</h1>
                        <label for="name" class="popover-label secondary-style txt"
                               >Name</label
                        >
                        <input
                            type="text"
                            class="popover-input secondary-style txt"
                            id="name"
                            value="Khushpreet Kaur"
                            />
                        <label for="email" class="popover-label secondary-style txt"
                               >Email</label
                        >
                        <input
                            type="text"
                            id="email"
                            name="username"
                            class="popover-input secondary-style txt"
                            value="khushisainikhushi148@gmail.com"
                            />
                        <label for="password" class="popover-label secondary-style txt"
                               >Password</label
                        >
                        <input
                            type="password"
                            id="password"
                            name="password"
                            class="popover-input secondary-style txt"
                            value="***********"
                            />
                    </fieldset>
                </form>
                <button class="btn-style" onclick="location.href = 'UserSettings.html'">
                    Done
                </button>
                <button class="btn-style" onclick="location.href = 'UserSettings.html'">
                    Clear
                </button>
            </div>
        </main>
        <jsp:include page="components/footer.jsp" />
    </body>
</html>

