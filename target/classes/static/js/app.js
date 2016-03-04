/*global angular */
'use strict';

/**
 * The main app module
 * @name app
 * @type {angular.Module}
 */
var app = angular.module('app', ['flow'])
.config(['flowFactoryProvider', function (flowFactoryProvider) {
  flowFactoryProvider.defaults = {
    target: '/continueFileUpload',
    permanentErrors: [404, 500, 501],
    maxChunkRetries: 1,
    chunkRetryInterval: 5000,
    simultaneousUploads: 4,
    singleFile: true
  };
  flowFactoryProvider.on('catchAll', function (event) {
    console.log('catchAll', arguments);
  });
  // Can be used with different implementations of Flow.js
  // flowFactoryProvider.factory = fustyFlowFactory;
}]).controller('teste', ['$scope', function($scope){

      $scope.send = function(file) {
                      console.log(eval(file))
                      console.log(file)
                      var data = $.param({
                          json: JSON.stringify({
                              file: file
                          })
                      });
                      $http.post("/continueFileUpload", data).success(function(data, status) {
                          $scope.response = data;
                      })
                  }
  
}]);
