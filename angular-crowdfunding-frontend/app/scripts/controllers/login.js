'use strict';

/**
 * @ngdoc function
 * @name documentsApp.controller:LoginCtrl
 * @description
 * # LoginCtrl
 * Controller of the documentsApp
 */
// angular.module('documentsApp')
//   .controller('LoginCtrl', ['$scope', LoginCtrl]);

angular.module('documentsApp')
  .controller('LoginController', LoginController);

// function LoginCtrl($scope) {
//   $scope.tester = 'success!';
// }
//
// function LoginTest() {
//   this.awesomeThings = [
//     'HTML5 Boilerplate',
//     'AngularJS',
//     'Karma'
//   ];
// }

LoginController.$inject = ['$location', 'AuthenticationService', 'FlashService'];
function LoginController($location, AuthenticationService, FlashService) {
  var vm = this;

  vm.login = login;

  (function initController() {
    // reset login status
    AuthenticationService.ClearCredentials();
  })();

  function login() {
    vm.dataLoading = true;
    AuthenticationService.Login(vm.username, vm.password, function (response) {
      if (response.success) {
        AuthenticationService.SetCredentials(vm.username, vm.password);
        $location.path('/home');
      } else {
        FlashService.Error(response.message);
        vm.dataLoading = false;
          $location.path('/login');
      }
    });
  };
}
