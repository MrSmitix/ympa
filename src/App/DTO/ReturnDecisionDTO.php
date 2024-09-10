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
     */
    public ?int $return_item_id = null;

    /**
     * Количество единиц товара.
     * @DTA\Data(field="count", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $count = null;

    /**
     * Комментарий.
     * @DTA\Data(field="comment", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $comment = null;

    /**
     * @DTA\Data(field="reasonType", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ReturnDecisionReasonType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ReturnDecisionReasonType::class})
     */
    public ?\App\DTO\ReturnDecisionReasonType $reason_type = null;

    /**
     * @DTA\Data(field="subreasonType", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ReturnDecisionSubreasonType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ReturnDecisionSubreasonType::class})
     */
    public ?\App\DTO\ReturnDecisionSubreasonType $subreason_type = null;

    /**
     * @DTA\Data(field="decisionType", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ReturnDecisionType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ReturnDecisionType::class})
     */
    public ?\App\DTO\ReturnDecisionType $decision_type = null;

    /**
     * Сумма возврата.
     * @DTA\Data(field="refundAmount", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $refund_amount = null;

    /**
     * Компенсация за обратную доставку.
     * @DTA\Data(field="partnerCompensation", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $partner_compensation = null;

    /**
     * Список хеш-кодов фотографий товара от покупателя.
     * @DTA\Data(field="images", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $images = null;

}
