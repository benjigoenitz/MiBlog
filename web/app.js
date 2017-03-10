(function() {
  var app = angular.module('blog', ['artModule']);

  app.controller('artCtrl',['$http', function($http) {
    var blogito = this;
    blogito.articulos=[];
    $http.get('http://localhost:8080/MiBlog/api/articulos').success(function(data){
    	blogito.articulos=data;
        console.log("it works" + blogito.articulos);
    });
  }]);

})();