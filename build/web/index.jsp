<%-- 
    Document   : index
    Created on : 8/05/2024, 8:40:31 p. m.
    Author     : yeiso
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="style.css">
    </head>
<body class="Register">
    <form class="Form" action="InsertarDatos" method="post">
        <h1 class="Form_h1">Crear Usuario</h1>
        <div class="Form_div">
            <label class="Form_Label">Nombres:</label>
            <input class="Form_Input" type="text" name="Nombres" placeholder="Diego" required>
        </div>
        <div class="Form_div">
            <label class="Form_Label">Apellidos:</label>
            <input class="Form_Input" type="text" name="Apellidos" placeholder="Garces Gomez" required>
        </div>
        <div class="Form_div">
            <label class="Form_Label">Email:</label>
            <input class="Form_Input" type="text" name="Email" placeholder="ejemplo123@gmail.com" required>
        </div>
        <div class="Form_div">
            <label class="Form_Label">Telefono:</label>
            <input class="Form_Input" type="number" name="Telefono" placeholder="3214568790" required>
        </div>
        <div class="Form_div">
            <label class="Form_Label">Contraseña: </label>
            <input class="Form_Input" type="password" name="Contrasena" placeholder="--------" required>
        </div>
        <input class="Form_Button" type="submit" value="Enviar" />
    </form>
    
    <form class="Form" action="LoginUser" method="get">
        <h1 class="Form_h1">Logear Usuario</h1>
        <div class="Form_div">
            <label class="Form_Label">Email:</label>
            <input class="Form_Input" type="text" name="Email" placeholder="ejemplo123@gmail.com" required>
        </div>
        <div class="Form_div">
            <label class="Form_Label">Contraseña: </label>
            <input class="Form_Input"  type="text" name="Contrasena" placeholder="--------" required>
        </div>
        <input class="Form_Button" type="submit" value="Enviar" />
    </form>
</body>
</html>
