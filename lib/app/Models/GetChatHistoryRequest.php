<?php
/**
 * GetChatHistoryRequest
 */
namespace app\Models;

/**
 * GetChatHistoryRequest
 * @description Историю какого чата нужно получить — и начиная с какого сообщения.
 */
class GetChatHistoryRequest {

    /** @var int $messageIdFrom Идентификатор сообщения, начиная с которого нужно получить все последующие сообщения.*/
    public $messageIdFrom = 0;

}
