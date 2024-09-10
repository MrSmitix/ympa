<?php
/**
 * CreateChatRequest
 */
namespace app\Models;

/**
 * CreateChatRequest
 * @description Заказ, для которого нужно создать чат.
 */
class CreateChatRequest {

    /** @var int $orderId Идентификатор заказа на Маркете.*/
    public $orderId = 0;

}
