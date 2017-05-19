'use strict';

/**
 * @ngdoc function
 * @name documentsApp.controller:ProjectCtrl
 * @description
 * # ProjectCtrl
 * Controller of the documentsApp
 */
angular.module('documentsApp')
    .controller('ProjectCtrl', function (UserService, $rootScope, $scope, $location, $q, $http, $route) {
        var vm = this;

        vm.likeProject = likeProject;

        vm.pledge = pledge;
        vm.comment = comment;

        init();

        function init() {
            if(!$rootScope.toProject) {
                $location.path('/');
            } else {
                getProject();
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
            UserService.CreateLog($rootScope.toProject, $rootScope.username);
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

        function pledge() {
            if ($rootScope.authenticated) {
                UserService.GetPledge($rootScope.toProject, vm.amount, $rootScope.username)
                    .then(function (response) {
                        getPledgeByProject();
                    });
            }
        }

        function comment() {
            if ($rootScope.authenticated) {
                UserService.CreateComment($rootScope.toProject, $rootScope.username, vm.insertComment)
                    .then(function (response) {
                        getProject();
                    });
            }
        }

    });
