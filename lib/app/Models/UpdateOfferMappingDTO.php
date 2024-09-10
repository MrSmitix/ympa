<?php
/**
 * UpdateOfferMappingDTO
 */
namespace app\Models;

/**
 * UpdateOfferMappingDTO
 * @description Информация о товаре.
 */
class UpdateOfferMappingDTO {

    /** @var \app\Models\UpdateOfferDTO $offer */
    public $offer;

    /** @var \app\Models\UpdateMappingDTO $mapping */
    public $mapping;

}
