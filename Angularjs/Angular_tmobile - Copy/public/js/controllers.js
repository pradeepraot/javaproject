angular.module('appcontroller',['ProductService'])
.controller('appcontroller',['$scope','$http','ProductService',function($scope,$http,ProductService){
	
	//function to load product data based on prouct model
    
	    ProductService.getProductData().then(function(response) {
			      $scope.productData = response.data.productdetails;
		    });
	    ProductService.getFAQData().then(function(response) {
			      $scope.QuestionsAnwsList = response.QuestionsAnswrs.MyListQuens;
		    });
}]);