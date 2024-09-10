<?php
/**
 * SuggestedOfferMappingDTO
 */
namespace app\Models;

/**
 * SuggestedOfferMappingDTO
 * @description Товар с соответствующей карточкой на Маркете.
 */
class SuggestedOfferMappingDTO {

    /** @var \app\Models\SuggestedOfferDTO $offer */
    public $offer;

    /** @var \app\Models\GetMappingDTO $mapping */
    public $mapping;

}
