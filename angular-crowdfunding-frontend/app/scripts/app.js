'use strict';

/**
 * @ngdoc overview
 * @name documentsApp
 * @description
 * # documentsApp
 *
 * Main module of the application.
 */

angular
  .module('documentsApp', [
    'ngAnimate',
    'ngCookies',
    'ngResource',
    'ngRoute',
    'ngSanitize',
    'ngTouch'
  ])
  .config(function ($routeProvider, $httpProvider) {
    $routeProvider
      .when('/', {
        templateUrl: 'views/main.html',
        controller: 'MainCtrl',
        controllerAs: 'vm'
      })
      .when('/about', {
        templateUrl: 'views/about.html',
        controller: 'AboutCtrl',
        controllerAs: 'vm'
      })
      .when('/test', {
              templateUrl: 'views/test.html',
              controller: 'TestCtrl',
              controllerAs: 'vm'
      })
      .when('/login', {
        templateUrl: 'views/login.html',
        controller: 'LoginController',
        controllerAs: 'vm'
      })
      .when('/register', {
        templateUrl: 'views/register.html',
        controller: 'RegisterController',
        controllerAs: 'vm'
      })
      .when('/home', {
        templateUrl: 'views/home.html',
        controller: 'HomeCtrl',
        controllerAs: 'vm'
      })
      .otherwise({
        redirectTo: '/'
      });

//      $httpProvider.defaults.headers.common["X-Requested-With"] = 'XMLHttpRequest';
  })
  .run(function run($rootScope, $location, $cookies, $http) {
    // keep user logged in after page refresh
    $rootScope.globals = $cookies.getObject('globals') || {};
    if ($rootScope.globals.currentUser) {
      $http.defaults.headers.common['Authorization'] = 'Basic ' + $rootScope.globals.currentUser.authdata;
    }

    // $rootScope.$on('$locationChangeStart', function (event, next, current) {
    //   // redirect to login page if not logged in and trying to access a restricted page
    //   var restrictedPage = $.inArray($location.path(), ['/login', '/register']) === -1;
    //   var loggedIn = $rootScope.globals.currentUser;
    //   if (restrictedPage && !loggedIn) {
    //     $location.path('/login');
    //   }
    // });
  });



// angular
//   .module('documentsApp', [
//     'ngAnimate',
//     'ngCookies',
//     'ngResource',
//     'ngRoute',
//     'ngSanitize',
//     'ngTouch'
//   ])
//   .config(function ($routeProvider) {
//     $routeProvider
//       .when('/', {
//         templateUrl: 'views/main.html',
//         controller: 'MainCtrl',
//         controllerAs: 'main'
//       })
//       .when('/about', {
//         templateUrl: 'views/about.html',
//         controller: 'AboutCtrl',
//         controllerAs: 'about'
//       })
//       .when('/login', {
//         templateUrl: 'views/login.html',
//         controller: 'LoginController',
//         controllerAs: 'login'
//       })
//       .when('/register', {
//         templateUrl: 'views/register.html',
//         controller: 'RegisterController',
//         controllerAs: 'register'
//       })

//       .otherwise({
//         redirectTo: '/'
//       });
//   });
