(function(){
   var app = angular.module('artModule',[]);
   
   app.directive("articulos", function(){
       return{
           restrict: 'E',
           templateUrl: "articulos.html"
       };
   });
})();
