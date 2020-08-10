<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="header.jsp"></jsp:include>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Discussion Forum</title>
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
        width: 100%;
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
<div align="center">
<% if(session.getAttribute("username") != null){  %>


    <h1>Add a Topic</h1>




    <form:form action="addTopic" method="post" modelAttribute="topic">
    <table id="customers">
        <tr>
            <td>Topic Name:</td>
            <td>
                <form:input path="topic" /> <br />
                <form:errors path="topic" cssClass="error" />
            </td>
        </tr>
        <tr>
            <td>Your Post:</td>
            <td>
                <form:input path="post" /> <br />
                <form:errors path="post" cssClass="error" />
            </td>
        </tr>
        <tr>
            <td colspan="2"><button type="submit">Submit</button></td>
        </tr>
    </table>
    </form:form>

<h2>Discussion Forum</h2>



<table id="customers">
    <tr>
        <td><strong><h3>ID</h3></strong></td>
        <td><strong><h3>Topic</h3></strong></td>
        <td><strong><h3>Post               </h3></strong></td>
    </tr>
    <c:forEach items="${topics}" var="topic">
    <tr>
        <td>${topic.id}</td>
        <td>${topic.topic}</td>
        <td>${topic.post}</td>
    </tr>
    </c:forEach>
</table>

        <% } else { %>
<table id="customers">
        <div align="center">
    <h1>Login First To Enter Into Discussion Forum</h1>
        </div>
</table>
</div>

        <% }%>
</body>
</html>