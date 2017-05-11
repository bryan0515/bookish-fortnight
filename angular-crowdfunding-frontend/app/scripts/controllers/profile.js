'use strict';

/**
 * @ngdoc function
 * @name documentsApp.controller:ProfileCtrl
 * @description
 * # ProfileCtrl
 * Controller of the documentsApp
 */
angular.module('documentsApp')
    .controller('ProfileCtrl', function ($scope, $q, $rootScope, UserService, $location) {

        var vm = this;

        vm.toProject = toProject;

        init();

        function init() {
            if ($scope.authenticated) {
                getUserDetails();
                getUserProject();
            } else {
                $location.path('/login');
            }
        }

        function getUserDetails() {
            $q.when(UserService.GetByUser($rootScope.username, $rootScope.password))
                .then(function (data) {
                    $scope.userDetail = data;
                }, function () {
                    $scope.userDetail = "Connection Failed";
                });
        }

        function toProject(pid) {
            $rootScope.toProject = pid;
            $location.path('/project');
        }

        function getUserProject() {
            $q.when(UserService.GetUserProject($rootScope.username))
                .then(function (data) {
                    $scope.userProject = data._embedded.projects;
                }, function () {
                    $scope.userProject = "Connection Failed";
                });
        }

    });