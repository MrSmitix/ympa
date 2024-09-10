<?php
/**
 * OrderDeliveryDateDTO
 */
namespace app\Models;

/**
 * OrderDeliveryDateDTO
 * @description Информация о новой дате доставки заказа.
 */
class OrderDeliveryDateDTO {

    /** @var \DateTime $toDate Новая дата доставки заказа.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;.*/
    public $toDate;

}
