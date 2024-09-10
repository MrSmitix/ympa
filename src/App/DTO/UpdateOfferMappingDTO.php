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
     * @var \App\DTO\UpdateOfferDTO|null
     */
    public $offer;

    /**
     * @DTA\Data(field="mapping", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\UpdateMappingDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\UpdateMappingDTO::class})
     * @var \App\DTO\UpdateMappingDTO|null
     */
    public $mapping;

}
