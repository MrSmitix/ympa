<?php
/**
 * GetOrdersStatsRequest
 */
namespace app\Models;

/**
 * GetOrdersStatsRequest
 * @description Запрос информации по заказам.
 */
class GetOrdersStatsRequest {

    /** @var \DateTime $dateFrom Начальная дата, когда заказ был сформирован.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Нельзя использовать вместе с параметрами &#x60;updateFrom&#x60; и &#x60;updateTo&#x60;.*/
    public $dateFrom;

    /** @var \DateTime $dateTo Конечная дата, когда заказ был сформирован.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Нельзя использовать вместе с параметрами &#x60;updateFrom&#x60; и &#x60;updateTo&#x60;.*/
    public $dateTo;

    /** @var \DateTime $updateFrom Начальная дата периода, за который были изменения статуса заказа.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Нельзя использовать вместе с параметрами &#x60;dateFrom&#x60; и &#x60;dateTo&#x60;.*/
    public $updateFrom;

    /** @var \DateTime $updateTo Конечная дата периода, за который были изменения статуса заказа.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Нельзя использовать вместе с параметрами &#x60;dateFrom&#x60; и &#x60;dateTo&#x60;.*/
    public $updateTo;

    /** @var int[]|null $orders Список идентификаторов заказов.*/
    public $orders = null;

    /** @var \app\Models\OrderStatsStatusType[]|null $statuses Список статусов заказов.*/
    public $statuses = null;

    /** @var bool $hasCis Нужно ли вернуть только те заказы, в составе которых есть хотя бы один товар с кодом идентификации [в системе «Честный ЗНАК»](https://честныйзнак.рф/):  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет. Такие коды присваиваются товарам, которые подлежат маркировке и относятся к определенным категориям.*/
    public $hasCis = false;

}
