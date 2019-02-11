/**
 * 
 */

 var mainApp = angular.module("myapp", []);

mainApp.service('CalcService', function() {
    this.square = function(a) {
        return MathService.multiply(a,a);
    }
});