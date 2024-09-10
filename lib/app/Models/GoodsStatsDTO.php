<?php
/**
 * GoodsStatsDTO
 */
namespace app\Models;

/**
 * GoodsStatsDTO
 * @description Отчет по товарам.
 */
class GoodsStatsDTO {

    /** @var \app\Models\GoodsStatsGoodsDTO[] $shopSkus Список товаров.*/
    public $shopSkus = [];

}
