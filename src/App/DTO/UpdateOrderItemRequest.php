<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Запрос на обновление состава заказа.
 */
class UpdateOrderItemRequest
{
    /**
     * Список товаров в заказе.  Если магазин не передал информацию о товаре во входных данных, он будет удален из заказа.  Обязательный параметр.
     * @DTA\Data(field="items")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection25::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection25::class})
     * @var \App\DTO\Collection25|null
     */
    public $items;

    /**
     * @DTA\Data(field="reason", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OrderItemsModificationRequestReasonType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OrderItemsModificationRequestReasonType::class})
     * @var \App\DTO\OrderItemsModificationRequestReasonType|null
     */
    public $reason;

}
