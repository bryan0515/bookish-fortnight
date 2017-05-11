'use strict';

/**
 * @ngdoc function
 * @name documentsApp.controller:CreateprojectCtrl
 * @description
 * # CreateprojectCtrl
 * Controller of the documentsApp
 */
angular.module('documentsApp')
  .controller('CreateprojectCtrl', CreateprojectCtrl);

CreateprojectCtrl.$inject = ['UserService', '$rootScope', 'FlashService', '$location'];
function CreateprojectCtrl(UserService, $rootScope, FlashService, $location) {
    var vm = this;
    
    vm.register = register;

    init();

    function init() {
        checkAuthentication();
    }
    
    function checkAuthentication() {
        if(!$rootScope.authenticated) {
            $location.path('/login');
        }
    }
    
    function register() {
        console.log();
        vm.dateLoading = true;

        UserService.CreateProject(vm.project, $rootScope.username)
            .then(function (response) {
                FlashService.Success('Create successful', true);
                $location.path('/createproject');
                vm.dataLoading = false;
            }, function () {
                vm.errormessage = response.message;
                FlashService.Error(response.message);
                vm.dateLoading = false;
            })

    }
}