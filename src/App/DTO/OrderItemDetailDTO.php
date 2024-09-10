<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Детали по товару в заказе.
 */
class OrderItemDetailDTO
{
    /**
     * Количество единиц товара.
     * @DTA\Data(field="itemCount", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $item_count = null;

    /**
     * @DTA\Data(field="itemStatus", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OrderItemStatusType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OrderItemStatusType::class})
     */
    public ?\App\DTO\OrderItemStatusType $item_status = null;

    /**
     * Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.
     * @DTA\Data(field="updateDate", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $update_date = null;

}
