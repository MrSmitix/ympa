<?php
/**
 * GetChatInfoDTO
 */
namespace app\Models;

/**
 * GetChatInfoDTO
 * @description Информация о чатах.
 */
class GetChatInfoDTO {

    /** @var int $chatId Идентификатор чата.*/
    public $chatId = 0;

    /** @var int $orderId Идентификатор заказа.*/
    public $orderId = 0;

    /** @var string $type */
    public $type = "";

    /** @var string $status */
    public $status = "";

    /** @var \DateTime $createdAt Дата и время создания чата.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;.*/
    public $createdAt;

    /** @var \DateTime $updatedAt Дата и время последнего сообщения в чате.*/
    public $updatedAt;

}
