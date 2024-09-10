<?php
/**
 * DeleteOffersDTO
 */
namespace app\Models;

/**
 * DeleteOffersDTO
 * @description Список товаров, которые не удалось удалить, потому что они хранятся на складе Маркета.
 */
class DeleteOffersDTO {

    /** @var string[]|null $notDeletedOfferIds Список SKU товаров, которые не удалось удалить.*/
    public $notDeletedOfferIds = null;

}
