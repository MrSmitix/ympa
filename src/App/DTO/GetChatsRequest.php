<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Фильтры по чатам, которые нужно вернуть.
 */
class GetChatsRequest
{
    /**
     * Фильтр по идентификаторам заказов на Маркете.
     * @DTA\Data(field="orderIds", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection116::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection116::class})
     * @var \App\DTO\Collection116|null
     */
    public $order_ids;

    /**
     * Фильтр по типам чатов.
     * @DTA\Data(field="types", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection117::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection117::class})
     * @var \App\DTO\Collection117|null
     */
    public $types;

    /**
     * Фильтр по статусам чатов.
     * @DTA\Data(field="statuses", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection118::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection118::class})
     * @var \App\DTO\Collection118|null
     */
    public $statuses;

}
