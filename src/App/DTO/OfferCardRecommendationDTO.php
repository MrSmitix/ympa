<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Рекомендация по заполнению карточки товара.
 */
class OfferCardRecommendationDTO
{
    /**
     * @DTA\Data(field="type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OfferCardRecommendationType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OfferCardRecommendationType::class})
     * @var \App\DTO\OfferCardRecommendationType|null
     */
    public $type;

    /**
     * Процент выполнения рекомендации. Указывается для рекомендаций некоторых типов.
     * @DTA\Data(field="percent", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":0, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":100})
     * @var int|null
     */
    public $percent;

}
