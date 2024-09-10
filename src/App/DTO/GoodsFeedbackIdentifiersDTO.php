<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Идентификаторы, которые связаны с отзывом.
 */
class GoodsFeedbackIdentifiersDTO
{
    /**
     * Идентификатор заказа на Маркете.
     * @DTA\Data(field="orderId")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $order_id;

    /**
     * Идентификатор модели товара.
     * @DTA\Data(field="modelId")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $model_id;

}
