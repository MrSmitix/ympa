<?php
/**
 * GetOfferMappingEntriesResponse
 */
namespace app\Models;

/**
 * GetOfferMappingEntriesResponse
 * @description Ответ на запрос списка товаров в каталоге.
 */
class GetOfferMappingEntriesResponse {

    /** @var string $status */
    public $status = "";

    /** @var \app\Models\OfferMappingEntriesDTO $result */
    public $result;

}
