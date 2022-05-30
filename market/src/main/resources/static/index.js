angular.module('market', []).controller('indexController', function ($scope, $http) {
    $scope.fillTable = function () {
        $http.get('http://localhost:8189/market/api/v1/products')
            .then(function (response) {
                $scope.products = response.data;
            });
    };

    $scope.deleteProduct = function (id) {
        $http.delete('http://localhost:8189/market/api/v1/products/' + id)
            .then(function (response) {
                $scope.fillTable();
            });
    }

    $scope.createNewProduct = function () {
        $http.post('http://localhost:8189/market/api/v1/products', $scope.newProduct)
            .then(function (response) {
                $scope.newProduct = null;
                $scope.fillTable();
            });
    }

    $scope.fillTable();

     $scope.fillTableCart = function () {
            $http.get('http://localhost:8189/market/api/v1/cart')
                .then(function (response) {
                    $scope.cartProducts = response.data;
                });
        };

        $scope.deleteProductCart = function (id) {
            $http.delete('http://localhost:8189/market/api/v1/cart/' + id)
                .then(function (response) {
                    $scope.fillTableCart();
                });
     }

     $scope.addProductInCart = function (p) {
             $http.post('http://localhost:8189/market/api/v1/cart', p)
                 .then(function (response) {
                     $scope.fillTableCart();
                 });
         }

    $scope.fillTableCart();


});