<?php
/**
 * OrdersStatsPaymentOrderDTO
 */
namespace app\Models;

/**
 * OrdersStatsPaymentOrderDTO
 * @description Информация о платежном получении.
 */
class OrdersStatsPaymentOrderDTO {

    /** @var string $id Номер платежного поручения.*/
    public $id = "";

    /** @var \DateTime $date Дата платежного поручения.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.*/
    public $date;

}
