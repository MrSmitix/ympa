<?php
/**
 * UpdateOrderStatusDTO
 */
namespace app\Models;

/**
 * UpdateOrderStatusDTO
 * @description Список заказов.
 */
class UpdateOrderStatusDTO {

    /** @var int $id Идентификатор заказа.*/
    public $id = 0;

    /** @var string $status */
    public $status = "";

    /** @var string $substatus */
    public $substatus = "";

    /** @var string $updateStatus */
    public $updateStatus = "";

    /** @var string $errorDetails Ошибка при изменении статуса заказа. Содержит описание ошибки и идентификатор заказа.  Возвращается, если параметр &#x60;updateStatus&#x60; принимает значение &#x60;ERROR&#x60;.*/
    public $errorDetails = "";

}
