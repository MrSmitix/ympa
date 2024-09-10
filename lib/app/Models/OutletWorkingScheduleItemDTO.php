<?php
/**
 * OutletWorkingScheduleItemDTO
 */
namespace app\Models;

/**
 * OutletWorkingScheduleItemDTO
 * @description Расписание работы точки продаж.
 */
class OutletWorkingScheduleItemDTO {

    /** @var string $startDay */
    public $startDay = "";

    /** @var string $endDay */
    public $endDay = "";

    /** @var string $startTime Точка продаж работает c указанного часа.  Формат: &#x60;ЧЧ:ММ&#x60;.*/
    public $startTime = "";

    /** @var string $endTime Точка продаж работает до указанного часа.  Формат: &#x60;ЧЧ:ММ&#x60;.*/
    public $endTime = "";

}
