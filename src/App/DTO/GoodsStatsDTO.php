<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Отчет по товарам.
 */
class GoodsStatsDTO
{
    /**
     * Список товаров.
     * @DTA\Data(field="shopSkus")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\GoodsStatsGoodsDTO[]|null
     */
    public $shop_skus;

}
