<?php
/**
 * OrderStatusChangeDTO
 */
namespace app\Models;

/**
 * OrderStatusChangeDTO
 * @description Заказ.
 */
class OrderStatusChangeDTO {

    /** @var string $status */
    public $status = "";

    /** @var string $substatus */
    public $substatus = "";

    /** @var \app\Models\OrderStatusChangeDeliveryDTO $delivery */
    public $delivery;

}
