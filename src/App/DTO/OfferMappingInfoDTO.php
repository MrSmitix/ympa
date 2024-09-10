<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация о карточке товара.
 */
class OfferMappingInfoDTO
{
    /**
     * @DTA\Data(field="mapping", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OfferMappingDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OfferMappingDTO::class})
     * @var \App\DTO\OfferMappingDTO|null
     */
    public $mapping;

    /**
     * @DTA\Data(field="awaitingModerationMapping", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OfferMappingDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OfferMappingDTO::class})
     * @var \App\DTO\OfferMappingDTO|null
     */
    public $awaiting_moderation_mapping;

    /**
     * @DTA\Data(field="rejectedMapping", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OfferMappingDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OfferMappingDTO::class})
     * @var \App\DTO\OfferMappingDTO|null
     */
    public $rejected_mapping;

}
