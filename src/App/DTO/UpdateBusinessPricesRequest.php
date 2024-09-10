<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Запрос на установку базовых цен на товары.
 */
class UpdateBusinessPricesRequest
{
    /**
     * Список товаров с ценами.
     * @DTA\Data(field="offers")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection56::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection56::class})
     * @var \App\DTO\Collection56|null
     */
    public $offers;

}
