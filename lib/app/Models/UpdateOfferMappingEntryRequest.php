<?php
/**
 * UpdateOfferMappingEntryRequest
 */
namespace app\Models;

/**
 * UpdateOfferMappingEntryRequest
 * @description Запрос на обновление товаров.
 */
class UpdateOfferMappingEntryRequest {

    /** @var \app\Models\UpdateOfferMappingEntryDTO[] $offerMappingEntries Информация о товарах в каталоге.*/
    public $offerMappingEntries = [];

}
