<?php
/**
 * SendMessageToChatRequest
 */
namespace app\Models;

/**
 * SendMessageToChatRequest
 * @description В какой чат нужно отправить сообщение и текст сообщения.
 */
class SendMessageToChatRequest {

    /** @var string $message Текст сообщения. Максимальная длина — 4096 символа.*/
    public $message = "";

}
