<?php
/**
 * AddOffersToArchiveDTO
 */
namespace app\Models;

/**
 * AddOffersToArchiveDTO
 * @description Товары, которые не удалось поместить в архив.
 */
class AddOffersToArchiveDTO {

    /** @var \app\Models\AddOffersToArchiveErrorDTO[]|null $notArchivedOffers Список товаров, которые не удалось поместить в архив.*/
    public $notArchivedOffers = null;

}
