<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class AcceptOrderCancellationRequest
{
    /**
     * Решение об отмене заказа:  * &#x60;true&#x60; — заказ отменяется, служба доставки узнала об отмене до передачи заказа покупателю. * &#x60;false&#x60; — заказ не отменяется, так как он уже доставлен покупателю курьером или передан в пункт выдачи заказов.
     * @DTA\Data(field="accepted")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $accepted;

    /**
     * @DTA\Data(field="reason", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OrderCancellationReasonType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OrderCancellationReasonType::class})
     * @var \App\DTO\OrderCancellationReasonType|null
     */
    public $reason;

}
