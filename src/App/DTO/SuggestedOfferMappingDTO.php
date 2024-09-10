<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Товар с соответствующей карточкой на Маркете.
 */
class SuggestedOfferMappingDTO
{
    /**
     * @DTA\Data(field="offer", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SuggestedOfferDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\SuggestedOfferDTO::class})
     */
    public ?\App\DTO\SuggestedOfferDTO $offer = null;

    /**
     * @DTA\Data(field="mapping", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\GetMappingDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\GetMappingDTO::class})
     */
    public ?\App\DTO\GetMappingDTO $mapping = null;

}
