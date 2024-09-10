<?php
/**
 * GetSuggestedOfferMappingEntriesRequest
 */
namespace app\Models;

/**
 * GetSuggestedOfferMappingEntriesRequest
 * @description Запрос рекомендованных карточек товара.
 */
class GetSuggestedOfferMappingEntriesRequest {

    /** @var \app\Models\MappingsOfferDTO[] $offers Список товаров.*/
    public $offers = [];

}
