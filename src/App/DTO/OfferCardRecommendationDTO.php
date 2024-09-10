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
     */
    public ?\App\DTO\OfferCardRecommendationType $type = null;

    /**
     * Процент выполнения рекомендации. Указывается для рекомендаций некоторых типов.
     * @DTA\Data(field="percent", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":0, "max":100, "exclude_max":true})
     */
    public ?int $percent = null;

}
