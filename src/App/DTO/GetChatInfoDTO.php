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
     */
    public ?int $chat_id = null;

    /**
     * Идентификатор заказа.
     * @DTA\Data(field="orderId")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $order_id = null;

    /**
     * @DTA\Data(field="type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ChatType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ChatType::class})
     */
    public ?\App\DTO\ChatType $type = null;

    /**
     * @DTA\Data(field="status")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ChatStatusType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ChatStatusType::class})
     */
    public ?\App\DTO\ChatStatusType $status = null;

    /**
     * Дата и время создания чата.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;.
     * @DTA\Data(field="createdAt")
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="DateTime")
     */
    public ?\DateTimeInterface $created_at = null;

    /**
     * Дата и время последнего сообщения в чате.
     * @DTA\Data(field="updatedAt")
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="DateTime")
     */
    public ?\DateTimeInterface $updated_at = null;

}
