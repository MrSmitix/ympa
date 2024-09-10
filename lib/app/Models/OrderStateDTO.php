<?php
/**
 * OrderStateDTO
 */
namespace app\Models;

/**
 * OrderStateDTO
 * @description Информация по заказу.
 */
class OrderStateDTO {

    /** @var int $id Идентификатор заказа.*/
    public $id = 0;

    /** @var string $status */
    public $status = "";

    /** @var string $substatus */
    public $substatus = "";

}
