'use strict';

/**
 * @ngdoc function
 * @name documentsApp.controller:MainCtrl
 * @description
 * # MainCtrl
 * Controller of the documentsApp
 */
angular.module('documentsApp')
  .controller('MainCtrl', MainCtrl);





MainCtrl.$inject = ['UserService', '$location', '$scope', '$http'];
function MainCtrl(UserService, $location, $scope, $http, $base64) {
  var vm = this;

  vm.testdata = 'success!';
  vm.user = [];
  vm.project = [];

  vm.ShowMeDate = ShowMeDate;
//    function($httpProvider, $base64) {
//
//    var auth = $base64.encode("user:e9d48e2c-4f65-4e54-9d0a-daaa17f909cb");
//    $httpProvider.defaults.headers.common['Authorization'] = 'Basic' + auth};
    loadProject();


  //loadCustomer();

  function loadCustomer() {
    UserService.GetCustomer()
        .then(function (user) {
            $scope.user = user._embedded.customers;
    });
  }

  function loadProject() {
    UserService.GetProject()
        .then(function(response) {
            $scope.project = response._embedded.fundingviews;

            $scope.author_group = [];

                                 for (var key in $scope.project) {
                                  $scope.author_group.push({
                                  'Author Name' : $scope.project[key].pname,
                                  'About the Author' : $scope.project[key].endtime,
                                  'Author Image' : $scope.project[key].minfund,
                                  'Author Linkedin Profile' : '',
                                  'Author Twitter Profile' : ''});
                                }
                                console.log($scope.author_group);
        });
  }

//  $scope.test = function ShowMeDate() {
//    console.log("HIHI");
function ShowMeDate(pname) {
    console.log("HIHI ");
    UserService.GetPledge(pname,vm.pledge.amount)
        .then(function(response) { handleSuccess, handleError('Error for getPledge')});

//    alert(vm.pledge.amount);
//    alert(pname);


  }
    //vm.user = 'ef';
    $scope.addItem = function() {
//    var vm.pledge.pname = vm.x.pname;
//    alert(vm.pledge.amount);
//    alert(vm.pledge.pname);
    }




//  function ($scope,$http) {
//       $http.get('http://localhost:8080/customers')
//        .then(function (response) {
//            $scope.names = response.record;
////            return response.data.record;
//       });
//
//  };
}


//  (function initController() {
//    // reset login status
//    AuthenticationService.ClearCredentials();
//  })();
//
//  function login() {
//    vm.dataLoading = true;
//    AuthenticationService.Login(vm.username, vm.password, function (response) {
//      if (response.success) {
//        AuthenticationService.SetCredentials(vm.username, vm.password);
//        $location.path('/home');
//      } else {
//        FlashService.Error(response.message);
//        vm.dataLoading = false;
//          $location.path('/login');
//      }
//    });
//  };

