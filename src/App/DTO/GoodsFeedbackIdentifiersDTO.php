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
     */
    public ?int $order_id = null;

    /**
     * Идентификатор модели товара.
     * @DTA\Data(field="modelId")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $model_id = null;

}
