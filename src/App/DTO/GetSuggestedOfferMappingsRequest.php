<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class GetSuggestedOfferMappingsRequest
{
    /**
     * Список товаров.
     * @DTA\Data(field="offers", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection45::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection45::class})
     * @var \App\DTO\Collection45|null
     */
    public $offers;

}
