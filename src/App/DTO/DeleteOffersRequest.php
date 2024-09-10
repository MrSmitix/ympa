<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Фильтрации удаляемых товаров по offerIds.
 */
class DeleteOffersRequest
{
    /**
     * Список SKU товаров, которые нужно удалить.
     * @DTA\Data(field="offerIds")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection37::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection37::class})
     * @var \App\DTO\Collection37|null
     */
    public $offer_ids;

}
