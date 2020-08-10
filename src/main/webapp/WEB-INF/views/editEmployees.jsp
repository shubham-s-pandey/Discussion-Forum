<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
                pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="header.jsp"></jsp:include>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Spring5 MVC Hibernate Demo</title>
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

        .collapsible {
            background-color: #777;
            color: white;
            cursor: pointer;
            padding: 18px;
            width: 100%;
            border: none;
            text-align: left;
            outline: none;
            font-size: 15px;
        }

        .active, .collapsible:hover {
            background-color: #555;
        }

        .collapsible:after {
            content: '\002B';
            color: white;
            font-weight: bold;
            float: right;
            margin-left: 5px;
        }

        .active:after {
            content: "\2212";
        }

        .content {
            padding: 0 18px;
            max-height: 0;
            overflow: hidden;
            transition: max-height 0.2s ease-out;
            background-color: #f1f1f1;
        }

    </style>
</head>
<style>

    #customers {
        font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
        border-collapse: collapse;
        width: 95%;
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

    #example1 {
        border: 10px dotted black;
        padding:35px;
        background: yellow;
    }
</style>
<body>
<div id="example1">


<% if(session.getAttribute("username") != null){  %>

<div align="center" >
    <table id="customers">
<a href="/topic"><h1>Click here to start Discussion</h1></a>
    </table>
</div>



        <% } else { %>

    <div align="center" >
        <h1 >Register Yourself!</h1>
        <c:choose>
            <c:when test="${empty employeeEdited}">
                <form:form action="addEmployee" method="post" modelAttribute="employee">
                    <table id="customers">
                        <tr>
                            <td>username</td>
                            <td>
                                <form:input path="username" /> <br />
                                <form:errors path="username" cssClass="error" />
                            </td>
                        </tr>
                        <tr>
                            <td>password</td>
                            <td>
                                <form:input path="password" /> <br />
                                <form:errors path="password" cssClass="error" />
                            </td>
                        </tr>
                        <tr>
                            <td>First Name</td>
                            <td>
                                <form:input path="firstName" /> <br />
                                <form:errors path="firstName" cssClass="error" />
                            </td>
                        </tr>
                        <tr>
                            <td>Last Name</td>
                            <td>
                                <form:input path="lastName" /> <br />
                                <form:errors path="lastName" cssClass="error" />
                            </td>
                        </tr>
                        <tr>
                            <td>Gender</td>
                            <td>
                                <form:input path="gender" /> <br />
                                <form:errors path="gender" cssClass="error" />
                            </td>
                        </tr>

                        <tr>
                            <td>Phone</td>
                            <td>
                                <form:input path="phone" /> <br />
                                <form:errors path="phone" cssClass="error" />
                            </td>
                        </tr>
                        <tr>
                            <td>City</td>
                            <td>
                                <form:input path="city" /> <br />
                                <form:errors path="city" cssClass="error" />
                            </td>
                        </tr>
                        <tr>
                            <td>Country</td>
                            <td>
                                <form:input path="country" /> <br />
                                <form:errors path="country" cssClass="error" />
                            </td>
                        </tr>
                        <tr>
                            <td colspan="2"><button type="submit">Submit</button></td>
                        </tr>
                    </table>
                </form:form>
            </c:when>
            <c:otherwise>
                <form:form action="updateEmployee" method="post" modelAttribute="employeeEdited">
                    <table>
                        <tr>
                            <td>username</td>
                            <td>
                                <form:input path="username" /> <br />
                                <form:errors path="username" cssClass="error" />
                            </td>
                        </tr>
                        <tr>
                            <td>password</td>
                            <td>
                                <form:input path="password" /> <br />
                                <form:errors path="password" cssClass="error" />
                            </td>
                        </tr>
                        <tr>
                            <form:hidden path="id"/>
                            <td>First Name</td>
                            <td>
                                <form:input path="firstName" /> <br />
                                <form:errors path="firstName" cssClass="error" />
                            </td>
                        </tr>
                        <tr>
                            <td>Last Name</td>
                            <td>
                                <form:input path="lastName" /> <br />
                                <form:errors path="lastName" cssClass="error" />
                            </td>
                        </tr>
                        <tr>
                            <td>Gender</td>
                            <td>
                                <form:input path="gender" /> <br />
                                <form:errors path="gender" cssClass="error" />
                            </td>
                        </tr>
                        <tr>
                            <td>Phone</td>
                            <td>
                                <form:input path="phone" /> <br />
                                <form:errors path="phone" cssClass="error" />
                            </td>
                        </tr>
                        <tr>
                            <td>City</td>
                            <td>
                                <form:input path="city" /> <br />
                                <form:errors path="city" cssClass="error" />
                            </td>
                        </tr>
                        <tr>
                            <td>Country</td>
                            <td>
                                <form:input path="country" /> <br />
                                <form:errors path="country" cssClass="error" />
                            </td>
                        </tr>
                        <tr>
                            <td colspan="2"><button type="submit">Submit</button></td>
                        </tr>
                    </table>
                </form:form>
            </c:otherwise>
        </c:choose>



<button class="collapsible"> Forgot Your ID, Click Here </button>
<div class="content">
<h2>User List</h2>

<table id="customers">
    <tr>
        <td><strong>User</strong></td>
        <td><strong>Pass</strong></td>
        <td><strong>First Name</strong></td>
        <td><strong>Last Name</strong></td>
        <td><strong>Gender</strong></td>
        <td><strong>Phone</strong></td>
        <td><strong>City</strong></td>
        <td><strong>Country</strong></td>
        <td><strong>Action</strong></td>
    </tr>
    <c:forEach items="${employees}" var="employee">
        <tr>
            <td>${employee.username}</td>
            <td>${employee.password}</td>
            <td>${employee.firstName}</td>
            <td>${employee.lastName}</td>
            <td>${employee.gender}</td>
            <td>${employee.phone}</td>
            <td>${employee.city}</td>
            <td>${employee.country}</td>
            <td>
                <a href="/editEmployee?id=${employee.id}">edit</a>
                |
                <a href="/deleteEmployee?id=${employee.id}">delete</a>
            </td>
        </tr>
    </c:forEach>
</table>
</div>


        <% }%>

<script>
            var coll = document.getElementsByClassName("collapsible");
            var i;

            for (i = 0; i < coll.length; i++) {
                coll[i].addEventListener("click", function() {
                    this.classList.toggle("active");
                    var content = this.nextElementSibling;
                    if (content.style.maxHeight){
                        content.style.maxHeight = null;
                    } else {
                        content.style.maxHeight = content.scrollHeight + "px";
                    }
                });
            }
</script>
</body>
</html>