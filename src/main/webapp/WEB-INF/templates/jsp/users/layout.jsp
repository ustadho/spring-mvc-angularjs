<%-- 
    Document   : layout
    Created on : May 16, 2013, 12:20:38 PM
    Author     : cak-ust
--%>

<div class="input-append">
    <input style="width:100px;" class="span2" type="text" ng-model="userId" required min="1" />
    <input style="width:100px;" class="span2" type="text" ng-model="userName" required min="1" />
    <button class="btn btn-primary" ng-disabled="!userName" ng-click="addNewUser(userName)">Add Car</button>
</div>

<h3>User List</h3>
<div class="alert alert-info" style="width:400px;" ng-show="users.length == 0">
    No User(s) found
</div>
<table class="table table-bordered table-striped" style="width:450px;" ng-show="users.length > 0">
    <thead>
        <tr>
            <th style="text-align: center; width: 25px;">Action</th>
            <th style="text-align: center;">User ID</th>
            <th style="text-align: center;">User Name</th>
        </tr>
    </thead>
    <tbody>
        <tr ng-repeat="u in users">
            <td  style="width:70px;text-align: center;"><button class="btn btn-mini btn-danger" ng-click="removeUser(u.userId)">Remove</button></td>
            <td>{{u.userId}}</td>
            <td>{{u.userName}}</td>
        </tr>
    </tbody>
</table>
<button class="btn btn-danger"  ng-show="cars.length > 1" ng-click="removeAllCars()">Remove All Cars</button>