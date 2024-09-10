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
     * @var int|null
     */
    public $time_period;

    /**
     * @DTA\Data(field="timeUnit")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TimeUnitType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TimeUnitType::class})
     * @var \App\DTO\TimeUnitType|null
     */
    public $time_unit;

    /**
     * Комментарий.
     * @DTA\Data(field="comment", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $comment;

}
