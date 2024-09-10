<?php
/**
 * GetOfferMappingsResultDTO
 */
namespace app\Models;

/**
 * GetOfferMappingsResultDTO
 * @description Информация о товарах.
 */
class GetOfferMappingsResultDTO {

    /** @var \app\Models\ScrollingPagerDTO $paging */
    public $paging;

    /** @var \app\Models\GetOfferMappingDTO[] $offerMappings Информация о товарах.*/
    public $offerMappings = [];

}
