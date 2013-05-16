/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

'use strict';
/*Filters*/

var AppFilters = angular.module('AngularSpringApp.filters', []);

AppFilters.filter('interpolate', ['version', function(version){
        return function(text){
            return String(text).replace(/\%version\%/mg, version);
        }
}]);

