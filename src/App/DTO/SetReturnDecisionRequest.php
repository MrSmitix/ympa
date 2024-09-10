<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Решения по позиции в возврате.
 */
class SetReturnDecisionRequest
{
    /**
     * Идентификатор товара в возврате.
     * @DTA\Data(field="returnItemId")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $return_item_id = null;

    /**
     * @DTA\Data(field="decisionType")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ReturnRequestDecisionType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ReturnRequestDecisionType::class})
     */
    public ?\App\DTO\ReturnRequestDecisionType $decision_type = null;

    /**
     * Комментарий к решению. Укажите:  * для &#x60;REFUND_MONEY_INCLUDING_SHIPMENT&#x60;— стоимость обратной пересылки;  * для &#x60;REPAIR&#x60; — когда вы устраните недостатки товара;  * для &#x60;DECLINE_REFUND&#x60; — причину отказа;  * для &#x60;OTHER_DECISION&#x60; — какое решение вы предлагаете.
     * @DTA\Data(field="comment", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $comment = null;

}
