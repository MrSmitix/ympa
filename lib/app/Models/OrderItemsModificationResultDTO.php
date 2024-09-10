<?php
/**
 * OrderItemsModificationResultDTO
 */
namespace app\Models;

/**
 * OrderItemsModificationResultDTO
 * @description Краткие сведения о промаркированных товарах. Параметр возвращается, если ответ `OK`.
 */
class OrderItemsModificationResultDTO {

    /** @var \app\Models\BriefOrderItemDTO[] $items Список позиций в заказе, подлежащих маркировке.*/
    public $items = [];

}
