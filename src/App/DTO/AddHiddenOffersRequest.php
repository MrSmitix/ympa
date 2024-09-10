<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Запрос на скрытие оферов.
 */
class AddHiddenOffersRequest
{
    /**
     * Список скрытых товаров.
     * @DTA\Data(field="hiddenOffers")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection67::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection67::class})
     */
    public ?\App\DTO\Collection67 $hidden_offers = null;

}
