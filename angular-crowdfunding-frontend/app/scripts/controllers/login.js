'use strict';

/**
 * @ngdoc function
 * @name documentsApp.controller:LoginCtrl
 * @description
 * # LoginCtrl
 * Controller of the documentsApp
 */

angular.module('documentsApp')
  .controller('LoginController', LoginController);

LoginController.$inject = ['$location', 'AuthenticationService', 'FlashService', '$rootScope'];
function LoginController($location, AuthenticationService, FlashService, $rootScope) {
    var vm = this;

    vm.login = login;

    (function initController() {
        // reset login status
        AuthenticationService.ClearCredentials();
        $rootScope.authenticated = false;
        $rootScope.username = "";
        $rootScope.password = "";
    })();

    function login() {
        vm.dataLoading = true;
        $rootScope.username = vm.username;
        $rootScope.password = vm.password;

        AuthenticationService.Login(vm.username, vm.password, function (response) {
            if (response.success) {
                AuthenticationService.SetCredentials(vm.username, vm.password);
                $location.path('/');
                $rootScope.authenticated = true;
            } else {
                FlashService.Error(response.message);
                vm.dataLoading = false;
                $location.path('/login');
                $rootScope.authenticated = false;
            }
        });
    }
}




// function LoginController($location, AuthenticationService, FlashService, $http, $rootScope) {
//
//   var vm = this;
//
//     var authenticate = function(credentials, callback) {
//
//       var headers = credentials ? {authorization: "Basic "
//         + btoa(credentials.username + ":" + credentials.password)
//       } : {};
//
//       $http.get('http://localhost:8080/user', {headers : headers})
//           .then(function (response) {
//               if (response.data.name) {
//                   $rootScope.authenticated = true;
//                   console.log("LOGIN");
//               } else {
//                   $rootScope.authenticated = false;
//                   console.log("LOGOUT");
//               }
//               callback && callback();
//           }, function () {
//               $rootScope.authenticated = false;
//               callback && callback();
//           });
//       $http.get('http://localhost:8080/customers');
//     };
//
//     authenticate();
//
//     vm.credentials = {};
//     vm.login = function() {
//         console.log("Button pressed");
//         authenticate(vm.credentials, function() {
//           if ($rootScope.authenticated) {
//             console.log("Login succeeded");
//             $location.path("/");
//             vm.error = false;
//             $rootScope.authenticated = true;
//           } else {
//             console.log("Login failed");
//             $location.path("/login");
//             vm.error = true;
//             $rootScope.authenticated = false;
//           }
//           console.log("username="+credentials.username+" password="+credentials.password);
//         });
//     };

