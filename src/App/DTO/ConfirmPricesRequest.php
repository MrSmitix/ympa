<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Запрос на подтверждение цены.
 */
class ConfirmPricesRequest
{
    /**
     * Идентификаторы товаров, у которых подтверждается цена.
     * @DTA\Data(field="offerIds")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection65::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection65::class})
     */
    public ?\App\DTO\Collection65 $offer_ids = null;

}
