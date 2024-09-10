<?php
/**
 * UpdateOfferMappingEntryDTO
 */
namespace app\Models;

/**
 * UpdateOfferMappingEntryDTO
 * @description Список товаров.  В теле запроса можно передать от одного до 500 товаров.  Обязательный параметр.
 */
class UpdateOfferMappingEntryDTO {

    /** @var \app\Models\OfferMappingDTO $mapping */
    public $mapping;

    /** @var \app\Models\OfferMappingDTO $awaitingModerationMapping */
    public $awaitingModerationMapping;

    /** @var \app\Models\OfferMappingDTO $rejectedMapping */
    public $rejectedMapping;

    /** @var \app\Models\UpdateMappingsOfferDTO $offer */
    public $offer;

}
