<?php
/**
 * GetChatsInfoDTO
 */
namespace app\Models;

/**
 * GetChatsInfoDTO
 * @description Список чатов.
 */
class GetChatsInfoDTO {

    /** @var \app\Models\GetChatInfoDTO[] $chats Информация о чатах.*/
    public $chats = [];

    /** @var \app\Models\ForwardScrollingPagerDTO $paging */
    public $paging;

}
