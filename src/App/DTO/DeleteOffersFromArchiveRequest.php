<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Товары, которые нужно восстановить из архива.
 */
class DeleteOffersFromArchiveRequest
{
    /**
     * Список товаров, которые нужно восстановить из архива.
     * @DTA\Data(field="offerIds")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection47::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection47::class})
     */
    public ?\App\DTO\Collection47 $offer_ids = null;

}
