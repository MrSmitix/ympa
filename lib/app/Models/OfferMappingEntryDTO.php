<?php
/**
 * OfferMappingEntryDTO
 */
namespace app\Models;

/**
 * OfferMappingEntryDTO
 * @description Список товаров.
 */
class OfferMappingEntryDTO {

    /** @var \app\Models\OfferMappingDTO $mapping */
    public $mapping;

    /** @var \app\Models\OfferMappingDTO $awaitingModerationMapping */
    public $awaitingModerationMapping;

    /** @var \app\Models\OfferMappingDTO $rejectedMapping */
    public $rejectedMapping;

    /** @var \app\Models\MappingsOfferDTO $offer */
    public $offer;

}
