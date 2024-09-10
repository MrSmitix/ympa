<?php
/**
 * UpdateStocksRequest
 */
namespace app\Models;

/**
 * UpdateStocksRequest
 * @description Запрос на изменение информации по остаткам товаров.
 */
class UpdateStocksRequest {

    /** @var \app\Models\UpdateStockDTO[] $skus Данные об остатках товаров.*/
    public $skus = [];

}
