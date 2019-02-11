var ajaxApp = angular.module("myapp", []);
 
ajaxApp.controller("UserCtrl", [ '$scope', '$http', function($scope, $http) {
 
    $http.defaults.headers.post["Content-Type"] = "application/x-www-form-urlencoded; charset=utf-8";
     
    $scope.createNewUser = function() {
         console.log("Caling createNewUser(): " + $scope.user);

        $http({
            url : 'http://localhost:8080/time-mgmt/user',
            method : "POST",
            data : {
                'user' : $scope.user
            }
        }).then(function(response) {
            console.log(response.data);
            $scope.message = response.data;
        }, function(response) {
            //fail case
            console.log(response);
            $scope.message = response;
        });
    };




} ]);