var tcgApp = angular.module('tcgApp',['ngResource']);

tcgApp.controller('deckController', ["$resource","$scope","$log",function DeckController($resource, $scope, $log) {
	$scope.$log = $log;
	$scope.jsonmsg = "";
	var msgs = $resource('/card/list','',{query:{method:'GET',isArray:true}});
	var cardList = $resource('/card/list','',{query:{method:'GET',isArray:true}});
	var addDeck = $resource('/deck','',{query:{method:'POST'} } );
	
	$scope.cardList = cardList.query();
	
	$scope.sendJson = function(){
		$log.info('sendJson has been called');
		var result = msgs.query();
		
		$log.info(result);
		$scope.jsonmsg=result;
	}
	
	$scope.addJson = function() {
		addDeck.save();
	}
}]);