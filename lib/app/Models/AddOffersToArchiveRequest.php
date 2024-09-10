<?php
/**
 * AddOffersToArchiveRequest
 */
namespace app\Models;

/**
 * AddOffersToArchiveRequest
 * @description Товары, которые нужно поместить в архив.
 */
class AddOffersToArchiveRequest {

    /** @var string[] $offerIds Список товаров, которые нужно поместить в архив.*/
    public $offerIds = [];

}
