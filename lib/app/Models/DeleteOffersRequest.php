<?php
/**
 * DeleteOffersRequest
 */
namespace app\Models;

/**
 * DeleteOffersRequest
 * @description Фильтрации удаляемых товаров по offerIds.
 */
class DeleteOffersRequest {

    /** @var string[] $offerIds Список SKU товаров, которые нужно удалить.*/
    public $offerIds = [];

}
