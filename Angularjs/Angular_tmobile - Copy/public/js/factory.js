angular.module('ProductService',[])
//.factory('ProductService',['$resource','$q','$http',function($resource,$q,$http){
	.factory('ProductService',['$q','$http',function($q,$http){
	return {
		/*getProductData : function () {
			return $resource(
		        "", //api path which T-Mobile team will provide in future
		        {},
		        { query: {method: 'GET', isArray: false}}
		    );	
		},*/
		getProductData : function (argument) {
			var deferred = $q.defer();
			var promise = $http.get('../data/tmobile.json',{ cache: true})
			 	.success(function(data){
			 		deferred.resolve(data);
			 	})
			 	.error(deferred.reject);	
			return deferred.promise;
		},
		getFAQData : function (argument) {
			var deferred = $q.defer();
			var promise = $http.get('../data/QuestionAnsw.json',{ cache: true})
			 	.success(function(data){
			 		deferred.resolve(data);
			 	})
			 	.error(deferred.reject);	
			return deferred.promise;
		}
	}
}]);