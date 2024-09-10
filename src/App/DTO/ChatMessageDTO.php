<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация о сообщениях.
 */
class ChatMessageDTO
{
    /**
     * Идентификатор сообщения.
     * @DTA\Data(field="messageId")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $message_id = null;

    /**
     * Дата и время создания сообщения.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;.
     * @DTA\Data(field="createdAt")
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="DateTime")
     */
    public ?\DateTimeInterface $created_at = null;

    /**
     * @DTA\Data(field="sender")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ChatMessageSenderType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ChatMessageSenderType::class})
     */
    public ?\App\DTO\ChatMessageSenderType $sender = null;

    /**
     * Текст сообщения.  Необязательный параметр, если возвращается параметр &#x60;payload&#x60;.
     * @DTA\Data(field="message", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $message = null;

    /**
     * Информация о приложенных к сообщению файлах.  Необязательный параметр, если возвращается параметр &#x60;message&#x60;.
     * @DTA\Data(field="payload", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $payload = null;

}
