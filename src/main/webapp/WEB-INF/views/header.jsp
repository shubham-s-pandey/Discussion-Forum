<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>



<html>
<head>
    <style>
    input[type=text], select {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
    }

    input[type=submit] {
    width: 100%;
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    border-radius: 4px;
    cursor: pointer;
    }

    input[type=submit]:hover {
    background-color: #45a049;
    }

    div {
    border-radius: 0px;
    background-color: #cccce5 ;
    background-image: linear-gradient(ghostwhite, gray);
    padding: 20px;
    }
    .error {
        color: red;
    }
    table {
        width: 50%;
        border-collapse: collapse;
        border-spacing: 0px;
    }
    table td {
        border: 1px solid #565454;
        padding: 20px;
    }
    </style>
</head>
<body>
<div align="right">
    <% if(session.getAttribute("username") != null){  %>
    <%= "Hello! " + session.getAttribute("name") +" ("+session.getAttribute("username")+")" %> |
    <a href="/logout">logout</a>
</div>
<div align="right">
    <% } else { %>
    <%= "Hello Guest!" %> | <a href="/login">login</a>
    <% }%>
</div>
<hr/>
</body>
</html>