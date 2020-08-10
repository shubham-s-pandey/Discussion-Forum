<jsp:include page="header.jsp"></jsp:include>
<html>
<head>
    <style>
        ul {
            list-style-type: none;
            margin: 0;
            padding: 0;
            overflow: hidden;
            background-color: #333;
        }

        li {
            float: left;
        }

        li a {
            display: block;
            color: white;
            text-align: center;
            padding: 14px 16px;
            text-decoration: none;
        }

        li a:hover {
            background-color: #111;
        }
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
            background-color: #333;
            color: white;
            padding: 14px 25px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
        }

        a:hover, a:active {
            background-color: red;

    </style>
</head>
<body>


<ul>
    <li><a class="active" href="/">Home</a></li>
    <li><a href="/emp">Register Here</a></li>
    <li><a href="/topic">Discussion Forum</a></li>
</ul>

<div align="center">
    <h1>Welcome to Discussion Forum</h1>
    <h2><i>"A place to share knowledge and better understand the world"</i></h2>
</div>


</body>
</html>