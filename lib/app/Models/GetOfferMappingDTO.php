<?php
/**
 * GetOfferMappingDTO
 */
namespace app\Models;

/**
 * GetOfferMappingDTO
 * @description Информация о товаре.
 */
class GetOfferMappingDTO {

    /** @var \app\Models\GetOfferDTO $offer */
    public $offer;

    /** @var \app\Models\GetMappingDTO $mapping */
    public $mapping;

}
