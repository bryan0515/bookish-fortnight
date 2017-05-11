'use strict';

/**
 * @ngdoc function
 * @name documentsApp.controller:ProjectCtrl
 * @description
 * # ProjectCtrl
 * Controller of the documentsApp
 */
angular.module('documentsApp')
    .controller('ProjectCtrl', function (UserService, $rootScope, $scope, $location, $q, $http) {
        var vm = this;

        vm.likeProject = likeProject;

        init();

        function init() {
            if(!$rootScope.toProject) {
                $location.path('/');
            } else {
                getProject();
                getProjectFounder();
                getPledgeByProject();
            }
        }

        function likeProject() {
            return $http({
                url: 'http://localhost:8080/likeProject',
                method: "POST",
                params: {
                    pid: $rootScope.toProject,
                    uemail: $rootScope.username
                }
            }).then(function(){alert('Liked!')}, function(){alert('Already Liked')});
        }

        function getProject() {
            $q.when(UserService.getProject($rootScope.toProject))
                .then(function (response) {
                    $scope.projectDetail = response;
                }, $scope.projectDetail = 'error');
        }

        function getProjectFounder() {
            $q.when(UserService.GetProjectFounder($rootScope.toProject))
                .then(function (response) {
                    $scope.projectDetail.founder = response;
                }, $scope.projectDetail = 'error');
        }

        function getPledgeByProject() {
            $q.when(UserService.GetPledgeByProject($rootScope.toProject))
                .then(function (response) {
                    $scope.pledges = response;
                    // $scope.projectDetail.pledges = response;
                }, function (response) {
                    $scope.pledges = 'error';
                });
        }


    });
