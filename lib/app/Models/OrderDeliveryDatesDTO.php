<?php
/**
 * OrderDeliveryDatesDTO
 */
namespace app\Models;

/**
 * OrderDeliveryDatesDTO
 * @description Диапазон дат доставки.
 */
class OrderDeliveryDatesDTO {

    /** @var string $fromDate Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.*/
    public $fromDate = "";

    /** @var string $toDate Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.*/
    public $toDate = "";

    /** @var string $fromTime Начало интервала времени доставки.  Передается только совместно с параметром &#x60;type&#x3D;DELIVERY&#x60;.  Формат времени: 24-часовой, &#x60;ЧЧ:ММ&#x60;. В качестве минут всегда должно быть указано &#x60;00&#x60; (исключение — &#x60;23:59&#x60;).  Минимальное значение: &#x60;00:00&#x60;.*/
    public $fromTime = "";

    /** @var string $toTime Конец интервала времени доставки.  Передается только совместно с параметром &#x60;type&#x3D;DELIVERY&#x60;.  Формат времени: 24-часовой, &#x60;ЧЧ:ММ&#x60;. В качестве минут всегда должно быть указано &#x60;00&#x60; (исключение — &#x60;23:59&#x60;).  Максимальное значение: &#x60;23:59&#x60;.*/
    public $toTime = "";

    /** @var string $realDeliveryDate Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.*/
    public $realDeliveryDate = "";

}
