<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация о товаре.
 */
class UpdateOfferMappingDTO
{
    /**
     * @DTA\Data(field="offer")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\UpdateOfferDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\UpdateOfferDTO::class})
     */
    public ?\App\DTO\UpdateOfferDTO $offer = null;

    /**
     * @DTA\Data(field="mapping", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\UpdateMappingDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\UpdateMappingDTO::class})
     */
    public ?\App\DTO\UpdateMappingDTO $mapping = null;

}
