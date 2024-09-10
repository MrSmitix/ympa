<?php
/**
 * OrderItemDetailDTO
 */
namespace app\Models;

/**
 * OrderItemDetailDTO
 * @description Детали по товару в заказе.
 */
class OrderItemDetailDTO {

    /** @var int $itemCount Количество единиц товара.*/
    public $itemCount = 0;

    /** @var string $itemStatus */
    public $itemStatus = "";

    /** @var string $updateDate Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.*/
    public $updateDate = "";

}
