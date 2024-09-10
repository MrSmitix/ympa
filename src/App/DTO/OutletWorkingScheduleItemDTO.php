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
     */
    public ?\App\DTO\DayOfWeekType $start_day = null;

    /**
     * @DTA\Data(field="endDay")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\DayOfWeekType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\DayOfWeekType::class})
     */
    public ?\App\DTO\DayOfWeekType $end_day = null;

    /**
     * Точка продаж работает c указанного часа.  Формат: &#x60;ЧЧ:ММ&#x60;.
     * @DTA\Data(field="startTime")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"min":1})
     */
    public ?string $start_time = null;

    /**
     * Точка продаж работает до указанного часа.  Формат: &#x60;ЧЧ:ММ&#x60;.
     * @DTA\Data(field="endTime")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"min":1})
     */
    public ?string $end_time = null;

}
