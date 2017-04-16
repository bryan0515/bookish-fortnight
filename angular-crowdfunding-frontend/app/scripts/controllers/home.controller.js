'use strict';

/**
 * @ngdoc function
 * @name documentsApp.controller:HomeControllerCtrl
 * @description
 * # HomeControllerCtrl
 * Controller of the documentsApp
 */
angular.module('documentsApp')
  .controller('HomeControllerCtrl', HomeController);
HomeController.$inject = ['UserService', '$rootScope'];
function HomeController(UserService, $rootScope) {
  var vm = this;

  vm.user = null;
  vm.allUsers = [];
  vm.deleteUser = deleteUser;

  initController();

  function initController() {
    loadCurrentUser();
    loadAllUsers();
  }

  function loadCurrentUser() {
    UserService.GetByUsername($rootScope.globals.currentUser.username)
      .then(function (user) {
        vm.user = user;
      });
  }

  function loadAllUsers() {
    UserService.GetAll()
      .then(function (users) {
        vm.allUsers = users;
      });
  }

  function deleteUser(id) {
    UserService.Delete(id)
      .then(function () {
        loadAllUsers();
      });
  }
}
