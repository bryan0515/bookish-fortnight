'use strict';

/**
 * @ngdoc function
 * @name documentsApp.controller:ProjectCtrl
 * @description
 * # ProjectCtrl
 * Controller of the documentsApp
 */
angular.module('documentsApp')
    .controller('ProjectCtrl', function (UserService, $rootScope, $scope, $location) {
        var vm = this;

        function init() {
            getProject()
        }

        function getProject() {
            $scope.projectDetail = UserService.getProject($rootScope.toProject);
        }


    });
