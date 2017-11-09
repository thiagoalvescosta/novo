(function($app) {
  angular.module('custom.controllers', []);

  app.controller('HomeController', ['$scope', '$http', '$rootScope', '$state', '$translate', 'Notification', function($scope, $http, $rootScope, $state, $translate, Notification) {

    $rootScope.http = $http;
    $rootScope.Notification = Notification;

    app.registerEventsCronapi($scope, $translate);
    
    for (var x in app.userEvents)
      $scope[x] = app.userEvents[x].bind($scope);



    $scope.message = {};

  }]);
}(app));
