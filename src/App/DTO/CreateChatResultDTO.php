<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация о созданном чате.
 */
class CreateChatResultDTO
{
    /**
     * Идентификатор чата.
     * @DTA\Data(field="chatId")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $chat_id;

}
