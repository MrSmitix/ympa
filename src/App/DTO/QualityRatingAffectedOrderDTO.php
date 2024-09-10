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
     * @DTA\Validator(name="GreaterThan", options={"min":0, "inclusive":true})
     * @var int|null
     */
    public $order_id;

    /**
     * Описание проблемы.
     * @DTA\Data(field="description")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $description;

    /**
     * @DTA\Data(field="componentType")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AffectedOrderQualityRatingComponentType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AffectedOrderQualityRatingComponentType::class})
     * @var \App\DTO\AffectedOrderQualityRatingComponentType|null
     */
    public $component_type;

}
