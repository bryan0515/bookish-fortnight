'use strict';

/**
 * @ngdoc service
 * @name documentsApp.user.service
 * @description
 * # user.service
 * Service in the documentsApp.
 */
angular.module('documentsApp')
    .factory('UserService', UserService);

UserService.$inject = ['$http'];
function UserService($http) {
    var service = {};

    service.GetAll = GetAll;
    service.GetById = GetById;
    service.GetByUsername = GetByUsername;
    service.Create = Create;
    service.Update = Update;
    service.Delete = Delete;
    service.GetByUser = GetByUser;
    service.CreateProject = CreateProject;

    return service;

    function GetByUser(username, password) {
        return $http({
            url: 'http://localhost:8080/customers/search/findCustomerByUemailAndPassword',
            method: "GET",
            params: {username: username, password: password}
        }).then(handleSuccess, handleError('Error getting user details'));
    }

    function GetAll() {
        return $http.get('/api/users').then(handleSuccess, handleError('Error getting all users'));
    }

    function GetById(id) {
        return $http.get('/api/users/' + id).then(handleSuccess, handleError('Error getting user by id'));
    }

    function GetByUsername(username) {
        return $http.get('/api/users/' + username).then(handleSuccess, handleError('Error getting user by username'));
    }

    function Create(user) {
        return $http({
            url: 'http://localhost:8080/register',
            method: "POST",
            params: {uemail: user.firstName, cname: user.lastName, password: user.password, address: user.username}
        }).then(handleSuccess, handleError('Error creating user'));
    }

    function CreateProject(project, uemail) {
        return $http({
            url: 'http://localhost:8080/createProject',
            method: "POST",
            params: {
                pname: project.pname,
                pdescription: project.pdescription,
                uemail: uemail,
                extime: project.extime,
                minfund: project.minFund,
                maxfund: project.maxFund
            }
        }).then(handleSuccess, handleError('Error creating project'));
    }

    function Update(user) {
        return $http.put('/api/users/' + user.id, user).then(handleSuccess, handleError('Error updating user'));
    }

    function Delete(id) {
        return $http.delete('/api/users/' + id).then(handleSuccess, handleError('Error deleting user'));
    }

    // private functions

    function handleSuccess(res) {
        return res.data;
    }

    function handleError(error) {
        return function () {
            return {success: false, message: error};
        };
    }
}
