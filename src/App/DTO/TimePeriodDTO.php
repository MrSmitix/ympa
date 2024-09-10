<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Временной отрезок с комментарием. Требования к содержанию комментария зависят от контекста использования параметра и указаны в описании поля, которое его содержит.
 */
class TimePeriodDTO
{
    /**
     * Продолжительность в указанных единицах.
     * @DTA\Data(field="timePeriod")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $time_period = null;

    /**
     * @DTA\Data(field="timeUnit")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TimeUnitType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TimeUnitType::class})
     */
    public ?\App\DTO\TimeUnitType $time_unit = null;

    /**
     * Комментарий.
     * @DTA\Data(field="comment", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $comment = null;

}
