<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Фильтрации удаляемых товаров по offerIds.
 */
class DeleteCampaignOffersRequest
{
    /**
     * Идентификаторы товаров в каталоге.
     * @DTA\Data(field="offerIds")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection102::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection102::class})
     * @var \App\DTO\Collection102|null
     */
    public $offer_ids;

}
