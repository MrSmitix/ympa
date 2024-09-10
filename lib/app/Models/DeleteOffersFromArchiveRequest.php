<?php
/**
 * DeleteOffersFromArchiveRequest
 */
namespace app\Models;

/**
 * DeleteOffersFromArchiveRequest
 * @description Товары, которые нужно восстановить из архива.
 */
class DeleteOffersFromArchiveRequest {

    /** @var string[] $offerIds Список товаров, которые нужно восстановить из архива.*/
    public $offerIds = [];

}
