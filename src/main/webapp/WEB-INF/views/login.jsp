<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Login</title>
    <style type="text/css">
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
<style>
    #customers {
        font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
        border-collapse: collapse;
        width: 50%;
    }

    #customers td, #customers th {
        border: 1px solid #ddd;
        padding: 8px;
    }

    #customers tr:nth-child(even){background-color: #7f7fbf;}
    #customers tr:nth-child(odd){background-color: #4c4ca6;}

    #customers tr:hover {background-color: #ddd;}

    #customers th {
        padding-top: 12px;
        padding-bottom: 12px;
        text-align: left;
        background-color: #4CAF50;
        color: white;
    }
    a:link, a:visited {
        background-color: #8000ff;
        color: white;
        padding: 14px 25px;
        text-align: center;
        text-decoration: none;
        display: inline-block;
    }

    a:hover, a:active {
        background-color: red;

</style>
<body>

<jsp:include page="header.jsp"/>
<div align="center">
<h1>Login</h1>
<form:form action="authenticate" method="post" modelAttribute="login">
    <table id="customers">
        <tr>
            <td>username</td>
            <td>
                <form:input path="username" size="50"/> <br />
                <form:errors path="username" cssClass="error" />
            </td>
        </tr>
        <tr>
            <td>password</td>
            <td>
                <form:input path="password" type="password" size="100"/> <br />
                <form:errors path="password" cssClass="error" />
            </td>
        </tr>
        <tr>
            <td colspan="2"><button type="submit">Login</button></td>
        </tr>
    </table>
</form:form>
</div>
</body>
</html>