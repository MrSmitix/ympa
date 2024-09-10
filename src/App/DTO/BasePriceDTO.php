<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Цена на товар.
 */
class BasePriceDTO
{
    /**
     * Значение.
     * @DTA\Data(field="value")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @DTA\Validator(name="Range", options={"min":0, "exclude_min":true})
     */
    public ?float $value = null;

    /**
     * @DTA\Data(field="currencyId")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CurrencyType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CurrencyType::class})
     */
    public ?\App\DTO\CurrencyType $currency_id = null;

}
