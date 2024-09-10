<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Запрос рекомендованных карточек товара.
 */
class GetSuggestedOfferMappingEntriesRequest
{
    /**
     * Список товаров.
     * @DTA\Data(field="offers")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection55::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection55::class})
     */
    public ?\App\DTO\Collection55 $offers = null;

}
