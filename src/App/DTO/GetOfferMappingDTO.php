<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация о товаре.
 */
class GetOfferMappingDTO
{
    /**
     * @DTA\Data(field="offer", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\GetOfferDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\GetOfferDTO::class})
     * @var \App\DTO\GetOfferDTO|null
     */
    public $offer;

    /**
     * @DTA\Data(field="mapping", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\GetMappingDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\GetMappingDTO::class})
     * @var \App\DTO\GetMappingDTO|null
     */
    public $mapping;

}