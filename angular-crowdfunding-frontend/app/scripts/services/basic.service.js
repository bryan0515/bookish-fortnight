'use strict';
angular
    .module('documentsApp')
    .factory("orderService", function ($http, $q) {
        	return {
    			// Create Orders
        		createOrders: function (viewModel) {
        			// Get the deferred object
        			var deferred = $q.defer();
        			// Initiates the AJAX call
        			$http({ method: 'POST', url: '/Home/Create', data: viewModel })
    					.success(deferred.resolve).error(deferred.reject);
        			// Returns the promise - Contains result once request completes
        			return deferred.promise;
        		}
        	}
        });