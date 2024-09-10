<?php
/**
 * SetOrderBoxLayoutRequest
 */
namespace app\Models;

/**
 * SetOrderBoxLayoutRequest
 */
class SetOrderBoxLayoutRequest {

    /** @var \app\Models\OrderBoxLayoutDTO[] $boxes Список коробок.*/
    public $boxes = [];

    /** @var bool $allowRemove Передайте &#x60;true&#x60;, если вы собираетесь удалить часть товаров из заказа.*/
    public $allowRemove = false;

}
