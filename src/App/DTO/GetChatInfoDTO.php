<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация о чатах.
 */
class GetChatInfoDTO
{
    /**
     * Идентификатор чата.
     * @DTA\Data(field="chatId")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $chat_id;

    /**
     * Идентификатор заказа.
     * @DTA\Data(field="orderId")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $order_id;

    /**
     * @DTA\Data(field="type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ChatType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ChatType::class})
     * @var \App\DTO\ChatType|null
     */
    public $type;

    /**
     * @DTA\Data(field="status")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ChatStatusType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ChatStatusType::class})
     * @var \App\DTO\ChatStatusType|null
     */
    public $status;

    /**
     * Дата и время создания чата.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;.
     * @DTA\Data(field="createdAt")
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="Date", options={"format": \DateTime::RFC3339})
     * @var \DateTime|null
     */
    public $created_at;

    /**
     * Дата и время последнего сообщения в чате.
     * @DTA\Data(field="updatedAt")
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="Date", options={"format": \DateTime::RFC3339})
     * @var \DateTime|null
     */
    public $updated_at;

}
