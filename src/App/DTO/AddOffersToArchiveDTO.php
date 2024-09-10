<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Товары, которые не удалось поместить в архив.
 */
class AddOffersToArchiveDTO
{
    /**
     * Список товаров, которые не удалось поместить в архив.
     * @DTA\Data(field="notArchivedOffers", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\AddOffersToArchiveErrorDTO[]|null
     */
    public $not_archived_offers;

}
