<?php
/**
 * DeleteOffersFromArchiveDTO
 */
namespace app\Models;

/**
 * DeleteOffersFromArchiveDTO
 * @description Товары, которые не удалось восстановить из архива.
 */
class DeleteOffersFromArchiveDTO {

    /** @var string[]|null $notUnarchivedOfferIds Список товаров, которые не удалось восстановить из архива.*/
    public $notUnarchivedOfferIds = null;

}
