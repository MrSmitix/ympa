<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Запрос на изменение информации по остаткам товаров.
 */
class UpdateStocksRequest
{
    /**
     * Данные об остатках товаров.
     * @DTA\Data(field="skus")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection70::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection70::class})
     */
    public ?\App\DTO\Collection70 $skus = null;

}
