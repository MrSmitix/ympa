<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация об оборачиваемости товара.
 */
class TurnoverDTO
{
    /**
     * @DTA\Data(field="turnover")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TurnoverType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TurnoverType::class})
     */
    public ?\App\DTO\TurnoverType $turnover = null;

    /**
     * Значение в днях. [Что это за число?](https://yandex.ru/support/marketplace/analytics/turnover.html)
     * @DTA\Data(field="turnoverDays", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $turnover_days = null;

}
