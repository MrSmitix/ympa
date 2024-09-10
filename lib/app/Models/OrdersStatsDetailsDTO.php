<?php
/**
 * OrdersStatsDetailsDTO
 */
namespace app\Models;

/**
 * OrdersStatsDetailsDTO
 * @description Информация об удалении товара из заказа.
 */
class OrdersStatsDetailsDTO {

    /** @var string $itemStatus */
    public $itemStatus = "";

    /** @var int $itemCount Количество товара со статусом, указанном в параметре &#x60;itemStatus&#x60;.*/
    public $itemCount = 0;

    /** @var \DateTime $updateDate Дата, когда товар получил статус, указанный в параметре &#x60;itemStatus&#x60;.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;.*/
    public $updateDate;

    /** @var string $stockType */
    public $stockType = "";

}
