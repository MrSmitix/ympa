<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Цена с указанием времени последнего обновления.
 */
class GetPriceDTO
{
    /**
     * Значение.
     * @DTA\Data(field="value")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @DTA\Validator(name="GreaterThan", options={"min":0})
     * @var float|null
     */
    public $value;

    /**
     * @DTA\Data(field="currencyId")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CurrencyType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CurrencyType::class})
     * @var \App\DTO\CurrencyType|null
     */
    public $currency_id;

    /**
     * Время последнего обновления.
     * @DTA\Data(field="updatedAt")
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="Date", options={"format": \DateTime::RFC3339})
     * @var \DateTime|null
     */
    public $updated_at;

}
