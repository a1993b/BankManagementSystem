var app = angular.module('BMSApp',['ngRoute']);
app.config(['$routeProvider',function($routeProvider){
	$routeProvider.
    when('/home', {
      templateUrl: 'resources/partial/home.html',
      controller: 'BMSController'
    }).
    when('/accountSignup',{
    	templateUrl: 'resources/partial/SetupAccount.html',
        controller: 'signUpController'
    	
    }).
    otherwise({
      redirectTo: '/home'
    });
}]);
app.controller('BMSController',function($scope,$http,$location){
	/*var SERVER_ENDPOINT="http://bankmanagementsystem-akshaybhatt.rhcloud.com";*/
	var SERVER_ENDPOINT="/bankmanagementsystem";
	$scope.login=function(){
		
		$scope.login= false;
		
		var data={
				"customerID":$scope.customerId,
				"password":$scope.password
		};
		$http.post(SERVER_ENDPOINT+"/login",data).success(function(data,status,headers,config){
			console.log(data);
			$scope.changePassword=true;
			alert(data.object);
			
		}).error(function(data,status,headers,config){
			console.log(status);
		});
	};
	$scope.signup= function(){
		$location.path("/accountSignup");
	};
});
app.controller('signUpController',function($scope){
	$('.datepicker').datepicker();
});