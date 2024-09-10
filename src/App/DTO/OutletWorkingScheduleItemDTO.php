<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Расписание работы точки продаж.
 */
class OutletWorkingScheduleItemDTO
{
    /**
     * @DTA\Data(field="startDay")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\DayOfWeekType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\DayOfWeekType::class})
     * @var \App\DTO\DayOfWeekType|null
     */
    public $start_day;

    /**
     * @DTA\Data(field="endDay")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\DayOfWeekType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\DayOfWeekType::class})
     * @var \App\DTO\DayOfWeekType|null
     */
    public $end_day;

    /**
     * Точка продаж работает c указанного часа.  Формат: &#x60;ЧЧ:ММ&#x60;.
     * @DTA\Data(field="startTime")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"min":1})
     * @var string|null
     */
    public $start_time;

    /**
     * Точка продаж работает до указанного часа.  Формат: &#x60;ЧЧ:ММ&#x60;.
     * @DTA\Data(field="endTime")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"min":1})
     * @var string|null
     */
    public $end_time;

}
