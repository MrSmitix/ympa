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
     * @var int|null
     */
    public $item_count;

    /**
     * @DTA\Data(field="itemStatus", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OrderItemStatusType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OrderItemStatusType::class})
     * @var \App\DTO\OrderItemStatusType|null
     */
    public $item_status;

    /**
     * Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.
     * @DTA\Data(field="updateDate", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $update_date;

}
