<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Changement de mot de passe</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>


<%@include file="topbar.jsp" %>

<div class="signup-header">
    <h2>Changement de mot de passe</h2>
</div>

<form method="post" action="Controller">

    <input type="hidden" name="page" value="login-form">

    <!-- Validations errors -->
    <font color="#F24638"><c:out value="${msg }"></c:out></font>

    <div class="signup-group">
        <label>Mot de passe</label>
        <input type="password" name="mdp1" placeholder="Nouveau mot de passe" value="<c:out value="${mdp}"></c:out>">
    </div>
    <div class="signup-group">
        <label>Nouveau mot de passe</label>
        <input type="password" name="mdp2" placeholder="Confirmer le mot de passe">
    </div>
    <div class="signup-group">
        <button type="submit" name="valider" class="signup-btn">Valider</button>
        <button type="submit" name="annuler" class="signup-btn">Annuler</button>
    </div>

</form>
<br><br><br>
<%@include file="bottombar.jsp" %>


</body>
</html>