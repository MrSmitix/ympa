<?php
/**
 * GetGoodsStatsResponse
 */
namespace app\Models;

/**
 * GetGoodsStatsResponse
 * @description Ответ на запрос отчета по товарам.
 */
class GetGoodsStatsResponse {

    /** @var string $status */
    public $status = "";

    /** @var \app\Models\GoodsStatsDTO $result */
    public $result;

}
