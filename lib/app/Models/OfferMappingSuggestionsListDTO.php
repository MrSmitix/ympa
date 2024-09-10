<?php
/**
 * OfferMappingSuggestionsListDTO
 */
namespace app\Models;

/**
 * OfferMappingSuggestionsListDTO
 * @description Список рекомендованных карточек товара.
 */
class OfferMappingSuggestionsListDTO {

    /** @var \app\Models\EnrichedMappingsOfferDTO[] $offers Список товаров.*/
    public $offers = [];

}
