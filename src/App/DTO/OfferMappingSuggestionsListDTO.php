<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Список рекомендованных карточек товара.
 */
class OfferMappingSuggestionsListDTO
{
    /**
     * Список товаров.
     * @DTA\Data(field="offers")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\EnrichedMappingsOfferDTO[]|null
     */
    public $offers;

}
