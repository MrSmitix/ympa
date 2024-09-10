<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Состояние уцененного товара.
 */
class OfferConditionDTO
{
    /**
     * @DTA\Data(field="type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OfferConditionType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OfferConditionType::class})
     * @var \App\DTO\OfferConditionType|null
     */
    public $type;

    /**
     * @DTA\Data(field="quality", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OfferConditionQualityType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OfferConditionQualityType::class})
     * @var \App\DTO\OfferConditionQualityType|null
     */
    public $quality;

    /**
     * Описание товара. Подробно опишите дефекты, насколько они заметны и где их искать.
     * @DTA\Data(field="reason", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $reason;

}