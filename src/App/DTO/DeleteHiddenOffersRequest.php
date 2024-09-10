<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Запрос на возобновление показа оферов.
 */
class DeleteHiddenOffersRequest
{
    /**
     * Список скрытых товаров.
     * @DTA\Data(field="hiddenOffers")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection68::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection68::class})
     * @var \App\DTO\Collection68|null
     */
    public $hidden_offers;

}
