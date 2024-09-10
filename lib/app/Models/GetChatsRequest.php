<?php
/**
 * GetChatsRequest
 */
namespace app\Models;

/**
 * GetChatsRequest
 * @description Фильтры по чатам, которые нужно вернуть.
 */
class GetChatsRequest {

    /** @var int[]|null $orderIds Фильтр по идентификаторам заказов на Маркете.*/
    public $orderIds = null;

    /** @var \app\Models\ChatType[]|null $types Фильтр по типам чатов.*/
    public $types = null;

    /** @var \app\Models\ChatStatusType[]|null $statuses Фильтр по статусам чатов.*/
    public $statuses = null;

}
