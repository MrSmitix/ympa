<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Расписание работы службы доставки в своем регионе.
 */
class CampaignSettingsScheduleDTO
{
    /**
     * Признак работы службы доставки в государственные праздники. Возможные значения. * &#x60;false&#x60; — служба доставки не работает в праздничные дни. * &#x60;true&#x60; — служба доставки работает в праздничные дни.
     * @DTA\Data(field="availableOnHolidays", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $available_on_holidays;

    /**
     * Список дней, в которые служба доставки не работает. Дни магазин указал в кабинете продавца на Маркете.
     * @DTA\Data(field="customHolidays")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection2::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection2::class})
     * @var \App\DTO\Collection2|null
     */
    public $custom_holidays;

    /**
     * Список выходных и праздничных дней, в которые служба доставки работает. Дни магазин указал в кабинете продавца на Маркете.
     * @DTA\Data(field="customWorkingDays")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection3::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection3::class})
     * @var \App\DTO\Collection3|null
     */
    public $custom_working_days;

    /**
     * @DTA\Data(field="period", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CampaignSettingsTimePeriodDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CampaignSettingsTimePeriodDTO::class})
     * @var \App\DTO\CampaignSettingsTimePeriodDTO|null
     */
    public $period;

    /**
     * Итоговый список нерабочих дней службы доставки. Список рассчитывается с учетом выходных, нерабочих дней и государственных праздников. Информацию по ним магазин указывает в кабинете продавца на Маркете.
     * @DTA\Data(field="totalHolidays")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection4::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection4::class})
     * @var \App\DTO\Collection4|null
     */
    public $total_holidays;

    /**
     * Список выходных дней недели и государственных праздников.
     * @DTA\Data(field="weeklyHolidays")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection5::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection5::class})
     * @var \App\DTO\Collection5|null
     */
    public $weekly_holidays;

}
