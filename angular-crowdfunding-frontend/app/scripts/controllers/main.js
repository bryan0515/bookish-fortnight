'use strict';

/**
 * @ngdoc function
 * @name documentsApp.controller:MainCtrl
 * @description
 * # MainCtrl
 * Controller of the documentsApp
 */
angular.module('documentsApp')
    .controller('MainCtrl', function ($rootScope, $scope, UserService, $location, $q) {

        var vm = this;

        $scope.searched = false;

        vm.testdata = 'success!';
        vm.user = [];
        vm.project = [];
        vm.search = [];
        vm.ShowMeDate = ShowMeDate;

        vm.Search = Search;
        initController();

        function initController() {

            loadProject();

            if ($rootScope.authenticated) {
                getUserDetails();
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

        function loadProject() {
            UserService.GetProject()
                .then(function (response) {
                    $scope.project = response._embedded.fundingviews;

                    $scope.author_group = [];

                    for (var key in $scope.project) {
                        $scope.author_group.push({
                            'Author Name': $scope.project[key].pname,
                            'About the Author': $scope.project[key].endtime,
                            'Author Image': $scope.project[key].minfund,
                            'Author Linkedin Profile': '',
                            'Author Twitter Profile': ''
                        });
                    }
                    console.log($scope.author_group);
                });
        }

        function ShowMeDate(pname) {
            if ($rootScope.authenticated) {
                console.log("HIHI ");
                UserService.GetPledge(pid, vm.pledge.amount, $rootScope.username)
                    .then(function (response) {

                        alert(response.success);
                    });
            } else {
                $location.path('/login');
            }
            //    alert(vm.pledge.amount);
            //    alert(pname);


        }

        $scope.addItem = function () {

        }

        function Search() {
            UserService.SearchProject(vm.keyword)
                .then(function(response) {
                    $scope.search = response._embedded.projects;
                    $scope.searched = true;
//                        alert(response.success);
            });
            //} else {
            //   $location.path('/login');
            //}
            console.log(vm.keyword);
//            var x = angular.element(document.querySelector('myInput'));
//            alert(x);
//            documentsApp.getElementById("demo").innerHTML = x;
        }

    });
