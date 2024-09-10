<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация о заказе, который повлиял на индекс качества.
 */
class QualityRatingAffectedOrderDTO
{
    /**
     * Идентификатор заказа.
     * @DTA\Data(field="orderId")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":0})
     */
    public ?int $order_id = null;

    /**
     * Описание проблемы.
     * @DTA\Data(field="description")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $description = null;

    /**
     * @DTA\Data(field="componentType")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AffectedOrderQualityRatingComponentType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AffectedOrderQualityRatingComponentType::class})
     */
    public ?\App\DTO\AffectedOrderQualityRatingComponentType $component_type = null;

}
