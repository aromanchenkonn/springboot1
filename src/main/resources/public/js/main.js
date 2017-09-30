var app=angular.module("springDemo", []);

//app.controller("AppCtrl", function($scope, $http){
//    $scope.websites = [];
//    $http.get('http://localhost:8882/api/stackoverflow').success(function(data) {
//      $scope.websites = data;
//    });
// });




app.controller("AppCtrl", function($scope){
       $scope.websites = [{
       iconImageUrl: 'https://www.santouka.co.jp/wp/wp-content/themes/santouka/img/home/icon-mark.png',
       id: 'stackoverflow',
       website: 'http://www.google.com',
       title: 'my name',
       description: 'my plot'
       }];
   });