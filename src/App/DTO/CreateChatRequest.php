<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Заказ, для которого нужно создать чат.
 */
class CreateChatRequest
{
    /**
     * Идентификатор заказа на Маркете.
     * @DTA\Data(field="orderId")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $order_id;

}
