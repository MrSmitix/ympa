<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Query parameters for sendMessageToChat
 */
class SendMessageToChatQueryData
{
    /**
     * Идентификатор чата.
     * @DTA\Data(field="chatId")
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"int"})
     * @var int|null
     */
    public $chat_id;

}
