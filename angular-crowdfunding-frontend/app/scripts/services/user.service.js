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

    service.SearchProject = SearchProject;
    service.GetPledge = GetPledge;
    service.GetProject = GetProject;
    service.GetCustomer = GetCustomer;
    service.GetAll = GetAll;
    service.GetById = GetById;
    service.GetByUsername = GetByUsername;
    service.Create = Create;
    service.Update = Update;
    service.Delete = Delete;
    service.GetByUser = GetByUser;
    service.CreateProject = CreateProject;

    service.GetUserProject = GetUserProject;
    service.getProject = getProject;
    service.GetProjectFounder = GetProjectFounder;

    service.GetPledgeByProject = GetPledgeByProject;
    service.CreateComment = CreateComment;

    service.CreateLog = CreateLog;

    return service;


    function GetByUser(username, password) {
        return $http({
            url: 'http://localhost:8080/customers/search/findCustomerByUemailAndPassword',
            method: "GET",
            params: {username: username, password: password}
        }).then(handleSuccess, handleError('Error getting user details'));
    }

    function GetCustomer() {
        return $http.get('http://localhost:8080/customers').then(handleSuccess, handleError('Error'));
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

    function Update(user) {
        return $http.put('/api/users/' + user.id, user).then(handleSuccess, handleError('Error updating user'));
    }

    function Delete(id) {
        return $http.delete('/api/users/' + id).then(handleSuccess, handleError('Error deleting user'));
    }

    // other services

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

    function GetProject(pid) {
        return $http.get('http://localhost:8080/fundingviews').then(handleSuccess, handleError('Error'));
    }

    function GetUserProject(username) {
        var url = 'http://localhost:8080/customers/' + username + '/projects';
        return $http.get(url).then(handleSuccess, handleError('Error'));
    }

    function SearchProject(keyword) {
            return $http({
//                url: 'http://localhost:8080/findKeyword',
                url: 'http://localhost:8080/projects/search/findProjectsByPdescriptionContaining',
                method: "GET",
                params: {
                    keyword: keyword

                }
            }).then(handleSuccess, handleError('Error to search a keyoword'));
        }

    function getProject(pid) {
        var url = 'http://localhost:8080/projects/' + pid;
        return $http.get(url).then(handleSuccess, handleError('Error'));
    }

    function GetProjectFounder(pid) {
        var url = 'http://localhost:8080/projects/' + pid + '/customer';
        return $http.get(url).then(handleSuccess, handleError('Error'));
    }

    // //pledge services
    function GetPledgeByProject(pid) {
        var url = 'http://localhost:8080/allcombineds/search/getAllcombinedsByPid?pid=' + pid;
        return $http.get(url).then(handleSuccess, handleError('Error'));
    }

    function GetPledge(pid, amount, username) {
        return $http({
            url: 'http://localhost:8080/createPledge',
            method: "POST",
            params: {
                pid: pid,
                amount: amount,
                uemail: username
            }
        }).then(newHandleSuccess, handleError('Error making a pledge'));
    }

    function CreateComment(pid, username, comment) {
        return $http({
            url: 'http://localhost:8080/commentProject',
            method: "POST",
            params: {
                pid: pid,
                uemail: username,
                comment: comment
            }
        }).then(newHandleSuccess, handleError('Error making a pledge'));
    }

    // logdetail

    function CreateLog(pid, username) {
        return $http({
            url: 'http://localhost:8080/getLog',
            method: "POST",
            params: {
                pid: pid,
                uemail: username
            }
        }).then(newHandleSuccess, handleError('Error making a pledge'));
    }

    // private functions

    function handleSuccess(res) {
        return res.data;
    }

    function newHandleSuccess(res) {
        return function () {
            return {success: true, message: res.data};
        }
    }

    function handleError(error) {
        return function () {
            return {success: false, message: error};
        };
    }

}
