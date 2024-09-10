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
     */
    public ?\App\DTO\OfferMappingDTO $mapping = null;

    /**
     * @DTA\Data(field="awaitingModerationMapping", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OfferMappingDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OfferMappingDTO::class})
     */
    public ?\App\DTO\OfferMappingDTO $awaiting_moderation_mapping = null;

    /**
     * @DTA\Data(field="rejectedMapping", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OfferMappingDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OfferMappingDTO::class})
     */
    public ?\App\DTO\OfferMappingDTO $rejected_mapping = null;

}
