/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

'use strict';

/*
 * User Controller
 * Constructor
 */

var UserController = function($scope, $http){
    $scope.fetchUserList= function (){
        $http.get('users/userlist.json').success(function(carList){
            $scope.users=carList;
        });
        
    };
    
    $scope.addNewUser = function(newUser) {
        $http.post('cars/addCar/' + newUser).success(function() {
            $scope.fetchCarsList();
        });
        $scope.carName = '';
    }
    
     $scope.removeUser = function(id) {
        console.log(id);
        $http.delete('users/removeUser/' + id).success(function() {
            $scope.fetchUserList();
        });
    }
    
    $scope.fetchUserList();
};
