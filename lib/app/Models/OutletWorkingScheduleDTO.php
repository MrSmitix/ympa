<?php
/**
 * OutletWorkingScheduleDTO
 */
namespace app\Models;

/**
 * OutletWorkingScheduleDTO
 * @description Список режимов работы точки продаж.
 */
class OutletWorkingScheduleDTO {

    /** @var bool $workInHoliday Признак, работает ли точка продаж в дни государственных праздников.  Возможные значения:  * &#x60;false&#x60; — точка продаж не работает в дни государственных праздников. * &#x60;true&#x60; — точка продаж работает в дни государственных праздников.*/
    public $workInHoliday = false;

    /** @var \app\Models\OutletWorkingScheduleItemDTO[] $scheduleItems Список расписаний работы точки продаж.*/
    public $scheduleItems = [];

}
