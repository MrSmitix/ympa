<?php
/**
 * UpdateOrderStorageLimitRequest
 */
namespace app\Models;

/**
 * UpdateOrderStorageLimitRequest
 * @description Запрос на обновление срока хранения заказа в ПВЗ.
 */
class UpdateOrderStorageLimitRequest {

    /** @var \DateTime $newDate Новая дата, до которой заказ будет храниться в пункте выдачи.  Срок хранения можно увеличить не больше, чем на 30 дней.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;.*/
    public $newDate;

}
