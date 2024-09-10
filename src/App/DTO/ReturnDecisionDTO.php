<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Решения по возвратам.
 */
class ReturnDecisionDTO
{
    /**
     * Идентификатор товара в возврате.
     * @DTA\Data(field="returnItemId", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $return_item_id;

    /**
     * Количество единиц товара.
     * @DTA\Data(field="count", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $count;

    /**
     * Комментарий.
     * @DTA\Data(field="comment", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $comment;

    /**
     * @DTA\Data(field="reasonType", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ReturnDecisionReasonType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ReturnDecisionReasonType::class})
     * @var \App\DTO\ReturnDecisionReasonType|null
     */
    public $reason_type;

    /**
     * @DTA\Data(field="subreasonType", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ReturnDecisionSubreasonType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ReturnDecisionSubreasonType::class})
     * @var \App\DTO\ReturnDecisionSubreasonType|null
     */
    public $subreason_type;

    /**
     * @DTA\Data(field="decisionType", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ReturnDecisionType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ReturnDecisionType::class})
     * @var \App\DTO\ReturnDecisionType|null
     */
    public $decision_type;

    /**
     * Сумма возврата.
     * @DTA\Data(field="refundAmount", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $refund_amount;

    /**
     * Компенсация за обратную доставку.
     * @DTA\Data(field="partnerCompensation", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $partner_compensation;

    /**
     * Список хеш-кодов фотографий товара от покупателя.
     * @DTA\Data(field="images", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var string[]|null
     */
    public $images;

}
