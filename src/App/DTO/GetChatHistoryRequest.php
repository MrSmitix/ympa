<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Историю какого чата нужно получить — и начиная с какого сообщения.
 */
class GetChatHistoryRequest
{
    /**
     * Идентификатор сообщения, начиная с которого нужно получить все последующие сообщения.
     * @DTA\Data(field="messageIdFrom", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $message_id_from = null;

}
