<?php
/**
 * GetGoodsStatsRequest
 */
namespace app\Models;

/**
 * GetGoodsStatsRequest
 * @description Запрос отчета по товарам.
 */
class GetGoodsStatsRequest {

    /** @var string[] $shopSkus Список ваших идентификаторов SKU.*/
    public $shopSkus = [];

}
