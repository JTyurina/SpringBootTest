var app = angular.module("springDemo", []);
app.controller("AppCtrl", function($scope){
$scope.websites = [{
iconImageUrl:'http://promo.kolbasa-vs.ru/img/top-info.jpg',
id:'001',
website:'www.yandex.ru',
title: 'Insightium',
description: 'wow'
}];
});