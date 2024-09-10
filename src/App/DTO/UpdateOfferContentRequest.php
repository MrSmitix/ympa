<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Запрос на установку новых значений для параметров.
 */
class UpdateOfferContentRequest
{
    /**
     * Список товаров с указанными характеристиками.
     * @DTA\Data(field="offersContent")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection115::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection115::class})
     */
    public ?\App\DTO\Collection115 $offers_content = null;

}
