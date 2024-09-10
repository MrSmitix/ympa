<?php
/**
 * OfferMappingEntriesDTO
 */
namespace app\Models;

/**
 * OfferMappingEntriesDTO
 * @description Информация о товарах в каталоге.
 */
class OfferMappingEntriesDTO {

    /** @var \app\Models\ScrollingPagerDTO $paging */
    public $paging;

    /** @var \app\Models\OfferMappingEntryDTO[] $offerMappingEntries Информация о товарах в каталоге.*/
    public $offerMappingEntries = [];

}
