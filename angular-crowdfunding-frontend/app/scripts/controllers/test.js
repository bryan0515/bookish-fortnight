'use strict';

/**
* @ngdoc function
* @name documentsApp.controller:TestCtrl
* @description
* # TestCtrl
* Controller of the documentsApp
*/
angular.module('documentsApp')
.controller('TestCtrl', function ($scope, $http) {
    $http.get("localhost:8080/customers")
    .then(function(response) {$scope.names = response.data.records;});
});
