<?php
/**
 * ChatMessagesResultDTO
 */
namespace app\Models;

/**
 * ChatMessagesResultDTO
 * @description Информация о сообщениях.
 */
class ChatMessagesResultDTO {

    /** @var int $orderId Идентификатор заказа.*/
    public $orderId = 0;

    /** @var \app\Models\ChatMessageDTO[] $messages Информация о сообщениях.*/
    public $messages = [];

    /** @var \app\Models\ForwardScrollingPagerDTO $paging */
    public $paging;

}
