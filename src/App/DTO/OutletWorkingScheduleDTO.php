<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Список режимов работы точки продаж.
 */
class OutletWorkingScheduleDTO
{
    /**
     * Признак, работает ли точка продаж в дни государственных праздников.  Возможные значения:  * &#x60;false&#x60; — точка продаж не работает в дни государственных праздников. * &#x60;true&#x60; — точка продаж работает в дни государственных праздников.
     * @DTA\Data(field="workInHoliday", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $work_in_holiday;

    /**
     * Список расписаний работы точки продаж.
     * @DTA\Data(field="scheduleItems")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\OutletWorkingScheduleItemDTO[]|null
     */
    public $schedule_items;

}
