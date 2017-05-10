'use strict';

/**
 * @ngdoc function
 * @name documentsApp.controller:RegisterCtrl
 * @description
 * # RegisterCtrl
 * Controller of the documentsApp
 */
angular.module('documentsApp')
    .controller('RegisterController', RegisterController);

RegisterController.$inject = ['UserService', '$location', '$rootScope', 'FlashService'];
function RegisterController(UserService, $location, $rootScope, FlashService) {
    var vm = this;

    vm.register = register;

    function register() {
        vm.dataLoading = true;

        UserService.Create(vm.user)
            .then(function (response) {
                FlashService.Success('Registration successful', true);
                $location.path('/login');
            }, function () {
                vm.errormessage = response.message;
                FlashService.Error(response.message);
                vm.dataLoading = false;
            })
    }
}
