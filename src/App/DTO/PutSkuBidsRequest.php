<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * description.
 */
class PutSkuBidsRequest
{
    /**
     * Список товаров и ставки для продвижения, которые на них нужно установить.
     * @DTA\Data(field="bids")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection108::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection108::class})
     */
    public ?\App\DTO\Collection108 $bids = null;

}
