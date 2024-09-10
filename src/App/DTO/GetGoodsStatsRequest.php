<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Запрос отчета по товарам.
 */
class GetGoodsStatsRequest
{
    /**
     * Список ваших идентификаторов SKU.
     * @DTA\Data(field="shopSkus")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection75::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection75::class})
     */
    public ?\App\DTO\Collection75 $shop_skus = null;

}
