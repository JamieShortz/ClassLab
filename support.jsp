<!DOCTYPE html>

<%@page contentType="text/html" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="/includes/header.jsp" %>

<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html lang>
    <head>
	<title>ImpactFull Designs - About Us</title>
    <meta name ="viewport" content="width=device-width, initial-scale=1.0">
	
    <meta charset="UTF-8">
</head>
<body>


<header>
	<img width= "200" src="images/violetimpact-designs-logo.jpg" alt ="Violet Impact Designs logo">
	<h1 class ="violet">About ImpactFull Designs</h1>

</header>

<nav>
	<ul>
            <li><a href="index.html">Home</a></li>
            <li><a href="about.html">About Us</a></li>
            <li><a href="news.html">News</a></li>
            <li><a href="trending.html">Trending</a></li>
            <li><a href="support.html">Support</a></li>
        </ul>
</nav>

<main> 
<h2 id="concerns">Email us your concerns and we'll respond as soon as possible!</h2>

<table border = "1">
    
		<thead>
                    <tr>
                        <th colspan="3" ><h2> Technical Support Team </h2></th>
                    </tr>
			<tr>
				<th>Name</th>
				<th>Email</th>
				<th>Phone</th>
			</tr>
		</thead>
		<tbody>

			<tr>
				<td>John Smith</td>
				<td>jsmith@mdc.edu</td>
				<td>(305)1234-5678</td>

			</tr>

			<tr>
				<td>Maria Tovar</td>
				<td>mtovar@mdc.edu</td>
				<td>(305)1234-5679</td>

			</tr>
			
                                <td>Charles Darwin</td>
				<td>cdarwin@mdc.edu</td>
				<td>(305)-1234-5680</td>

			</tr>
		</tbody>
	</table>

</main>

<%@include file="/includes/footer.jsp" %>

</body>
</html>
