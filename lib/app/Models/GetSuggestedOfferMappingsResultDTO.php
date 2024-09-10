<?php
/**
 * GetSuggestedOfferMappingsResultDTO
 */
namespace app\Models;

/**
 * GetSuggestedOfferMappingsResultDTO
 * @description Подобранные карточки на Маркете.
 */
class GetSuggestedOfferMappingsResultDTO {

    /** @var \app\Models\SuggestedOfferMappingDTO[] $offers Список товаров.*/
    public $offers = [];

}
