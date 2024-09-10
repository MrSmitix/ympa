<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Диапазон дат доставки.
 */
class OrderDeliveryDatesDTO
{
    /**
     * Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.
     * @DTA\Data(field="fromDate", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $from_date;

    /**
     * Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.
     * @DTA\Data(field="toDate", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $to_date;

    /**
     * Начало интервала времени доставки.  Передается только совместно с параметром &#x60;type&#x3D;DELIVERY&#x60;.  Формат времени: 24-часовой, &#x60;ЧЧ:ММ&#x60;. В качестве минут всегда должно быть указано &#x60;00&#x60; (исключение — &#x60;23:59&#x60;).  Минимальное значение: &#x60;00:00&#x60;.
     * @DTA\Data(field="fromTime", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $from_time;

    /**
     * Конец интервала времени доставки.  Передается только совместно с параметром &#x60;type&#x3D;DELIVERY&#x60;.  Формат времени: 24-часовой, &#x60;ЧЧ:ММ&#x60;. В качестве минут всегда должно быть указано &#x60;00&#x60; (исключение — &#x60;23:59&#x60;).  Максимальное значение: &#x60;23:59&#x60;.
     * @DTA\Data(field="toTime", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $to_time;

    /**
     * Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.
     * @DTA\Data(field="realDeliveryDate", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $real_delivery_date;

}
