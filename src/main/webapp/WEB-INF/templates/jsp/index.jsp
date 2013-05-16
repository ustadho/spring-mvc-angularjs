<%-- 
    Document   : index
    Created on : May 16, 2013, 1:21:19 PM
    Author     : cak-ust
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" ng-app="AngularSpringApp">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Test AngularJS</title>
        <link rel="stylesheet" href="resources/css/app.css" />
        <link rel="stylesheet" href="resources/bootstrap/css/bootstrap.min.css" />
        
    </head>
    <body>
        <div id="wrapper">
            <ul class="menu">
                <li><a href="#users">User</a> </li>
                <li><a href="#home">Home</a> </li>
            </ul>
            <hr class="">
            <div ng-view></div>
        </div>
        
        <script src="resources/js/lib/angular.min.js"></script>
        <script src="resources/js/app.js"></script>
        <script src="resources/js/services.js"></script>
        <script src="resources/js/controller/UserController.js"></script>
        <script src="resources/js/filters.js"></script>
        <script src="resources/js/directives.js"></script>
    </body>
</html>
