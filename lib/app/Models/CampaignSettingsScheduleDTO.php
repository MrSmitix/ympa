<?php
/**
 * CampaignSettingsScheduleDTO
 */
namespace app\Models;

/**
 * CampaignSettingsScheduleDTO
 * @description Расписание работы службы доставки в своем регионе.
 */
class CampaignSettingsScheduleDTO {

    /** @var bool $availableOnHolidays Признак работы службы доставки в государственные праздники. Возможные значения. * &#x60;false&#x60; — служба доставки не работает в праздничные дни. * &#x60;true&#x60; — служба доставки работает в праздничные дни.*/
    public $availableOnHolidays = false;

    /** @var string[] $customHolidays Список дней, в которые служба доставки не работает. Дни магазин указал в кабинете продавца на Маркете.*/
    public $customHolidays = [];

    /** @var string[] $customWorkingDays Список выходных и праздничных дней, в которые служба доставки работает. Дни магазин указал в кабинете продавца на Маркете.*/
    public $customWorkingDays = [];

    /** @var \app\Models\CampaignSettingsTimePeriodDTO $period */
    public $period;

    /** @var string[] $totalHolidays Итоговый список нерабочих дней службы доставки. Список рассчитывается с учетом выходных, нерабочих дней и государственных праздников. Информацию по ним магазин указывает в кабинете продавца на Маркете.*/
    public $totalHolidays = [];

    /** @var int[] $weeklyHolidays Список выходных дней недели и государственных праздников.*/
    public $weeklyHolidays = [];

}
