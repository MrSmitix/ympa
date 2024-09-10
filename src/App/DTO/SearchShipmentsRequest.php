<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Запрос информации об отгрузках.
 */
class SearchShipmentsRequest
{
    /**
     * Начальная дата для фильтрации по дате отгрузки (включительно).  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.
     * @DTA\Data(field="dateFrom")
     * @DTA\Strategy(name="Date")
     * @DTA\Validator(name="Date")
     * @var \DateTime|null
     */
    public $date_from;

    /**
     * Конечная дата для фильтрации по дате отгрузки (включительно).  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.
     * @DTA\Data(field="dateTo")
     * @DTA\Strategy(name="Date")
     * @DTA\Validator(name="Date")
     * @var \DateTime|null
     */
    public $date_to;

    /**
     * Список статусов отгрузок.
     * @DTA\Data(field="statuses", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection34::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection34::class})
     * @var \App\DTO\Collection34|null
     */
    public $statuses;

    /**
     * Список идентификаторов заказов из отгрузок.
     * @DTA\Data(field="orderIds", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection35::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection35::class})
     * @var \App\DTO\Collection35|null
     */
    public $order_ids;

    /**
     * Возвращать ли отмененные заказы.  Значение по умолчанию — &#x60;true&#x60;. Если возвращать отмененные заказы не нужно, передайте значение &#x60;false&#x60;.
     * @DTA\Data(field="cancelledOrders", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $cancelled_orders;

}
