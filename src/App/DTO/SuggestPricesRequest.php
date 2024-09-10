<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Запрос на получение списка цен для продвижения.
 */
class SuggestPricesRequest
{
    /**
     * Список товаров.
     * @DTA\Data(field="offers")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection59::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection59::class})
     * @var \App\DTO\Collection59|null
     */
    public $offers;

}
