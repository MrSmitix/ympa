<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * В какой чат нужно отправить сообщение и текст сообщения.
 */
class SendMessageToChatRequest
{
    /**
     * Текст сообщения. Максимальная длина — 4096 символа.
     * @DTA\Data(field="message")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"min":1, "max":4096})
     * @var string|null
     */
    public $message;

}
