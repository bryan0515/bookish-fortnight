'use strict';

/**
 * @ngdoc function
 * @name documentsApp.controller:MainCtrl
 * @description
 * # MainCtrl
 * Controller of the documentsApp
 */
angular.module('documentsApp')
  .controller('MainCtrl', function ($rootScope, $scope, UserService) {

    var vm = this;

    initController();

    function initController() {
        if ($rootScope.authenticated) {
            getUserDetails();
        }
    }

    function getUserDetails() {
        UserService.GetByUser($rootScope.username, $rootScope.password)
            .then(function (data) {
                $scope.userDetail = data;
            }, function () {
                $scope.userDetail = "Connection Failed";
            })
    }
  });
