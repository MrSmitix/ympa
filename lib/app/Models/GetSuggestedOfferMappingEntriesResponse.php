<?php
/**
 * GetSuggestedOfferMappingEntriesResponse
 */
namespace app\Models;

/**
 * GetSuggestedOfferMappingEntriesResponse
 * @description Ответ со списком рекомендованных карточек товара.
 */
class GetSuggestedOfferMappingEntriesResponse {

    /** @var string $status */
    public $status = "";

    /** @var \app\Models\OfferMappingSuggestionsListDTO $result */
    public $result;

}
