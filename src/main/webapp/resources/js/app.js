/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


'use strict';

var AngularSpringApp = {};

var App = angular.module('AngularSpringApp', ['AngularSpringApp.filters', 'AngularSpringApp.services', 'AngularSpringApp.directives']);

//Declare app level module which depends filters and services

App.config(['$routeProvider', function($routeProvider){
        $routeProvider.when('/users', {
            templateUrl: 'users/layout', 
            controller: UserController
        }); 
        
}]);
