<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Товары, которые не удалось восстановить из архива.
 */
class DeleteOffersFromArchiveDTO
{
    /**
     * Список товаров, которые не удалось восстановить из архива.
     * @DTA\Data(field="notUnarchivedOfferIds", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var string[]|null
     */
    public $not_unarchived_offer_ids;

}
