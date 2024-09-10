<?php
/**
 * CreateChatResponse
 */
namespace app\Models;

/**
 * CreateChatResponse
 * @description Результат создания чата.
 */
class CreateChatResponse {

    /** @var string $status */
    public $status = "";

    /** @var \app\Models\CreateChatResultDTO $result */
    public $result;

}
