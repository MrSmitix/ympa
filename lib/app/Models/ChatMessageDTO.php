<?php
/**
 * ChatMessageDTO
 */
namespace app\Models;

/**
 * ChatMessageDTO
 * @description Информация о сообщениях.
 */
class ChatMessageDTO {

    /** @var int $messageId Идентификатор сообщения.*/
    public $messageId = 0;

    /** @var \DateTime $createdAt Дата и время создания сообщения.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;.*/
    public $createdAt;

    /** @var string $sender */
    public $sender = "";

    /** @var string $message Текст сообщения.  Необязательный параметр, если возвращается параметр &#x60;payload&#x60;.*/
    public $message = "";

    /** @var \app\Models\ChatMessagePayloadDTO[]|null $payload Информация о приложенных к сообщению файлах.  Необязательный параметр, если возвращается параметр &#x60;message&#x60;.*/
    public $payload = null;

}
