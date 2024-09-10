<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Товары, которые нужно поместить в архив.
 */
class AddOffersToArchiveRequest
{
    /**
     * Список товаров, которые нужно поместить в архив.
     * @DTA\Data(field="offerIds")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection46::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection46::class})
     */
    public ?\App\DTO\Collection46 $offer_ids = null;

}
