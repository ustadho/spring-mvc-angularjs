/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

'use strict';
/*Directives*/

var AppDirectives=angular.module('AngularSpringApp.directives', []);
AppDirectives.directive('appVersion', ['version', function(version){
        return function (scope, elm, attrs){
           elm.text(version); 
        };
}]);

