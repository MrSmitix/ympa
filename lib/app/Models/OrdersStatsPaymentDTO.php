<?php
/**
 * OrdersStatsPaymentDTO
 */
namespace app\Models;

/**
 * OrdersStatsPaymentDTO
 * @description Информация о денежных переводах по заказу.
 */
class OrdersStatsPaymentDTO {

    /** @var string $id Идентификатор денежного перевода.*/
    public $id = "";

    /** @var \DateTime $date Дата денежного перевода.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;.*/
    public $date;

    /** @var string $type */
    public $type = "";

    /** @var string $source */
    public $source = "";

    /** @var float $total Сумма денежного перевода. Значение указывается в рублях независимо от способа денежного перевода. Точность — два знака после запятой.*/
    public $total = 0;

    /** @var \app\Models\OrdersStatsPaymentOrderDTO $paymentOrder */
    public $paymentOrder;

}
