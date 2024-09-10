<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Список товаров, которые не удалось удалить, потому что они не найдены или хранятся на складе Маркета.
 */
class DeleteCampaignOffersDTO
{
    /**
     * Список SKU.
     * @DTA\Data(field="notDeletedOfferIds", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $not_deleted_offer_ids = null;

}
