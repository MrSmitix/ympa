<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Подобранные карточки на Маркете.
 */
class GetSuggestedOfferMappingsResultDTO
{
    /**
     * Список товаров.
     * @DTA\Data(field="offers")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\SuggestedOfferMappingDTO[]|null
     */
    public $offers;

}
