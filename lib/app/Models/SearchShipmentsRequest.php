<?php
/**
 * SearchShipmentsRequest
 */
namespace app\Models;

/**
 * SearchShipmentsRequest
 * @description Запрос информации об отгрузках.
 */
class SearchShipmentsRequest {

    /** @var \DateTime $dateFrom Начальная дата для фильтрации по дате отгрузки (включительно).  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.*/
    public $dateFrom;

    /** @var \DateTime $dateTo Конечная дата для фильтрации по дате отгрузки (включительно).  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.*/
    public $dateTo;

    /** @var \app\Models\ShipmentStatusType[]|null $statuses Список статусов отгрузок.*/
    public $statuses = null;

    /** @var int[]|null $orderIds Список идентификаторов заказов из отгрузок.*/
    public $orderIds = null;

    /** @var bool $cancelledOrders Возвращать ли отмененные заказы.  Значение по умолчанию — &#x60;true&#x60;. Если возвращать отмененные заказы не нужно, передайте значение &#x60;false&#x60;.*/
    public $cancelledOrders = true;

}
