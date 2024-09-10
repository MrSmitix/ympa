<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Статус товара в магазине.
 */
class OfferCampaignStatusDTO
{
    /**
     * Идентификатор кампании.
     * @DTA\Data(field="campaignId")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $campaign_id;

    /**
     * @DTA\Data(field="status")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OfferCampaignStatusType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OfferCampaignStatusType::class})
     * @var \App\DTO\OfferCampaignStatusType|null
     */
    public $status;

}
