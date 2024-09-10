<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация о заказе, указанная в отзыве.
 */
class FeedbackOrderDTO
{
    /**
     * Номер заказа, указанный в отзыве.
     * @DTA\Data(field="shopOrderId", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $shop_order_id;

    /**
     * @DTA\Data(field="delivery", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\FeedbackDeliveryType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\FeedbackDeliveryType::class})
     * @var \App\DTO\FeedbackDeliveryType|null
     */
    public $delivery;

}
